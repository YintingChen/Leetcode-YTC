import java.util.ArrayList;

public class Solution_1 {
    public int lengthOfLongestSubstring(String s) {

        ArrayList<Character> checkerAL = new ArrayList<>();

        int lengthCounter = 0;

        for(int i = 0; i < s.length(); i++){

            int temp_lengthCounter = 0;

            for(int i3 = i; i3<s.length(); i3++){
                if(checkerAL.contains(s.charAt(i3)))
                    break;
                checkerAL.add(s.charAt(i3));
                temp_lengthCounter++;
            }

            if(temp_lengthCounter > lengthCounter)
                lengthCounter = temp_lengthCounter;

            checkerAL.clear();

        }

        return lengthCounter;

    }
}
