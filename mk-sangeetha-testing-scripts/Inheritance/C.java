class A1{
static int i=10;
private int j=20;
}
class B1 extends A1{
static int k=30;
int l = 40;
}
class C extends B{
public static void main(String [] args)
{
C c1 = new C();
System.out.println(c1.j);
System.out.println(c1.l);
System.out.println(C.i);
System.out.println(C.k);
}
}
