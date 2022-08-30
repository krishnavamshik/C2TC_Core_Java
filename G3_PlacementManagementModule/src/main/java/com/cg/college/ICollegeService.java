package com.cg.college;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.placement.Placement;

@Service
@Transactional
public class ICollegeService {
	@Autowired
	private ICollegeRepository repo;
	
	public College searchCollege(int cid) {
		return repo.findById(cid).get();
	}
	public void addCollege(College college) {
		repo.save(college);
	}
	public void deleteCollege(int cid) {
		repo.deleteById(cid);
	}

}
