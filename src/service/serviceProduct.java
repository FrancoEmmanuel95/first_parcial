package service;
import model.*;
import enums.productType;

import java.util.ArrayList;

public class serviceProduct {
    private ArrayList<product> inventory;

    public serviceProduct() {
       this.inventory = new ArrayList<>();
    }
    chair chair1 = new chair(10,"gamer chair",3000.00D,productType.CHAIR,true);
    chair chair2 = new chair(6,"black chair",1500.00D,productType.CHAIR,false);
    desk desk1 = new desk(5,"gamer desk",2000.00D,productType.DESK,0.80D);
    desk desk2 = new desk(5,"black desk",1500.00D,productType.DESK,0.76);
    printer printer1 = new printer(5,"m2020w",1000.00D,productType.PRINTER,"samsung",100);
    notebook notebook1 = new notebook(10,"pavillion h3",300.00D,productType.NOTEBOOK,"HP",4);

    public void addProduct(){
        this.inventory.add(chair1);
        this.inventory.add(chair2);
        this.inventory.add(desk1);
        this.inventory.add(desk2);
        this.inventory.add(printer1);
        this.inventory.add(notebook1);
    }
    public void listProducts(){
        for (product p:this.inventory) {
            System.out.println(p);
        }
    }
    public void offerPrice(Double percentage){
        Double offerCost;
        for (product p:this.inventory) {
            if (p.getType()==productType.CHAIR || p.getType() == productType.PRINTER){
                System.out.println("\nName: "+p.getName()+"\nCost without offer:$"+p.getCost());
                offerCost=p.getCost()-(p.getCost()*(percentage/100));
                System.out.println("Cost with offer:$"+offerCost);
            }
        }

    }

    public void actualizePrice(){
        for (product p:this.inventory) {
            Double newCost;
            System.out.println("\nName: "+p.getName()+"\nOld cost:$"+p.getCost());
            if(p.getType()==productType.CHAIR){
                newCost=p.getCost()*1.05;
                p.setCost(newCost);
            } else if (p.getType()==productType.DESK) {
                newCost=p.getCost()*1.1;
                p.setCost(newCost);
            } else if (p.getType()==productType.PRINTER) {
                newCost=p.getCost()*1.15;
                p.setCost(newCost);
            } else if (p.getType()==productType.NOTEBOOK) {
                newCost=p.getCost()*1.2;
                p.setCost(newCost);
            }
            System.out.println("New cost:$"+p.getCost());
        }
    }
}
