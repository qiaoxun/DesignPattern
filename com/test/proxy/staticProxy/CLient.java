package com.test.proxy.staticProxy;

public class CLient {
	public static void main(String[] args) {
		ProxyStar ps = new ProxyStar(new RealStar());
		ps.signContract();
		ps.playGuitar();
	}
}
