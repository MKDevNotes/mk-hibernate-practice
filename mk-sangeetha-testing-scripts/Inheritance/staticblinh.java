class staticblinh1
{
static int i=10;
String S ="Q";
static void D1(){
System.out.println("I S M");
}
void NS1(){
System.out.println("I NS M");
} 
static{
System.out.println("I S B");
}
{
System.out.println("I NS B");
}
}
class staticblinh extends staticblinh1
{
public static void main(String [] args)
{

System.out.println("I M B");

}
}