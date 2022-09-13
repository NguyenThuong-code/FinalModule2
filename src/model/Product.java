package model;

public class Product implements Comparable<Product>{
    private String idProduct;
    private String nameProduct;
    private int priceProduct;
    private int amountProduct;
    private String describe;

    public Product() {
    }

    public Product(String idProduct, String nameProduct, int priceProduct, int amountProduct, String describe) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.amountProduct = amountProduct;
        this.describe = describe;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public int getAmountProduct() {
        return amountProduct;
    }

    public void setAmountProduct(int amountProduct) {
        this.amountProduct = amountProduct;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", amountProduct=" + amountProduct +
                ", describe='" + describe + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.getPriceProduct()-o.getPriceProduct();
    }
}
