import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Product[] products = new Product[4];
        products[0] = new Product(1,50, "Молоко");
        products[1] = new Product(2,80, "Яблоки");
        products[2] = new Product(3,45, "Хлеб");
        products[3] = new Product(4,30, "Соль");

        int[] prices = {50, 80, 45, 30}; // TODO не понимаю как оперировать с ценами из объекта "Product", поэтому обозначила их отдельно

        System.out.println("Список возможных товаров для покупки:");
        for (Product product : products) {
            System.out.println(product.toString());
        }

        int[] countProduct = new int[4];
        int[] sum = new int[4];
        int sumProducts = 0; // для итогового количества

        while (true) {
            int productNumber; // для номера продукта
            int productCount; // для количества

            System.out.println("Выберите товар и количество или введите `end`");

            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            String[] parts = input.split(" ");
            productNumber = Integer.parseInt(parts[0]) - 1; // чтобы получить номер продукта
            productCount = Integer.parseInt(parts[1]); // чтобы получить количество

            sum[productNumber] = sum[productNumber] + prices[productNumber] * productCount; // цена за каждый вид продукта
            countProduct[productNumber] += productCount; // итоговое количество продуктов
        }

        System.out.println("Ваша корзина:");
        System.out.println("Наименование товара | Цена/за.ед | Количество | Общая стоимость");

        for (int i = 0; i < products.length; i++) {
            if (countProduct[i] != 0) {
                System.out.println(products[i] + " | " + countProduct[i] + " | " + sum[i]);
            }
            sumProducts += sum[i];
        }
        System.out.println("Итого: " + sumProducts);
    }
}
