class Stove{
	static void burning(String powerd){
		System.out.println(" stove is burning by "+powerd);
	if(powerd!=null){
		System.out.println(" powerd is valid");
	}
	else{
		System.out.println(" powerd is in-valid");
		return;
	}
	}
	static void burning(int use){
		System.out.println(" number of stove use "+use);
		if(use>2 && use<=10){
			System.out.println(" number is valid");
		}
		else{
			System.out.println(" number is in-valid");
			return;
		}
	}
	static void burning(short capacity){
		System.out.println(" capacity of the stove in years "+capacity);
		if(capacity>3){
			System.out.println(" capacity is valid");
		}
		else{
			System.out.println(" capacity is in-valid");
		}
	}
}