class Demo1methods{
	public static void main(String args[]){
	int a = Demo1methods.m1();
	System.out.println(a);
	char b =Demo1methods.m2();
	System.out.println(b);
	//String c = Demo1methods.m3();
	//System.out.println(c);
	int d=Demo1methods.m4(2,3);
	System.out.println(d);
	int m = Demo1methods.m6();
	System.out.println(m);
	int n = Demo1methods.m5();
	System.out.prinln(n);
}
static int m1(){
return 5;
}
static char m2(){
return's';
}
static int m4(int i,int j){
int k;
k=i+j;
return k;
}
static int m6(){
return "Qspiders";
}
static void m5(){
return 10;
}
}
