
public class SwitchExample {

	public static void main(String[] args) {

	 int a,b,c,ch;
	a=10;
	b=20;
	ch=9;

		switch(ch)
		{
		 
		case 1: 
		c=a+b;
		System.out.println("Sum="+c);
		break;
		
		case (4-2): 
			c=a-b;
		System.out.println("Sub="+c);
		break;		
		
		case 3:
			c=a*b;
		System.out.println("Mul="+c);
		break;
		
		case 4: 
			c=a/b;
		System.out.println("Div="+c);
		break;
		
		default:
		System.out.println("End");
		}
 
				System.out.println("End Of Switch");
	}

}
