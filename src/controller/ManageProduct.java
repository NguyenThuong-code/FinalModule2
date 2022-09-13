package controller;

import model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ManageProduct {
    public static List<Product> productsList=new ArrayList<>();

    public void displayProducts(){
        for (Product list:productsList
             ) {
            System.out.println(list.toString());
        }
    }
    public void addNewProduct(Product product){
        productsList.add(product);
    }
    public void editProductById(String id, String idProduct, String nameProduct, int priceProduct, int amountProduct, String describe){
        for (int i=0;i<productsList.size();i++){
if (productsList.get(i).getIdProduct().equalsIgnoreCase(id)){
    productsList.get(i).setIdProduct(idProduct);
    productsList.get(i).setNameProduct(nameProduct);
    productsList.get(i).setPriceProduct(priceProduct);
    productsList.get(i).setAmountProduct(amountProduct);
    productsList.get(i).setDescribe(describe);
}
        }
    }
    public void deleteProduct(String id){
        for (int i=0;i<productsList.size();i++){
            if (productsList.get(i).getIdProduct().equalsIgnoreCase(id)){
                productsList.remove(i);
            }
        }
    }
    public void sortProduct(){
        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPriceProduct()) - o2.getPriceProduct();
            }
        };
        productsList.sort(comparator);
        System.out.println("sort Product By Price ");
        displayProducts();
    }
    public void searchMaxPrice() {
        double max = 0;
        int product = 0;
        for (int i = 0; i < productsList.size(); i++) {
            if (max < productsList.get(i).getPriceProduct()) {
                max = productsList.get(i).getPriceProduct();
                product = i;
            }
        }
        System.out.println("Product have a price Largest: ");
        System.out.println(productsList.get(product));
    }
}
