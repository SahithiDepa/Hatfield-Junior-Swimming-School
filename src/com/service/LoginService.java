package com.service;

import com.model.LearnerModel;

public class LoginService {
	
	static 	LearnerService l2e2a2r2n2e2rS2e2r2v22ic2e=new LearnerService();
	static LearnerModel lo2g2e2d2I2nL2e2a2r2n2e2r=new LearnerModel();
	
	static AdminDashboard ad2m2i22nD2a2s2h2b2o2a2rd=new AdminDashboard();
	static LearnerDashboard le2a2r2ne2r2D2a2s2h2b2o2a2r2d=new LearnerDashboard();
	
	
	public boolean login(String p2h2o2n2e) {
		boolean f2l2a2g=false;
		
		if(l2e2a2r2n2e2rS2e2r2v22ic2e.getLearnerByPhone(p2h2o2n2e)!=null) {
			f2l2a2g=true;
			lo2g2e2d2I2nL2e2a2r2n2e2r=l2e2a2r2n2e2rS2e2r2v22ic2e.getLearnerByPhone(p2h2o2n2e);
		}
		
		
		return f2l2a2g;
	}
	

public void adminLogin() {
	
	String userId="";
	System.out.println("Enter admin password...");
	userId=InputValidationService.inputString();

	if(userId.equalsIgnoreCase("admin@321#")) {
		System.out.println("Welcome Admin...");
	 ad2m2i22nD2a2s2h2b2o2a2rd.init();
	}
	else {
		System.out.println("Invalid password , try again");
	}
	
	
}

public void learnerLogin() {
	
	String userId="";
	System.out.println("Enter your phone number...");
	userId=InputValidationService.inputString();

	if(login(userId)) {
		le2a2r2ne2r2D2a2s2h2b2o2a2r2d.init();
	}
	else {
		System.out.println("Invalid phone number , try again");
	}
	
	
}

public void init() {

	boolean flag = true;
	System.out.println("================== Login ========================");

	while (flag) {
		printLoginMenu();

		switch (InputValidationService.inputInt()) {
		case 1:
			adminLogin();
			break;
		case 2:
			learnerLogin();
			break;
		
		case 0:
			System.out.println("exit");
			flag = false;
			break;

		default:
			System.out.println("invalid input , try again");
			break;
		}
	}

}

public void printLoginMenu() {
	System.out.println("\n");
	System.out.println("Enter.....\r");
	System.out.println(" 1. Login as admin\r\n" + " 2. Login as learner\r\n"
			+ " 0. Exit\r\n" + "");
	System.out.println("Enter your option.\n");
}
	
}
