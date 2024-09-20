package model;

import enums.productType;

public class notebook extends informaticProduct{
    private Integer ram;

    public notebook(Integer stock, String name, Double cost, productType type, String vendor, Integer ram) {
        super(stock, name, cost, type, vendor);
        this.ram = ram;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }
    @Override
    public String toString(){
        return super.toString()+"\nRam: "+ram+"GB";
    }
}
