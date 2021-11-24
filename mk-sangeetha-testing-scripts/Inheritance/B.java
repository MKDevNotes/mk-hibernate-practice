class A
{
static int i=10;
int j = 20;
}
class B extends A{
static int k=30;
int l=40;
public static void main(String args[])
{
B b1=new B();
System.out.println(b1.j);

System.out.println(B.i);

System.out.println(b1.l);

System.out.println(B.k);
}
}
