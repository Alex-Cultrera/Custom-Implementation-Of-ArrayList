package com.coderscampus.assignment5;

public class CustomListApplication {

	public static void main(String[] args) {
		
		// ***TESTING PROCESS***
		
		
		
		
		
		
		
		
		
		// test by instantiating the CustomArrayList class and inserting elements into it
		CustomList<String> myCustomList = new CustomArrayList<>();
		myCustomList.add("element 1");
		myCustomList.add("element 2");
		myCustomList.add("element 3");
		myCustomList.add("element 4");
		myCustomList.add("element 5");
		myCustomList.add("element 6");
		myCustomList.add("element 7");
		myCustomList.add("element 8");
		((CustomArrayList<String>) myCustomList).showMe();
		// and continue to add another 10, 20 or 40 more elements
		Elements elements = new Elements();
		elements.addElementsToCustomList(10, myCustomList);
		elements.addElementsToCustomList(20, myCustomList);
		elements.addElementsToCustomList(40, myCustomList);
		
		// then validate that all the elements inserted actually exist in the data structure
		for (int i=0; i<myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
					
	}
	
}





