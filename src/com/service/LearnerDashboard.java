package com.service;

import java.util.ArrayList;
import java.util.List;
import com.model.LearnerModel;
import com.model.LessonModel;

public class LearnerDashboard {
	
	static LessonService lessonService = new LessonService();
	static LessonBookingService bookingService = new LessonBookingService();
	static LearnerService learnerService = new LearnerService();
	static ReviewService reviewService=new ReviewService();
	
	
	public void initSearchUpdateBooking(int bookingId) {
		boolean flag = true;
		List<LessonModel> list = new ArrayList<LessonModel>();
		while (flag) {

			printLessonSearchMenu();
			switch (InputValidationService.inputInt()) {
			case 1:
				System.out.println("Enter Day ");

				list = lessonService.se2a2r2c2B2y2D2a2y(InputValidationService.inputString());
				if (list.size()>=1) {
					lessonService.p2r2i2n2t2L2e2s2s2o2n2s(list);
					flag = !initUpdateBooking(bookingId);
				}
				else {
					System.out.println("no data found , try with another one");
				}
				

				

				break;
			case 2:
				System.out.println("Enter grade level");
				list = lessonService.se2a2r2c2B2yG2ra2de(InputValidationService.inputInt());
				if (list.size()>=1) {
					lessonService.p2r2i2n2t2L2e2s2s2o2n2s(list);
					flag = !initUpdateBooking(bookingId);
				}
				else {
					System.out.println("no data found , try with another one");
				}
				
				break;
			case 3:
				System.out.println("Enter coach name");
				list = lessonService.se2a2r2c2ByC2o2a2ch(InputValidationService.inputString());
				if (list.size()>=1) {
					lessonService.p2r2i2n2t2L2e2s2s2o2n2s(list);
					flag = !initUpdateBooking(bookingId);
				}
				else {
					System.out.println("no data found , try with another one");
				}
				
				break;
			case 4:
				System.out.println("back");
				flag = false;
				break;
			default:
				System.out.println("invalid input , try again");
				break;
			}

		}

	}
	
	public void initSearchBooking() {
		boolean flag = true;
		List<LessonModel> list = new ArrayList<LessonModel>();
		while (flag) {

			printLessonSearchMenu();
			switch (InputValidationService.inputInt()) {
			case 1:
				System.out.println("Enter Day ");

				list = lessonService.se2a2r2c2B2y2D2a2y(InputValidationService.inputString());
				if (list.size()>=1) {
					lessonService.p2r2i2n2t2L2e2s2s2o2n2s(list);
					flag = !initBooking();
				}
				else {
					System.out.println("no data found , try with another one");
				}
				

				

				break;
			case 2:
				System.out.println("Enter grade level");
				list = lessonService.se2a2r2c2B2yG2ra2de(InputValidationService.inputInt());
				if (list.size()>=1) {
					lessonService.p2r2i2n2t2L2e2s2s2o2n2s(list);
					flag = !initBooking();
				}
				else {
					System.out.println("no data found , try with another one");
				}
				
				break;
			case 3:
				System.out.println("Enter coach name");
				list = lessonService.se2a2r2c2ByC2o2a2ch(InputValidationService.inputString());
				if (list.size()>=1) {
					lessonService.p2r2i2n2t2L2e2s2s2o2n2s(list);
					flag = !initBooking();
				}
				else {
					System.out.println("no data found , try with another one");
				}
				
				break;
			case 4:
				System.out.println("back");
				flag = false;
				break;
			default:
				System.out.println("invalid input , try again");
				break;
			}

		}

	}

	public boolean initBooking() {

		boolean flag = false;

		System.out.println("Enter lesson Id from the above list for booking");
		int lessonId = InputValidationService.inputInt();
		if (lessonService.is2E2x2i2st(lessonId)) {
			flag = bookingService.newBooking(LoginService.lo2g2e2d2I2nL2e2a2r2n2e2r.getId(), lessonId);
		} else {
			System.out.println("Invalid lesson id ");
		}

		return flag;
	}
	
	
	public boolean initUpdateBooking(int bookingId) {

		boolean flag = false;

		System.out.println("Enter lesson Id from the above list for booking");
		int lessonId = InputValidationService.inputInt();
		if (lessonService.is2E2x2i2st(lessonId)) {
			flag=bookingService.initUpdateBooking(bookingId,LoginService.lo2g2e2d2I2nL2e2a2r2n2e2r.getId() ,lessonId);
		} else {
			System.out.println("Invalid lesson id ");
		}

		return flag;
	}
	

	public void initChangeCancel() {

		boolean flag = true;
		int bookingId = 0;
		
		while (flag) {

			printChangeCancelMenu();
			switch (InputValidationService.inputInt()) {
			case 1:
				System.out.println("cancel booking ");
				bookingService.printBookings(LoginService.lo2g2e2d2I2nL2e2a2r2n2e2r.getId());
				System.out.println("Enter id to cancel");
				
				bookingId = InputValidationService.inputInt();

				if(bookingService.is2B2o2o2k2e2d2B2y2L2e2a2r2ner(bookingId, LoginService.lo2g2e2d2I2nL2e2a2r2n2e2r.getId())) {
					bookingService.ca2n2c2e2l2B2o2o2k2ing(bookingId);
					System.out.println("Booking canceled");
				}
				else {
					System.out.println("Please enter correct id");
				}
				

				
				

				break;
			case 2:   
				System.out.println("change booking ");
				bookingService.printBookings(LoginService.lo2g2e2d2I2nL2e2a2r2n2e2r.getId());
				System.out.println("Enter id to change");
			
				bookingId = InputValidationService.inputInt();

				
				if(bookingService.is2B2o2o2k2e2d2B2y2L2e2a2r2ner(bookingId, LoginService.lo2g2e2d2I2nL2e2a2r2n2e2r.getId())) {
					initSearchUpdateBooking(bookingId);
				}
				else {
					System.out.println("Please enter correct id");
				}
				
				break;

			case 3:
				System.out.println("back");
				flag = false;
				break;
			default:
				System.out.println("invalid input , try again");
				break;
			}

		}

	}

	public void attendAndReview() {
		int bookingId = 0;
		int rating = 0;
		String review = "";
		bookingService.printBookings(LoginService.lo2g2e2d2I2nL2e2a2r2n2e2r.getId());
		System.out.println("Enter booking id to Attend");

		bookingId = InputValidationService.inputInt();
		while (!bookingService.i2s2B2o2o2k2i2n2g2E2x2i2st(bookingId)) {
			System.out.println("Please enter correct id");
			bookingId = InputValidationService.inputInt();

		}

		System.out.println("Please enter rating from 1-5");
		rating = InputValidationService.inputInt();
		while (!(rating >= 1 && rating <= 5)) {
			System.out.println("Invalid input , Please enter rating from 1-5");
			rating = InputValidationService.inputInt();

		}
		
		System.out.println("Enter review ");

		review = InputValidationService.inputString();

		reviewService.submitReview(bookingId, rating, review);

		System.out.println("Lesson attended and review submited");

	}
	
	public void printLearnerMenu() {
		System.out.println("\n");
		System.out.println("Press.....\r");
		System.out.println(" 1. Book a swimming lesson\r\n" + " 2. Change/Cancel a booking\r\n"
				+ " 3. Attend a swimming lesson\r\n" + " 0. Logout\r\n" + "");
		System.out.println("Enter your choise..\n");
	}

	public void printLessonSearchMenu() {
		System.out.println("\n");
		System.out.println("Press.....\r");
		System.out.println(" 1. Search by specifying the day\r\n" + " 2. By specifying the grade level\r\n"
				+ " 3. by specifying the coach’s name\r\n" + " 4. Go back\r\n" + "");
		System.out.println("Enter your choise..\n");
	}

	public void printChangeCancelMenu() {
		System.out.println("\n");
		System.out.println("Press.....\r");
		System.out.println(" 1. Cancel booking\r\n" + " 2. Change booking\r\n" + " 3. Go back\r\n" + "");
		System.out.println("Enter your choise..\n");
	}
	
	public void learnerMenu() {

		boolean flag = true;

		while (flag) {
			printLearnerMenu();

			switch (InputValidationService.inputInt()) {
			case 1:
				initSearchBooking();
				break;
			case 2:
				initChangeCancel();
				break;
			case 3:
				attendAndReview();
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
	
	public void init() {
		LearnerModel learner=LoginService.lo2g2e2d2I2nL2e2a2r2n2e2r;
		System.out.println("Welcome "+learner.getName());
		System.out.println("Learner details :\n");
		
		
		System.out.printf("%-3s | %-13s | %-6s | %-6s | %-15s  |%s%n", "ID","Name","Gender","Age","Phone","Level");
		System.out.println("-------------------------------------------------------------------------------------");
		
		System.out.printf("%-3s | %-13s | %-6s | %-6s | %-15s  |%s%n", 
				learner.getId(),learner.getName(),learner.getGender(),
				learner.getAge(),learner.getPhone(),learner.getLevel());
		
		learnerMenu();
	}

}
