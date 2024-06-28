package com.coderscampus.assignment5;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	
	public Object[] growItemsArray(int index, Object[] items) {
		int i=0;
		Object[] newItemsArray = new Object[index*2];
		while (i<index) {
			newItemsArray[i]=items[i];
		}
		items=newItemsArray;
		return items; 
	}
	
	int orderOfInsertion;
	
	public int getOrderOfInsertion() {
		return orderOfInsertion;
	}

	public void setOrderOfInsertion(int orderOfInsertion) {
		this.orderOfInsertion = orderOfInsertion;
	}
	
	public void showMe() {
		for (Object item:items) {
			System.out.println(item);
		}
	}
	
	// For this assignment, don't worry about the ability to remove elements from the array

	

	@Override
	public boolean add(T item) {
		// This method should add a new item into the CustomList 
		// backed by an array "items" with a pre-defined size of 10
		// need a way to index the item & record the order it was added to array
		// need to check if an item was recorded previously in the array at that index
		// need to make sure array is not full before adding new item to the array
		// if array is full, the array needs to double in size
		// when adding the 11th element, the Object [] should grow from 10 to 20 elements
		// when adding the 21st element, the Object [] should grow from 20 to 40 elements, etc.
		// should return true if it was successfully able to insert an item.
		
		int i = 0;
		int arrayLength=items.length;
		int count=0;
		int index;
		while (i<arrayLength) {
			if(items[i]==null) {	
				count++;
			}
			i++;
		}
		if (count==arrayLength) {
			items[0]=item;
			setOrderOfInsertion(0);
			}
		if (count!=arrayLength) {
			index=getOrderOfInsertion() + 1;
			items[index]=item;
			if (index==arrayLength) {
				
			}
		}
		
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