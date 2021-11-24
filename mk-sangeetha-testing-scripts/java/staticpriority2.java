class staticpriority2
{
static int i =10;
static{
System.out.println("ISb1");
staticpriority2.m1();
System.out.println(i);
staticpriority2.i=300;
}
	static{
	System.out.println("ISB2");
	System.out.println(i);
}


static void m1(){
System.out.println(i);
staticpriority2.i=20;
}
public static void main(String args[])
{
}

}


























