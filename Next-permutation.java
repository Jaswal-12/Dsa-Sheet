class Solution {
    public void nextPermutation(int[] nums) {

        int pivot = -1;
        int n = nums.length;

        // step 1: find pivot
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                pivot = i;
                break;
            }
        }

        // step 2: agar pivot nahi mila → pura reverse
        if(pivot == -1){
            reverse(nums, 0, n - 1);
            return;
        }

        // step 3: just greater element dhundo
        for(int i = n - 1; i > pivot; i--){
            if(nums[i] > nums[pivot]){
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        // step 4: reverse right part
        reverse(nums, pivot + 1, n - 1);
    }

    public void reverse(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}class Solution {
    public void nextPermutation(int[] nums) {

        int pivot = -1;
        int n = nums.length;

        // step 1: find pivot
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                pivot = i;
                break;
            }
        }

        // step 2: agar pivot nahi mila → pura reverse
        if(pivot == -1){
            reverse(nums, 0, n - 1);
            return;
        }

        // step 3: just greater element dhundo
        for(int i = n - 1; i > pivot; i--){
            if(nums[i] > nums[pivot]){
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        // step 4: reverse right part
        reverse(nums, pivot + 1, n - 1);
    }

    public void reverse(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
