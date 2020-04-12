package arthemetic;

public class ArithmeticOperation {
	int x=40,y=10;

	void increment()
	{
		y=((y++) +(y++) + (++y) +(--y) -( y--));
		System.out.println("after performing ((y++) +(y++) + (++y) +(--y) -( y--))");
		System.out.println(y);
	}
	void shiftopearation()
	{
		int a=y>>1;
		int b=x<<3;
		System.out.println("bit wise right shift="+a);
		System.out.println("bit wise leftt shift="+b);
	}
	public void operations() {
		// TODO Auto-generated method stub
		int add=x+y;
		int sub=x-y;
		int div=x/y;
		int mult=x*y;
		int rem=x%y;
		System.out.println("addition="+add);
		System.out.println("substraction="+sub);
		System.out.println("division="+div);
		System.out.println("Multiplication="+mult);
		System.out.println("Remainder="+rem);
	}
	
	

}

