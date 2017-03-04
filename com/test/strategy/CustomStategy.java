package com.test.strategy;

public interface CustomStategy {
	double getPrice(double originPrice);
}

class OldCustomFew implements CustomStategy{
	@Override
	public double getPrice(double originPrice) {
		System.out.println("10 persent off");
		return originPrice*0.90;
	}
}

class OldCustomHuge implements CustomStategy{
	@Override
	public double getPrice(double originPrice) {
		System.out.println("15 persent off");
		return originPrice*0.85;
	}
}


class NewCustomFew implements CustomStategy{
	@Override
	public double getPrice(double originPrice) {
		System.out.println("5 persent off");
		return originPrice*0.95;
	}
}

class NewCustomHuge implements CustomStategy{
	@Override
	public double getPrice(double originPrice) {
		System.out.println("10 persent off");
		return originPrice*0.90;
	}
}

