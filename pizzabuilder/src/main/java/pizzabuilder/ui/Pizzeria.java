package pizzabuilder.ui;

import java.util.Scanner;

import pizzabuilder.materials.CheeseTopping;
import pizzabuilder.materials.Mushrooms;
import pizzabuilder.materials.Pepperoni;
import pizzabuilder.materials.Pizza;
import pizzabuilder.materials.Topping;

public class Pizzeria {

	public static void main(String[] args) {

		System.out.println("Welcome to the pizzeria.");
		
		Pizza pizza = new Pizza();
		int toppingsCount = 0;
		Scanner inputScanner = new Scanner(System.in);
		
		do {
			System.out.println("P for Pepperoni | C for Cheese | M for Mushrooms | Q to quit");
			String input = inputScanner.nextLine();
			
			Topping topping;
			if (input.equals("C")) {
				topping = new CheeseTopping();
				pizza.addTopping(topping);
				System.out.println("Cheese added");
				toppingsCount++;
			} else if (input.equals("P")) {
				topping = new Pepperoni();
				pizza.addTopping(topping);
				System.out.println("Pepperoni added");
				toppingsCount++;
			}else if (input.equals("M")) {
				topping = new Mushrooms();
				pizza.addTopping(topping);
				System.out.println("Mushrooms added");
				toppingsCount++;
			} else if (input.equals("Q")) {
				toppingsCount = 3;
			} else {
				System.out.println("Invalid option");
			}
			
		} while (toppingsCount < 3);
		
		System.out.println(pizza);

	}

}
