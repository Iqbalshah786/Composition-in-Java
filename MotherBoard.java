package com.company;

public class MotherBoard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private  int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program : "+programName +"is now"+" loading...");


    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }

    @Override
    public String toString() {
        return "Motherboard Information : \n"+
                "Model : "+getModel()+"\n+" +
                "Manufacturer : "+getManufacturer()+"\n"+
                "Number of Ram Slots : "+getRamSlots()+"\n"+
                "Number of Card Slots : "+getCardSlots()+"\n"+
                "Bios : "+getBios();

    }
}
