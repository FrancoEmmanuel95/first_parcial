package model;

import enums.productType;

public class printer extends informaticProduct{
    private Integer pagesMinute;

    public printer(Integer stock, String name, Double cost, productType type, String vendor, Integer pagesMinute) {
        super(stock, name, cost, type, vendor);
        this.pagesMinute = pagesMinute;
    }

    public Integer getPagesMinute() {
        return pagesMinute;
    }

    public void setPagesMinute(Integer pagesMinute) {
        this.pagesMinute = pagesMinute;
    }

    @Override
    public String toString(){
        return super.toString()+"\nPages/Minute: "+pagesMinute;
    }
}
