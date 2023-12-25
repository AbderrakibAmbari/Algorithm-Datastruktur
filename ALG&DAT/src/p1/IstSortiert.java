package p1;

public class IstSortiert {

	public static void main(String[] args) {
		int[] a= {40,20,7,80,60,50,10,30,17,42};
		System.out.println("ist a sortiert :" + istSortiert(a) );
		
		

	}
	public static boolean istSortiert(int a[]) {
		for(int i=0;i<=a.length-2;i++) {
			if(a[i]>a[i+1]) {
				return false;
			}
		}
		
		
		return true;
		
	}

}
