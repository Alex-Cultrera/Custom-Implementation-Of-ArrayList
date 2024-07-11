package com.coderscampus.assignment5.refactored;

public class ElementsV2 {

	String element = "element ";

	public void addElementsToCustomList(int numberOfElements, CustomListV2<String> aList) {
		int i = 2;
		int elementNumber;
		elementNumber = aList.getSize();
		while (i < numberOfElements) {
			aList.add(element + String.valueOf(elementNumber));
			elementNumber++;
			i++;
		}
	}

}
