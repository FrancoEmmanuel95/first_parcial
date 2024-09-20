package model;
import enums.productType;
public abstract class product {
    private Integer stock;
    private String name;
    private Double cost;
    private productType type;

    public product() {
    }

    public product(Integer stock, String name, Double cost,productType type) {
        this.stock = stock;
        this.type = type;
        this.name = name;
        this.cost = cost;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public productType getType() {
        return type;
    }

    public void setType(productType type) {
        this.type = type;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString(){
        return "\nName: "+name+"\nCost: $"+cost+"\nProduct type: "+type+"\nStock: "+stock;
    }
}
