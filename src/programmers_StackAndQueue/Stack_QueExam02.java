package programmers_StackAndQueue;

//----------------------------------
//대분류 : [스택/큐]  제목 : <프린터>
//----------------------------------
public class Stack_QueExam02 {

	public static int solution(int[] priorities, int location) {
		int first = 0;
		
		for (int i = 0; i < priorities.length-1; i++) {
			if(priorities[i] < priorities[i+1]){
				first = priorities[i+1];
			} else {
				first = priorities[i];
			}
		}
		int answer = 0;
		return answer;
	}

	public static void main(String[] args) {
		int[] priorities ={1,1,9,1,1,1}; 
		int location = 0;
		int result = solution(priorities,location);
				
	}
}

/*   < 느낀점 >      
	공부를 많이해야겠구나 이런것도 못하는구나... 싶다...

*/



/*				<다른사람이 푼 문제>
					-1-
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] priorities, int location) {
    List<Integer> list = new ArrayList<>();
    for (int priority : priorities) {
      list.add(priority);
    }

    int turn = 1;
    while (!list.isEmpty()) {
      final Integer j = list.get(0);
      if (list.stream().anyMatch(v -> j < v)) {
        list.add(list.remove(0));
      } else {
        if (location == 0) {
          return turn;
        }
        list.remove(0);
        turn++;
      }

      if (location > 0) {
        location--;
      } else {
        location = list.size() - 1;
      }
    }

    throw new IllegalArgumentException();
  }
}

						--2--
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        File[] files = new File[priorities.length];
        Queue<File> queue = new LinkedList<>();
        ArrayList<File> printList = new ArrayList<>();

        for(int i=0; i<files.length; i++) {
            files[i] = new File(i, priorities[i]);
            queue.offer(files[i]);
        }
        while(!queue.isEmpty()) {
            File file = queue.poll();
            int size = queue.size();
            boolean canPrint = true;

            for(int j=0; j<size; j++) {
                File temp = queue.poll();
                if(file.priorities < temp.priorities) {canPrint = false;}
                queue.add(temp);
            }

            if(canPrint) {printList.add(file);}
            else {queue.offer(file);}
        }

        for(int j=0; j<printList.size(); j++) {
            if(printList.get(j).name == location) {
                answer = j+1;
            }
        }

        return answer;
    }

    class File {
        int name;
        int priorities;
        File(int name, int priorities){
            this.name = name; this.priorities = priorities;
        }
    }
}

 */
