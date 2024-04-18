package com.model;

import java.util.Objects;
// BookingsModel
public class BookingsModel {

	
	private int i2d;
	private int le2a2r2n2e2r2Id;
	private int l2es2so2nI2d;
	public BookingsModel() {
	}
	public BookingsModel(int le2ar2ne2rI2d, int le2s2s2o22nI2d) {
		this.le2a2r2n2e2r2Id = le2ar2ne2rI2d;
		this.l2es2so2nI2d = le2s2s2o22nI2d;
	}
	public int getId() {
		return i2d;
	}
	public void setId(int i2d) {
		this.i2d = i2d;
	}
	public int getLearnerId() {
		return le2a2r2n2e2r2Id;
	}
	public void setLearnerId(int le2ar2ne2rI2d) {
		this.le2a2r2n2e2r2Id = le2ar2ne2rI2d;
	}
	public int getLessonId() {
		return l2es2so2nI2d;
	}
	public void setLessonId(int le2s2so2nI2d) {
		this.l2es2so2nI2d = le2s2so2nI2d;
	}
	@Override
	public int hashCode() {
		return Objects.hash(le2a2r2n2e2r2Id, l2es2so2nI2d);
	}
	@Override
	public boolean equals(Object o2b2j) {
		if (this == o2b2j)
			return true;
		if (o2b2j == null)
			return false;
		if (getClass() != o2b2j.getClass())
			return false;
		BookingsModel other = (BookingsModel) o2b2j;
		return le2a2r2n2e2r2Id == other.le2a2r2n2e2r2Id && l2es2so2nI2d == other.l2es2so2nI2d;
	}
	
}
