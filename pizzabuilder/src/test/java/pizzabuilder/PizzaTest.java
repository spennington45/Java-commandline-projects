package pizzabuilder;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import pizzabuilder.materials.CheeseTopping;
import pizzabuilder.materials.Mushrooms;
import pizzabuilder.materials.Pepperoni;
import pizzabuilder.materials.Pizza;
import pizzabuilder.materials.Topping;

public class PizzaTest {

	@Test
	public void basicPizzaTest() {
		Pizza pizza = new Pizza();
		assertEquals(new BigDecimal(4.99), pizza.getTotalPrice());
		
	}

	@Test
	public void toppingTest() {
		Pizza pizza = new Pizza();
		Topping topping = new CheeseTopping();
		pizza.addTopping(topping);
		assertEquals(new BigDecimal(6.49), pizza.getTotalPrice());
		Topping topping2 = new Pepperoni();
		pizza.addTopping(topping2);
		assertEquals(new BigDecimal(9.99), pizza.getTotalPrice());
		Topping topping3 = new Mushrooms();
		pizza.addTopping(topping3);
		assertEquals(new BigDecimal(13.49), pizza.getTotalPrice());
		
	}
	
}
