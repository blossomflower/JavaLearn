package Unit_01;

public class P3_Task01_VariablesAndDataTypesInJava {

		static int q = 11;
		int p = 10;
		
		public static void main(String[] args) {
		
		//Variable Declaration 
	    int a,b,c;
	    float pi;
	    double d;
	    char e;
	   
	    //Valid Initializations 
	    pi = 3.14f;
	    d = 20.22d;
	    e = 'v';
	    
	    a = 10;
	    b = 10;
	    c = 10;
	    
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    
	    System.out.println(pi);
	    System.out.println(d);
	    System.out.println(e);
	    
	    int myNum = 5; //integer (whole number)
	    float myfloatNum  = 5.99f; //floating point number
	    char myLetter = 'D'; //character	
	    boolean myBool = true; //boolean
	    String myText = "hello"; //string 
	    
	    System.out.println(myNum);
	    System.out.println(myfloatNum);
	    System.out.println(myLetter);
	    System.out.println(myBool);
	    System.out.println(myText);
	    
	   //Java Variable Type Conversion And Type Casting
	    
	    
	    double f;
	    int i = 10;
	    f = i; //type conversion 
	    double g = 10;
	    int j;
	    j = (int) g; //type casting
	    
	    System.out.println(f);
	    System.out.println(i);
	    System.out.println(g);
	    System.out.println(j);
	    
	    byte k = 10; //1 byte
	    boolean l = true; // 1bit = true or false only 
	    long m = 10L;
	    float n = 1.2f;
	    double o = 1.2d;
	    
	    System.out.println(k);
	    System.out.println(l);
	    System.out.println(m);
	    System.out.println(n);
	    System.out.println(o);
	    System.out.println(ABC.j); //data + function
	    //ABC.display();
	    
	    ABC obj1 = new ABC();
	    
	    System.out.println(obj1.i++);
	    System.out.println(obj1.i);
	    
	    ABC obj2 = new ABC();
	    System.out.println(obj2.i);
	    
	    System.out.println(ABC.j++);
	    System.out.println(ABC.j);
	    
	   // System.out.println(ABC.j++);
	   // System.out.println(ABC.j);
	    
	    ABC.typeConversionandTypecasting();

	}

}

class ABC{
	static int j=10;//class /static variable
	int i=10;//instance variable
	static void display()
	{
		int a=5;//local variable
		System.out.println("This is display method!!");
	    System.out.println(a);
	    
	}
	static void typeConversionandTypecasting() {
		/*
		 * double f; //8 bytes =64 bits/slots int i=10; //4bytes=32 bits/slots f=i;//type conversion System.out.println(f);
		 * 
		 * double g=10;//64 int j;//32 j=(int)g;
		 */
		
		double f;//64 slots
		int i=10;//32 slots
		f=i;//type conversion
		System.out.println(f);
		
		double g=10;//64
		int j;//32
		j=(int)g;//type casting
		
		//32 bits=64bits
		System.out.println(i);
		System.out.println(j);
		
		
		
}
	
}
