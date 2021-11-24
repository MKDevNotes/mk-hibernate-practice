class staticpriority1
{
static String s ="Qspiders";
static void m1(){
System.out.println("Inside m1");
}
static{
System.out.println(staticpriority1.s);
staticpriority1.m1();
staticpriority1.s="Jsider";
}
public static void main(String args[])
{
System.out.println("Main method");
}
}
