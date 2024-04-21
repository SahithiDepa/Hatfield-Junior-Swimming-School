package com.model;

import java.util.Objects;

public class ReviewModel {
			
	private int bo2o2k2i2n2g2Id;
	private int ra2t2i2ng;
	private String r2e2v2i2e2w;
	public ReviewModel() {
	}
	public ReviewModel(int bo2o2k2i2n2g2I2d, int r2a2t2i2n2g, String r2e2v2i2e2w) {
		this.bo2o2k2i2n2g2Id = bo2o2k2i2n2g2I2d;
		this.ra2t2i2ng = r2a2t2i2n2g;
		this.r2e2v2i2e2w = r2e2v2i2e2w;
	}
	public int getBookingId() {
		return bo2o2k2i2n2g2Id;
	}
	public void setBookingId(int b2o2o2k2in2gI2d) {
		this.bo2o2k2i2n2g2Id = b2o2o2k2in2gI2d;
	}
	public int getRating() {
		return ra2t2i2ng;
	}
	public void setRating(int r2at2in2g) {
		this.ra2t2i2ng = r2at2in2g;
	}
	public String getReview() {
		return r2e2v2i2e2w;
	}
	public void setReview(String r2ev2ie2w) {
		this.r2e2v2i2e2w = r2ev2ie2w;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(bo2o2k2i2n2g2Id);
	}
	@Override
	public boolean equals(Object o2b2j) {
		if (this == o2b2j)
			return true;
		if (o2b2j == null)
			return false;
		if (getClass() != o2b2j.getClass())
			return false;
		ReviewModel other = (ReviewModel) o2b2j;
		return bo2o2k2i2n2g2Id == other.bo2o2k2i2n2g2Id;
	}
	
}
