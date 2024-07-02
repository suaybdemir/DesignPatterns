package StructuralPatterns.fileSystem;
import java.util.List;

import BehaviouralPatterns.iterator.DirectoryIterator;
public interface StorageContainer {
	
	public void add(Storage element);
	
	public void delete(Storage element);
	
	public void list();
	
	public List<Storage> elements();
	
	public DirectoryIterator iterator();

}
