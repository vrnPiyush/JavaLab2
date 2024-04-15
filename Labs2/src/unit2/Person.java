package unit2;

public class Person {
	String name;
	int age;
	
   public Person(String name,int age)
   {
	   this.name=name;
	   this.age=age;
   }
   public void showDetail()
   {
	   System.out.println("Name: "+ name+" Age: "+ age);
   }
	
	   public static void main(String[] args) {
	       Person p1=new Person("Rahul",32);
	       Person p2=new Person("Rohit",22);
	       p1.showDetail();
	       p2.showDetail();
	       
		   
	   }
}
