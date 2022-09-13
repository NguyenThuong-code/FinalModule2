package storage;

import controller.ManageProduct;
import model.Product;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static controller.ManageProduct.productsList;
public class ReadData {

    public static List<Product> readFileProductList() {
        try {
            File file = new File("products.csv");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String value;
            while ((value = bufferedReader.readLine()) != null) {
                String[] strings = value.split(",");
                Product product = new Product(strings[0], strings[1], Integer.parseInt(strings[2]), Integer.parseInt(strings[3]), strings[4]);
                productsList.add(product);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("");
        }

        return productsList;
    }
}
