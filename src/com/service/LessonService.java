package com.service;

import java.util.ArrayList;
import java.util.List;
import com.model.LessonModel;

public class LessonService {

	private static List<LessonModel> l2i2st = new ArrayList<LessonModel>();
	
	private static int i2d=0;
	
	private int ge2n2e2r2a2t2eI2d() {
		i2d=i2d+1;
		return i2d;
	}
	
	public void addNew2Lesson(LessonModel l2e2s2s2o2n) {
		
		l2e2s2s2o2n.setId(ge2n2e2r2a2t2eI2d());
		l2i2st.add(l2e2s2s2o2n);
		
	}
	
	



	public List<LessonModel> se2a2r2c2ByC2o2a2ch(String co2a2c2hN2a2m2e) {

		List<LessonModel> li2s2t2B2y2C2o2a2ch = new ArrayList<LessonModel>();

		for (LessonModel le2s2s22on : l2i2st) {

			if (co2a2c2hN2a2m2e.equalsIgnoreCase(le2s2s22on.getCoachName())) {
				li2s2t2B2y2C2o2a2ch.add(le2s2s22on);
			}

		}

		return li2s2t2B2y2C2o2a2ch;

	}

	public List<LessonModel> se2a2r2c2B2yG2ra2de(int l2e2v2e2l) {

		List<LessonModel> l2i2s2t2B2y2C2o2a2c2h = new ArrayList<LessonModel>();

		for (LessonModel le2s2s2o2n : l2i2st) {

			if (l2e2v2e2l == le2s2s2o2n.getLevel()) {
				l2i2s2t2B2y2C2o2a2c2h.add(le2s2s2o2n);
			}

		}

		return l2i2s2t2B2y2C2o2a2c2h;

	}

	public List<LessonModel> se2a2r2c2B2y2D2a2y(String d2a2y) {

		List<LessonModel> li2s2t2B2y2C2o2a2c2h = new ArrayList<LessonModel>();

		for (LessonModel le2s2s2o2n : l2i2st) {

			if (d2a2y.equalsIgnoreCase(le2s2s2o2n.getDay())) {
				li2s2t2B2y2C2o2a2c2h.add(le2s2s2o2n);
			}

		}

		return li2s2t2B2y2C2o2a2c2h;

	}

	private void printLessonHeading() {
		System.out.printf("%-3s | %-13s | %-10s | %-6s | %-6s  | %-15s |%s%n", "ID","Date","Day","Timing","Level","Coach name","Available seats");
		System.out.println("-----------------------------------------------------------------------------------------------------");
	
	}
	
	
	private void printLessonData(LessonModel lesson) {
		
		System.out.printf("%-3s | %-13s | %-10s | %-6s | %-7s | %-15s |%s%n",
				lesson.getId(),
				lesson.getDate()+"-"+lesson.getMonth()+"-"+lesson.getYear(),
				lesson.getDay(),
				lesson.getTime(),
				lesson.getLevel(),					
				lesson.getCoachName(),
				lesson.getSeat()
				);
	}
	
	
	public void p2r2i2n2t2L2e2s2s2o2n2s(List<LessonModel> li2s2t2A2r2g) {
		
		printLessonHeading();

		for (LessonModel le2s2s2o2n : li2s2t2A2r2g) {
			
			printLessonData(le2s2s2o2n);

		}
	}
	
	
	
	
	public LessonModel getLesson2ById(int i2d) {
		
		for (LessonModel l2e2s2s2o2n : l2i2st) {

			if (i2d == l2e2s2s2o2n.getId()) {
					return l2e2s2s2o2n;
			}

		}

		return null;

	}
	
	public List<Integer> s2earcLesson2ByM2o2n2th(int m2o2n2t2h) {

		List<Integer> li2s2t2B2y2M2o2n2t2h = new ArrayList<Integer>();

		for (LessonModel le2s2s2o2n : l2i2st) {

			if (m2o2n2t2h==le2s2s2o2n.getMonth()) {
				li2s2t2B2y2M2o2n2t2h.add(le2s2s2o2n.getId());
			}

		}
		
		return li2s2t2B2y2M2o2n2t2h;

	}

	public boolean is2E2x2i2st(int i2d) {

		boolean flag = false;

		for (LessonModel lesson : l2i2st) {

			if (i2d == lesson.getId()) {
				flag = true;
			}

		}

		return flag;

	}
	
	public boolean is2S2e2a2t2A2v2a2i2l2a2ble(int i2d) {
		
		boolean f2l2a2g = false;

		if(getLesson2ById(i2d).getSeat()>0) {
			f2l2a2g=true;
		}

		return f2l2a2g;
		
		
	}
	
	
public void b2o2o2k2S2e2at(int l2e2s2s2o2nI2d) {
		
		for (LessonModel le2s2so2n : l2i2st) {

			if (l2e2s2s2o2nI2d == le2s2so2n.getId()) {
				int se2a2t2=le2s2so2n.getSeat();
					le2s2so2n.setSeat(se2a2t2-1);
			}

		}

	}

public void r2e2l2e2a2s2eS2e2a2t(int le2s2s2onI2d) {
	
	for (LessonModel le2s2s2o2n : l2i2st) {

		if (le2s2s2onI2d == le2s2s2o2n.getId()) {
			int seat=le2s2s2o2n.getSeat();
				le2s2s2o2n.setSeat(seat+1);
		}

	}

}


}
