package com.coderscampus.assignment5;

public class CustomArrayList<T> implements CustomList<T> {
	static Object[] items = new Object[10];
	static int itemOrderOfInsertion;
			
	// Getters and Setters
	public int getItemOrderOfInsertion() {
		return itemOrderOfInsertion;
	}
	
	// method to double size of array
		private void growItemsArray(int previousSize, Object[] anArray) {
			int i=0;
			Object[] newItemsArray = new Object[previousSize*2];
			while (i<previousSize) {
				newItemsArray[i]=items[i];
				i++;
			}
			items=newItemsArray;
		}
	
	// method to print out current array
	public static void printIt() {
		for (Object item : items) {
			System.out.println(item);
		}
	}
				
	@Override
	public boolean add(T item) {
		int i = 0;
		int arrayLength=items.length;
		int count=0;
		// check if array is completely empty (null at all indexes) 
		while (i<arrayLength) {
			if(items[i]==null) {	
				count++;
			}
			i++;
		}
		// check if array has reached capacity and double array size if so
		if (count==0) {
			growItemsArray(arrayLength, items);
		}
		// confirm array is empty and place item at first index
		if (count==arrayLength) {
			items[0]=item;
			itemOrderOfInsertion = 0;
			}
		// confirm array is not empty and place item at next available index
		else {
			itemOrderOfInsertion++;
			items[itemOrderOfInsertion]=item;
		}
		return false;
	}

	@Override
	public int getSize() {
		return itemOrderOfInsertion+1;
	}

	@Override
	public T get(int index) {
		int itemNumber =0;
		for (Object item : items) {
			if (itemNumber == index) {
				return (T) item;	
			}
			itemNumber++;
		}
		return null;
	}
	
}