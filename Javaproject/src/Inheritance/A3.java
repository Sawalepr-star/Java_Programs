package Inheritance;

 class A3 {
	 		void showsA3()
	 		{
	 			System.out.println(" A class method");
	 		}
 }	
 class B3 extends A3 {
		void showsB3()
		{
			System.out.println(" B class method");
		}
}	
 class C3 extends A3{
		void showsC3()
		{
			System.out.println(" C class method");
		}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B3 ob1 =new B3();
		C3 ob2 =new C3();
		ob1.showsA3();
		ob1.showsB3();
		ob2.showsC3();
		ob2.showsA3();


	}

}
