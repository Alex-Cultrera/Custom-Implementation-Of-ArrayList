package com.coderscampus.assignment5;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	
	// if Object [] is full, the array needs to double in size
	// when adding the 11th element, the Object [] should grow from 10 to 20 elements
	// when adding the 21st element, the Object [] should grow from 20 to 40 elements, etc.
	
	// For this assignment, don't worry about the ability to remove elements from the array

	@Override
	public boolean add(T item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
}