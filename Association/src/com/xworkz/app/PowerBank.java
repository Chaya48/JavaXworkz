package com.xworkz.app;

public class PowerBank {
     public Battery battery=new Battery();
     public Battery battery1=new Battery();
     
     public void capaity()
     {
    	 System.out.println("invoking main in power Bnak");
    	 if(battery !=null) {
    		 this.battery.storingPower();
    	 }
    	 else
    	 {
    		 System.err.println("invoking battery is null");
    	 }
     }
     public void display()
     {
    	 System.out.println("invoking main in dispaly");
    	 if(battery1 !=null) {
    		 this.battery1.charging();
    	 }
    	 else
    	 {
    		 System.out.println("invoking display is null");
    	 }
     }
}
