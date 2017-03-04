package com.test.mediator;

public interface IDepartment {
	
	void selfAction();
	
	void outAction();
}

/**
 * the development department
 * @author joey
 *
 */
class Development implements IDepartment{
	private IMediator mediator;
	
	public Development(IMediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("develop", this);
	}

	@Override
	public void selfAction() {
		System.out.println("coding");
	}

	@Override
	public void outAction() {
		mediator.command("sales");
	}
}

/**
 * the Sales department
 * @author joey
 *
 */
class Sales implements IDepartment{
	private IMediator mediator;
	
	public Sales(IMediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("sales", this);
	}

	@Override
	public void selfAction() {
		System.out.println("sale software");
	}

	@Override
	public void outAction() {
		mediator.command("develop");
	}
	
}