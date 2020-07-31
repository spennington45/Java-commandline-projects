package pizzabuilder.materials;

import java.math.BigDecimal;

public class CheeseTopping implements Topping {

	private String name = "Cheese\t";
	private BigDecimal price = new BigDecimal(1.50);
	
	public BigDecimal getPrice() {
		return this.price;
	}

	public String getName() {
		return this.name;
	}

}
