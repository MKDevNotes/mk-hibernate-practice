class D 
{
D(int a){
System.out.println("IN A C");
}
D()
{
System.out.println("No arg");
}

}
class D1 extends D
{
D1(){
//super(10);
super(10);
System.out.println("IN D C");

}
public static void main(String [] args)
{
D1 d3=new D1();
}
}
