package pizzabuilder;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import pizzabuilder.materials.Pepperoni;
import pizzabuilder.materials.Topping;

public class PepperoniTest {

	@Test
	public void pepperoniTest() {
		Topping pepperoniTest = new Pepperoni();
		
		assertEquals("Pepperoni", pepperoniTest.getName());
		assertEquals(new BigDecimal(3.50), pepperoniTest.getPrice());
		
	}

}
