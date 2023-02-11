package edu.uoc.pac3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
class FootballerTest {

	private Footballer footballer1;
	private Footballer footballer2;

	@BeforeAll
	void init(){
		try {
			footballer1 = new Footballer("Buffon", 1, new Position[]{Position.GOALKEEPER});
			footballer2 = new Footballer("Pedri", 9, new Position[]{Position.MIDFIELDER, Position.FORWARD});
		} catch (Exception e) {
			e.printStackTrace();
			fail("testFootballer failed");
		}
	}

	@Test
	void testPositionFootballer() {
		assertEquals(Arrays.toString(new Position[]{Position.GOALKEEPER}), Arrays.toString(footballer1.getPositions()));
		assertEquals(Arrays.toString(new Position[]{Position.MIDFIELDER, Position.FORWARD}), Arrays.toString(footballer2.getPositions()));
	}
}
