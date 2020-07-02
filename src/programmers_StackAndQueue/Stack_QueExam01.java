package programmers_StackAndQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//----------------------------------
//대분류 : [스택/큐]  제목 : <기능개발>
//----------------------------------
public class Stack_QueExam01 {

	public static int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> q = new LinkedList<>();
		List<Integer> answerList = new ArrayList<>();
		for (int i = 0; i < speeds.length; i++) {
			double remain = (100 - progresses[i])/(double) speeds[i];
			int date = (int) Math.ceil(remain);
			if(!q.isEmpty() && q.peek() < date){
				answerList.add(q.size());
				q.clear();
				
			}
			q.offer(date);
		}
		
		answerList.add(q.size());
		
		int[] answer = new int[answerList.size()];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = answerList.get(i);
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		int[] progresses ={93,30,55}; 
		int[] speeds = {1,30,5};
		int[] result = solution(progresses,speeds);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}
}

/*   < 느낀점 >      
	공부를 많이해야겠구나 이런것도 못하는구나... 싶다...

*/

