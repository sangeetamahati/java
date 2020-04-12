package fruit;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static fruit.FruitPredicate.*;
public class Fruitmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Fruit1 f1 =new Fruit1("apple","red",100);
       Fruit1 f2=new Fruit1("mango","yellow",120);
       Fruit1 f3=new Fruit1("Banana","yellow",100);
       Fruit1 f4=new Fruit1("cherry","red",20);
       
       List<Fruit1> fruit= new ArrayList<Fruit1>();
       
       fruit.addAll(Arrays.asList(new Fruit1[]{f1,f2,f3,f4}));
       System.out.println(filterFruit1(fruit,isred()) );
       
	}

}
