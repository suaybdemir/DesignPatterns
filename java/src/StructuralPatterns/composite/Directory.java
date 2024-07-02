package StructuralPatterns.composite;

import StructuralPatterns.fileSystem.*;
import java.util.ArrayList;
import java.util.List;

import BehaviouralPatterns.iterator.DirectoryIterator;

public class Directory extends StorageElement implements StorageContainer {
	List<Storage> elements = new ArrayList<Storage>();

	public Directory(String name) {
		super(name, null);
		directory = true;
	}

	public Directory(String name, StorageElement parent) {
		super(name, parent);
		directory = true;
	}

	@Override
	public Storage copy() {
		Storage copiedElement = null;
		try {
			copiedElement = (Storage) clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Problem with copying: " + e.getMessage());
		}
		return copiedElement;
	}

	@Override
	public void move(Directory target) {
		parent = target;
		target.add(this);
	}

	@Override
	public void add(Storage element) {
		elements.add(element);
	}

	@Override
	public void delete(Storage element) {
		elements.remove(element);
	}

	@Override
	public void list() {
		System.out.println("\nList of the directory: " + name);
		for (Storage element : elements) {
			StorageElement storageElement = (StorageElement) element;
			if (storageElement.isDirectory())
				System.out.format("%-20s %10s %s", storageElement, "dir", '\n');
			else
				System.out.format("%-20s %s", storageElement, '\n');
		}
	}

	@Override
	public List<Storage> elements() {
		return elements;
	}

	@Override
	public DirectoryIterator iterator() {
		DirectoryIterator iterator = new DirectoryIterator(this);
		return iterator;
	}
}
