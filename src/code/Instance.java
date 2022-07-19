package code;

public class Instance { 
	// this instance variable can be used inside all the function of the class
	int a,b=10,c=20;
	public void add() {
		a=b+c; // accessing instance variable
		System.out.println("add=" +a);
	}
	public void sub() {
		a=b-c; // accessing instance variable
		System.out.println("sub=" +a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance obj = new Instance();
		obj.add();
		obj.sub();

	}

}
