class staticblinh3
{
static int i=10;
String S ="Q";
static void D1(){
System.out.println("I S M");
}
static void NS1(){
System.out.println("I NS M");
} 
static{
staticblinh3.NS1();
System.out.println("I S B");
}
{
System.out.println("I NS B");
}
}
class staticblinh2 extends staticblinh3
{
public static void main(String [] args)
{

System.out.println("I M B");

}
}