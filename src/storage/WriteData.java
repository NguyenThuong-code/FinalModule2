package storage;

import model.Product;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static controller.ManageProduct.productsList;
public class WriteData {
    public static void writeFileProduct(String File) {
        try {
            java.io.File file = new File("products.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Product product : productsList) {
                bufferedWriter.write(product.getIdProduct()+ "," + product.getNameProduct() + "," + product.getPriceProduct()+ "," + product.getAmountProduct() + "," + product.getDescribe() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("");
        }
    }
}
