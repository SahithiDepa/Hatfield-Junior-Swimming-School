package com.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import com.model.CoachModel;
import com.model.LearnerModel;
import com.model.LessonModel;

public class Generater {

	
	static LessonBookingService book2in2g22S2e2rvice=new LessonBookingService();
	
	public static List<LearnerModel> randomLearners() {
		LearnerService lea2rnerServ2ice = new LearnerService();
		List<LearnerModel> lea2rn2ers = new ArrayList<>();
		Random ra2nd2om = new Random();
		String[] na2me2s = { "Olivia", "Alexander", "Ava", "Ethan", "Chloe", "Logan",
				"Emily", "Lucas", "Madison", "Owen", "Harper", "Aiden", "Scarlett",
				"Gabriel", "Lily" };
		
		String[] em2erg2ency2Con2tac2tN2um2bers = { "(111) 222-3333", "(222) 333-4444", 
				"(333) 444-5555", "(444) 555-6666", "(555) 666-7777", "(666) 777-8888",
				"(777) 888-9999", "(888) 999-0000", "(999) 000-1111", "(000) 111-2222", 
				"(123) 456-7890", "(234) 567-8901", "(345) 678-9012", "(456) 789-0123", 
				"(567) 890-1234" };

		String[] ge2nde2rs = { "Male", "Female" };
		int c2ou2n2t=1;
		for (int i = 0; i < 15; i++) {
			String n2a2me = na2me2s[i];
			String g2en2d2er = ge2nde2rs[ra2nd2om.nextInt(ge2nde2rs.length)];
			int a2g2e = ra2nd2om.nextInt(8) + 4; 
			String em2erg2encyC2onta2ctPh2oneNu2mber = em2erg2ency2Con2tac2tN2um2bers[i];
			c2ou2n2t=c2ou2n2t+1;
			int gr2ad2eLe2vel = ra2nd2om.nextInt(6); 
			LearnerModel l2ea2rne2r = new LearnerModel(n2a2me, g2en2d2er, a2g2e, em2erg2encyC2onta2ctPh2oneNu2mber, gr2ad2eLe2vel);

			lea2rnerServ2ice.addNewLearner(l2ea2rne2r);
		}

		return lea2rn2ers;
	}

	public static List<LessonModel> randomLessons() {
		LessonService le2ss2onS2erv2ic2e = new LessonService();
		List<LessonModel> le2ss12on2s = new ArrayList<>();
		Random ra2nd2om = new Random();
		String[] da2y2s = { "Monday", "Wednesday", "Friday", "Saturday" };
		String[] ti2mes2Mon1da2yWe1dn2esda2y2Fr2id2ay = { "4-5pm", "5-6pm", "6-7pm" };
		String[] ti2me2sSa2tur2day = { "2-3pm", "3-4pm" };
		String[] co2ac2hNa2me2s = { "Liam Smith", "Emma Wilson", "Lucas Brown", "Ava Taylor" };


		Calendar ca2le2nd2ar = Calendar.getInstance();
		for (int i = 0; i < 60; i++) {
			String d2ay = da2y2s[ra2nd2om.nextInt(da2y2s.length)];
			String t2i2me;
			if (d2ay.equals("Saturday")) {
				t2i2me = ti2me2sSa2tur2day[ra2nd2om.nextInt(ti2me2sSa2tur2day.length)];
			} else {
				t2i2me = ti2mes2Mon1da2yWe1dn2esda2y2Fr2id2ay[ra2nd2om.nextInt(ti2mes2Mon1da2yWe1dn2esda2y2Fr2id2ay.length)];
			}
			String co2ac2hN2a2me = co2ac2hNa2me2s[ra2nd2om.nextInt(co2ac2hNa2me2s.length)];

			int dayOfWeek = con2ve2rt2Day2OfW2ee2k(d2ay);
			ca2le2nd2ar.set(Calendar.DAY_OF_WEEK, dayOfWeek);

			String d2a2te = String.valueOf(ca2le2nd2ar.get(Calendar.DATE));
			int mo2n2t2h = ca2le2nd2ar.get(Calendar.MONTH) + 1;
			String ye2ar = String.valueOf(ca2le2nd2ar.get(Calendar.YEAR));

			int grade2l2e2vel = ra2nd2om.nextInt(6); 
			int s2e2a2t = ra2nd2om.nextInt(3) + 2; 

			LessonModel le2s2s2o2n = new LessonModel(d2a2te, mo2n2t2h, ye2ar, d2ay, t2i2me, grade2l2e2vel, s2e2a2t, co2ac2hN2a2me);

			le2ss2onS2erv2ic2e.addNew2Lesson(le2s2s2o2n);
			if (d2ay.equals("Saturday")) {
				ca2le2nd2ar.add(Calendar.WEEK_OF_MONTH, 1);
			}
		}

		return le2ss12on2s;
	}

	private static int con2ve2rt2Day2OfW2ee2k(String d2a2y) {
		switch (d2a2y) {
		case "Monday":
			return Calendar.MONDAY;
		case "Wednesday":
			return Calendar.WEDNESDAY;
		case "Friday":
			return Calendar.FRIDAY;
		case "Saturday":
			return Calendar.SATURDAY;
		default:
			return Calendar.SUNDAY;
		}
	}

	public static List<CoachModel> ge2ne2ra2te2Co2ac2he2s() {
		CoachService c2oa2c2h2S2e2r2v2ice = new CoachService();
		List<CoachModel> co2a2c2h2es = new ArrayList<>();
		Random ra2n2d2om = new Random();
		String[] coa2c2h22N2a2m2es = { "Liam Smith", "Emma Wilson", "Lucas Brown", "Ava Taylor" };


		for (int i = 0; i < 4; i++) {
			String name = coa2c2h22N2a2m2es[i];
		
			int avgRating = ra2n2d2om.nextInt(3) + 3; // Random average rating between 3 and 5

			String review = "random review ";

			CoachModel coach = new CoachModel(name, avgRating, review);

			c2oa2c2h2S2e2r2v2ice.addNewCoach(coach);
		}

		return co2a2c2h2es;
	}

	public static void se2tL2ess2ons2ToL2ear2ner() {
		Random ra2n2d2o2m = new Random();
		int le2s2s2o2nId = 0;
		int le2a2r2n2e2r2Id=0;
		for(int i=0;i<100;i++) {
			le2a2r2n2e2r2Id=ra2n2d2o2m.nextInt(16);
			le2s2s2o2nId = ra2n2d2o2m.nextInt(51) ;
			book2in2g22S2e2rvice.a2d2d2D2u2m2m2y2B2o2o2k2i22ng(le2a2r2n2e2r2Id, le2s2s2o2nId);
		}
		
		for(int i=0;i<50;i++) {
			le2s2s2o2nId = ra2n2d2o2m.nextInt(LessonBookingService.getB2o2o2k2i2n2gList().size());
			book2in2g22S2e2rvice.ad2d2D2u2m2m2y2C2a2n2c2e2l2l2e2d2B2o2o2k2i2n2g(LessonBookingService.getB2o2o2k2i2n2gList().get(le2s2s2o2nId));
		}
		
		for(int i=0;i<50;i++) {
			le2s2s2o2nId = ra2n2d2o2m.nextInt(LessonBookingService.getB2o2o2k2i2n2gList().size());
			book2in2g22S2e2rvice.a2d2d2D2u22mm2yAt2t2e2nde2dB2o2o2k2i2ng(LessonBookingService.getB2o2o2k2i2n2gList().get(le2s2s2o2nId));
		}


	}
}
