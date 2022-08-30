package com.cg.certificate;

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
public class CertificateController {
	@Autowired
	private CertificateService service;
	
	// search certificate
	@GetMapping("/certificate/{ceid}")
	public ResponseEntity<Certificate>search(int ceid){
		try {
			Certificate certificate = service.searchCertificate(ceid);
			return new ResponseEntity<>(certificate,HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	// add Certificate
	@PostMapping("/certificate")
	public void add(@PathVariable Certificate certificate) {
		service.addCertificate(certificate);
	}
	//update Certificate
	@PutMapping("/certificate/{ceid}")
	public ResponseEntity<?>update(@PathVariable Certificate certificate,int ceid){
		try {
			Certificate existCert = service.searchCertificate(ceid);
			service.addCertificate(certificate);
			return new ResponseEntity<>(certificate,HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	//delete Certificate
	@DeleteMapping("/certificate/{ceid}")
	public void delete(@PathVariable int ceid) {
		service.deleteCertificate(ceid);
	}
	
	
}
