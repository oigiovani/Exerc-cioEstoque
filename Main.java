package estoque;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product;

		product = new Product();

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();

		System.out.println();
		System.out.println(product);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int added = sc.nextInt();
		product.AddProducts(added);

		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		int removed = sc.nextInt();
		product.RemoveProducts(removed);

		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();
	}

}
