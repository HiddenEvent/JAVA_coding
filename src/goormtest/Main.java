package goormtest;

class Main {
	
	public static void main(String[] args) {
		char[] abcCode =
			{ '`','~','!','@','#','>','%','^','&','*',
				'(',')','-','_','+','=','|','[',']','{',
				'}',';',':',',','.','/'
			};
											// 0   1   2   3   4   5   6   7   8   9
			char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
			
			String src = "cwit2017";
			String result = "";
			int index = 0;

			// ���ڿ� src�� ���ڸ� charAt()���� �ϳ��� �о ��ȯ �� result�� ����
			for(int i=0; i < src.length();i++) {
					char ch = src.charAt(i);
					if (ch>47 && ch<58){
						index = (int)ch - 48;
						result = result+numCode[index];
					} else {
						index = (int)ch - 97;
						result = result+abcCode[index];
					}
			}
			System.out.println("result: "+result);
		} // end of main
} // end of class