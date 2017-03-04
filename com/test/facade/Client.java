package com.test.facade;

public class Client {
	public static void main(String[] args) {
//		Cpu cpu = new Cpu();
//		cpu.buyCpu();
//		Gpu gpu = new Gpu();
//		gpu.buyGpu();
//		Mobo mobo = new Mobo();
//		mobo.buyMobo();
//		DIYComputer diy = new DIYComputer();
//		diy.DIY();
		new RegisterFacade().register();
	}
}
