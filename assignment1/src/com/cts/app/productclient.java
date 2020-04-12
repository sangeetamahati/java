package com.cts.app;
import com.cts.beans.product;
public class productclient {
	public static void main(String args[])
	{
		product mp=new product();
		mp.Setproduct(190,"mobile",15000.00);
		mp.display();
	}
}