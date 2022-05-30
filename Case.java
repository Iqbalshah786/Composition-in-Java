package com.company;

public class Case {

    private  String Model;
    private  String manufacturer;
    private  String powerSupply;
    private Dimension dimension;

    public Case(String model, String manufacturer, String powerSupply, Dimension dimension) {
        Model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }
    public void pressPowerButton(){
        System.out.println("Power button is pressed ");
    }
    public void pressResetButton(){
        System.out.println("Reset button is pressed ");
    }

}
