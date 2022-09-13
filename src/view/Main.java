package view;

import controller.ManageProduct;
import model.Product;
import storage.ReadData;
import storage.WriteData;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Product> productList= ManageProduct.productsList;
    public static ManageProduct mp=new ManageProduct();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int choice;
        do {
            System.out.println("---- Manage Product ----");
            System.out.println("1. Display Product");
            System.out.println("2. Add new Product");
            System.out.println("3. Edit Product");
            System.out.println("4. Delete Product");
            System.out.println("5. sort Product");
            System.out.println("6. Find largest Product");
            System.out.println("7. read file Csv");
            System.out.println("8. Write file Csv");
            System.out.println("9.Next");
            System.out.println("--------------------------------------------------------");
            System.out.print("Please chose button: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> mp.displayProducts();
                case 2 -> addProductToList();
                case 3 -> editProductToList();
                case 4 -> deleteProductInList();
                case 5 -> mp.sortProduct();
                case 6 -> mp.searchMaxPrice();
                case 7 -> ReadData.readFileProductList();
                case 8 -> WriteData.writeFileProduct("products.csv");
                case 9 -> System.exit(0);
            }
        } while (true);



    }
    public static void deleteProductInList(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id that u want to Edit:");
        String id = sc.nextLine();
        mp.deleteProduct(id);
        mp.displayProducts();
    }
    public static void addProductToList(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Product id:");
        String prId= sc.nextLine();
        System.out.println("Enter Name Product:");
        String name = sc.nextLine();
        System.out.println("Enter Price Product");
        int pricePro= sc.nextInt();
        System.out.println("Enter Amount Product");
        int amount = sc.nextInt();
        System.out.println("Enter Describe Product");
        sc.nextLine();
        String describe= sc.nextLine();
        Product product= new Product(prId, name,pricePro,amount,describe);
        mp.addNewProduct(product);
        mp.displayProducts();
    }
    public static  void  editProductToList(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id that u want to Edit:");
        String id = sc.nextLine();
        System.out.println("Enter Product id:");
        String idPr= sc.nextLine();
        System.out.println("Enter Name Product:");
        String namePr = sc.nextLine();
        System.out.println("Enter Price Product");
        int pricePr= sc.nextInt();
        System.out.println("Enter Amount Product");
        int amountPr = sc.nextInt();
        System.out.println("Enter Describe Product");
        sc.nextLine();
        String describePr= sc.nextLine();

        mp.editProductById(id, idPr,namePr,pricePr,amountPr,describePr);
        mp.displayProducts();

    }
}
