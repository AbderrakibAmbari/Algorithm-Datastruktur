package p1;

public class SelectionSort {
	public static void selectionSort(int[]a) {
		for (int i=0;i<a.length-1;i++) {
			int minElementIndex=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[minElementIndex]) { // swap to ist größer als
					minElementIndex=j;
				}
			}
			swap (a,i,minElementIndex);
		}
	}

	private static void swap(int[] a, int i, int minElementIndex) {
		int temp=a[minElementIndex];
		a[minElementIndex]=a[i];
		a[i]=temp;
		
	}
	public static void main (String args[]) {
		int[] a= {40,20,7,80,60,50,10,30,17,42};
		System.out.println("Zu sortierendes Array");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		selectionSort(a);
		System.out.println("Sortiertes Aray:");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
	}
}
