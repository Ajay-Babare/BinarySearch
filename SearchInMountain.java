// https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountain {

	public static void main(String[] args) {
		int[] arr = {1,3,6,8,10,6,4,2,1};
		int target = 1;
		System.out.println("Index is :: "+search(arr,target));

	}
	
	static int search (int[] arr, int target) {
		int peak = peakIndexInMountainArray(arr);
		int firstTry = orderAgnosticBS(arr, target, 0, peak);
		if(firstTry != -1) {
			return firstTry;
		}
		
		return orderAgnosticBS(arr, target, peak+1, arr.length-1);
	}

	static int peakIndexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			int mid = start+(end-start)/2;
			if(arr[mid]>arr[mid+1]) {
				end=mid;
			}
			else {
				start=mid+1;
			}
		}
		return start;
	}
	static int orderAgnosticBS(int[] arr, int target, int start, int end) {
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(arr[mid] == target) {
				return mid;
			}
			if(arr[start]<arr[end]) {
				if(target<arr[mid]) {
					end= mid - 1;
				}
				else {
					start= mid+1;
				}
			}
			else {
				if(target>arr[mid]) {
					end= mid - 1;
				}
				else {
					start= mid+1;
				}	
			}

		}
			return -1;
	}
}
