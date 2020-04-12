package bank;

public class Account {
	int acountnum;
	String acountname;
	Account(int acn,String acname)
	{
		acountnum=acn;
		acountname=acname;
		
	}
	void disp()
	{
		System.out.println("Account number="+acountnum);
		System.out.println("Account name="+acountname);
	}

}
	
	class savingac extends Account
	{
	double intr;
	savingac(int a,String an,double in){
	super(a,an);
	intr=in;
	}
	void display()
	{
	System.out.println("intresrt of saving="+intr);
	}
}
	class fixedac extends Account
	{
	double intr;
	fixedac(int a,String an,double in){
	super(a,an);
	intr=in;
	}
	void display()
	{
	System.out.println("intresrt of fixed="+intr);
	}
	
}

	class Recurrentac extends Account
	{
	double intr;
	Recurrentac(int a,String an,double in){
	super(a,an);
	intr=in;
	}
	void display()
	{
	System.out.println("intresrt of recurrent="+intr);
	}
	}

