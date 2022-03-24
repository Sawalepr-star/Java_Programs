package oopsConcepts;

 class Animal {
	public void eat()
	{
		System.out.println(" I am eating");
	}
	public void run()
	{
		System.out.println("I am runing");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		Animal dog=new Animal();
		Animal fox= new Animal();
		dog.eat();
		fox.run();

	}

}
