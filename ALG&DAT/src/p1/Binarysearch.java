package p1;

public class Binarysearch {
	/*public static int binarySearch(int [] arr, int target) {
		int left =0;
		int right =arr.length - 1;
		while(left<=right) {
			int mid =left +(right-left)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if (arr[mid]<target) {
				left=mid +1;
				
			}else {
				right =mid-1;
			}
		}
		
		return -1;
	}
	*/
	
	public static int binarySearch(int arr[],int target) {
		int bot=0;
		int top=arr.length-1;
		while(top>=bot) {
			int mid=bot+(top+bot)/2;
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]<target) {
				bot=mid+1;
			}else {
				top=mid-1;
			}
		}
		
		return -1;
	}
	public static void main (String args[] ) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int target =1;
		int result = binarySearch(arr,target);
		
		if (result ==-1) {
			System.out.println("Element not Found");
			 
		}else {
			System.out.println("your element is : "+ target);
		}
		
	}

}
