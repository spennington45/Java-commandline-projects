package pizzabuilder;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import pizzabuilder.materials.Mushrooms;
import pizzabuilder.materials.Topping;

public class MushroomsTest {

	@Test
	public void mushroomsTest() {
		Topping mushroomTest = new Mushrooms();
		
		assertEquals("Mushrooms", mushroomTest.getName());
		assertEquals(new BigDecimal(3.50), mushroomTest.getPrice());
		
	}

}
