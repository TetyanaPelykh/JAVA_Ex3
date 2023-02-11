package edu.uoc.pac3;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
class PositionTest {

	private Position position;

	@Test
	void testGetColor() {

		position = Position.GOALKEEPER;
		assertEquals("BLACK", position.getColor());

		position = Position.DEFENDER;
		assertEquals("RED", position.getColor());

		position = Position.MIDFIELDER;
		assertEquals("GREEN", position.getColor());

		position = Position.FORWARD;
		assertEquals("BLUE", position.getColor());

	}

	@Test
	void testToString() {
		position = Position.GOALKEEPER;
		assertEquals("GOALKEEPER", position.toString());

		position = Position.DEFENDER;
		assertEquals("DEFENDER", position.toString());

		position = Position.MIDFIELDER;
		assertEquals("MIDFIELDER", position.toString());

		position = Position.FORWARD;
		assertEquals("FORWARD", position.toString());

	}

	@Test
	void testgetPositionByColor() {
		assertEquals(Position.GOALKEEPER, Position.getPositionByColor("BLACK"));
		assertEquals(Position.DEFENDER, Position.getPositionByColor("RED"));
		assertEquals(Position.MIDFIELDER, Position.getPositionByColor("GREEN"));
		assertEquals(Position.FORWARD, Position.getPositionByColor("BLUE"));
		assertNull(Position.getPositionByColor("WHITE"));
		assertNull(Position.getPositionByColor("black"));
	}

	@Test
	void testGetColors() {
		assertEquals(Arrays.toString(new String[]{"BLACK, RED, GREEN, BLUE"}), Arrays.toString(Position.getColors()));
	}

	@Test
	void testOrder() {
		position = Position.DEFENDER;
		assertFalse(position.isPreceding(Position.GOALKEEPER));
		assertTrue(position.isPreceding(Position.MIDFIELDER));
		assertTrue(position.isPreceding(Position.FORWARD));
		assertTrue(position.isPreceding(Position.DEFENDER));

		position = Position.FORWARD;
		assertFalse(position.isPreceding(Position.MIDFIELDER));
		assertFalse(position.isPreceding(Position.DEFENDER));
		assertFalse(position.isPreceding(Position.GOALKEEPER));
		assertTrue(position.isPreceding(Position.FORWARD));

		position = Position.GOALKEEPER;
		assertTrue(position.isPreceding(Position.MIDFIELDER));
		assertTrue(position.isPreceding(Position.DEFENDER));
		assertTrue(position.isPreceding(Position.FORWARD));
	}

}
