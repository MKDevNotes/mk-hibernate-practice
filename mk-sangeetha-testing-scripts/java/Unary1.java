public class Unary1{
	public static void main(String args[]){
		int i=0;
		int j=0;
		int k;

		k= ++i + j++ + i++ + ++i;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
