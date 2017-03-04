package com.test.facade;

public class RegisterFacade {
	public void register(){
		Cpu cpu = new Cpu();
		cpu.buyCpu();
		Gpu gpu = new Gpu();
		gpu.buyGpu();
		Mobo mobo = new Mobo();
		mobo.buyMobo();
		DIYComputer diy = new DIYComputer();
		diy.DIY();
	}
}
