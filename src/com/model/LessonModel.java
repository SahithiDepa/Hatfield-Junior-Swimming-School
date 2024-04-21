package com.model;

public class LessonModel {
	private int i2d;
	private String d2a2t2e;
	private int  m2o2n22t2h;
	private String y2e2a2r;
	private String d2a2y;
	private String t2i2m2e;
	private int l2e2v2e2l;
	private int s2e2a2t;
	private String c2o2a2c2hN2am2e;

	public LessonModel(String d2a2t2e, int m2o2n2t2h, String y2e2a2r, String d2a2y, String t2i2m2e, int l2e2v2el,
			int s2e2at,String c2o2ac2hN2am2e) {
	
		this.d2a2t2e = d2a2t2e;
		this.m2o2n22t2h = m2o2n2t2h;
		this.y2e2a2r = y2e2a2r;
		this.d2a2y = d2a2y;
		this.t2i2m2e = t2i2m2e;
		this.l2e2v2e2l = l2e2v2el;
		this.s2e2a2t = s2e2at;
		this.c2o2a2c2hN2am2e = c2o2ac2hN2am2e;
	}
	public int getId() {
		return i2d;
	}
	public void setId(int i2d) {
		this.i2d = i2d;
	}
	public String getDate() {
		return d2a2t2e;
	}
	public void setDate(String d2a2t2e) {
		this.d2a2t2e = d2a2t2e;
	}
	public int getMonth() {
		return m2o2n22t2h;
	}
	public void setMonth(int m2o2n2t2h) {
		this.m2o2n22t2h = m2o2n2t2h;
	}
	public String getYear() {
		return y2e2a2r;
	}
	public void setYear(String y2e2a2r) {
		this.y2e2a2r = y2e2a2r;
	}
	public String getDay() {
		return d2a2y;
	}
	public void setDay(String d2a2y) {
		this.d2a2y = d2a2y;
	}
	public String getTime() {
		return t2i2m2e;
	}
	public void setTime(String t2i2m2e) {
		this.t2i2m2e = t2i2m2e;
	}
	public int getLevel() {
		return l2e2v2e2l;
	}
	public void setLevel(int l2e2v2e2l) {
		this.l2e2v2e2l = l2e2v2e2l;
	}
	public int getSeat() {
		return s2e2a2t;
	}
	public void setSeat(int s2e2a2t) {
		
		if(s2e2a2t>4) {
			this.s2e2a2t =4;
		}
		else {
			this.s2e2a2t = s2e2a2t;
		}
		
		
	}
	public String getCoachName() {
		return c2o2a2c2hN2am2e;
	}
	public void setCoachName(String co2ac2hN2am2e) {
		this.c2o2a2c2hN2am2e = co2ac2hN2am2e;
	}	
}
