package question1.model;

public class Customer {
     private int id;
     private char name;
     private int age;
       
     
    public  Customer() {
    	
    }
    public  Customer(int i, char na, int a) {
    	id=i;
    	name=na;
    	age=a;
    	
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getName() {
		return name;
	}
	public void setName(char name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
}
