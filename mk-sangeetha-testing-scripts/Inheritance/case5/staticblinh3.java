class staticblinh2
{
static int i=10;
String S ="Q";
void NS2()
{
System.out.println("I NSM");
}

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
class staticblinh3 extends staticblinh2
{
static
{

System.out.println("I S B B");

}

public static void main(String [] args)
{

System.out.println("I M B");
staticblinh3 a1 = new staticblinh3();
}
}