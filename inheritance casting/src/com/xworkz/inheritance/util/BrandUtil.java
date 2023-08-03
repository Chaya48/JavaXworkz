package com.xworkz.inheritance.util;

import com.xworkz.inheritance.app4.Brand;
import com.xworkz.inheritance.app4.DuplicateBrand;
import com.xworkz.inheritance.app4.InternationalBrand;
import com.xworkz.inheritance.app4.LocalBrand;
import com.xworkz.inheritance.app4.NationalBrand;

public class BrandUtil {
	
public void run(Brand brand) {
		
		Brand brand2 = new Brand();
		brand2.getBrandName();
		
		if(brand instanceof LocalBrand)
		{
			Brand local=new LocalBrand();
			local.getBrandName();
			
			LocalBrand local1=(LocalBrand)local;
			local1.getLocalBrand();;
		
		}
		if(brand instanceof NationalBrand)
		{
			Brand national=new NationalBrand();
			national.getBrandName();//Brand
			
			NationalBrand national2=(NationalBrand)national;
			national2.getNationalBrandName();
		}
		
		if(brand instanceof InternationalBrand)
		{
			Brand inter=new InternationalBrand();
			inter.getBrandName();
			
			InternationalBrand inter2=(InternationalBrand)inter;
			inter2.getInternationalBrandName();
		}
		
		if(brand instanceof DuplicateBrand)
		{
			Brand duplicate=new DuplicateBrand();
			duplicate.getBrandName();
			
			DuplicateBrand duplicate2=(DuplicateBrand)duplicate;
			duplicate2.getDuplicateBrandName();
		}
	}

}
