class Solution {
    public int search(int[] arr, int target) {
        int pivot=pivotIndex(arr);

        if(pivot==-1) {
            return binarySearch(arr, target, 0, arr.length-1);
        }
        if(arr[pivot]==target) {
            return pivot;
        }
        if(target>= arr[0]) { 
            return binarySearch(arr, target, 0, pivot-1);
        }
        return binarySearch(arr, target, pivot+1, arr.length-1);
       
    }

     int pivotIndex(int[] arr) {
        int start=0;
        int end=arr.length-1;
        //only if are used
        while(start<=end) {
            int mid=start+(end-start)/2;
            if( mid<end && arr[mid]>arr[mid+1]) {
                return mid;
            }
            if( mid>start && arr[mid-1] > arr[mid] ) {
                return mid-1;
            }
            if(arr[start]>arr[mid]) {
                end=mid-1;
            }
            else {   
                start=mid+1;
            }
        }
        return -1;
    }


    int binarySearch(int [] arr, int target, int start, int end) {
        
        while(start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target) {
                return mid;
            }
            else if(target<arr[mid]) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }

}