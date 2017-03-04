package com.test.chainofresponsiblity;

public abstract class Leader {
	protected String name;
	protected Leader nextLeader;
	public Leader(String name) {
		super();
		this.name = name;
	}
	
	public void setLeader(Leader nextLeader){
		this.nextLeader = nextLeader;
	}
	
	public abstract void hanlderRequest(LeaveRequest request);
}

/**
 * 主任
 * @author joey
 *
 */
class Director extends Leader{
	public Director(String name) {
		super(name);
	}
	@Override
	public void hanlderRequest(LeaveRequest request) {
		if(request.getLeaveDays()<=3){
			System.out.println("员工："+request.getName()+" 需要请假 "+request.getLeaveDays()+" 天");
			System.out.println("主任 "+this.name+" 审批通过");
		}else{
			System.out.println("员工："+request.getName()+" 需要请假 "+request.getLeaveDays()+" 天");
			System.out.println("主任 "+this.name+" 没有权限审批，交由上一级领导审批");
			this.nextLeader.hanlderRequest(request);
		}
	}
}

/**
 * 经理
 * @author joey
 *
 */
class Manager extends Leader{
	public Manager(String name) {
		super(name);
	}

	@Override
	public void hanlderRequest(LeaveRequest request) {
		if(request.getLeaveDays() > 3 && request.getLeaveDays()<=10){
			System.out.println("员工："+request.getName()+" 需要请假 "+request.getLeaveDays()+" 天");
			System.out.println("经理 "+this.name+" 审批通过");
		}else{
			System.out.println("一共请假"+request.getLeaveDays()+"天，这么多天，不给请");
		}
	}
}

