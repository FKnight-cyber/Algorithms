/*
Ler os dados de um pedido com N itens ( N fornecido pelo usuário ).
Depois, mostrar um sumario do pedido conforme exemplo ( próxima página ).
Nota: o instante do pedido deve ser o instante do sistema: new Date()
 */

package Exercise1;

import Exercise1.Entities.Client;
import Exercise1.Entities.Order;
import Exercise1.Entities.OrderItem;
import Exercise1.Entities.Product;
import Exercise1.Enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client c1 = new Client(name, email, birthDate);

        sc.nextLine();

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.nextLine();
        System.out.print("How many items to this order?: ");
        int items = sc.nextInt();

        sc.nextLine();

        OrderStatus os1 = OrderStatus.valueOf(status);
        Order orders = new Order(os1, c1);

        for(int i = 1; i <= items; i++) {
            System.out.printf("Enter #%d item data:\n", i);
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            sc.nextLine();

            Product p = new Product(productName, productPrice);
            OrderItem order = new OrderItem(quantity, p);

            orders.addItem(order);
        }

        System.out.println(orders);

        sc.close();

    }
}
