package ZTI;

public class Program {

	public static void main(String[] args) {
		Point p1, p2;
		
		p1 = new Point(3,5);
		p2 = new Point(8,10);
		System.out.println("p1 =?= p2 : " + p1.compareTo(p2));

		p1 = new Point(3,5);
		p2 = new Point(3,5);
		System.out.println("p1 =?= p2 : " + p1.compareTo(p2));
	}
}
