class staticblock1
{
static
{
System.out.println("static block next to main method 1");
}

public static void main(String args[])
{
System.out.println("inside main method");
}
static
{
System.out.println("static block next to main method 2");
}

}