package model;

import enums.productType;

public class desk extends product {
    private Double height;

    public desk() {
    }

    public desk(Integer stock, String name, Double cost, productType type, Double height) {
        super(stock, name, cost, type);
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString(){
        return super.toString()+"\nHeight: "+height+"m.";
    }
}
