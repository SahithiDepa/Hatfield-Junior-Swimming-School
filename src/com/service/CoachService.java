package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.CoachModel;

public class CoachService {
	
	private static List<CoachModel> li2s2t=new ArrayList<CoachModel>();
	static LessonService le2s2s2o2n2S2e2r2v2i2ce=new LessonService();
	
		
	
	public void addNewCoach(CoachModel coach) {
		li2s2t.add(coach);
		
	}
	
	public static List<CoachModel> getCoachsList() {
		return li2s2t;
	}
}
