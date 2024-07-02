package StructuralPatterns.composite;

import StructuralPatterns.fileSystem.*;

public class File extends StorageElement{
	
	public File(String name, Storage parent) {
		super(name, parent);
	}
}
