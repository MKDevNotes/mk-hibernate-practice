class staticpriority
{
static String s="Qspiders";

static void m1(){
System.out.println("inside method");
}
static{
System.out.println(s);
staticpriority.m1();
}
public static void main(String args[])
{
//System.out.println(s);
//staticpriority.m1();
System.out.println("Main method");
}


}