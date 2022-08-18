package com.java.casetest;

import java.util.Scanner;

public class JavaCase {
	private static String[] HexiBaseValues = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D",
			"E", "F" };

	public static void main(String[] args) {
		try (Scanner s1 = new Scanner(System.in)) {
			System.out.print(
					"Enter \'1 \' to convert Decimal to Hexidecimal , \'2\' to convert Decimal to Binary  and \'3\' to convert  binary to decimal:....");
			int option = s1.nextInt();

			if (option == 1) {
				System.out.print("Enter decimal value....");
				System.out.printf("The hexadecimal value = %s", ConvertDecimalToHexadecimal(s1.nextInt())).println();
			}

			if (option == 2) {
				System.out.print("Enter decimal value....");
				System.out.printf("The binary value = %s", ConvertDecimalToBinary(s1.nextInt())).println();
			}

			if (option == 3) {
				System.out.print("Enter binary value....");
				System.out.printf("The decimal value = %s", ConvertBinaryToDecimal(s1.nextInt())).println();
			}

		} catch (Exception e) {
			System.out.print("Make sure you enter an integer value for both option and value");

		}
	}

	/**
	 * Convert decimal value to hexadecimal value
	 * 
	 * @param decimalNumber
	 * @return
	 */
	private static String ConvertDecimalToHexadecimal(int decimalNumber) {
		int result = decimalNumber;
		StringBuilder finalResult = new StringBuilder(" ");
		while (result >= 1) {
			int index = result % 16;
			result /= 16;
			System.out.println(index);
			System.out.println(result);
			finalResult.append(HexiBaseValues[index]);
		}
		return finalResult.reverse().toString();

	}

	/**
	 * Convert decimal value to binary
	 * 
	 * @param decimalNumber
	 * @return
	 */
	private static String ConvertDecimalToBinary(int decimalNumber) {
		int result = decimalNumber;
		StringBuilder finalResult = new StringBuilder(" ");
		while (result >= 1) {
			int index = result % 2;
			result /= 2;
			finalResult.append(HexiBaseValues[index]);
		}
		return finalResult.reverse().toString();

	}

	/**
	 * Convert binary value to decimal
	 * 
	 * @param binary
	 * @return
	 */
	private static int ConvertBinaryToDecimal(int binary) {
		String newBinary = Integer.toString(binary);
		int position = 0;
		int result = 0;
		for (int i = newBinary.length() - 1; i >= 0; i--) {
			result += Math.pow(2, position) * Integer.parseInt(newBinary.substring(i, i + 1));
			position++;
		}
		return result;
	}

}
