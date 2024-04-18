package com.service;

import java.util.Scanner;

public class InputValidationService {
	
	public static String inputString() {
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		String input = "";
		while (flag) {

			try {
				scanner = new Scanner(System.in);
				input = scanner.nextLine();
				flag = false;

			} catch (Exception e) {
				System.out.println("invalid input , try again");
			}

		}

		return input;
	}

	public static int inputInt() {
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		int opt = 0;
		while (flag) {

			try {
				scanner = new Scanner(System.in);
				opt = scanner.nextInt();
				flag = false;

			} catch (Exception e) {
				System.out.println("invalid input , try again");
			}

		}

		return opt;
	}

}
