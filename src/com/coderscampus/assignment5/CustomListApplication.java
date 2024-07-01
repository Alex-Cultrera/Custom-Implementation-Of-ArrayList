package com.coderscampus.assignment5;

public class CustomListApplication {

	public static void main(String[] args) {
		
		// ***TESTING PROCESS***
		
		// test by instantiating the CustomArrayList class and inserting elements into it
		CustomList<String> myCustomList = new CustomArrayList<>();
		myCustomList.add("element 1");
		
		// and continue to add another 10, 20 or 40 more elements
		// method to quickly add multiple elements to the CustomArrayList
		Elements elements = new Elements();
		elements.addElementsToCustomList(10, myCustomList);
			
		// then validate that all the elements inserted actually exist in the data structure
		for (int i=0; i<myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
			
		System.out.println("---------------");
		
		
		// instantiation additional CustomArrayList for further testing
		CustomList<String> myAlexList = new CustomArrayList<>();
		myAlexList.add("hi");
		for (int i=0; i<myAlexList.getSize(); i++) {
			System.out.println(myAlexList.get(i));
		}
		
		
		
	}
}