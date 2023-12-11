
public class CeilingNumber {

	public static void main(String[] args) {
		int[] arr = {1,4,6,8,121,133,155};
		int target = 156;
		System.out.println("Index of Ceiling Number is "+ceilingCheck(arr,target));
	}
	static int ceilingCheck(int[] arr,int target) {
		int start = 0;
		int end = arr.length-1;
		
		if(target>arr[end]) {
			return -1;
		}
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(target==arr[mid]) {
				return mid;
			}
			if(target<arr[mid]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return start;
	}

}
