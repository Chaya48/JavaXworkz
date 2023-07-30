package com.xworkz.app;

public class Browser {
      public Internet internet=new Internet();
      public Internet internet1=new Internet();
      
      public void search() {
    	  if(internet !=null) {
    		  this.internet.speed();
    		  System.out.println("invoking browser search");
    	  }
    	  else {
    		  System.out.println("invoking search is null");
    	  }
      }
      public void visitingWebPage() {
    	  if(internet1 !=null) {
    		  this.internet1.type();
    		  System.out.println("invoking brower in visiting web page");
    	  }
    	  else {
    		  System.out.println("invoking visiting web page is null");
    	  }
      }
}
