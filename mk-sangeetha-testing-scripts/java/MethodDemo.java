class MethodDemo{
	public static void main(String args[])
	{
	MethodDemo.method1();
	MethodDemo.method2();
	int a,b;
	//a=MethodDemo.Sum(2,3);
	//System.out.println(a);
	//b=MethodDemo.Sum(4,5);
	//System.out.println(b);
	a=Sum(Sum(2,3),Sum(4,5));
	b=Sum(2,3);
	System.out.println(a);
	System.out.println(b);
	}
	static void method1(){
	System.out.println("I love java");
	return;
	}
	static void method2(){
	System.out.println("Again I love java");
	}
	static int Sum(int i,int j){
	int res;
	res = i+j;
	return res;
	}
}
