/**
 *   Class: StackOfIntegers	  
 *   @author Dr. Johnson
 *   @version 1.0 
 *   Course: ITEC 2150 Fall, 2019
 *   Written: Originally written by Y. Daniel Liang, modified 8/26/19
 *   This class provides storage for a set of integers in the last in,last out format.  To add, we push() an int.
 *   to remove we pop() an int.
*/

public class StackOfIntegers
{
	// class variables (attributes)
	private int[] elements;
	private int size;
	// constant defining number of ints that can be pushed at one time
	public static final int DEFAULT_CAPACITY = 16;

	/**
	 *  Method: StackOfIntegers 
	 *  Default constructor
	 *  Construct a stack with the default capacity 16 
	 *  */
	public StackOfIntegers()
	{
		this(DEFAULT_CAPACITY);
	}

	/** 
	 *  Method: StackOfIntegers 
	 *  Additional constructor
	 *  Construct a stack with the specified maximum capacity 
	 * 
	 *  @param int - new capacity that overrides the default
	 * */
	public StackOfIntegers(int capacity)
	{
		elements = new int[capacity];
	}

	/**
	 *  Method: push() 
	 *  Push a new integer into the top of the stack
	 *  @param int value- the new integer being added
	 * */
	public void push(int value)
	{
		// resize the array if this is beyond the capacity of the array
		if (size >= elements.length)
		{
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		
        // add the new int to the array
		elements[size++] = value;
	}

	/** 
	 *  Method:  pop() 
	 * Return and remove the top element from the stack 
	 * 
	 * @return int - the integer being removed from the stack
	 * */
	public int pop()
	{
		return elements[--size];
	}

	/** 
	 * Method: peek() 
	 * Return the top element from the stack without removing it
	 * 
	 * @return int - the top element
	 * */
	public int peek()
	{
		return elements[size - 1];
	}

	/*
	 *  Method: empty
	 * Test whether the stack is empty 
	 * @return boolean - true if stack is empty
	 * */
	public boolean empty()
	{
		return size == 0;
	}

	/*
	 *  Method: getSize()
	 * Return the number of elements in the stack
	 * @return int - number of elements
	 *  */
	public int getSize()
	{
		return size;
	}
}
