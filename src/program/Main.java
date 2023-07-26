package program;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter clent data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.nextLine();
		
		Client c1 = new Client(name, email, LocalDate.parse(birthDate, formato));
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.nextLine();
		LocalDateTime data = LocalDateTime.now();
		Order order = new Order(data, OrderStatus.valueOf(status), c1);
		
		System.out.print("How many items to this order? ");
		int number = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < number; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Product quantity: ");
			int productquantity = sc.nextInt();
			sc.nextLine();
			LocalDate moment = LocalDate.now();
			
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(productquantity, productPrice, product);
			
			order.addItem(orderItem);
			
			
		}
		
		System.out.println(order.toString());
		sc.close();
	}

}
