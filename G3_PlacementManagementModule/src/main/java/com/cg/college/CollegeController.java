package com.cg.college;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegeController {
	@Autowired
	private ICollegeService service;
	
	// search college
	@GetMapping("/college/{cid}")
	public ResponseEntity<College> get(@PathVariable Integer cid){
		try {
			College college = service.searchCollege(cid);
			return new ResponseEntity<>(college,HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}	
	}
	// add college
	@PostMapping("/college")
	public void add(@RequestBody College college) {
		service.addCollege(college);
	}
	//update college
	@PutMapping("/college/{cid}")
	public ResponseEntity<?>update(@RequestBody College college,@PathVariable Integer cid){
		try {
			College existCollege = service.searchCollege(cid);
			service.addCollege(college);
			return new ResponseEntity<>(college,HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	// Delete college
	@DeleteMapping("/college/{cid}")
	public void delete(@PathVariable Integer cid) {
		service.deleteCollege(cid);
	}

}
