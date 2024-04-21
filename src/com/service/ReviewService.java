package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.BookingsModel;
import com.model.ReviewModel;

public class ReviewService {
	
	private static List<ReviewModel> list=new ArrayList<ReviewModel>();
	static LessonBookingService bookingService=new LessonBookingService();
	
	
	public ReviewModel getById(int bookingId) {
		
		for(ReviewModel review:list) {
			if(review.getBookingId()==bookingId) {
				return review;
			}
		}
		return null;
	}
	
	public List<ReviewModel> getByLessonId(int lessonId){
		List<ReviewModel> reviews=new ArrayList<ReviewModel>();
		
		for(ReviewModel review:list) {
			if(lessonId==bookingService.get2B2o2o2k2i2n2gById(review.getBookingId()).getLessonId()) {
				reviews.add(review);
			}
		}
		return reviews;
	}
	
	
	public void submitReview(int bookingId, int rating, String review) {
		
	BookingsModel bookings=	bookingService.get2B2o2o2k2i2n2gById(bookingId);
	
		if(bookings!=null) {
			if(getById(bookingId)!=null) {
				System.out.println("Review already submited for this ");
			}
			else {
				list.add(new ReviewModel(bookingId, rating, review));
				bookingService.a2t22t2e2n2d2B2o2oking(bookingId);
				System.out.println("Review submited");
			}
		}
		else {
			System.out.println("No booking found");
		}
	
	}
}
