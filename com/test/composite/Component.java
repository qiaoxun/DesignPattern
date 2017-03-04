package com.test.composite;

public interface Component {
	void operation();
}

interface Leaf extends Component{
	
}

interface Composite extends Component{
	void add();
	void delete();
	Component getChild();
}
