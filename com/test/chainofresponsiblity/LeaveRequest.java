package com.test.chainofresponsiblity;

/**
 * 请假申请
 * @author joey
 *
 */
public class LeaveRequest {
	private int leaveDays;
	private String name;
	public LeaveRequest(int leaveDays, String name) {
		super();
		this.leaveDays = leaveDays;
		this.name = name;
	}
	public int getLeaveDays() {
		return leaveDays;
	}
	public String getName() {
		return name;
	}
}
