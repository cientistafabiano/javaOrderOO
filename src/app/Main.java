package app;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.next();
		//Client client = new Client(name, email, Date.parse(birthDate));
		
		sc.close();

	}

}
