package Inheritance;

 class A1 {
	 	
	 			void showA1()
	 			{
	 				System.out.println(" A is class method");
	 			}
	 		}
 class B1 extends A1{
	 
 
	 		void showB1()
	 		{
	 			System.out.println(" B is class method");
	 		}
 }
 class C1 extends B1{
	 
	 		void ShowC1()
	 		{
	 			System.out.println(" C is class method");
	 		}
	 			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 C1 obj = new C1();
		 obj.showA1();
		 obj.showB1();
		 obj.ShowC1();
	}

}
