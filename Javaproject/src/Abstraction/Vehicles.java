package Abstraction;

abstract class Vehicles 
{
	int no_of_tyres;
	abstract void main();
}
class Car extends Vehicles
{
	int no_of_tyres=4;
	void main()
	{
		System.out.println(no_of_tyres);
		System.out.println(" Car start by key");
	}
}
class Scooter extends Vehicles
{
	int no_of_tyres=2;
			void main()
			 {
				System.out.println(no_of_tyres);
				System.out.println("Scooter starts by kick");
			 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c= new Car();
		c.main();
		Scooter s= new Scooter();
		s.main();
		

	}

}
