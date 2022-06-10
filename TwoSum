import java.util.HashMap;
import java.util.Arrays;

public class TwoSum_3 {
    public int[] twoSum(int[] nums, int target) {
        int index_1 = 0;
        int index_2 = 0;
        int counter = 0;

        if(target % 2 == 0){
            for(int i = 0; i< nums.length; i++){
                if(nums[i] == target/2){
                    if(counter == 0) {
                        index_1 = i;
                        counter++;
                    }else if(counter == 1){
                        index_2 = i;
                        int [] answer = new int[] {index_1, index_2};
                        return answer;
                    }
                }
            }
        }

        HashMap<Integer, Integer> TminusX_Index = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            TminusX_Index.put(target-nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            if(TminusX_Index.get(nums[i]) != null && TminusX_Index.get(nums[i]) != i){
                int [] answer = new int[] {i, TminusX_Index.get(nums[i])};
                return answer;
            }
        }


        int[] answer = {0, 0};
        return answer;
    }
}
