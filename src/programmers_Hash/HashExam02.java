package programmers_Hash;

import java.util.*;
//----------------------------------
//��з� : [�ؽ�]  ���� : <��ȭ��ȣ ���>
//----------------------------------
public class HashExam02 {

	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		for (int i = 0; i < phone_book.length-1; i++) {
			for (int j = i+1; j < phone_book.length; j++) {
				if(phone_book[i].startsWith(phone_book[j])){return false;}
				if(phone_book[j].startsWith(phone_book[i])){return false;}
			}
		}
		
		return answer;
	}

//=========================================================================================================
	
	public static void main(String[] args) {
		//phone_book(��ȣ3��) : ��ȣ�� ��� ���� 
		String[] phone_book = {"119","97674223","1195524421"};


		boolean result = solution(phone_book);

		System.out.println(result);
		
	}
}

/*   < ������ >      
	�������� ������ ������...

*/



/*                �ٸ������ ���� Ǭ��!  -1

class Solution {
    public boolean solution(String[] phoneBook) {
       for(int i=0; i<phoneBook.length-1; i++) {
            for(int j=i+1; j<phoneBook.length; j++) {
                if(phoneBook[i].startsWith(phoneBook[j])) {return false;}
                if(phoneBook[j].startsWith(phoneBook[i])) {return false;}
            }
        }
        return true;
    }
}
*/


/*                �ٸ������ ���� Ǭ��!  -2

class Solution {
    public boolean solution(String[] phoneBook) {
        boolean answer = true;
        int length;
        for(String s : phoneBook) {
            length = s.length();
            for(String r : phoneBook) 
                if(r.length()>length&&r.substring(0, length).equals(s)) return false;
        }
        return answer;
    }
}


*/

