class Chariot{
	String typeOfDriven;
	String wordComesFrom;
	int wheelNumbers;
	String usingAnimal;
	String type;
	String introduced;
	float priceForRide;
	int animalNumber;
	String horseEyes;
	String riderName;
	int riderNumbers;
	
	Chariot(){
		System.out.println("invoking no-args constructor");
		System.out.println(this.typeOfDriven);
		System.out.println(this.wordComesFrom);
		System.out.println(this.wheelNumbers);
		System.out.println(this.usingAnimal);
		System.out.println(this.type);
		System.out.println(this.introduced);
		System.out.println(this.priceForRide);
		System.out.println(this.animalNumber);
		System.out.println(this.horseEyes);
		System.out.println(this.riderName);
		System.out.println(this.riderNumbers);
		System.out.println("\n");
	}
	Chariot(String typeOfDriven){
		System.out.println("invoking String constructor");
		this.typeOfDriven=typeOfDriven;
	}
	Chariot(String typeOfDriven,String wordComesFrom){
		System.out.println("invoking String,String constructor");
		this.typeOfDriven=typeOfDriven;
		this.wordComesFrom=wordComesFrom;
	}
	Chariot(String typeOfDriven,String wordComesFrom,int wheelNumbers){
		System.out.println("invoking String,String,int constructor");
		this.typeOfDriven=typeOfDriven;
		this.wordComesFrom=wordComesFrom;
		this.wheelNumbers=wheelNumbers;
	}
	Chariot(String typeOfDriven,String wordComesFrom,int wheelNumbers,String usingAnimal){
		System.out.println("invoking String,String,int,String constructor");
		this.typeOfDriven=typeOfDriven;
		this.wordComesFrom=wordComesFrom;
		this.wheelNumbers=wheelNumbers;
		this.usingAnimal=usingAnimal;
	}
	Chariot(String typeOfDriven,String wordComesFrom,int wheelNumbers,String usingAnimal,String type){
		System.out.println("invoking String,String,int,String,String constructor");
		this.typeOfDriven=typeOfDriven;
		this.wordComesFrom=wordComesFrom;
		this.wheelNumbers=wheelNumbers;
		this.usingAnimal=usingAnimal;
		this.type=type;
	}
	Chariot(String typeOfDriven,String wordComesFrom,int wheelNumbers,String usingAnimal,String type,String introduced){
		System.out.println("invoking String,String,int,String,String,String constructor");
		this.typeOfDriven=typeOfDriven;
		this.wordComesFrom=wordComesFrom;
		this.wheelNumbers=wheelNumbers;
		this.usingAnimal=usingAnimal;
		this.type=type;
		this.introduced=introduced;
	}
	Chariot(String typeOfDriven,String wordComesFrom,int wheelNumbers,String usingAnimal,String type,String introduced,float priceForRide){
		System.out.println("invoking parameter constructor");
		this.typeOfDriven=typeOfDriven;
		this.wordComesFrom=wordComesFrom;
		this.wheelNumbers=wheelNumbers;
		this.usingAnimal=usingAnimal;
		this.type=type;
		this.introduced=introduced;
		this.priceForRide=priceForRide;
	}
	Chariot(String typeOfDriven,String wordComesFrom,int wheelNumbers,String usingAnimal,String type,String introduced,float priceForRide,int animalNumber){
		System.out.println("invoking parameter constructor");
		this.typeOfDriven=typeOfDriven;
		this.wordComesFrom=wordComesFrom;
		this.wheelNumbers=wheelNumbers;
		this.usingAnimal=usingAnimal;
		this.type=type;
		this.introduced=introduced;
		this.priceForRide=priceForRide;
		this.animalNumber=animalNumber;
	}
	Chariot(String typeOfDriven,String wordComesFrom,int wheelNumbers,String usingAnimal,String type,String introduced,float priceForRide,int animalNumber,String horseEyes){
		System.out.println("invoking parameter constructor");
		this.typeOfDriven=typeOfDriven;
		this.wordComesFrom=wordComesFrom;
		this.wheelNumbers=wheelNumbers;
		this.usingAnimal=usingAnimal;
		this.type=type;
		this.introduced=introduced;
		this.priceForRide=priceForRide;
		this.animalNumber=animalNumber;
		this.horseEyes=horseEyes;
	}
		Chariot(String typeOfDriven,String wordComesFrom,int wheelNumbers,String usingAnimal,String type,String introduced,float priceForRide,int animalNumber,String horseEyes,String riderName){
		System.out.println("invoking parameter constructor");
		this.typeOfDriven=typeOfDriven;
		this.wordComesFrom=wordComesFrom;
		this.wheelNumbers=wheelNumbers;
		this.usingAnimal=usingAnimal;
		this.type=type;
		this.introduced=introduced;
		this.priceForRide=priceForRide;
		this.animalNumber=animalNumber;
		this.horseEyes=horseEyes;
		this.riderName=riderName;
	}
	Chariot(String typeOfDriven,String wordComesFrom,int wheelNumbers,String usingAnimal,String type,String introduced,float priceForRide,int animalNumber,String horseEyes,String riderName,int riderNumbers){
		System.out.println("invoking parameter constructor");
		this.typeOfDriven=typeOfDriven;
		this.wordComesFrom=wordComesFrom;
		this.wheelNumbers=wheelNumbers;
		this.usingAnimal=usingAnimal;
		this.type=type;
		this.introduced=introduced;
		this.priceForRide=priceForRide;
		this.animalNumber=animalNumber;
		this.horseEyes=horseEyes;
		this.riderName=riderName;
		this.riderNumbers=riderNumbers;
	}
}