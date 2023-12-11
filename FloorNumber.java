
public class FloorNumber {

	public static void main(String[] args) {
		int[] arr = {11,34,56,78,900,100};
		int target = 10;
		System.out.println("Floor of a Number "+floorCheck(arr,target));
	}
	static int floorCheck(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			
			int mid = start + (end-start)/2;
			
			if(target ==  arr[mid]) {
				return mid;
			}
			if(target<arr[mid]) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return end;
	}
}
