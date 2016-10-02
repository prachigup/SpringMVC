package com.prachi.common.model;

public class M2000 {
	private int pnum;
	private String status;
	private int race;
	private int weight;
	private int height;
	private int isVeg;
	public M2000() {
		super();
	}
	public M2000(int pnum, String status, int race, int weight, int height, int isVeg) {
		super();
		this.pnum = pnum;
		this.status = status;
		this.race = race;
		this.weight = weight;
		this.height = height;
		this.isVeg = isVeg;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getRace() {
		return race;
	}
	public void setRace(int race) {
		this.race = race;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getIsVeg() {
		return isVeg;
	}
	public void setIsVeg(int isVeg) {
		this.isVeg = isVeg;
	}
	@Override
	public String toString() {
		return "M2000 [pnum=" + pnum + ", status=" + status + ", race=" + race + ", weight=" + weight + ", height="
				+ height + ", isVeg=" + isVeg + "]";
	}
}
