/**
 * author:		abigailgaver
 * Description:
 * 				Insert Sort
 * 
 * 				Input: unsorted array
 * 				Output: sorted array
 * 
 * 				
 * created 	2020/03/25; 
 * works:	2020/03/25
 */
public class InsertSort
{
	int[] ar1;
	int[] ar2;
	
	public InsertSort()
	{
		
	}
	
	public void setArray(int[] arrayx)
	{
		ar1 = arrayx;
		ar2 = new int[arrayx.length];
	}
	
	public void print()
	{
		System.out.println("start of print");
		for (int i = 0; i < ar1.length; i++)
		{
			System.out.printf("%4d", ar1[i] );
		}
		System.out.println("\nend of print");
		
	}
	
	public void printSorted()
	{
		System.out.println("start of print");
		for (int i = 0; i < ar2.length; i++)
		{
			System.out.printf("%4d", ar2[i] );
		}
		System.out.println("\nend of print");
		
	}
	
	
	public void sort()  //{12, 8, 3, 7, 10}
	{
		int temp;
		for (int j = 0; j < ar1.length; j++)
		{
			ar2[j] = ar1[j];
			
			for (int k = j; k >= 1; k--)
			{
				if (ar2[k - 1] > ar2[k])
				{
					temp = ar2[k - 1];
					ar2[k - 1] = ar2[k];
					ar2[k] = temp;
				}
			}
		}
	}
	
	

	
	
	static public void main(String[] args)
	{
		System.out.println("start insertSort");
		int[] arr1 = { 45, 22, 4,  7 , 9 , 11, 49, 12};
		//int[] arr1 = {12, 8, 3, 7, 10};
		
		InsertSort bs = new InsertSort();
		bs.setArray(arr1);
		//before sort
		bs.print();
		bs.sort();
		//after sort
		bs.printSorted();

	}

}

