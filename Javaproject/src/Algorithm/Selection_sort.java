package Algorithm;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,45,67,90,36};
		 int min;
		 int temp;
		for(int i=0;i<a.length;i++)
		{
			 min=i;
			for(int j=i+1; j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
