package com.coderscampus.assignment5;

public class Elements {

	String element = "element ";

	public void addElementsToCustomList(int numberOfElements, CustomList<String> aList) {
		int i = 2;
		while (i < (numberOfElements + 2)) {
			aList.add(element + String.valueOf(i));
			i++;
		}
	}

}
