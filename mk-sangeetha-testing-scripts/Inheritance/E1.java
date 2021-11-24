Class E
{
E(int10){
System.out.println("Ii C");
}
E(){
System.out.println("No arg");
}
}

Class E1 extends E{
E1(){
super(10);
System.out.println("Ii E);
}
public static void main(String [] args)
{
 E1 c = new E1();

}
}