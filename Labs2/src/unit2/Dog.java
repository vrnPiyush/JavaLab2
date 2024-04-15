package unit2;

public class Dog {
	String name;
	String breed;
	
   public Dog(String name,String breed)
   {
	   this.name=name;
	   this.breed=breed;
   }
   public void showDetail()
   {
	   System.out.println("Name: "+ name+" Age: "+ breed);
   }
   
   public void setName(String name)
   {
	   this.name=name;
   }
   public void getName()
   {
	   System.out.println("Name: "+name);
   }
	
	   public static void main(String[] args) {
	       Dog d1=new Dog("Tom","German Shepard");
	         Dog d2=new Dog("Tommy","PITBULL");
	       d1.showDetail();
	       d2.showDetail();
	       d1.setName("Boxer");
	       d2.setName("shera");
	       d1.showDetail();
	       d2.showDetail();
	       
		   
	   }
}
