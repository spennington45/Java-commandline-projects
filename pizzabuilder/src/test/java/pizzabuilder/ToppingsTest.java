package pizzabuilder;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import pizzabuilder.materials.CheeseTopping;
import pizzabuilder.materials.Topping;

public class ToppingsTest {


	@Test
	public void cheeseTest() {
		Topping cheeseTest = new CheeseTopping();
		
		assertEquals("Cheese", cheeseTest.getName());
		assertEquals(new BigDecimal(1.50), cheeseTest.getPrice());
		
	}

}
