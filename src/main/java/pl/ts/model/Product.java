package pl.ts.model;

public class Product {
    private int id;
    private String name;
    private String category;
    private double price;
    private String productCode;
    private int pieces;

    public Product(int id, String name, String category, double price, String productCode, int pieces) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.productCode = productCode;
        this.pieces = pieces;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }
}
