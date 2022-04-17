package Unit_01;

/*
 * operator in java is a symbol that is used to perform operations.
 * 
 * sum=a+b;
 * eg - + , - , *, / etc.
 * 
 * Types -
   - Unary          : prefix and postfix  [a++, a--, ++a, --a, ~a, !a]
   - Arithmetic		: [+ - / * %]
   - Shift			: [<< >>]
   - Relational		: [< > <= >= == !=]
   
   - Bitwise		: [& ^ |]  bitwise AND, exclusive OR, inclusive OR
   - Logical		: [&& ||]  logical AND logical OR
   
   - ternary 		: [? :]
   - Assignment		: [= += -= /= *= %= &= ^= |= <<= >>= >>>=2]
     
 */

public class P3_Task02_OperatorsInJava {

	public static void main(String[] args) {
		
	OperatorsInJava obj = new OperatorsInJava();
	
	obj.UnaryOperator();
	obj.ArithmeticOperator();
	obj.ShiftOperator();
	obj.RelationalOperator();
	obj.BitwiseOperator();
	obj.TernaryOperator();
	obj.AssignmentOperator();

	}

}
class OperatorsInJava {
	
	void UnaryOperator() {
		int a = 10;
		boolean b = false;
		System.out.println("Inside UnaryOperator");
		System.out.println(a++); //10
		System.out.println(a--); //11
		System.out.println(++a); //11
		System.out.println(--a); //10
		
		/*
		 * BITWISE complement(~)
		 * this unary operator returns one complement representation of input value with all bits inverted, which means it makes every 0 to 1 and every 1 to 0
		 */
		System.out.println(~a); // 1010 invert all bits=> 0101 2's complement => 1010 + 1 =>1011
		//00000000000......1010
		
		//NOT operator ! : used to reverse the value of operand
		
		System.out.println(!b); // true
		System.out.println("n");
	}
	void ArithmeticOperator() {
		System.out.println("Inside ArithmeticOperator");
		
		int a = 10;
		int b = 5;
		System.out.println(a+b); //15
		System.out.println(a-b); //5
		System.out.println(a*b); //20
		System.out.println(a/b); //50
		System.out.println(a%b); //0
		
		//What is the output of this expression?
		System.out.println((10*10)/5+3-((1*4)/2));
		System.out.println("n");
	}
	
	void ShiftOperator() {
	System.out.println("Inside ShiftOperator");
	/*
	 
	 01010101<<1
	 
	 */
	
	System.out.println(10 << 2); // 10*2^2=10*4=40
	System.out.println(10 << 3); // 10*2^3=10*8=80
	System.out.println(20 << 2); // 20*2^2=20*4=80
	System.out.println(15 << 4); // 15*2^4=15*16=240
	
	System.out.println(10 >> 2); // 10/2^2=10/4=2
	System.out.println(20 >> 2); // 20/2^2=20/4=5 
	System.out.println(20 >> 3); // 20/2^3=20/8=2
	
	System.out.println("/n");
	}
	
	//result is true or false 
	void RelationalOperator() {
		
		System.out.println("Inside relational operator");
		int a=10,b=20;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println("\n");
	}
	
	void BitwiseOperator() {
		System.out.println("Inside bitwise and logical operator");
		int a=10,b=5,c=20;
		
		//logical && and bitwise &
		System.out.println(a<b && a++ < c);
		System.out.println(a);
		
		System.out.println(a<b & a++ < c);
		System.out.println(a);
		
		//logical || bitwise |
		System.out.println(a>b || a<c);
		System.out.println(a>b | a<c);
		
		System.out.println(a>b || a++ <c);
		System.out.println(a);	
		System.out.println(a>b | a++ <c);
		System.out.println(a);
		
		/*
		 * Exclusive | and Inclusive ^ OR
		 * Incase of or: 0|1=1 ,1|0=1 , 1|1=1,0|0=0
		 * */
		System.out.println("bitwise inclusive OR :"+(12|12));
		System.out.println("bitwise exclusive OR"+(12^12));
		
		System.out.println("\n");
	}
	
	
	void TernaryOperator() {
		System.out.println("inside ternary operator");
		
		int a=2,b=5;
		int min = (a<b)?a:b;
		System.out.println(min);
		System.out.println("\n");
		
	}
	
	void AssignmentOperator() {
		System.out.println("inside assignment operator");
		
		int a=10,b=20;
		a+=4; //a=a+4  (a=10+4)
		b-=4; //b=b-4  (b=20-4)
		System.out.println(a);
		System.out.println(b);
	
     }
	
}

