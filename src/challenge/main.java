package challenge;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//-----------------constructor with args
		Dog d = new Dog("Ross", 4);
		System.out.println(d.name);
		
		//---------------constructor without args
		Dog myDog = new Dog();
		System.out.println(myDog.name);
		System.out.println(myDog.age);
		
		
	}


	}


