package com.cg.placement;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IPlacementController {
	@Autowired
	private IPlacementService service;

	// search placement
	@GetMapping("/placement/{pid}")
	public ResponseEntity<Placement> search(int pid) {
		try {
			Placement placement = service.searchPlacemen(pid);
			return new ResponseEntity<>(placement, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// add Placement
	@PostMapping("/placement")
	public void add(@PathVariable Placement placement) {
		service.addPlacement(placement);
	}

	// update placement
	@PutMapping("/pacement/{pid}")
	public ResponseEntity<?> update(@PathVariable Placement placement, int pid) {
		try {
			Placement existPlacement = service.searchPlacemen(pid);
			service.addPlacement(placement);
			return new ResponseEntity<>(placement, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}
