package p1;



public class QuickSort {

	public static void main(String[] args) {
		int[] a= {40,20,7,80,60,50,10,30,17,42};
		System.out.println("Zu sortierendes Array");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		sortiere(a,0,a.length-1);
		System.out.println("Sortiertes Aray:");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}

	}

	public static void sortiere(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            sortiere(arr, low, pivotIndex - 1);
            sortiere(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) { // changeable if u want from high to low (arr[j] >pivot)
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

	

