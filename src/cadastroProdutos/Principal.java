package cadastroProdutos;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void clearScreen()throws IOException, InterruptedException{
    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
}
    public static void main(String[] args)throws IOException, InterruptedException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        clearScreen();
        //Instanciando
        Product product = new Product();
       
        //Entrando com o produto a ser cadastrado
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
        //Imprimindo o produto digitado
        System.out.println();
        System.out.println("Product data: "  + product);
        //Atualizando o Estoque
        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        //soma com a quantidade existente
        product.addProducts(quantity);
         
        //Imprime a atualizacao
        System.out.println();
        System.out.println("Updated data: "  + product);
        System.out.println();

        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        //remove do estoque
        product.removeProducts(quantity);
        
        System.out.println();
        System.out.println("Updated data: "  + product);
        
        sc.close();
    }
}
