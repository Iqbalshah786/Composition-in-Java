package com.company;

public class Monitor {
    private  String Model;
    private  String manufacturer;
    private  int size;

    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        Model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixAt(int x , int y, String  Color){
        System.out.println("Drawing pixel at : "+x+","+y+" in color "+Color );
    }

    public String getModel() {
        return Model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }


}
