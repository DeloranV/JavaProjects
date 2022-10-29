package Misc;

class Bike{
	
	int gears_n;
	int price;
	int warranty;
	
	Bike(int gears_n, int price, int warranty){
		this.gears_n = gears_n;
		this.price = price;
		this.warranty = warranty;
	}
	
	Bike(){	                             //DEFAULT CONSTRUCTOR
		this.gears_n = 0;
		this.price = 0;
		this.warranty = 0;
	}

	void wyswietl() {
		System.out.print("\nIlość biegów: " + gears_n + "    Cena: " + price + " zł" + "    Gwarancja: " + warranty + " lat(a)");
	}
	
}

class MountainBike extends Bike{                            //EXTENDS BIKE CLASS WITH 2 VARS
	char susp_rating;
	String wheel_diam;
	
	MountainBike(int gears_n, int price,int warranty ,char susp_rating, String wheel_diam){
		super(gears_n, price, warranty);                     //CALLS SUPERCLASS CONSTRUCTOR FOR FIRST 3 VALUES
		this.susp_rating = susp_rating;
		this.wheel_diam = wheel_diam;
	}
	
	void wyswietl() {
		super.wyswietl();
		System.out.print("    Ocena zawieszenia: " + susp_rating + "    Rozmiar koła: " + wheel_diam + "        Rower górski");
	}
}

class RoadBike extends Bike{
	int max_vel;
	int weight;
	
	RoadBike(int gears_n, int price, int warranty, int max_vel, int weight){
		super(gears_n, price, warranty);
		this.max_vel = max_vel;
		this.weight = weight;
	}
	
	void wyswietl() {
		super.wyswietl();
		System.out.print("    Prędkość max: " + max_vel + " km/h" + "    Waga: " + weight + " kg" + "        Rower Sportowy");
	}
}


public class Bikes {
	public static void main(String[] args) {
		
		Bike rower1 = new Bike(5, 700, 3);
		MountainBike rower2 = new MountainBike(8, 1500, 5, 'A', "30 cm");
		RoadBike rower3 = new RoadBike(9,8,7,6,5);
		
		System.out.println("Informacje o rowerach:");
		
		rower1.wyswietl();
		rower2.wyswietl();
		rower3.wyswietl();
		
	}
}
