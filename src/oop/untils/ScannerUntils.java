package oop.untils;

import java.util.Scanner;

public class ScannerUntils {
    public static final String STRING_ERR = "Hãy nhập đúng kiểu String";
    public static final String INT_ERR = "Hãy nhập đúng kiểu int";
    public static final String BYTE_ERR = "Hãy nhập đúng kiểu byte";
    public static final String FLOAT_ERR = "Hãy nhập đúng kiểu float";
    public static final String DOUBLE_ERR = "Hãy nhập đúng kiểu double";

    private static void printErrString(String errString) {
        System.out.println(errString);
    }

    public static int inputInt(Scanner scanner, String errString) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                printErrString(errString);
            }
        }
    }

    public static byte inputByte(Scanner scanner, String errString) {
        while (true) {
            try {
                return Byte.parseByte(scanner.nextLine());
            } catch (Exception e) {
                printErrString(errString);
            }
        }
    }

    public static float inputFloat(Scanner scanner, String errString) {
        while (true) {
            try {
                return Float.parseFloat(scanner.nextLine());
            } catch (Exception e) {
                printErrString(errString);
            }
        }
    }

    public static double inputDouble(Scanner scanner, String errString) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (Exception e) {
//				printErrString(errString);
            }
        }
    }

    public static String inputString(Scanner scanner, String errString) {
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                if (input != null && !input.isEmpty()) {
                    return input;
                }
            } catch (Exception e) {
                printErrString(errString);
            }
        }
    }
}

