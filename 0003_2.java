
import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> checkerHM = new HashMap<>();

        int startPlace = 0;
        int lengthCounter = 0;
        int temp_lengthCounter = 0;

        for(int i = 0; i < s.length(); i++){

            if(checkerHM.containsKey(s.charAt(i))){

                if(checkerHM.get(s.charAt(i)) + 1  > startPlace)
                    startPlace = checkerHM.get(s.charAt(i)) + 1;

                temp_lengthCounter = i - startPlace +1;

                if(temp_lengthCounter > lengthCounter) {
                    lengthCounter = temp_lengthCounter;
                }



                checkerHM.put(s.charAt(i), i);

                continue;
            }


            checkerHM.put(s.charAt(i), i);
            temp_lengthCounter = i - startPlace + 1;

            if(temp_lengthCounter > lengthCounter) {
                lengthCounter = temp_lengthCounter;
            }


        }


        return lengthCounter;

    }
}
