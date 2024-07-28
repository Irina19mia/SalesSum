package app;


import java.util.Locale;
import java.util.Scanner;

// ДЗ 4.1. Сума продажів
public class Main {

    private static final String[] PRODUCTS = new String[]{"smartphone", "laptop"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        String currency;
        System.out.println("Enter currency");
        currency = scanner.next();
        System.out.println("Your currency is " + currency);

        double[] prices = new double[PRODUCTS.length];
        int[] daysNumber = new int[PRODUCTS.length];
        int[] salesNumber = new int[PRODUCTS.length];
        System.out.println("\nFill information about products");

        for (int i= 0; i < prices.length; i++) {
            // Заповнення ціни продукту
            System.out.println("Enter price of " + PRODUCTS[i]);
            prices[i] = scanner.nextDouble();

            // Кількість днів торгівлі
            System.out.println("Enter number days of trade of " + PRODUCTS[i]);
            daysNumber[i] = scanner.nextInt();

            // Кількість проданих ОДИНИЦЬ
            System.out.println("Enter number of sales items of product - " + PRODUCTS[i]);
            salesNumber[i] = scanner.nextInt();
            System.out.println("---------------");
        }

        // Розрахунок
        for (int i= 0; i < prices.length; i++) {
            System.out.printf("Product No %d: %s,\n", i + 1, PRODUCTS[i]);

            // Загальна сума продажів
            double totalSales = daysNumber[i] * prices[i] * salesNumber[i];
            System.out.printf("total sales for %d days is %s %.2f,%n", daysNumber[i], currency, totalSales);

            // Середньоденна сума продажів
            double salesByDay = totalSales / daysNumber[i];
            System.out.printf("sales by day is %s %.2f.%n", currency, salesByDay);
        }
    }
}
