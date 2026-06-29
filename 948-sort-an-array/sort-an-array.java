class Solution {

    public int[] sortArray(int[] nums) {
        return mergesort(nums);
    }

    public int[] mergesort(int[] arr) {

        if(arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));

        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public int[] merge(int[] left, int[] right) {

        int i = 0, j = 0, k = 0;

        int[] joined = new int[left.length + right.length];

        while(i < left.length && j < right.length) {

            if(left[i] < right[j]) {
                joined[k++] = left[i++];
            } else {
                joined[k++] = right[j++];
            }
        }

        while(i < left.length) {
            joined[k++] = left[i++];
        }

        while(j < right.length) {
            joined[k++] = right[j++];
        }

        return joined;
    }
}