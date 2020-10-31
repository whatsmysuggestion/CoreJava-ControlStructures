
public class IFElseIf {
	public static void main(String[] args) {
		int a,b,c;
		a=1000;
		b=20008;
		c=3000;
		
		if((a>b)&&(a>c))
			System.out.println("A is greater");
		else if(b>c)
			System.out.println("B is greater");
		else
			System.out.println("C is greater");
	}
}
