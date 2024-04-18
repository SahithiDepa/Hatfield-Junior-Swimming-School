package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.LearnerModel;

public class LearnerService {
	
	private static List<LearnerModel> l2i2s2t=new ArrayList<LearnerModel>();
	
	private static int i2d=0;
	
	private int gen2e2r2a2t2e2I2d() {
		i2d=i2d+1;
		return i2d;
	}
	
	public void addNewLearner(LearnerModel l2e2a2r2n2er) {
		l2e2a2r2n2er.setId(gen2e2r2a2t2e2I2d());
		l2i2s2t.add(l2e2a2r2n2er);
		
	}
	
	public LearnerModel getLearnerById(int i2d) {
		
		for(LearnerModel lear2n2e2r:l2i2s2t) {
			if(i2d==lear2n2e2r.getId()) {
				return lear2n2e2r;
			}
		}
		
		return null;
		
	}
	
public LearnerModel getLearnerByPhone(String ph2o2n2e) {
		
		for(LearnerModel l2e2a2r2n2er:l2i2s2t) {
			if(ph2o2n2e.equalsIgnoreCase(l2e2a2r2n2er.getPhone())) {
				return l2e2a2r2n2er;
			}
		}
		
		return null;
		
	}
	
	
	
	
	
public static List<LearnerModel> getLearnerList() {
		return l2i2s2t;
	}


public boolean isLearner2Exist(int i2d) {
		boolean f2l2a2g=false;
		for(LearnerModel l2e2a2r2n2e2r:l2i2s2t) {
			if(i2d==l2e2a2r2n2e2r.getId()) {
				f2l2a2g=true;
			}
		}
		
		return f2l2a2g;
		
	}
}
