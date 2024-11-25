/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;


public class Flowero17 {
    private String nameflower;
    private int numpetals;
    private float price;

    public Flowero17(String nameflower, int numpetals, float price) {
        this.nameflower = nameflower;
        this.numpetals = numpetals;
        this.price = price;
    }

    public String getNameflower() {
        return nameflower;
    }

    public int getNumpetals() {
        return numpetals;
    }

    public float getPrice() {
        return price;
    }

    public void setNameflower(String nameflower) {
        this.nameflower = nameflower;
    }

    public void setNumpetals(int numpetals) {
        this.numpetals = numpetals;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void displayflower(){
        System.out.println("flower name :"+nameflower);
        System.out.println("numpetals :"+numpetals);
       System.out.println("price :"+price);
    }
    
    public static void main(String[] args) {
     Flowero17 flower=new Flowero17("rose",5,2.99f);
     flower.displayflower();
     flower.setNameflower("tulip");
     flower.setNumpetals(6);
     flower.setPrice(3.49f);
     flower.displayflower();
    
    }
}
