package com.coderscampus.assignment5.refactored;


public class CustomListApplicationV2 {

	public static void main(String[] args) {

		// ***TESTING PROCESS***

		// test by instantiating the CustomArrayList class and inserting elements into it
		CustomListV2<String> myCustomList = new CustomArrayListV2<>();
		myCustomList.add("element 1");
		// instantiation of additional CustomArrayList for further testing
		CustomListV2<String> myShoppingList = new CustomArrayListV2<>();
		myShoppingList.add("eggs");
		myShoppingList.add("fruit");
		myShoppingList.add("milk");
		System.out.println(myShoppingList.get(2));

		// and continue to add another 10, 20 or 40 more elements to myCustomList
		// method below will quickly add specified number elements to the CustomArrayList
//		ElementsV2 elements = new ElementsV2();
//		elements.addElementsToCustomList(10, myCustomList);

		
		// then validate that all the elements inserted actually exist in the data structure
//		for (int i = 0; i < myCustomList.getSize(); i++) {
//			System.out.println(myCustomList.get(i));
//		}
//
//		System.out.println("---------------");
//
//		for (int i = 0; i < myShoppingList.getSize(); i++) {
//			System.out.println(myShoppingList.get(i));
//		}
	}
	
}
