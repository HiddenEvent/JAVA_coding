package programmers_Sort;

//----------------------------------
//��з� : [����]  ���� : <K��°��>
//----------------------------------
public class Sort01 {

	 public static int[] solution(int[] array, int[][] commands) {
	        int[] answer = {};
	        return answer;
	   }

//=========================================================================================================
	
	public static void main(String[] args) {
		//array :  
		int[] array = {1,5,2,6,3,7,4};
		//commands : 
		int[][] commands = {{2,5,3,},{5,5,1},{1,7,3}};

		int[] result = solution(array,commands);

		System.out.println(result);
		
		
	}
}

/*   < ������ >      
	length == 1���� ���۵ǹǷ� 3���� �ִ°�� 3�� ǥ��

*/



/*                �ٸ������ ���� Ǭ��!  -1

import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}

*/


/*                �ٸ������ ���� Ǭ��!  -2

import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0;i<completion.length;i++)
        {
            if(!participant[i].equals(completion[i]))
            {
                answer = participant[i];
                break;
            }
        }
        if(answer.equals(""))
        {
            answer = participant[participant.length-1];   
        }
        //System.out.println(answer);
        return answer;
    }
}

*/

