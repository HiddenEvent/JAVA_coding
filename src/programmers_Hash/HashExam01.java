package programmers_Hash;

import java.util.*;
//----------------------------------
//대분류 : [해시]  제목 : <완주하지 못한 선수>
//----------------------------------
public class HashExam01 {

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();
		for ( String player : participant){
			//참석자 배열을 각각 해시맵에 key로 넣고 value에 1을 셋팅하는 작업
			hm.put( player, hm.getOrDefault(player, 0) + 1 );
			
			
		}
		for (String player : completion){
			//완료자 배열을 각각 해시맵에서 찾아서 value를 -1연산하여 
			//0이면 완주, 1이면 미완주
			hm.put(player, hm.get(player) - 1);

		}
		
		for (String key : hm.keySet()){  
			if( hm.get(key) != 0 ){
				answer = key;
			}
		}
		
		return answer;
	}

//=========================================================================================================
	
	public static void main(String[] args) {
		//participant(참석자) : 마라톤에 참여한 참가자 이름을 담는 변수 
		String[] participant = {"leo","kiki","eden"};
		//completion(완료)  : 마라톤을 참가한 사람중 완주한 사람만 담는 변수
		String[] completion = {"eden","kiki"};

		String result = solution(participant,completion);

		System.out.println(result);
		
		
	}
}

/*   < 느낀점 >      
	length == 1부터 시작되므로 3개가 있는경우 3을 표현

*/



/*                다른사람이 문제 푼거!  -1

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


/*                다른사람이 문제 푼거!  -2

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

