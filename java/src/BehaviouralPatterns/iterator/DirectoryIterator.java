package BehaviouralPatterns.iterator;

import java.util.Iterator;
import java.util.List;

public class DirectoryIterator<Storage> implements Iterator<Storage> {
	private Directory dir;
	private List<Storage> elements;
	private Iterator<Storage> iterator;
	
	public DirectoryIterator(Directory dir){
		this.dir = dir;
		elements = (List<Storage>) dir.elements();
		iterator = elements.iterator();
	}

	public DirectoryIterator(Directory directory) {
		// TODO Auto-generated constructor stub
		this.dir = dir;
		elements = (List<Storage>) dir.elements();
		iterator = elements.iterator();
	}

	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	@Override
	public Storage next() {
		return iterator.next();
	}
}
