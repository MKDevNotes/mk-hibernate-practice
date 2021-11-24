class A2{
public static void main(String args[]){
A2.m1();
A2 a1 = new A2();
a1.m2();

}
void m2(){
System.out.println("Non static method");
}
static void m1(){
System.out.println("Static method");

}}