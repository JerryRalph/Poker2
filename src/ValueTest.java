import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValueTest {

	@Test
	void testGetValue() {
		assertEquals(14, Value.ACE.getValue());
	}

	@Test
	void testFindValue() {
		assertEquals(Value.TWO, Value.findValue('2'));
		assertEquals(Value.THREE, Value.findValue('3'));
		assertEquals(Value.FOUR, Value.findValue('4'));
		assertEquals(Value.FIVE, Value.findValue('5'));
		assertEquals(Value.SIX, Value.findValue('6'));
		assertEquals(Value.SEVEN, Value.findValue('7'));
		assertEquals(Value.EIGHT, Value.findValue('8'));
		assertEquals(Value.NINE, Value.findValue('9'));
	}

	@Test
	void testFindValueFaceCards() {
		assertEquals(Value.TEN, Value.findValue('T'));
		assertEquals(Value.JACK, Value.findValue('J'));
		assertEquals(Value.QUEEN, Value.findValue('Q'));
		assertEquals(Value.KING, Value.findValue('K'));
		assertEquals(Value.ACE, Value.findValue('A'));

	}

}
