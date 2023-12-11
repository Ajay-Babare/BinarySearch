// https://leetcode.com/problems/find-peak-element/
public class FindPeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start +(end-start)/2;
            if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
}
