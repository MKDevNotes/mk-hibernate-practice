public class Unary2{
	public static void main(String args[]){
		int i=0;
		int j=0;
		int k;
		float w =0.0f;
		w++;

		k= i++ + j++ + ++i + ++j + i-- + --j;

		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(w);
	}
}
