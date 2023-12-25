package p1;

public class MergeSort {
	
	/*private static int comparisons =0;
	private static int switches =0;
	public static void main (String args[]) {
		int[] a= {40,20,7,80,60,50,10,30,17,42};
		System.out.println("Zu sortierendes Array");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		
		merge(a);
		System.out.println("Sortiertes Aray:");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("switch count : " + switches);
		System.out.println("comparisons : "+ comparisons);
	}
	public static void merge(int []a) {
	int [] helpa =new int[a.length];
	doMergeSort(a,0,a.length-1,helpa);
	}

	private static void doMergeSort(int[] a, int i, int j, int[] helpa) {
		if(j-i>0) {
			int middle=(i+j)/2;
			doMergeSort(a,i,middle,helpa);
			doMergeSort(a,middle+1,j,helpa);
			mergeParts(a,i,middle,j,helpa);
		}
		
	}

	private static void mergeParts(int[] a, int i, int middle, int j, int[] helpA) {
	    for (int k = i; k <= j; k++) {
	        helpA[k] = a[k];  // Copy elements from the original array 'a' to the helper array 'helpA'
	    }
	    int left = i;
	    int right = middle + 1;
	    int k = i;

	    while (left <= middle && right <= j) {
	    	comparisons++;// comparison counts
	        if (helpA[left] <= helpA[right]) {//change here if u want to get the other Reihenfolge
	            a[k] = helpA[left];  // Merge the elements back into the original array 'a'
	            left++;
	        } else {
	            a[k] = helpA[right];  // Merge the elements back into the original array 'a'
	            right++;
	        }
	        k++;
	        switches++;// switch count
	    }

	    while (left <= middle) {
	        a[k] = helpA[left];  // Copy the remaining elements from the left subarray in 'helpA' to 'a'
	        k++;
	        left++;
	        switches++;// switch count
	    }
	    while (right <= j) {
	        a[k] = helpA[right];  // Copy the remaining elements from the right subarray in 'helpA' to 'a'
	        k++;
	        right++;
	        switches++;// switch count
	    }
	}
*/
	
	public static void main (String args[]) {
		int[] a= {40,20,7,80,60,50,10,30,17,42};
		System.out.println("Zu sortierendes Array");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		
		merge(a);
		System.out.println("Sortiertes Aray:");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}}
		/*
		public static void merge(int a[]) {
			int helpa[]=new int [a.length];
			domergesort(a,0,a.length-1,helpa);
		}

	private static void domergesort(int[] a, int left, int right, int[] helpa) {
		if(right >left) {
			int middle = (right+left)/2;
			domergesort(a,left,middle,helpa);
			domergesort(a,middle+1,right,helpa);
			mergepart(a,left,middle,right,helpa);
			
		}
		}

	private static void mergepart(int[] a, int left, int middle, int right, int[] helpa) {
		for (int i=left;i<=right;i++) {
			helpa[i]=a[i];
		}
		int l=left;
		int r=middle+1;
		int o =left;
		
		while(l<=middle&&r<=right) {
			if(helpa[l]<=helpa[r]) {
				a[o]=helpa[l];
				l++;
			}else {
				a[o]=helpa[r];
				r++;
			}
			o++;
		}
		while(l<=middle) {
			a[o]=helpa[l];
			o++;
			l++;
		}
		while(r<=right) {
			a[o]=helpa[r];
			o++;
			r++;
		}
		
	}
	}*/
	/* public static void merge(int a[] ) {
		 int helpa[]=new int [a.length];
		 mergesort(a,0,a.length-1,helpa);
	 }
		private static void mergesort(int[] a, int left, int right, int[] helpa) {
			if(right>left) {
				int middle =(right+left)/2;
				mergesort(a,left,middle,helpa);
				mergesort(a,middle+1,right,helpa);
				mergepart(a,left,middle,right,helpa);
			}
			
		}
		private static void mergepart(int[] a, int left, int middle, int right, int[] helpa) {
			for(int i =left;i<=right;i++) {
				helpa[i]=a[i];
			}
			int l=left;
			int r=middle+1;
			int o=left;
			while(l<=middle&&r<=right) {
				if(helpa[l]<helpa[r]) {
					a[o]=helpa[l];
					l++;
				}else {
					a[o]=helpa[r];
					r++;
				}
				o++;
			}
			while(l<=middle) {
				a[o]=helpa[l];
				o++;
				l++;
			}
			while(r<=right) {
				a[o]=helpa[r];
				r++;
				o++;
			}
			
		}
		*/
	/*
		public static void merge(int a[] ) {
			int helpa[]=new int[a.length];
			mergesort(a,0,a.length-1,helpa);
		}
		private static void mergesort(int[] a, int left, int right, int[] helpa) {
			if (right>left){
				int middle =(right+left)/2;
				mergesort(a,left,middle,helpa);
				mergesort(a,middle+1,right,helpa);
				mergeparts(a,left,middle,right,helpa);
				
			}
		}
		private static void mergeparts(int[] a, int left, int middle, int right, int[] helpa) {
			for (int i=left;i<=right;i++) {
				helpa[i]=a[i];
			}
			
			int l=left;
			int r=middle+1;
			int o=l;
			
			while(l<=middle&& r<=right) {
				if(helpa[l]>helpa[r]) {
					a[o]=helpa[l];
					l++;
				}else {
					a[o]=helpa[r];
					r++;
				}
				o++;
			}
			while(l<=middle) {
				a[o]=helpa[l];
				o++;
				l++;
			}
			while(r<=right) {
				a[o]=helpa[r];
				o++;
				r++;
			}
			
		}
		*/
	 public static void merge(int a[] ) {
		 int helpa[]=new int[a.length];
		 mergesort(a,0,a.length-1,helpa);
	 }
		private static void mergesort(int[] a, int left, int right, int[] helpa) {
			if(right>left) {
				int middle=(left+right)/2;
				mergesort(a,left,middle,helpa);
				mergesort(a,middle+1,right,helpa);
				sortparts(a,left,middle,right,helpa);
			}
			
		}
		private static void sortparts(int[] a, int left, int middle, int right, int[] helpa) {
			for (int i=left;i<=right;i++) {
				helpa[i]=a[i];
			}
			int l=left;
			int r=middle+1;
			int o=left;
			while(l<=middle&&r<=right) {
				if(helpa[l]>helpa[r]) {
					a[o]=helpa[l];
					l++;
				}else {
					a[o]=helpa[r];
					r++;
				}
				o++;
			}
			/*while(l<=middle) {
				a[o]=helpa[l];
				l++;
				o++;
			}
			while(r<=right) {
				a[o]=helpa[r];
				r++;
				o++;
			}*/
			while(l<=middle&&r<=right)
				if(helpa[l]<helpa[r]) {
					a[o]=helpa[l];
					l++;
				}else {
					a[o]=helpa[r];
					r++;
				
				}
			while(l<=middle) {
				a[o]=helpa[l];
				o++;
				l++;
			}
			while(r<=right){
				a[o]=helpa[r];
				o++;
				r++;
				
			}
		}
		
}
	

