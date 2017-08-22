package com.dan.seckill.entity;

import java.util.Date;

public class Seckill {

	private long seckillTd;

	private String name;

	private int number;

	private Date startTime;

	private Date endTime;

	private Date createTime;

	public Seckill() {
		super();
	}

	public Seckill(long seckillTd, String name, int number, Date startTime, Date endTime, Date createTime) {
		super();
		this.seckillTd = seckillTd;
		this.name = name;
		this.number = number;
		this.startTime = startTime;
		this.endTime = endTime;
		this.createTime = createTime;
	}

	public long getSeckillTd() {
		return seckillTd;
	}

	public void setSeckillTd(long seckillTd) {
		this.seckillTd = seckillTd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Seckill [seckillTd=" + seckillTd + ", name=" + name + ", number=" + number + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", createTime=" + createTime + "]";
	}

}
