package bank;

public class Mainclass {
	public static void main(String args[])
	{
		Account ac=new Account();
		ac.setaccount(89067856,"savings");
		ac.disp();
		RecurrentAccount sa=new RecurrentAccount();
		sa.Intrest2();
		
		
	}

}
