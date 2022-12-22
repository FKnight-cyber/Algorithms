/*
Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário).
Ao final, mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados.

Todo produto possui nome e preço.
Produtos importados possuem uma taxa de alfândega, e produtos usados possuem data de fabricação.
Estes dados específicos devem ser acrescentados na etiqueta de preço conforme exemplo.
Para produtos importados, a taxa de alfândega deve ser acrescentada ao preço final do produto.
 */

package Exercise1;

import Exercise1.Entities.ImportedProduct;
import Exercise1.Entities.Product;
import Exercise1.Entities.UsedProduct;

import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws Exception{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= n; i++) {
            System.out.printf("Product %d# data:\n",i);
            System.out.print("Common, used or imported (c/u/i): ");
            char type = sc.next().charAt(0);

            if(type != 'c' && type != 'u' && type != 'i') {
                i--;
                System.out.println("Invalid type, try again!");
                continue;
            }

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            sc.nextLine();

            Product product = new Product();

            if(type == 'c'){
                product = new Product(name,price);
            }
            if(type == 'i'){
                System.out.print("Customs Fee: ");
                Double customsFee = sc.nextDouble();
                product = new ImportedProduct(name, price, customsFee);
            }
            if(type == 'u'){
                System.out.print("Manufacture date: (dd/MM/yyyy) - ");
                Date manufactureDate = sdf.parse(sc.next());
                product = new UsedProduct(name, price, manufactureDate);
            }

            products.add(product);
        }

        System.out.println("\nPrice tags:");
        for(Product p : products) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
