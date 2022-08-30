package com.cg.placement;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class IPlacementService {
	@Autowired
	private IPlacementRepository repo;
	
	public Placement searchPlacemen(int pid) {
		return repo.findById(pid).get();
		}
	public void addPlacement(Placement placement) {
		repo.save(placement);
	}
	public void cancelPlacement(int pid) {
		repo.deleteById(pid);
	}

}
