package com.coderscampus.assignment5;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] myItems = new Object[10];
	int myItemOrderOfInsertion;
	

	public Object[] getMyItems() {
		return myItems;
	}
	
	public void setMyItems(Object[] myItems) {
		this.myItems = myItems;
	}
	
	public int getMyItemOrderOfInsertion() {
		return myItemOrderOfInsertion;
	}
	
	public void setMyItemOrderOfInsertion(int myItemOrderOfInsertion) {
		this.myItemOrderOfInsertion = myItemOrderOfInsertion;
	}

	
	// method to double size of array
		private void growItemsArray(int previousSize, Object[] anArray) {
			int i=0;
			Object[] newItemsArray = new Object[previousSize*2];
			while (i<previousSize) {
				newItemsArray[i]=anArray[i];
				i++;
			}
			setMyItems(newItemsArray);
		}
				
	@Override
	public boolean add(T item) {
		int i = 0;
		Object[] newItems = getMyItems();
		int arrayLength=newItems.length;
		int count=0;
		// check if array is completely empty (null at all indexes) 
		while (i<arrayLength) {
			if(newItems[i]==null) {	
				count++;
			}
			i++;
		}
		// check if array has reached capacity and double array size if so
		if (count==0) {
			growItemsArray(arrayLength, newItems);
		}
		// confirm array is empty and place item at first index
		if (count==arrayLength) {
			newItems[0]=item;
			myItemOrderOfInsertion=0;
			setMyItemOrderOfInsertion(myItemOrderOfInsertion);
			}
		// confirm array is not empty and place item at next available index
		else {
			myItemOrderOfInsertion++;
			newItems[myItemOrderOfInsertion]=item;
		}
		return false;
	}

	@Override
	public int getSize() {
		return myItemOrderOfInsertion+1;
	}

	@Override
	public T get(int index) {
		int itemNumber =0;
		Object[] someNewItems = getMyItems();
		for (Object item : someNewItems) {
			if (itemNumber == index) {
				return (T) item;	
			}
			itemNumber++;
		}
		return null;
	}
	
}