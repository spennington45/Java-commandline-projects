package pizzabuilder.materials;

import java.math.BigDecimal;

public class Mushrooms implements Topping {

	private String name = "Mushrooms";
	private BigDecimal price = new BigDecimal(3.50);
	
	public BigDecimal getPrice() {
		return this.price;
	}

	public String getName() {
		return this.name;
	}


}
