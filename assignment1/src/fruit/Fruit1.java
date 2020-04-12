package fruit;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Fruit1{
	String fruitname;
	String color;
	int weight;
	public String getFruitname() {
		return fruitname;
	}
	public Fruit1(String fruitname, String color, int weight) {
		super();
		this.fruitname = fruitname;
		this.color = color;
		this.weight = weight;
	}
	public void setFruitname(String fruitname) {
		this.fruitname = fruitname;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Fruit1(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
	@Override
	public String toString() {
		return "Fruit1 [fruitname=" + fruitname + ", color=" + color + ", weight=" + weight + "]";
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}

class FruitPredicate{
	public static Predicate<Fruit1>isred()
	{
		return c->c.getColor().equals("red");
	}

public static List<Fruit1> filterFruit1(List<Fruit1> fruit, 
        Predicate<Fruit1> predicate) 
{
return fruit.stream()
.filter( predicate )
.collect(Collectors.<Fruit1>toList());
}
}   



