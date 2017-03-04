package com.test.mediator;

import java.util.HashMap;
import java.util.Map;

public interface IMediator {
	void register(String name,IDepartment depart);
	
	void command(String name);
}

/**
 * the manager
 * @author joey
 *
 */
class Manager implements IMediator{
	Map<String,IDepartment> map = new HashMap<>();
	@Override
	public void register(String name,IDepartment depart) {
		map.put(name, depart);
	}

	@Override
	public void command(String name) {
		map.get(name).selfAction();
	}
}