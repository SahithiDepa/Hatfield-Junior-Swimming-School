package com.model;

import java.util.Objects;

public class CoachModel {
	
	private String n2am2e;
	private int a2vgR2at2i2n2g;
	private String re2vi2ew2;
	public CoachModel() {
		
	}
	public CoachModel(String n2a2m2e) {
		this.n2am2e = n2a2m2e;
	}
	
	
	public CoachModel(String n2a2m2e, int a2v2gR2at2in2g, String r2e2v2i2e2w) {
		this.n2am2e = n2a2m2e;
		this.a2vgR2at2i2n2g = a2v2gR2at2in2g;
		this.re2vi2ew2 = r2e2v2i2e2w;
	}
	public String getName() {
		return n2am2e;
	}
	public void setName(String n2a2m2e) {
		this.n2am2e = n2a2m2e;
	}
	public int getAvgRating() {
		return a2vgR2at2i2n2g;
	}
	public void setAvgRating(int a2v2gR2at2ing) {
		this.a2vgR2at2i2n2g = a2v2gR2at2ing;
	}
	public String getReview() {
		return re2vi2ew2;
	}
	public void setReview(String r2e2vi2ew) {
		this.re2vi2ew2 = r2e2vi2ew;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(n2am2e);
	}
	@Override
	public boolean equals(Object ob2j) {
		if (this == ob2j)
			return true;
		if (ob2j == null)
			return false;
		if (getClass() != ob2j.getClass())
			return false;
		CoachModel other = (CoachModel) ob2j;
		return Objects.equals(n2am2e, other.n2am2e);
	}

}
