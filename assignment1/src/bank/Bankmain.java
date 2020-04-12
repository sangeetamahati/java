package bank;

public class Bankmain {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
        savingac sa = new savingac(1234567,"Savings",8);
        sa.disp();
        sa.display();
        fixedac fa=new fixedac(2345678,"fixed",9);
        fa.disp();
        fa.display();
        Recurrentac ra=new Recurrentac(3456789,"recurrent",10);
        ra.disp();
        ra.display();

}
}
