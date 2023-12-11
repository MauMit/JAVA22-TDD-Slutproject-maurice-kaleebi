package test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.mockedObjects.MockItem;

public class TestItem {

	@Test
	@DisplayName("test if id is lowercase")
	void testIfIdIsLowerCase() {
		MockItem mockItem = new MockItem("ABC");
		assertEquals("abc", mockItem.getId());
	}

	@Test
	@DisplayName("test if id is null")
	void testIfIDIsNull() {
		assertThrows(NullPointerException.class, () -> new MockItem(null));

	}

	@Test
	@DisplayName("test if ID is empty string")
	void testEmptyString() {
		MockItem mockItem = new MockItem("");
		assertEquals("", mockItem.getId());
	}

	@Test
	@DisplayName("test numbers instead of letters")
	void testNumbersInsteadOfLetters() {
		MockItem mockItem = new MockItem("123");
		assertEquals("123", mockItem.getId());
	}

	@Test
	@DisplayName("test numbers instead of letters to string")
	void testNumbersToString() {
		MockItem mockItem = new MockItem("123");
		assertEquals("123", mockItem.toString());
	}

	@Test
	@DisplayName("test lowercase to string")
	void testLowerCaseToString() {
		MockItem mockItem = new MockItem("HELLO");
		assertEquals("hello", mockItem.toString());
	}

	@Test
	@DisplayName("test empty string to string")
	void testEmptyStringToString() {
		MockItem mockItem = new MockItem("");
		assertEquals("", mockItem.toString());
	}

	@Test
	@DisplayName("test empty string to setID")
	void testEmptyStringToSetID() {
		MockItem mockItem = new MockItem("hej");
		mockItem.setId("");
		assertEquals("", mockItem.getId());
	}

	@Test
	@DisplayName("test numbers instead of letters setID")
	void testNumbersInsteadOfLettersSetID() {
		MockItem mockItem = new MockItem("HELLO");
		mockItem.setId("123");
		assertEquals("123", mockItem.getId());
	}

	@Test
	@DisplayName("test lowercase setID")
	void testLowerCaseSetId() {
		MockItem mockItem = new MockItem("HELLO");
		mockItem.setId("hello");
		assertEquals("hello", mockItem.getId());
	}

	@Test
	@DisplayName("test null set ID")
	void testNull() throws NullPointerException {
		MockItem mockItem = new MockItem("Test");
		assertThrows(NullPointerException.class, () -> mockItem.setId(null));
	}

}
