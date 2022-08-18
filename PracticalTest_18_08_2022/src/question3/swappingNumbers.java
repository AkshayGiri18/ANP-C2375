package question3;

public class swappingNumbers {
	public static void main(String[] args) {
		System.out.println("Before Swapping");
		int x=1;
		int y=2;
		System.out.println("value of x: " + x);
		System.out.println("value of y: " + y);
		System.out.println("After Swapping ");
		x= x + y;
		y= x - y;
		x= x - y;
		System.out.println("value of x: " + x);
		System.out.println("value of y: " + y);
		
	}

}
