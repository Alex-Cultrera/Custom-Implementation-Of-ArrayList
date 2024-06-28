package com.coderscampus.assignment5;

public class Elements {

	public void addElementsToList(int numberOfElements, CustomList<String> myCustomList) {
		String element = "element ";
		int i = 2;
		while (i < numberOfElements + 2) {
			myCustomList.add(element + String.valueOf(i));
		}
	}

}
