class A2
{
A2(int a)
{
System.out.println("IN A");
}
}
class B2 extends A2{
public static void main(String [] args)
{
B2 b1 = new B2();
super(10);
}
}