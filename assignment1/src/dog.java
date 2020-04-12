
		
		public class dog
		{
		
		 private int age;
		
		 private String name; 
		
		 public dog(int age,String name)
		
		 {
		
		  this.age = age;
		
		  this.name = name;
		
		 }
		
		 public String setDogName(String name)
		
		 {
		
		  this.name = name;
	
		  return name;
		
		 }
		
		 public int getDogName()
		 {
	
		  return age;
		
		 }
		
		 public int setDogAge(int age)
		 {
		  this.age = age;
		
		  return age;
		
		 }
	
		  
		
		 public int getDogAge()
		
		 {
		
		  return age;
		
		 }
		
		  
		
		 public String toString()
		
		 {
		
		  String dogsname= "Dog's name: ";
		
		  String dogsage= "Dog's age: ";
		
		  return dogsname + name + "\t" + 
		
		                  dogsage +  age ;
		
		 } 
	
		  
	
		 public static void main (String[] args)
		
		 {
		  dog dog1 = new dog(1,"Lucky");
		  dog dog2 = new dog(2,"Starc");
		  dog dog3 = new dog(5,"Lutchy");
		
		  dog1.setDogAge(9);
		
		  System.out.println(dog1);
		
		  dog2.setDogName("Azzam");
		  System.out.println(dog2);
		
		  System.out.println(dog3);
		
		  System.out.println();
		
		
		  
		 }
		
		

		
	}


