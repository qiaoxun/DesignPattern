package com.test.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class ChessFlyWeightFactory {
	private static Map<String,ChessFlyWeight> map = new HashMap<>();
	public static ChessFlyWeight getChess(String color){
		if(map.containsKey(color)){
			return map.get(color);
		}else{
			ChessFlyWeight chess = new ConcreteChess(color);
			map.put(color, chess);
			return chess;
		}
	}
}
