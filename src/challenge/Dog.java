package challenge;

public class Dog {

	String name;
	int age;
	//String color;
	
	//--------------------constructor with arg------------------------
	public Dog (String myDogName, int myDogAge) {
     this.name = myDogName;
     this.age = myDogAge;
	}
	
	public Dog() {
		name = "bruno";
		age = 4;
	}
	
	public void bark()
	{
		System.out.println("bow bow");
	}
}


