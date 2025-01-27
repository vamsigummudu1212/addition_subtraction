
public class addition_subtraction {
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public static void main(String args[]) {
		addition_subtraction R=new addition_subtraction();
		int x=R.add(56, 34);
		int y=R.sub(98,9);
		System.out.println("the total amount was :"+x);
		System.out.println("the total profit was :"+y);
		
	}

}
