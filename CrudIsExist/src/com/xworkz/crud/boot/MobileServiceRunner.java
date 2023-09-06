package com.xworkz.crud.boot;

import com.xworkz.crud.app.Service.MobileNoService;
import com.xworkz.crud.app.Service.MobileNoServiceImpl;
import com.xworkz.crud.app.repository.MobileNoRepository;
import com.xworkz.crud.app.repository.MobileNoRepositoryImpl;

public class MobileServiceRunner {

	public static void main(String[] args) {


		MobileNoRepository mobileNoRepository=new MobileNoRepositoryImpl();
		MobileNoService mobileNoService=new MobileNoServiceImpl(mobileNoRepository);
		mobileNoService.validateAndSave(9353773918l);
		mobileNoService.validateAndSave(8549948888l);
	}

}
