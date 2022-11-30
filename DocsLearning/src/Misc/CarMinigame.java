package Misc;

import java.util.Scanner;

interface heading {
	enum direction {
		LEFT, RIGHT, AHEAD
	}

	void changeSpeed(char current);

	void turn(char pozycja);

	void printState();

}

class car implements heading {
	private int speed = 0;
	direction kierunek = direction.AHEAD;

	public void changeSpeed(char current) {
		if (current == 'w')
			this.speed += 10;
		if (current == 's')
			this.speed -= 10;
	}

	public void turn(char pozycja) {
		if (pozycja == 'a')
			this.kierunek = kierunek.LEFT;
		if (pozycja == 'd')
			this.kierunek = kierunek.RIGHT;
		if (pozycja == 'w')
			this.kierunek = kierunek.AHEAD;
	}

	public void printState() {
		System.out.println(speed + " " + kierunek);
	}
}

public class CarMinigame {

	public static void main(String[] args) {

		Scanner klawiatura = new Scanner(System.in);

		car bmw = new car();
		bmw.printState();

		exit: while (5 > 1) {

			switch (klawiatura.next().charAt(0)) {
			case 'a':
				bmw.turn('a');
				break;
			case 'd':
				bmw.turn('d');
				break;
			case 'w':
				bmw.changeSpeed('w');
				bmw.turn('w');
				break;
			case 's':
				bmw.changeSpeed('s');
				break;
			case 'q':
				break exit;
			}
			bmw.printState();
		}

	}

}
