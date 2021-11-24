class student{
student(int s_id,String S_N, int S_P_N){
this.s_id=s_id;
this.S_N=S_N;
this.s_p_n=s_p_n;
}
student(int s_id,int s_p_n)
{
this.s_id=s_id;
this.s_p_n=s_p_n;
}
public static void main(String [] args)
{
student s1= new student(1,"a",111);

student s2= new student(1,"b",222);

student s3= new student(3,333);
}
}