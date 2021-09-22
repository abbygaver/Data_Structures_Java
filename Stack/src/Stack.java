/**
 * @author abigailgaver
 * 
 * Description: This program is a Stack. It has a stack,
 * a top pointer, and a size for the stack. It can push
 * data into the stack, check if the stack is full, 
 * remove data from the stack, and peek into the top of
 * the stack.
 * Hwk: hwk5/Stack.java
 * Compiles: yes
 * Works: yes
 * Number of hours of programming since start: 13
 */
import java.util.Scanner;
public class Stack
{
	//data
	private String[] data;
	private int top;
	private int size;
	
	
	//constructors
	public Stack()
	{
		size = 10;
		data = new String[size];
		top = -1;
	}
	
	public Stack(int sizex)
	{
		size = sizex;
		data = new String[size];
		top = -1;
	}
	
	//work methods
	public void push(String it)
	{
		if (isFull())
		{
			System.out.println("Sorry, there is no more room.");
		}
		else
		{
			top++;
			data[top] = it;
		}
	}
	
	public boolean isFull()
	{
		if (top == size - 1)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	public String pop()
	{
		String item = "";
		if (top > 0)
		{
			item = data[top];
			data[top] = null;
			top--;
		}
		return(item);
	}
	
	public void peek()
	{
		if (top > -1)
		{
			System.out.println(data[top]);	
		}
	}
	
	//main method
	public static void main(String[] args)
	{
		Stack stc = new Stack();
		System.out.println("start Stack");
		Scanner sc = new Scanner(System.in);
		
		String cmd = ""; //quit, push, pop, peek
		
		while(!(cmd.contentEquals("quit")))
		{
			System.out.println("type a cmd: quit, push, pop, peek");
			cmd = sc.nextLine();
			
			//if cmd is push
			if (cmd.equals("push"))
			{
				System.out.println("do push");
				System.out.println("What would you like to push?");
				
				String pushItem = sc.nextLine();
				stc.push(pushItem);
			}
			
			//if cmd is pop
			if (cmd.equals("pop")) 
			{
				System.out.println("do pop");
				stc.pop();
			}
			
			//if cmd is peek
			if (cmd.contentEquals("peek"))
			{
				System.out.println("do Peek");
				stc.peek();
			}
			
			//if cmd is quit, quit gracefully
		}
		System.out.println("thanks for playing -- come back soon!");
		sc.close();
	}
}
