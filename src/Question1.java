import java.util.Arrays;

public class Question1 {
        public int numIdenticalPairs(int[] nums) {

            int count = 0;
            Arrays.sort(nums);
            int i = 0;
            int j = i+1;
            while (i < nums.length - 1) {


                if (nums[i] == nums[j] && j != nums.length-1) {
                    j++;
                    count++;
                }

                else if (nums[i] == nums[j] && j == nums.length-1){
                    count++;
                    i++;
                    j = i+1;
                } else {
                    i++;
                    j = i+1;
                }
            }
            return count;

        }
    }
