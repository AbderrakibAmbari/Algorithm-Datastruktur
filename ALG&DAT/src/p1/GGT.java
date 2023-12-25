package p1;

public class GGT {
	public static void main (String args[]) {
		int a =100;
		int b=250;
		int ggt =Ggt(a,b);
		System.out.println("Das GGT ist : " +ggt );
	}
	public static int Ggt(int a, int b) {
		int temp=0;
		while(b!=0) {
			temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}

}
