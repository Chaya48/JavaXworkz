package com.xworkz.app;

public class Hotel {
      public Cook cook=new Cook();
      public Cook cook1=new Cook();
      
      public void name() {
    	  if(cook != null) {
    		  this.cook.type();
    		  System.out.println("invoking hotel name");
    	  }
    	  else {
    		  System.out.println("invoking hotel null");
    	  }
      }
      public void location() {
    	  if(cook1 !=null) {
    		  this.cook1.material();
    		  System.out.println("invoking hotel material");
    	  }
    	  else {
    		  System.out.println("invoking hotel null");
    	  }
      }
}
