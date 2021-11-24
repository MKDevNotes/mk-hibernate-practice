class student
{
private int s_id;
private String s_n=null;
private int spn;
private int  YOP;
private String address=null;
student(int s_id, String s_n)
{
this.s_id=s_id;
this.s_n=s_n;
}
int getstudentid()
{
return s_id;
}
String getstudenname(){
return s_n;
}
void setstudentphnum(int spn)
{
this.spn=spn;
}
int getstudentphnum(){
return spn;
}

public static void main(String [] args){
student s = new student(1,"A");
System.out.println(s.s_id);
System.out.println(s.s_n);
System.out.println(s.getstudentid());
s.setstudentphnum(111);
System.out.println(s.getstudentphnum());

}
}
