package com.coderscampus.assignment5;

public class CustomListApplication {

	public static void main(String[] args) {
		
		// ***TESTING PROCESS***

		// test by instantiating the CustomArrayList class and inserting elements into it
		CustomList<String> myCustomList = new CustomArrayList<>();
		myCustomList.add("element 1"); 
		
		// and continue to add another 10, 20 or 40 more elements
		Elements elements = new Elements();
		// consider creating a new class/service to consolidate this
		int test1 = 10; int test2 = 20; int test3 = 40;
		elements.addElementsToList(test1, myCustomList);
		elements.addElementsToList(test2, myCustomList);
		elements.addElementsToList(test3, myCustomList);
	
		// then validate that all the elements inserted actually exist in the data structure
		for (int i=0; i<myCustomList.getSize(); i++) {
		    System.out.println(myCustomList.get(i));
		}
				
	}
	
	

}





