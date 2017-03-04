package com.test.factory.abstractFactory;
/**
 * 工厂类
 * @author joey
 *
 */
public interface CarFactory {
	Engine createEngine();
	Seat createSeat();
	Tyre createTyre();
}
