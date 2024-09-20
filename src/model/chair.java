package model;

import enums.productType;

public class chair extends product {
    private boolean wheels;

    public chair() {
    }

    public chair(Integer stock, String name, Double cost, productType type, boolean wheels) {
        super(stock, name, cost, type);
        this.wheels = wheels;
    }

    public boolean isWheels() {
        return wheels;
    }

    public void setWheels(boolean wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWheels: " + wheels;
    }
}
