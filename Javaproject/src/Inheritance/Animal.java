package Inheritance;

 class Animal {
		void eat()
		{
			System.out.println("I am eating");
		}
}
class Dog extends Animal
{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d= new Dog();
		d.eat();

	}

}
