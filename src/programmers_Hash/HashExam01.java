package programmers_Hash;

import java.util.*;
//----------------------------------
//��з� : [�ؽ�]  ���� : <�������� ���� ����>
//----------------------------------
public class HashExam01 {

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();
		for ( String player : participant){
			//������ �迭�� ���� �ؽøʿ� key�� �ְ� value�� 1�� �����ϴ� �۾�
			hm.put( player, hm.getOrDefault(player, 0) + 1 );
			
			
		}
		for (String player : completion){
			//�Ϸ��� �迭�� ���� �ؽøʿ��� ã�Ƽ� value�� -1�����Ͽ� 
			//0�̸� ����, 1�̸� �̿���
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
		//participant(������) : �����濡 ������ ������ �̸��� ��� ���� 
		String[] participant = {"leo","kiki","eden"};
		//completion(�Ϸ�)  : �������� ������ ����� ������ ����� ��� ����
		String[] completion = {"eden","kiki"};

		String result = solution(participant,completion);

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

