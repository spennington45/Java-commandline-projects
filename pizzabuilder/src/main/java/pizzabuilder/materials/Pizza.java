package pizzabuilder.materials;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Pizza {

	private List <Topping> toppings = new ArrayList <Topping> ();
	private BigDecimal basePrice = new BigDecimal(4.99);
	private BigDecimal totalPrice = new BigDecimal(4.99);
	
	public void addTopping(Topping topping) {
		this.toppings.add(topping);
		this.totalPrice = totalPrice.add(topping.getPrice());
	}

	public BigDecimal getTotalPrice() {
		return this.totalPrice;
	}

	@Override
	public String toString() {
		
		String str = "--------------------------\n";
		str+= "Your order\n";
		str += "Pizza \t\t$" + this.basePrice.setScale(2, RoundingMode.HALF_UP) + "\n";
		for (Topping i : toppings) {
			str += i.getName() + "\t$" + i.getPrice().setScale(2, RoundingMode.HALF_UP) + "\n";
		}
		str += "--------------------------\n";
		str += "Total \t\t$" + this.totalPrice.setScale(2, RoundingMode.HALF_UP);
		return str;
	}
	
}
