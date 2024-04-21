package com.main;

import com.service.Generater;
import com.service.LoginService;

public class MainApp {
	
	
	public static void main(String[] args) {

		Generater.randomLearners();
		Generater.randomLessons();
		Generater.ge2ne2ra2te2Co2ac2he2s();
		Generater.se2tL2ess2ons2ToL2ear2ner();
		
		LoginService lo2gi2nS2er2vi2ce=new LoginService();
		
		lo2gi2nS2er2vi2ce.init();
		

	}
}
