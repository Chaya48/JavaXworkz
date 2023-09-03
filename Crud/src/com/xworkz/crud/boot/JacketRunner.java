package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.JacketRepository;
import com.xworkz.crud.app.repository.JacketRepositoryimpl;

public class JacketRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in JacketRunner");
		
		JacketRepository jacket=new JacketRepositoryimpl();
		jacket.cover("puma");
		jacket.cover("moncler");
		jacket.cover("Arc'teryx");
		jacket.cover("levi's");
		jacket.cover("the north face");
		jacket.cover("canada goose");
		jacket.cover("patagonia");
		jacket.cover("adidas");
		jacket.cover("nike");
		jacket.cover("burberry");
		jacket.cover("gucci");

	}

}
