public class BinarySearch1 {

	public static void main(String[] args) {
		int[] arr = {-16,-5,-1,4,6,8,23,65,75};
//		int[] arr = {100,89,75,56,41,33,11,-2,-5};
		int target = 8;
		System.out.println(orderIgnosticBinarySearch(arr,target));
	}
	static int orderIgnosticBinarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;

		boolean isAsc = arr[start]<arr[end];

			while(start<= end) {
				
				int mid= start+(end-start)/2;
				
				if(arr[mid] == target) {
					return mid;
				}
				if (isAsc) {
					if(target<arr[mid]) {
						end=mid-1;
					}
					else {
						start=mid+1;
					}
				}else {
					if(target>arr[mid]) {
						end=mid-1;
					}
					else {
						start=mid+1;
					}					
				}	
			}
		return -1;	
	}
}
