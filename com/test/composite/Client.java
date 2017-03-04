package com.test.composite;

public class Client {
	public static void main(String[] args) {
		AbstractFile img1 = new ImageLeaf();
		AbstractFile img2 = new ImageLeaf();
		AbstractFile txt1 = new TxtLeaf();
		
		FolderComponsite fold = new FolderComponsite();
		fold.addLeaf(img1);
		fold.addLeaf(img2);
		fold.addLeaf(txt1);
		
		AbstractFile video1 = new VideoLeaf();
		AbstractFile video2 = new VideoLeaf();
		FolderComponsite fold2 = new FolderComponsite();
		fold2.addLeaf(video1);
		fold2.addLeaf(video2);
		fold2.addLeaf(fold);
		fold2.killVirus();
	}
}
