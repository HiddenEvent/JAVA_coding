package programmers_Exam;

public class printerExam {

	static int solution(int[] priorities, int location){
    	int answer = 0;
    	int maxNum = priorities[0];
    	int maxIndex = 0;
    	int top = 0;
    	
    	//1. 가장 중요도가 큰 수 찾기
    	for (int i = 0; i < priorities.length; i++) {
    		for (int j = 0; j < priorities.length-1; j++) {
    			if(maxNum < priorities[j+1]) {// 가장큰수를 max변수에 넣는 작업
    				maxNum = priorities[j+1];
    				maxIndex = j+1;
				}
			};
			for (int j = 0; j < priorities.length; j++) {
    			if(maxNum == priorities[j] && j >= top) {
    				maxNum = priorities[j];
    				maxIndex = j;
    				break;
				}
			};
			top = maxIndex;
    		priorities[maxIndex] = -i-1;
    		maxNum = priorities[0];
    		maxIndex = 0;
		}
    	answer = -(priorities[location]);
        return answer;
    }
    public static void  main(String[] args){
		int[] participant = {1, 1, 9, 1, 1, 1};
		int location = 0;
		int result = solution(participant,location);
		System.out.println(result);
    }

}
