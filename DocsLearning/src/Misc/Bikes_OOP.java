package Misc;

class Bike {

	static final int WHEELS_NUM = 2; // STATIC CONSTANT FOR ALL BIKE INSTANCES
	static private int bikeID = 0; // INCREMENTED EVERY TIME A BIKE IS MADE FROM A CONSTRUCTOR
	private int gears_Number; // MAKE VARIABLES AND METHODS PRIVATE WHENEVER POSSIBLE
	int price;
	int warranty;

	Bike(int gears_Number, int price, int warranty) {
		this.gears_Number = gears_Number;
		this.price = price;
		this.warranty = warranty;

		bikeID++;
	}

	Bike() { // DEFAULT CONSTRUCTOR
		this.gears_Number = 0;
		this.price = 0;
		this.warranty = 0;

		bikeID++;
	}

	void outputAll() {
		System.out.print("\nID: " + bikeID + "    Ilość biegów: " + gears_Number + "    Cena: " + price + " zł"
				+ "    Gwarancja: " + warranty + " lat(a)" + "    Ilość kół: " + WHEELS_NUM);
	}

	final public static void outputGears(Bike rower) { // METHOD DECLARED FINAL - CANNOT BE OVERRIDEN BY A SUBCLASS -
														// USE IN CASES WHERE ITS CRITICAL FOR CONSISTENCY
		System.out.println("\nIlość biegów wybranego roweru: " + rower.gears_Number);
	}
}

class MountainBike extends Bike { // EXTENDS BIKE CLASS WITH 2 VARS

	char susp_rating;
	String wheel_diam;

	MountainBike(int gears_Number, int price, int warranty, char susp_rating, String wheel_diam) {
		super(gears_Number, price, warranty); // CALLS SUPERCLASS CONSTRUCTOR FOR FIRST 3 VALUES
		this.susp_rating = susp_rating;
		this.wheel_diam = wheel_diam;
	}

	@Override
	void outputAll() {
		super.outputAll();
		System.out.print(
				"    Ocena zawieszenia: " + susp_rating + "    Rozmiar koła: " + wheel_diam + "        Rower górski");
	}
}

class RoadBike extends Bike implements bikeTestDrive {

	int max_vel;
	int weight;

	RoadBike(int gears_Number, int price, int warranty, int max_vel, int weight) {
		super(gears_Number, price, warranty);
		this.max_vel = max_vel;
		this.weight = weight;
	}

	@Override
	void outputAll() {
		super.outputAll();
		System.out
				.print("    Prędkość max: " + max_vel + " km/h" + "    Waga: " + weight + " kg" + "    Rower Sportowy");
		return; // OPTIONAL IN VOID FOR FLOW-CONTROL
	}

	public void bikeRide() { // INTEFRACE METHOD IMPLEMENTATION
		System.out.println("\n\nJedziesz z prędkością: " + max_vel);
	}
}

interface bikeTestDrive {

	void bikeRide(); // ABSTRACT METHOD - NEEDS TO BE IN EVERY IMPLEMENTATION

	default void koniecJazdy() { // DEFAULT METHOD - DEFINED IN INTERFACE - USEFUL WHEN EXTENDING INTERFACES -
									// ALTERNATIVELY EXTEND INTERFACE
		System.out.println("\nJazda testowa zakończona.");
	}

}

public class Bikes_OOP {
	public static void main(String[] args) {

		Bike rower1 = new Bike(5, 700, 3);
		rower1.outputAll();
		MountainBike rower2 = new MountainBike(8, 1500, 5, 'A', "30 cm");
		rower2.outputAll();
		RoadBike rower3 = new RoadBike(9, 8, 7, 6, 5);
		rower3.outputAll();

		rower3.bikeRide();
		rower3.koniecJazdy();

		System.out.println("\n\n" + (rower1 instanceof Bike));

		Bike.outputGears(rower3);

		// System.out.println(rower1.gears_Number); NOT WORKING - PRIVATE MAKES IT
		// ACCESIBLE ONLY FROM WITHIN ITS CLASS

	}
}