class h
{
h(){
System.out.println("IA CC");
}
}

class h1 extends h{
h1()
{
super();0
System.out.println("I B CC");
}
}

class h2 extends h1{
h2()
{
super();
}
public static void main(String [] args){
h2 f = new h2();
}
}
