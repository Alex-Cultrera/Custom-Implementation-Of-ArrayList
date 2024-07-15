package com.coderscampus.assignment5.refactored;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CustomArrayListV2Test {
	// Test-Driven Development methodology:
	//	step 1 - write a failing test
	//	step 2 - write the business logic to make the test pass
	//	step 3 - refactor your code

//		Three A's
//		1.	Arrange - set stuff up
//		2. 	Act - physically invoking the code aka calling the method you are testing
//		3.	Assert - (expected behavior vs actual behavior) did what I expect to happen actually happen? If yes, test passes / assert true. If not, test failed / assert false.
	
	@Test
	void should_add_one_item_to_list() {
//		Arrange
		CustomListV2<Integer> customList = new CustomArrayListV2<>();
		
//		Act
		customList.add(10);
		Integer expectedResult = customList.get(0);
		Integer expectedSize = customList.getSize();
		
//		Assert
//		what would we expect to happen?
//		I expect there to be an Integer with value 10 stored in the first index in my customList
		assertEquals(10, expectedResult);
		assertEquals(1, expectedSize);
		
	}

	@Test
	void should_add_11_items_to_list () {
//		Arrange
		CustomListV2<Integer> sut = new CustomArrayListV2<>();
//		sut = system under test
		
//		Act
		for (int i=1; i<12; i++)
		sut.add(i);
		
//		Assert
		for (int i=0; i<10; i++) {
			assertEquals(i+1, sut.get(i));
		}
		assertEquals(11, sut.getSize());
	}
	
	@Test
	void should_add_999_items_to_list () {
//		Arrange
		CustomListV2<Integer> sut = new CustomArrayListV2<>();
		
//		Act
		for (int i=1; i<1000; i++)
			sut.add(i);
		
//		Assert
		for (int i=0; i<999; i++) {
			assertEquals(i+1, sut.get(i));
		}
		assertEquals(999, sut.getSize());
	}

}
