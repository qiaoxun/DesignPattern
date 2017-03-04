package com.test.composite;

import java.util.ArrayList;
import java.util.List;
/**
 * Component
 * @author joey
 *
 */
public interface AbstractFile {
	void killVirus();
}

/**
 * leaf
 * @author joey
 *
 */
class ImageLeaf implements AbstractFile{
	@Override
	public void killVirus() {
		System.out.println("kill image virus");
	}
}

/**
 * leaf
 * @author joey
 *
 */
class TxtLeaf implements AbstractFile{
	@Override
	public void killVirus() {
		System.out.println("kill txt virus");
	}
}

/**
 * leaf
 * @author joey
 *
 */
class VideoLeaf implements AbstractFile{
	@Override
	public void killVirus() {
		System.out.println("kill video virus");
	}
}

/**
 * composite
 * @author joey
 *
 */
class FolderComponsite implements AbstractFile{
	private List<AbstractFile> list = new ArrayList<>();
	
	public void addLeaf(AbstractFile file){
		list.add(file);
	}
	
	public void removeLeaf(AbstractFile file){
		list.remove(file);
	}
	
	@Override
	public void killVirus() {
		for(AbstractFile file : list){
			file.killVirus();
		}
	}
	
}
