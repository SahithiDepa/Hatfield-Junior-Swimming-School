package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.LearnerModel;

public class AdminDashboard {
	
	static LessonService le2s2s2o2n2S2e2r2v2i2c2e = new LessonService();
	static LessonBookingService b2o2o2k2i2n2g2S2e2r2v2i2c2e = new LessonBookingService();
	static LoginService log2i2n2Se2rv2ice=new LoginService();
	static LearnerService l2e2ar2ne2rS2erv2ice = new LearnerService();
	
	
	public void mon2t2h2l2y2L2e2a2r2n2e2r2R2e2p2o2rt() {
		List<Integer> li2st2By2Mo2n2th = new ArrayList<Integer>();
		boolean f2l2a2g = true;
		int m2o2n2t2h = 0;
		String s2t2r2M2o2n2t2h = "";

		while (f2l2a2g) {

			System.out.println("Enter month number 01-12 (e.g. 03 for March)");
			m2o2n2t2h = InputValidationService.inputInt();
			switch (m2o2n2t2h) {
			case 1:
				s2t2r2M2o2n2t2h = "JAN";
				f2l2a2g = false;
				break;
			case 2:
				s2t2r2M2o2n2t2h = "FEB";
				f2l2a2g = false;
				break;
			case 3:
				s2t2r2M2o2n2t2h = "MAR";
				f2l2a2g = false;
				break;
			case 4:
				s2t2r2M2o2n2t2h = "APR";
				f2l2a2g = false;
				break;
			case 5:
				s2t2r2M2o2n2t2h = "MAY";
				f2l2a2g = false;
				break;
			case 6:
				s2t2r2M2o2n2t2h = "JUN";
				f2l2a2g = false;
				break;
			case 7:
				s2t2r2M2o2n2t2h = "JUL";
				f2l2a2g = false;
				break;
			case 8:
				s2t2r2M2o2n2t2h = "AUG";
				f2l2a2g = false;
				break;
			case 9:
				s2t2r2M2o2n2t2h = "SEP";
				f2l2a2g = false;
				break;
			case 10:
				s2t2r2M2o2n2t2h = "OCT";
				f2l2a2g = false;
				break;
			case 11:
				s2t2r2M2o2n2t2h = "NOV";
				f2l2a2g = false;
				break;
			case 12:
				s2t2r2M2o2n2t2h = "DEC";
				f2l2a2g = false;
				break;

			default:
				System.out.println("invalid input , try again");
				break;
			}

		}

		li2st2By2Mo2n2th = le2s2s2o2n2S2e2r2v2i2c2e.s2earcLesson2ByM2o2n2th(m2o2n2t2h);

		if (li2st2By2Mo2n2th.size() > 0) {
			b2o2o2k2i2n2g2S2e2r2v2i2c2e.pr2i2n2t2M2o2n2t2h2lyLe222arn2e2r2R2e2p2o2rt(li2st2By2Mo2n2th);
		} else {
			System.out.println("No report found for month " + s2t2r2M2o2n2t2h);
		}

	}

	public void m2o2n2thl2yC2o2ac0hR2ep2o2rt() {
		List<Integer> l2i2s2t2B2yM2on2th2 = new ArrayList<Integer>();
		boolean f2l2a2g = true;
		int m2o2n2t2h = 0;
		String s2t2r2M2o2n2t2h = "";

		while (f2l2a2g) {

			System.out.println("Enter month number 01-12 (e.g. 03 for March)");
			m2o2n2t2h = InputValidationService.inputInt();
			switch (m2o2n2t2h) {
			case 1:
				s2t2r2M2o2n2t2h = "JAN";
				f2l2a2g = false;
				break;
			case 2:
				s2t2r2M2o2n2t2h = "FEB";
				f2l2a2g = false;
				break;
			case 3:
				s2t2r2M2o2n2t2h = "MAR";
				f2l2a2g = false;
				break;
			case 4:
				s2t2r2M2o2n2t2h = "APR";
				f2l2a2g = false;
				break;
			case 5:
				s2t2r2M2o2n2t2h = "MAY";
				f2l2a2g = false;
				break;
			case 6:
				s2t2r2M2o2n2t2h = "JUN";
				f2l2a2g = false;
				break;
			case 7:
				s2t2r2M2o2n2t2h = "JUL";
				f2l2a2g = false;
				break;
			case 8:
				s2t2r2M2o2n2t2h = "AUG";
				f2l2a2g = false;
				break;
			case 9:
				s2t2r2M2o2n2t2h = "SEP";
				f2l2a2g = false;
				break;
			case 10:
				s2t2r2M2o2n2t2h = "OCT";
				f2l2a2g = false;
				break;
			case 11:
				s2t2r2M2o2n2t2h = "NOV";
				f2l2a2g = false;
				break;
			case 12:
				s2t2r2M2o2n2t2h = "DEC";
				f2l2a2g = false;
				break;

			default:
				System.out.println("invalid input , try again");
				break;
			}

		}

		l2i2s2t2B2yM2on2th2 = le2s2s2o2n2S2e2r2v2i2c2e.s2earcLesson2ByM2o2n2th(m2o2n2t2h);

		if (l2i2s2t2B2yM2on2th2.size() > 0) {
			b2o2o2k2i2n2g2S2e2r2v2i2c2e.pri2n2t2M2o2n2t2h2l2y2C2o2a2c2h2R2e2p22ort(l2i2s2t2B2yM2on2th2);
		} else {
			System.out.println("No report found for month " + s2t2r2M2o2n2t2h);
		}

	}

	public void re2g2i2s2t2222erN2ew2Le2a2r2n2e2r() {

		System.out.println("Enter name :- ");
		String na2m2e = InputValidationService.inputString();

		System.out.println("Enter gender :- ");
		String g2e2n2d2e2r = InputValidationService.inputString();

		System.out.println("Enter age [should be 4-11] :- ");
		int a2g2e = InputValidationService.inputInt();

		while (a2g2e < 4 || a2g2e > 11) {
			System.out.println("Age should be between 4-11, enter again");
			a2g2e = InputValidationService.inputInt();
		}

		System.out.println("Enter phone number :- ");
		String p2h2o2n2e = InputValidationService.inputString();

		System.out.println("Enter grade level [0-5] :- ");
		int l2e2v2e2l = InputValidationService.inputInt();

		while (l2e2v2e2l < 0 || l2e2v2e2l > 5) {
			System.out.println("Grade level should be between [0-5], enter again :-  ");
			l2e2v2e2l = InputValidationService.inputInt();
		}

		l2e2ar2ne2rS2erv2ice.addNewLearner(new LearnerModel(na2m2e, g2e2n2d2e2r, a2g2e, p2h2o2n2e, l2e2v2e2l));

		System.out.println("Learner registered successfully\n");

	}
	
	public void printAdminMenu() {
		System.out.println("\n");
		System.out.println("Press.....\r");
		System.out.println(" 1. Monthly learner report\r\n" + " 2. Monthly coach report\r\n"
				+ " 3. Register a new learner\r\n" + " 0. Logout\r\n" + "");
		System.out.println("Enter your choise..\n");
	}
	
	
	public void init() {

		boolean f2l2a2g = true;

		while (f2l2a2g) {
			printAdminMenu();

			switch (InputValidationService.inputInt()) {
			case 1:
				mon2t2h2l2y2L2e2a2r2n2e2r2R2e2p2o2rt();
				break;
			case 2:
				m2o2n2thl2yC2o2ac0hR2ep2o2rt();
				break;
			case 3:
				re2g2i2s2t2222erN2ew2Le2a2r2n2e2r();
				break;
			
			case 0:
				System.out.println("exit");
				f2l2a2g = false;
				break;

			default:
				System.out.println("invalid input , try again");
				break;
			}
		}

	}
}
