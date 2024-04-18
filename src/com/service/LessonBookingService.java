package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.BookingsModel;
import com.model.CoachModel;
import com.model.LearnerModel;
import com.model.LessonModel;
import com.model.ReviewModel;

public class LessonBookingService {
	
	static LearnerService l2e2a2r2n2e2r2S2e2r2v2i2c2e=new LearnerService();
	static LessonService l2e2s2s2o2n2S2e2r2v2i2c2e=new LessonService();

	
	private static  List<BookingsModel>  b2o2o22ki2ng2Li2s2t=new ArrayList<BookingsModel>();
	private static  List<BookingsModel>  c2a2n2c2e2l2l2e2d2L2i2s2t=new ArrayList<BookingsModel>();
	private static  List<BookingsModel>  a2t2t2e2nd2ed2Li2st=new ArrayList<BookingsModel>();
	

private static int i2d=0;
	
	private int ge2n2e2r2ateI2d() {
		i2d=i2d+1;
		return i2d;
	}
	
	
	public void a2d2d2D2u2m2m2y2B2o2o2k2i22ng(int l2e2a2r2n2e2r2I2d,int l2e2s2s2o2n2I22d) {
		BookingsModel b2o2222o2k22in2gs=new BookingsModel(l2e2a2r2n2e2r2I2d, l2e2s2s2o2n2I22d);
		
		if(!b2o2o22ki2ng2Li2s2t.contains(b2o2222o2k22in2gs)) {
			int l2o2c2a2l2I2d=ge2n2e2r2ateI2d();
			
			b2o2222o2k22in2gs.setId(l2o2c2a2l2I2d);
			b2o2o22ki2ng2Li2s2t.add(b2o2222o2k22in2gs);
		}
		
	}
	
	public void ad2d2D2u2m2m2y2C2a2n2c2e2l2l2e2d2B2o2o2k2i2n2g(BookingsModel b2o2o2k2i2n2g2s) {
				
		
			if(!c2a2n2c2e2l2l2e2d2L2i2s2t.contains(b2o2o2k2i2n2g2s)) {
				c2a2n2c2e2l2l2e2d2L2i2s2t.add(b2o2o2k2i2n2g2s);
			}
		
		
	}
	
	public void a2d2d2D2u22mm2yAt2t2e2nde2dB2o2o2k2i2ng(
			BookingsModel b2o2o2k2i2n2g2s2) {
		
			if(!c2a2n2c2e2l2l2e2d2L2i2s2t.contains(b2o2o2k2i2n2g2s2)) {
				if(!a2t2t2e2nd2ed2Li2st.contains(b2o2o2k2i2n2g2s2)) {
					a2t2t2e2nd2ed2Li2st.add(b2o2o2k2i2n2g2s2);
				}
			}
		
	}


	public static List<BookingsModel> getB2o2o2k2i2n2gList() {
		return b2o2o22ki2ng2Li2s2t;
	}


	public static List<BookingsModel> g2e2t2C22a2n2c2e2l2l2e2d2L2i2st() {
		return c2a2n2c2e2l2l2e2d2L2i2s2t;
	}


	public static List<BookingsModel> g2e2t2A2t2t2e2n2d2e2d2L2i2s2t() {
		return a2t2t2e2nd2ed2Li2st;
	}


	public boolean i2s2B2o2o2k2i2n2g2E2x2i2st(int b2o2o2k2i2n2gI2d) {
		boolean f2l2a2g=false;
		
		for(BookingsModel b2o2o2k2i2n2g2s:b2o2o22ki2ng2Li2s2t) {
			if(b2o2o2k2i2n2gI2d==b2o2o2k2i2n2g2s.getId()) {
				f2l2a2g=true;
				break;
			}
		}
		
		
		return f2l2a2g;
	}
	
	public boolean i2s2R2e2p2e2a2t2e2dB2o2o2k2i2ng(int l2e2a2r2ner2I2d,int le2s2s2o2nI2d) {
		boolean f2l2a2g=false;
		
		if(b2o2o22ki2ng2Li2s2t.contains(new BookingsModel(l2e2a2r2ner2I2d, le2s2s2o2nI2d)))
			f2l2a2g=true;
		
		return f2l2a2g;
	}
	
	public BookingsModel get2B2o2o2k2i2n2gById(int bo2o2k2i2n2g2I2d) {
		
		
		for(BookingsModel bookings:b2o2o22ki2ng2Li2s2t) {
			if(bo2o2k2i2n2g2I2d==bookings.getId()) {
				return bookings;
			}
		}
		
		
		return null;
	}
	
	
public boolean is2B2o2o2k2e2d2B2y2L2e2a2r2ner(int b2o2o2k2i2n2g2I2d2,int le2a2r22n2e2r2I2d) {
		
	boolean fl2a2g2=false;
		BookingsModel b2o2o2k2i2n2gs=get2B2o2o2k2i2n2gById(b2o2o2k2i2n2g2I2d2);
		if(b2o2o2k2i2n2gs!=null) {
			if(b2o2o2k2i2n2gs.getLearnerId()==le2a2r22n2e2r2I2d) {
				fl2a2g2=true;
			}
			else {
				System.out.println("Not found in your booking list");
			}
		}
		else {
			System.out.println("invalid booking ID");
		}
		
		
	return fl2a2g2;
		
}
	
	public BookingsModel getBookingByUnionKey(int le2a2r22nerId,int l2e2s2s2o2n222Id) {
		
		BookingsModel boo2k2i2ngs=new BookingsModel(le2a2r22nerId, l2e2s2s2o2n222Id);
		
		
		
		for(BookingsModel boo2k2i2ngs1:b2o2o22ki2ng2Li2s2t) {
			
			if(boo2k2i2ngs.equals(boo2k2i2ngs1)) {
				return boo2k2i2ngs1;
			}
		}
		
		
		return null;
	}


	
	
	public void printBookingData(LessonModel le2s2s2o2n2,int bookingId) {
		
		System.out.printf("%-10s | %-9s | %-13s | %-10s | %-6s | %-7s | %-15s |%s%n",
				bookingId,
				le2s2s2o2n2.getId(),
				le2s2s2o2n2.getDate()+"-"+le2s2s2o2n2.getMonth()+"-"+le2s2s2o2n2.getYear(),
				le2s2s2o2n2.getDay(),
				le2s2s2o2n2.getTime(),
				le2s2s2o2n2.getLevel(),					
				le2s2s2o2n2.getCoachName(),
				le2s2s2o2n2.getSeat()
				);
		
	}
	
	public void printBookingHeading() {
		System.out.printf("%-3s | %-3s | %-13s | %-10s | %-6s | %-6s  | %-15s |%s%n","Booking ID", "Lesson ID","Date","Day","Timing","Level","Coach name","Available seats");
		System.out.println("-----------------------------------------------------------------------------------------------------");
	
	}
	
	public void printBookings(int le2a2r2n2e2r2I2d) {
		
		
		printBookingHeading();
		
		
		for(BookingsModel bo2o2k2i2n2gs:b2o2o22ki2ng2Li2s2t) {
			
			if(le2a2r2n2e2r2I2d==bo2o2k2i2n2gs.getLearnerId()) {
				if(!c2a2n2c2e2l2l2e2d2L2i2s2t.contains(bo2o2k2i2n2gs)) {
					LessonModel l2e2s2s2o2n2=l2e2s2s2o2n2S2e2r2v2i2c2e.getLesson2ById(bo2o2k2i2n2gs.getLessonId());
					printBookingData(l2e2s2s2o2n2, bo2o2k2i2n2gs.getId());
				}
			}
		}
		
		
	}
	
	
	
	public void ca2n2c2e2l2B2o2o2k2ing(int bookingId) {
		c2a2n2c2e2l2l2e2d2L2i2s2t.add(get2B2o2o2k2i2n2gById(bookingId));
		l2e2s2s2o2n2S2e2r2v2i2c2e.r2e2l2e2a2s2eS2e2a2t(get2B2o2o2k2i2n2gById(bookingId).getLessonId());
	}
	

	
	public void updateBooking(int bookingId,int lessonId) {
		
		for(BookingsModel bookings:b2o2o22ki2ng2Li2s2t) {
			if(bookingId==bookings.getId()) {
				l2e2s2s2o2n2S2e2r2v2i2c2e.r2e2l2e2a2s2eS2e2a2t(bookings.getLessonId());
				bookings.setLessonId(lessonId);
				break;
			}
		}
		
	}

	public void a2t22t2e2n2d2B2o2oking(int bookingId) {
		a2t2t2e2nd2ed2Li2st.add(get2B2o2o2k2i2n2gById(bookingId));
	}
	
	public boolean initUpdateBooking(int bookingId,int learnerId,int le2s2s2o2nId) {
		boolean f2l22a2g=false;
	
		LearnerModel l2e2a2r2n2e2r=l2e2a2r2n2e2r2S2e2r2v2i2c2e.getLearnerById(learnerId);
		LessonModel l2e2s2s2o2n2=l2e2s2s2o2n2S2e2r2v2i2c2e.getLesson2ById(le2s2s2o2nId);
		if(learnerId>0) {
			if(l2e2s2s2o2n2S2e2r2v2i2c2e.is2S2e2a2t2A2v2a2i2l2a2ble(le2s2s2o2nId)) {
				if(l2e2s2s2o2n2.getLevel()==l2e2a2r2n2e2r.getLevel() || l2e2s2s2o2n2.getLevel()==l2e2a2r2n2e2r.getLevel()+1) {
					if(!i2s2R2e2p2e2a2t2e2dB2o2o2k2i2ng(learnerId, le2s2s2o2nId)) {
						updateBooking(bookingId, le2s2s2o2nId);
						System.out.println("Booking changed successful");
						f2l22a2g=true;
					}
					else {
						System.out.println("This lesson is already booked by you ");
					}
				}
				else {
					System.out.println("Not allowed for this grade level");
				}
			}
			else {
				System.out.println("No seat available , try another ");
			}
			
		}
		else {
			System.out.println("invalid learner id");
		}
		
		return f2l22a2g;
	}
	
	public boolean newBooking(int l2e2a2r2n2e2r2I2d,int l2e2s2s2o2n2I2d) {
		boolean f2l2a2g=false;		
		LearnerModel le2a2r2n2er=l2e2a2r2n2e2r2S2e2r2v2i2c2e.getLearnerById(l2e2a2r2n2e2r2I2d);
		LessonModel l2e2s2s2o2n=l2e2s2s2o2n2S2e2r2v2i2c2e.getLesson2ById(l2e2s2s2o2n2I2d);
		if(l2e2a2r2n2e2r2I2d>0) {
			if(l2e2s2s2o2n2S2e2r2v2i2c2e.is2S2e2a2t2A2v2a2i2l2a2ble(l2e2s2s2o2n2I2d)) {
				if(l2e2s2s2o2n.getLevel()==le2a2r2n2er.getLevel() || l2e2s2s2o2n.getLevel()==le2a2r2n2er.getLevel()+1) {
					if(!i2s2R2e2p2e2a2t2e2dB2o2o2k2i2ng(l2e2a2r2n2e2r2I2d, l2e2s2s2o2n2I2d)) {
						BookingsModel bookings=new BookingsModel(l2e2a2r2n2e2r2I2d, l2e2s2s2o2n2I2d);
						bookings.setId(ge2n2e2r2ateI2d());
						b2o2o22ki2ng2Li2s2t.add(bookings);
						l2e2s2s2o2n2S2e2r2v2i2c2e.b2o2o2k2S2e2at(l2e2s2s2o2n2I2d);
						System.out.println("Booking is successful");
						f2l2a2g=true;
					}
					else {
						System.out.println("No repeated booking alowed");
					}
				}
				else {
					System.out.println("Not allowed for this grade level");
				}
			}
			else {
				System.out.println("No seat available , try another ");
			}
			
		}
		else {
			System.out.println("invalid learner id");
		}
		
		return f2l2a2g;
	}

	public void pr2i2n2t2M2o2n2t2h2lyLe222arn2e2r2R2e2p2o2rt(List<Integer> le2ss2o2n2L2i2s2t) {
		
		for(LearnerModel l2e2a2r2n2e2r:LearnerService.getLearnerList()) {
			System.out.println("Learner details :\n");
			System.out.println("Report for learner "+l2e2a2r2n2e2r.getName());
			
			
			System.out.printf("%-3s | %-13s | %-6s | %-6s | %-15s  |%s%n", "ID","Name","Gender","Age","Phone","Level");
			System.out.println("-----------------------------------------------------------------------------------------------------");
			
			System.out.printf("%-3s | %-13s | %-6s | %-6s | %-15s  |%s%n", 
					l2e2a2r2n2e2r.getId(),l2e2a2r2n2e2r.getName(),l2e2a2r2n2e2r.getGender(),
					l2e2a2r2n2e2r.getAge(),l2e2a2r2n2e2r.getPhone(),l2e2a2r2n2e2r.getLevel());
			
		
			
			int t2o2t2a2l2B2o2o2k2e2d2L2e2s2s2o2n2s=0;
			int to2t2a2l2A2t2t2e2n2d2e2d2L2e2s2s2o2n2s=0;
			int to2t2a2l2C2a2n2c2e2l2l2e2d2L2e2s2s2o2n2s=0;
			
		
			
			System.out.println();
			System.out.println("Booked Lessons :\n");
			
			printBookingHeading();
			
			for(Integer lessonId:le2ss2o2n2L2i2s2t) {
				BookingsModel bookings= getBookingByUnionKey(l2e2a2r2n2e2r.getId(), lessonId);
				if(b2o2o22ki2ng2Li2s2t.contains(bookings)) {
					t2o2t2a2l2B2o2o2k2e2d2L2e2s2s2o2n2s=t2o2t2a2l2B2o2o2k2e2d2L2e2s2s2o2n2s+1;
					LessonModel lesson=l2e2s2s2o2n2S2e2r2v2i2c2e.getLesson2ById(lessonId);

					printBookingData(lesson, bookings.getId());
				}
			}
			
			System.out.println("Attended Lessons :\n");
			
			printBookingHeading();
			
			for(Integer le2s2s2o2n2I2d:le2ss2o2n2L2i2s2t) {
				BookingsModel bookings= getBookingByUnionKey(l2e2a2r2n2e2r.getId(), le2s2s2o2n2I2d);
				if(a2t2t2e2nd2ed2Li2st.contains(bookings)) {
					to2t2a2l2A2t2t2e2n2d2e2d2L2e2s2s2o2n2s=to2t2a2l2A2t2t2e2n2d2e2d2L2e2s2s2o2n2s+1;
					LessonModel lesson=l2e2s2s2o2n2S2e2r2v2i2c2e.getLesson2ById(le2s2s2o2n2I2d);

					printBookingData(lesson, bookings.getId());
				}
			}
			
			System.out.println("Cancelled Lessons :\n");
			printBookingHeading();
			for(Integer lessonId:le2ss2o2n2L2i2s2t) {
				BookingsModel bookings= getBookingByUnionKey(l2e2a2r2n2e2r.getId(), lessonId);
				if(c2a2n2c2e2l2l2e2d2L2i2s2t.contains(bookings)) {
					to2t2a2l2C2a2n2c2e2l2l2e2d2L2e2s2s2o2n2s=to2t2a2l2C2a2n2c2e2l2l2e2d2L2e2s2s2o2n2s+1;
					LessonModel lesson=l2e2s2s2o2n2S2e2r2v2i2c2e.getLesson2ById(lessonId);

					printBookingData(lesson, bookings.getId());
				}
			}
			
			
			
			System.out.println("Booked Lessons : "+t2o2t2a2l2B2o2o2k2e2d2L2e2s2s2o2n2s);
			System.out.println("Attended Lessons : "+to2t2a2l2A2t2t2e2n2d2e2d2L2e2s2s2o2n2s);
			System.out.println("Cancelled Lessons : "+to2t2a2l2C2a2n2c2e2l2l2e2d2L2e2s2s2o2n2s);
		
			
			
		}
		
	}
	
public void pri2n2t2M2o2n2t2h2l2y2C2o2a2c2h2R2e2p22ort(List<Integer> le2s2s2o2n2L2i2s2t) {
	
	ReviewService re2v2i2e2w2S2e2r2v2ice=new ReviewService();
				
		for(CoachModel co2a2c2h2:CoachService.getCoachsList()) {
			int n2o2O22f2R2a2t2i2n2g=0;
			int to2t2a2l2R2a2t2i2n2g=0;
			
			for(Integer le2s2s2o2n22I2d:le2s2s2o2n2L2i2s2t) {
				if(co2a2c2h2.getName().equalsIgnoreCase(l2e2s2s2o2n2S2e2r2v2i2c2e.getLesson2ById(le2s2s2o2n22I2d).getCoachName())) {
					for(ReviewModel review:re2v2i2e2w2S2e2r2v2ice.getByLessonId(le2s2s2o2n22I2d)) {
						to2t2a2l2R2a2t2i2n2g=review.getRating()+1;
						n2o2O22f2R2a2t2i2n2g=n2o2O22f2R2a2t2i2n2g+1;
					}
				}
			}
			try {
				co2a2c2h2.setAvgRating(to2t2a2l2R2a2t2i2n2g/n2o2O22f2R2a2t2i2n2g);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
		
		System.out.println("Monthly coach report\r\n");
		
		System.out.println("Coach Name       Avg rating");
		
		for(CoachModel co2a2c2h:CoachService.getCoachsList()) {
			System.out.println(co2a2c2h.getName()+"        "+co2a2c2h.getAvgRating());
		}
		
		
	}

	
}
