package com.xworkz.app.inheritance;

import com.xworkz.app.boot.inheritance.eight.Destop;
import com.xworkz.app.boot.inheritance.eight.ElectronicsDevice;
import com.xworkz.app.boot.inheritance.eight.Laptop;
import com.xworkz.app.boot.inheritance.eight.Mobile;
import com.xworkz.app.boot.inheritance.eight.Printer;
import com.xworkz.app.boot.inheritance.eight.Projector;
import com.xworkz.app.boot.inheritance.eight.Tablet;
import com.xworkz.app.boot.inheritance.eight.Tv;
import com.xworkz.app.boot.inheritance.eight.WebCamara;

public class ElectronicsDeviceRunner {

	public static void main(String[] args) {
	
		ElectronicsDevice device=new ElectronicsDevice();
		device.deviceMethod();
		System.out.println("\n");
		
		ElectronicsDevice destop=new Destop();
		Destop destop1=new Destop();
		destop.deviceMethod();
		destop1.destopMethod();
		System.out.println("\n");
		
		ElectronicsDevice laptop=new Laptop();
		Destop laptop1=new Laptop();
		Laptop laptop2=new Laptop();
		laptop.deviceMethod();
		laptop1.destopMethod();
		laptop2.laptopMethod();
		System.out.println("\n");
		
		ElectronicsDevice mobile=new Mobile();
		Destop mobile1=new Mobile();
		Laptop mobile2=new Mobile();
		Mobile mobile3=new Mobile();
		mobile.deviceMethod();
		mobile1.destopMethod();
		mobile2.laptopMethod();
		mobile3.mobileMethod();
		System.out.println("\n");
		
		ElectronicsDevice tablet=new Tablet();
		Destop tablet1=new Tablet();
		Laptop tablet2=new Tablet();
		Mobile tablet3=new Tablet();
		Tablet tablet4=new Tablet();
		tablet.deviceMethod();
		tablet1.destopMethod();
		tablet2.laptopMethod();
		tablet3.mobileMethod();
		tablet4.tabletMethod();
		System.out.println("\n");
		
		ElectronicsDevice tv=new Tv();
		Destop tv1=new Tv();
		Laptop tv2=new Tv();
		Mobile tv3=new Tv();
		Tablet tv4=new Tv();
		Tv tv5=new Tv();
		tv.deviceMethod();
		tv1.destopMethod();
		tv2.laptopMethod();
		tv3.mobileMethod();
		tv4.tabletMethod();
		tv5.tvMethod();
		System.out.println("\n");
		
		ElectronicsDevice printer=new Printer();
		Destop printer1=new Printer();
		Laptop printer2=new Printer();
		Mobile printer3=new Printer();
		Tablet printer4=new Printer();
		Tv printer5=new Printer();
		Printer printer6=new Printer();
		printer.deviceMethod();
		printer1.destopMethod();
		printer2.laptopMethod();
		printer3.mobileMethod();
		printer4.tabletMethod();
		printer5.tvMethod();
		printer6.printerMethod();
		System.out.println("\n");
		
		ElectronicsDevice projector=new Projector();
		Destop projector1=new Projector();
		Laptop projector2=new Projector();
		Mobile projector3=new Projector();
		Tablet projector4=new Projector();
		Tv projector5=new Projector();
		Printer projector6=new Projector();
		Projector projector7=new Projector();
		projector.deviceMethod();
		projector1.destopMethod();
		projector2.laptopMethod();
		projector3.mobileMethod();
		projector4.tabletMethod();
		projector5.tvMethod();
		projector6.printerMethod();
		projector7.projectorMethod();
		System.out.println("\n");
		
		ElectronicsDevice web=new WebCamara();
		Destop web1=new WebCamara();
		Laptop web2=new WebCamara();
		Mobile web3=new WebCamara();
		Tablet web4=new WebCamara();
		Tv web5=new WebCamara();
		Printer web6=new WebCamara();
		Projector web7=new WebCamara();
		WebCamara web8=new WebCamara();
	    web.deviceMethod();
	    web1.destopMethod();
	    web2.laptopMethod();
	    web3.mobileMethod();
	    web4.tabletMethod();
	    web5.tvMethod();
	    web6.printerMethod();
	    web7.projectorMethod();
	    web8.webcamaraMethod();
				
		
		

	}

}
