package com.company;



public class Main {

    public static void main(String[] args) {
	// write your code here

        Dimension dimension = new Dimension(20,20,5);
        Case theCase = new Case("1106","Dell","240",dimension);

        Monitor theMonitor = new Monitor("27 inch HD","ACER",27,new Resolution(2540,1440));
        MotherBoard motherBoard = new MotherBoard("XJ-241","ASUS",4,5,"V.445");

        PC thePc = new PC(theCase,theMonitor,motherBoard);

        thePc.getTheCase().pressPowerButton();
        thePc.getTheMonitor().drawPixAt(1500,1200,"Red");
        thePc.getTheMotherBoard().loadProgram("Windows 10 ");
        thePc.getTheCase().pressResetButton();

    }
}
