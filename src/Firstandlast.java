public class Firstandlast {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};

        result[0] = findIndex(nums , target, true);
        result[1] = findIndex(nums, target, false);

        return result;
    }
    int findIndex(int[] nums, int target, boolean findIndex) {
        int result = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(target < nums[mid]) {
                end = mid - 1;

            } else if(target > nums[mid]) {
                start = mid + 1;

            }else {
                result = mid;
                if(findIndex == true) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
        }
        return result;

    }
}

