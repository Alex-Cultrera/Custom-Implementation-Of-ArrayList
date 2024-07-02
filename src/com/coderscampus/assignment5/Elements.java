package com.coderscampus.assignment5;

public class Elements {

	String element = "element ";

	public void addElementsToCustomList(int numberOfElements, CustomList<String> aList) {
		CustomArrayList<String> aCustomList = new CustomArrayList<>();
		int i = 2; 
		int elementNumber; 
		while (i < (numberOfElements + 2)) { 
			elementNumber = aCustomList.getMyItemOrderOfInsertion() + i;
			aList.add(element + String.valueOf(elementNumber));
			i++;
		}
	}

}
