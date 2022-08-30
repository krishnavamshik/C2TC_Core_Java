package com.cg.certificate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CertificateService {
	@Autowired
	private CertificateRepository repo;
	
	public Certificate searchCertificate(int ceid) {
		return repo.findById(ceid).get();
	}
	public void addCertificate(Certificate certificate) {
		repo.save(certificate);
	}
	public void deleteCertificate(int ceid ) {
		repo.deleteById(ceid);
	}
}
