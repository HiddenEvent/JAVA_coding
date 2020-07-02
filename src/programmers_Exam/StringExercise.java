package programmers_Exam;

class StringExercise{
    String getMiddle(String word){
    	String result = "";

    	if(word.length()%2==1){
    		result = ""+word.charAt(word.length()/2);
    	}else{
    		result = ""+word.charAt(word.length()/2-1)+word.charAt(word.length()/2);
    		
    	}
    	
        return result;
    }
    public static void  main(String[] args){
    	//participant(참석자) : 마라톤에 참여한 참가자 이름을 담는 변수

    	//	System.out.println(result);
    }
}

/*      다른사람들이 푼 문제 - 1


class StringExercise{
    String getMiddle(String word){
    int a = word.length();
    String word1;
    if ( a % 2 == 0 )
            word1 = word.substring(a/2 - 1, (a/2) + 1);
    else
            word1 = word.substring((a/2), (a/2) + 1);
    return word1;
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}

		내가 푼 문제 입니다!(효율이 안좋음...)
class StringExercise{
    String getMiddle(String word){
    	String result = "";

    	if(word.length()%2==1){
    		result = ""+word.charAt(word.length()/2);
    	}else{
    		result = ""+word.charAt(word.length()/2-1)+word.charAt(word.length()/2);
    		
    	}
    	
        return result;
    }
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("powower"));
    }
}

 */
