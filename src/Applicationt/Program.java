package Applicationt;

import java.util.Scanner;

import entitiest.Product;



public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Product product= new Product();
		System.out.println("Enter product data");
		System.out.print("Name : ");
		
		product.name = sc.nextLine();
		
		System.out.print("Price : ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in Stock : ");
		product.quantity = sc.nextInt();
		
		
		System.out.println("Product Data : " + product);
		
		System.out.println();
		
		
		System.out.print("Add unit at stock : ");
		int quantity = sc.nextInt();
		
		product.addProducts(quantity);
		
		System.out.println("Update Product Data : " + product);
		
		System.out.println();
		
		System.out.print("Add unit at remove stock : ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Update Product Data : " + product);
		
		System.out.println();
		
		sc.close();

	}

}
