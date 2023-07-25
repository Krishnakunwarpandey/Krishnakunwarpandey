package Operator;

public class LogicalOpr {

	public static void main(String[] args) {
		int a=100, b=200, c=300;
		//&& (and) oprator
		boolean res1=a<b && b<c;   //true
		System.out.println(res1);  
		boolean res2 = a<b &&b>c;  //false
		System.out.println(res2);  
		boolean res3 =a>b && b<c;  // false
		System.out.println(res3);
		boolean res4 =a>b && b>c;  //false
		System.out.println(res4);
		// ||(or) operator
		boolean resu1 =a<b || b<c;  //true
		System.out.println(resu1); 
		boolean resu2=a>b || b<c;   //true
		System.out.println(resu2);
		boolean resu3=a<b || b>c;   //true
		System.out.println(resu3);
		boolean resu4 =a>b || b>c;  //false
		System.out.println(resu4);
		
		// ! (not) operator
		
		boolean resul = !(a<b);  
		System.out.println(resul);  //false
		boolean resul2 =!(a>b);
		System.out.println(resul2);  //true
		
		
		
	}
}
