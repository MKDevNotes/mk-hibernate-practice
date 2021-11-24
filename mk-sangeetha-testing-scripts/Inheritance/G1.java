class G{
G(int a){
System.out.println("int arg");
}

G(){
System.out.println("No arg");
}
}
class G1 extends G{

G1()
{
super(10);
System.out.println("I Class G1");
}

public static void main(String args[])
{
G1 f2 = new G1();
}
}
// case 2