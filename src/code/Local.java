package code;

public class Local {
	public void add() {
		int a,b=10,c=20; // declaring local variable
		a=b+c;
		System.out.println("add=" + a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Local obj = new Local();
		obj.add();
		
		
	}

}
