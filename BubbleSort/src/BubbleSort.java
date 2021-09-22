/**
 * author: abigailgaver
 * Description:
 * 				Bubble Sort
 * 
 * 				Input: unsorted array
 * 				Output: sorted array
 * 
 * 				
 * created 	2020/03/25; 
 * works:	2020/03/25
 */
public class BubbleSort
{
	int[] myArr;
	
	public BubbleSort()
	{
		
	}
	
	public void setArray(int[] arrayx)
	{
		myArr = arrayx;
	}
	
	public void print()
	{
		System.out.println("start of print");
		for (int i = 0; i < myArr.length; i++)
		{
			System.out.printf("%4d", myArr[i] );
		}
		System.out.println("\nend of print");
		
	}
	
	public void sort()
	{
		int tmp;
		
		for (int i = 0; i < myArr.length; i++)
		{
			for (int k = 0; k < myArr.length - 1; k++)
			{
				if (myArr[k] > myArr[k+1]) //if want in decreasing order, switch "<" and ">" in this if statement
				{
					//swap
					tmp = myArr[k];
					myArr[k] = myArr[k+1];
					myArr[k+1] = tmp;
				}
			}
		}
		
		
	}
	

	
	
	static public void main(String[] args)
	{
		
		int[] arr1 = { 45, 22, 4,  7 , 9 , 11, 49, 12};
		
		BubbleSort bs = new BubbleSort();
		bs.setArray(arr1);
		//before sort
		System.out.println("before sort");
		bs.print();
		bs.sort();
		//after sort
		System.out.println("after sort");
		bs.print();

	}

}
