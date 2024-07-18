package com.cbfacademy;

public class Exceptions {
	public static void main(String[] args) {
		try {
			int myInt = Integer.parseInt("hat");
		} catch (NumberFormatException nfe) {// will catch all trypes of number frmet exceptions and underneath that
												// class
			System.out.println("incorrect");
		}
		System.out.println("End here");

		// excdeption in a method example you dont need to catch an exception on the line occurs in, it can be called up tot he method that called it
			try {
				getInt():
				
			} catch (NumberFormatException | NullPointerException e) {// can catch mutiple exceptions reduced repeated code ( multi catch statement) // can alos put it on different lines
													// class
				System.out.println("incorrect");
			}
			finally{ // continues the code you want tot execure whether there is an exception or not
				System.out.println("in the finally block");
			}
			System.out.println("End here");

		}private static void getInt() {
			int myInt = Integer.parseInt("hat"); // thown back up method
		}

	try

	{
		int myInt = Integer.parseInt("hat"); // thown back up method
		System.out.println("say something"); // this will not printed afer the exception is thrown
	}

	catch(
	NumberFormatException e)
	{

	}System.out.println("incorrect");
}finally{
// continues the code you want tot execure whether there is an exception or not
// any return statement in finally block will overun any return statement in the
// try bloack
// finallly is used for example always wanting to close and stream or file
System.out.println("in the finally block");}System.out.println("End here");}

}

}

}
