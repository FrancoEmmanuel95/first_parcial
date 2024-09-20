package model;

import enums.productType;

public abstract class informaticProduct extends product {
    private String vendor;

    public informaticProduct(String vendor) {
        this.vendor = vendor;
    }

    public informaticProduct(Integer stock, String name, Double cost, productType type, String vendor) {
        super(stock, name, cost, type);
        this.vendor = vendor;
    }

    @Override
    public String toString(){
        return super.toString()+"\nVendor: "+vendor;
    }
}
