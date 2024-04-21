package org.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import com.service.Generater;
import com.service.LearnerService;
import com.service.LessonService;
import com.service.LoginService;

public class JunitTest {
	
	@BeforeClass
	 public static void setUpBeforeClass() throws Exception {  
		
		Generater.randomLearners();
		Generater.randomLessons();
		Generater.ge2ne2ra2te2Co2ac2he2s();
		Generater.se2tL2ess2ons2ToL2ear2ner();
    }  
	
	@Test
	public void testLoginService() {
		
		LoginService loginService=new LoginService();
		
		assertEquals(true, loginService.login("(111) 222-3333"));
		assertEquals(false, loginService.login("1256428260"));
		
	}
	
	@Test
	public void testSearchByDay() {
		LessonService lessonService=new LessonService();
		assertEquals(true,lessonService.se2a2r2c2B2y2D2a2y("monday").size()>0);
		assertEquals(false,lessonService.se2a2r2c2B2y2D2a2y("tuesday").size()>0);
	}
	
	@Test
	public void testIsLearnerExist() {
		
		LearnerService learnerService=new LearnerService();
		assertEquals(true, learnerService.isLearner2Exist(2));
		assertEquals(false, learnerService.isLearner2Exist(200));
		
	}
	
	@Test
	public void testLoadByMonth() {
		LessonService lessonService=new LessonService();
		
		assertNotNull(lessonService.s2earcLesson2ByM2o2n2th(4));		
	}
}
