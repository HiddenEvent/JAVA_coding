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
    	//participant(������) : �����濡 ������ ������ �̸��� ��� ����

    	//	System.out.println(result);
    }
}

/*      �ٸ�������� Ǭ ���� - 1


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
    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}

		���� Ǭ ���� �Դϴ�!(ȿ���� ������...)
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
