package practice;

class Shirt {
	Shirt() {
		System.out.println("this is a shirt constructor!");
	}
}

class Car {
	int maxSpeed;
	
	Car(int newMaxSpeed) {
		System.out.println("this is a car constructor!");
		this.maxSpeed = newMaxSpeed;
		
	}
}

class SimpleConstructor {
	public static void main(String[] args) {
		Shirt shirt = new Shirt();
		Car car = new Car(200);
		System.out.println("this car can do max speed of: " + car.maxSpeed);;
		
	}
}

