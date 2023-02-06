package codingTest;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

    }


    
    
    
    // ���� �迭 array�� n �� � ������� ī����
    
    public int solution(int[] array, int n) {
    	int answer = 0;
    	for(int i = 0;i<array.length;i++) {
    		if(array[i] == n) {
    			answer++;
    		}
    	}
    	
    	return answer;

    }
    
    // �粿ġ ���Կ��� 1�κ��� 12,000��, ������� 2,000 ��
    // 10�κи��� ����� 1���� ����
    // n �κ��� �Ծ��� ������� k ���� ���̴ٸ� �����ؾ� �ϴ� �ݾ���?
    
    public int solution2(int n, int k) {
    	int answer = 0;
    	int drink = 0; // �����ؾߵǴ� ������� ����
    	drink = k - n/10;
    	answer = 12000*n + 2000*drink;
    	return answer;
    }
    
    
    // ���� ���Կ��� slice ��ŭ ������ �߶���
    // n���� �������� �ּ��� �� ���� �ֹ��ؾ� �ϴ°�?
    
    public int solution3(int slice, int n) {
    	int answer = 0;
    	if (n%slice != 0) {
    		answer = n/slice + 1;
    	} else {
    		answer = n/slice;
    	}
    	
    	return answer;
    }
    
    
    // ������ ����ִ� �迭 num_list
    // �ش� �迭�� ���� ������ �Ųٷ� �ؼ� return
    
    public int[] solution4(int[] num_list) {
    	int[] answer = {};

    	for(int i = num_list.length;i<0;i--) {
    		answer[i] = num_list[i];
    	}
    	return answer;
    }
    
    
    // ���� �����Ա� (2)
    
    public int solution5(int n) {
    	int answer = 1; // 0���� �����ϸ� �� ó�� ������ ���������� ���� ������ ����.
    	while ((6*answer%n != 0)) {
    		answer++;
    	}
    	return answer;
    }
    
    
    // �ʰ��� ���ιޱ�
    // 10���� �̻��� 5%, 30���� �̻��� 10%, 50���� �̻��� 20% ���� (������ �ִ� 100����)
    // ���� ���� price. �����ؾ��ϴ� �ݾ��� return
    
    public int solution6(int price) {
    	int answer = 0; // �����ؾ��ϴ� �ݾ�
    	if (price >= 500000) {
    		answer = (int)(price*0.8);
    	} else if (price >= 300000) {
    		answer = (int)(price*0.9);
    	} else if (price >= 100000) {
    		answer = (int)(price*0.95);
    	} else {
    		answer = price;
    	}
    	return answer;
    }
    
    
    // ���̽� �Ƹ޸�ī��
    // �ƾ��� ������ 5500. �Ӿ��̰� ���� ���� money
    // �Ӿ��̰� �ִ�� ���� �� �ִ� �Ƹ޸�ī���� �� ���� ���� ���� ������� ���� �迭 return
    
   public int[] solution7(int money) {
	   int[] answer = new int[2]; // ���� 2�� �� �迭�� ������ ��.
	   answer[0] = money/5500;
	   answer[1] = money%5500;
	   return answer;
   }
   
   
   // ���ڿ� ������
   // ���ڿ� my_string�� �Ųٷ� ������ ���ڿ��� return
   
   public String solution8 (String my_string) {
	   String answer = "";
	   StringBuffer sb = new StringBuffer(my_string);
	   // String�� �ѹ� ���� �������� ������ �� ������, StringBuffer�� ���� ��ü�� �������� �ʰ�
	   // �� �ڸ����� �ٷιٷ� �߰��Ѵ�. -> String�� ���ڿ� �߰��ϸ� �׸�ŭ ���ο� ��ü�� ���� ����
	   // ���ڿ��� �߰��� ������ append() �޼��带 ����ϰ� toString() �� ���� String ������ ��ȯ.
	   // StringBuffer / StringBuilder
	   // StringBuffer : ��Ƽ������ ȯ�濡�� ���� / StringBuilder : ������ ���
	   // ����ȭ ����� ���� ������ StringBuilder�� ���� ���� ���ϴ�.
	   answer = sb.reverse().toString();
	   // ������ �ٲ� �� String ������ �ٲ㼭 �����ƶ�
	   return answer;
   }
   
   
   // �迭 �ڸ���
   // ���� �迭 numbers�� ���� num1, num2�� �־��� �� 
   // numbers�� num1 ��° �ε������� num2 ��° �ε��������� ���� �迭�� return
   public int[] solution9 (int[] numbers, int num1, int num2) {
	   int num3 = num2-num1+1;
	   int[] answer = new int[num3];
	   for(int i = 0; i < num3; i++) {
		   answer[i] = numbers[num1+i];
	   }
	   return answer;
	   
	   /* �� ���� ��� */
	   // Arrays.copyOfRange(numbers, num1, num2+1);
	   // copyOfRange(a,b,c); : a �迭�� ������ b�� �ε������� c �̸� (��, c-1��° �ε�������) ���� 
   }
   
   
   // �ִ� �����(1)
   // ���� �迭 numbers
   // numbers�� ���� �� 2 ���� ���� ���� �� �ִ� �ִ��� return
   public int solution10 (int[] numbers) {
	   int answer = 0;
	   Arrays.sort(numbers);
	   int num1 = numbers[numbers.length-1];
	   int num2 = numbers[numbers.length-2];
	   answer = num1*num2;
	   return answer;
   }
   
   
   // ¦�� Ȧ�� ����
   // ������ ��� ����Ʈ num_list
   // �ش� ���� �� ¦��, Ȧ���� ������ ���� �迭 return
   public int[] solution11(int[] num_list) {
	   int[] answer = new int[2];
	   for (int i=0;i < num_list.length;i++) {
		   if (num_list[i]%2 == 0) {
			   answer[0]++;
		   } else {
			   answer[1]++;
		   }
	   }
	   return answer;
   }
   
   
   // �ﰢ�� �����
   // �� ���� ���̰� ��� �迭 sides
   // �ﰢ���� ���� : ���� �� ���� ������ �� ���� �պ��� �۾ƾ� �Ѵ�
   // ���� ������ �����ϸ� 1, �ƴϸ� 2�� return
   public int solution12(int[] sides) {
	   int answer = 0;
	   Arrays.sort(sides);
	   if(sides[2] < sides[0] + sides[1]) {
		   answer = 1;
	   } else {
		   answer = 2;
	   }
	   return answer;
   /* �� ���� �ϴ� �� */
	   // return (side[2] < sides[0] + sides[1]) ? 1 : 2; 
   
   }
   
   
   // Ư�� ���� �����ϱ�
   // ���ڿ� my_string, ���� letter
   // my_string���� letter�� ������ ���ڿ� return
   public String solution13(String my_string, String letter) {
		   String answer = "";
		   answer = my_string.replaceAll(letter, "");
		   // String.replaceAll(�ٲܱ���, ��ü�ұ���);
		   return answer;
   }
   
   
   // ���� ��ġ ���ϱ�
   // x ��ǥ�� y ��ǥ�� ��� ����̸� �� 1��и�
   // x �� ����, y�� ����̸� �� 2��и�
   // x , y ��� �����̸� �� 3��и�
   // x �� ���, y �� �����̸� �� 4��и�
   // ��ǥ x,y�� ���� �����迭 dot
   // dot �� ��и� �� ��� ���ϴ��� return
   public int solution14(int[] dot) {
	   int answer = 0;
	   if (dot[0] > 0 && dot[1] > 0) {
		   answer = 1;
	   } else if (dot[0] < 0 && dot[1] > 0) {
		   answer = 2;
	   } else if (dot[0] < 0 && dot[1] < 0) {
		   answer = 3;
	   } else {
		   answer = 4;
	   }
	   return answer;
   }
   
   
   // �迭 ������ ����
   // ���ڿ� �迭 strlist
   // �� ������ ���̸� ���� �迭�� return
   public int[] solution15(String[] strlist) {
	   int[] answer = new int[strlist.length];
	   for (int i = 0; i < strlist.length; i++) {
		   answer[i] = strlist[i].length();
	   }
	   return answer;
   }
   
   
   // ����
   // �Ӿ��̰� �ҸӴϿ��� ���� ���� ���� ��
   // ���� �� ���� 2cm. 
   // ���� ���� message (�Ű�����) �� ���� ���� �ʿ��� �������� �ּ� ���� ���� return
   public int solution16(String message) {
	   int answer = 0;
	   answer = 2*message.length();
	   return answer;
   }
   
   
   // �����ﰢ�� ���
   // "*" �� ���̿� �ʺ� 1�� ��, "*"�� �̿��� ���� �̵ �ﰢ���� �׸�
   // ���� n �� �־����� ���̿� �ʺ� n�� ���� �̵ �ﰢ���� ����ϵ��� �ڵ� �ۼ�
   public static void solution17() {
 	   Scanner sc = new Scanner(System.in);
 	   int n = sc.nextInt();
 	   for(int i = 0; i < n; i++) {
 		   for(int j = 0; j <= i; j++) {
 			   System.out.print("*");
 		   }
 		   System.out.println();
 	   }
 	   
 	   /* �� ����� ������ ���� for�� ���� ���� */
   }
   
   
   // ���� �ݺ� ����ϱ�
   // ���ڿ� my_string�� ���� n�� �Ű�����
   // my_string�� ����ִ� �� ���ڸ� n��ŭ �ݺ��� ���ڿ� return
   public String solution18(String my_string, int n) {
	   String answer = "";
	   // ���� ���ڿ��� �����ؼ� �ű�ٰ� �� ���ڸ� n�� �ݺ��ؼ� �ֱ�
	   
	   return answer;
   }
   
   
   // ���簢�� ��ǥ ���ϱ�
   public int[] solution19(int[][] v) {
	   int[] answer = new int[2];
	   
	   for(int i = 0; i < answer.length;i++) {
		   if(v[0][i] == v[1][i]) {
			   answer[i] = v[2][i];
		   } else if (v[0][i] == v[2][i]) {
			   answer[i] = v[1][i];
		   } else {
			   answer[i] = v[0][i];
		   }
	   }
	   return answer;
   }
   
     
   
   // ���ڿ��� ���� n �� �ݺ��ؼ� ���
   public String solution20(String my_string, int n) {
	   String answer = "";
	   String[] arr = new String[my_string.length()];
	   for(int i = 0; i < my_string.length();i++) {
		  arr[i] = String.valueOf(my_string.charAt(i)).repeat(n);
	   }
	   // ������� �ϸ� hello�� ��� ["hhh","eee","lll","ooo","ooo"] �ϼ�
	   // �׷� �̰� ���ڿ��� �������� ���ؾ� �ϳ�?
	   for (int j = 0; j < arr.length; j++) {
		   answer+=arr[j];
	   }
	   
//	   String answer = Arrays.toString(arr); -> �̷��� �ߴ��� �迭 ��ü�� ���ڿ��� �ٲٴ°Ŷ� []�� , �� ���� ����
	   return answer;
   }
   
   
   
   // �ܰ� �༺�� �̸�
   // a�� 0, b�� 1, .... j�� 9. 
   // �Ű����� ���� age�� ���ĺ����� ġȯ�� ��
   public String solution21(int age) {
	   String answer = "";
	   String[] arr = {"a","b","c","d","e","f","g","h","i","j"};
	   // ���̸� String �迭�� ������ ����
	   String[] ageArr = String.valueOf(age).split(""); 
	   // ageArr�� �� ���� ���� �ش��ϴ� �ֵ��� answer�� �ִ´� (�������)
	   for(int i = 0; i < ageArr.length;i++) {
		   answer += arr[Integer.parseInt(ageArr[i])];
	   }
	   return answer;
   }
   
   
   
   // ���� ���� ���ϱ�
   // ���޽� ȯ���� ���޵��� �������� ���� ���� ���ϱ� (�������� ���� ��Ȳ!)
   // ���� �迭 emergency -> ���޵��� ���� ������� ���� ������ ���� �迭 return
   public int[] solution22(int[] emergency) {
	   int[] answer = new int[emergency.length];
	   // 1. ���� ������ ���ʴ�� �־ �� �ε����� ������ �迭�� ��ȯ�ϸ� ���� ������?
	   // -> No. why? ������ �������� ��!

//	   // �������� ���� ��, int �迭�� integer �迭�� �ٲ���� ��! 
//	   Integer[] arr = (Integer[])Arrays.stream(emergency).boxed().toArray();
//	   Arrays.sort(arr, Collections.reverseOrder());
//	   // ���� ������ ���� �� ���� �ش��ϴ� ���� �� �� �ְ� ����. (�� �ش� �ε��� ��)
//	   for(int i = 0; i < arr.length; i++) {
//		   // ����! indexOf �� ���� �ߴ��� �̰� list �������� �����ϴµ�. ArrayList�� �����ߵ�!
//	   }
//	   
	   ArrayList<Integer> arr = new ArrayList<Integer>();

	   /* ���� for�� : �ַ� �ش� �迭�̳� ���ڿ����� ���� ���� �� �� 
	    * �� : ���� ��� ������ ���� ���� / �� : ���� ��� �迭 */
	   
	   for(int i : emergency) {
		   arr.add(i); // emergency�� �ϳ��� ���� arr�� �Է�
	   }
	   
	   // ������������ ����
	   Collections.sort(arr, Collections.reverseOrder());
	   for(int j = 0; j < answer.length; j++) {
		   answer[j] = arr.indexOf(emergency[j]) + 1;
	   }
	   
	   return answer;
   }
   
   
   // �������� ����
   // ������ : �� ���� ���ڸ� ������ ���� ¦���� ��� ��. (a, b)�� ǥ��
   // �ڿ��� n�� �Ű������� �־��� �� �� ������ ���� n�� �������� ������ return
   public int solution23(int n) {
	   int answer = 0;
	   for(int i = 1; i <= n; i++) {
		   if(n % i == 0) {
			   answer++;
		   }
	   }
	   return answer;
   }
   
   
   // ���� ����
   // ��ɰ��� ü�¿� �� �´� ������ ������ ����
   // �屺���� 5, �������� 3, �ϰ��� 1�� ���ݷ�
   // ��ɰ��� ü�� hp -> �ּ����� ���� return
   public int solution24(int hp) {
	   int answer = 0; // ����
	   int leftHp = 0; // ���� ü��
	   if (hp%5 == 0) {
		   answer += hp/5;
	   } else { // �屺���̸����� �ȵȴٸ�
		   answer += hp/5; // �ϴ� �屺���̸����� �ο�� 
		   leftHp = hp%5; // ���� hp�� Ȯ���Ѵ�
		   
		   if(leftHp%3 == 0) { // ���� �������̷� �ο��� �����ٸ�
			   answer += leftHp/3; // �������̸� ���ϰ�
		   } else {
			   answer += leftHp/3;
			   leftHp = leftHp%3;
			   answer += leftHp; // �ƴϸ� ���� �ֵ鵵 ������
		   }
	   }
	   return answer;
	   
	   /* �ٸ� ��� Ǯ�� */
	   // ������ �������� ���� 0�̸� ��� ������
	   // hp/5 + (hp%5)/3 + ((hp%5)%3) �ص� ��
   }
   
   
   // �𽺺�ȣ (1)
   // �Ӿ��̴� �𽺺�ȣ �ص� ���α׷��� ����
   // ���ڿ� letter�� �Ű������϶�, letter�� ���� �ҹ��ڷ� �ٲ� ���ڿ��� return
   // �𽺺�ȣ �迭 �־���
   // �𽺺�ȣ�� �������� ���е�
   public String solution25(String letter) {
	   String answer = "";
	   // ���� ���ڸ��� map �̿��ؾ߰ڴ� ������!
	   Map<String, String> morse = new HashMap<>();
	   // �ش� �𽺺�ȣ ���� �־��ֱ�
	   morse.put(".-","a");
	   morse.put("-...", "b");
	   morse.put("-.-.","c");
	   morse.put("-..", "d");
	   morse.put(".","e");
	   morse.put("..-.","f");
	   morse.put("--.","g");
	   morse.put("....","h");
	   morse.put("..","i");
	   morse.put(".---","j");
	   morse.put("-.-","k");
	   morse.put(".-..","l");
	   morse.put("--","m");
	   morse.put("-.","n");
	   morse.put("---","o");
	   morse.put(".--.","p");
	   morse.put("--.-","q");
	   morse.put(".-.","r");
	   morse.put("...","s");
	   morse.put("-","t");
	   morse.put("..-","u");
	   morse.put("...-","v");
	   morse.put(".--","w");
	   morse.put("-..-","x");
	   morse.put("-.--","y");
	   morse.put("--..","z");
	   // letter�� �� ���ھ� �и�
	   String[] arr = letter.split(" "); 
	   for(int i = 0; i < arr.length;i++) {
		   if(morse.containsKey(arr[i])) {
			   answer += morse.get(arr[i]);
		   }
	   }
	   
	   // for���� ���� for������ �ܼ�ȭ�Ѵٸ�
//	   for(String str : arr) {
//		   answer = morse.get(str);
//	   }
	   return answer;
   }
   
   
   // ���� ���� ��
   // ������ 2, ������ 0, ���� 5
   // ���� ������� ��Ÿ�� ���ڿ� rsp
   // rsp�� ����� ������������ ��� �̱�� ��츦 ������� ��Ÿ�� ���ڿ� return
   
   public String solution26(String rsp) {
	   String answer = "";
	   // 2�� �־����� 0����, 0�� �־����� 5��, 5�� �־����� 2�� �ٲ㼭 ���� �Ҹ�!
	   String[] arr = rsp.split("");
	   for(String str : arr) {
		   if(str.equals("2")) {
			   answer += "0";
		   } else if (str.equals("0")) {
			   answer += "5";
		   } else if (str.equals("5")) {
			   answer += "2";
		   }
	   }
	   return answer;
	   
	   // case�� Ȱ���غ��� -> �̷��� �ߴ��� �׽�Ʈ �� �ð��� �� �� �ɸ�!
//		for (String srt : arr) {
//			switch(srt) {
//			case "2" :
//				answer += "0";
//				break;
//			case "5" :
//				answer += "2";
//				break;
//			case "0" :
//				answer += "5";
//			}
//		}

   }
   
   
   // ���� ������ ����� ��
   // �Ӿ��̴� ������ ģ�������� ������ ��
   // �Ӿ��̰� ���� ���� ���� balls, ģ���鿡�� �� ���� ���� share
   // balls �� �� share ���� ���ϴ� ������ ����� ���� return
   
   /* 1. int�� �õ��ߴ��� ���� �׽�Ʈ ���̽����� ���� �߻�
    -> �˰��� ���� int���� Ŀ�� �� �־ int�� ���� �ȵȴܴ�
      2. Long���� �õ��ص� ���������� ���� �߻�
      3. ã�ƺ��� BigInteger�� ��� �Ѵܴ� :(  */
   public Long solution27(int balls, int share) {
	   Long answer = 0L;
	   Long upper = 1L; // ������ �� 
	   Long lower = 1L; // ���� ��
	   Long lower2 = 1L; // n-m!�� ��
	   
	   // ���丮�� �Լ� ó�� 
	   for(int i = 2;i<=balls;i++) {
		   upper *= i;
	   }
	   // ���丮�� �Լ� ó��
	   for(int i = 2;i<=share;i++) {
		   lower *= i;
	   }
	   for(int i = 2; i<=(balls-share);i++) {
		   lower2 *= i;
	   }
	   answer = upper/(lower*lower2);	   
	   return answer;
   }
   
   
   // 2�������� �����
   // ���� �迭 num_list �� ���� n
   // num_list�� 2���� �迭�� �ٲ� return 
   // n���� ���
   public int[][] solution28(int[] num_list, int n){
	   int[][] answer = new int[num_list.length/n][n];
	   int cnt = 0;
	   for(int i = 0; i < num_list.length/n;i++) {
		   for(int j = 0; j < n; j++) {
			   answer[i][j] = num_list[cnt];
			   cnt++;
		   }
	   }
	   return answer;
	   
	   /* ���� Arrays.copyOfRange()�� ���� �;��µ� ��� �ؾ��ϴ��� ���� �� ������ */
//	   int[][] answer = new int[num_list.length/n][n];
//	   
//	   for(int i = 0; i < num_list.length/n;i++) {
//		   answer[i] = Arrays.copyOfRange(num_list, i*n, (i+1)*n);
//	   }
//	   return answer;
//	   
	   /* �ٸ� ��� Ǯ�̸� ���� ���ʿ� ������ �� int[][] answer = new int[num_list.length/n][];
	    * �̷� ������ �����ϸ� num_list ��� ���� :) */

   }
   
   
   // �� ������
   // �Ӿ��̴� ģ�����̶� ���׶��� ���� �� ������ ��. 1������ ������ ���������� 1�� �ǳ� �ٰ�
   // �� ���� ������� ����. ģ������ ��ȣ�� �� ���� �迭 numbers, ���� k
   // k��°�� ���� ������ ����� ��ȣ return
   public int solution29(int[] numbers, int k) {
	   int answer = 0; // k ��° ���� ��ȣ
	   
	   // ���� ��� 1���� �����ٸ� �� ������ 3��, �� ������ 5��....
	   // ������ �� �ٷ� ���� 1�� ����.
	   answer = numbers[2 * (k-1) % numbers.length];

	   return answer;
   }
   
   
   // �迭 ȸ����Ű��
   // ������ ��� �迭 numbers, ���ڿ� direction�� �Ű�����
   // numbers�� ���Ҹ� direction �������� �� ĭ�� ȸ����Ų �迭�� return
   public int[] solution30(int[] numbers, String direction) {
	   int[] answer = new int[numbers.length];
	   // direction�� ���� �迭�� �ٸ��� �Ǿ�� ��.
	   if (direction.equals("right")) {
		   answer[0] = numbers[numbers.length-1]; 
		   for(int i = 1; i < numbers.length; i++) {
			   answer[i] = numbers[i-1];
		   }
	   } else {
		   answer[numbers.length-1] = numbers[0];
		   for(int i = 1; i < numbers.length; i++) {
			   answer[i-1] = numbers[i];
		   }
	   }
	   return answer;
   }
   
   
   // ������ ������ ����� ��
   // �Ӿ��̰� ���� ������ ���� balls, �������� ���� ���� share
   // balls �� �� share ���� ���� ����� �� return
   public int solution31(int balls, int share) {
	   // �ַ��1,2�� ����ϴٰ� �ȵǾ ������ Ȯ���ϴ� BigInteger�� ����϶�� �Ѵ�. Long�� ������ ���ٵǴ� ��.

	   
/*		�ַ��1 : ���� �ʹ� Ŀ������ �ټ� ���̽����� ����  */
//			   Long answer = 0L;
//			   Long upper = 1L; // ������ �� 
//			   Long lower = 1L; // ���� ��
//			   Long lower2 = 1L; // n-m!�� ��
//			   
//			   // ���丮�� �Լ� ó�� 
//			   for(int i = 2;i<=balls;i++) {
//				   upper *= i;
//			   }
//			   // ���丮�� �Լ� ó��
//			   for(int i = 2;i<=share;i++) {
//				   lower *= i;
//			   }
//			   for(int i = 2; i<=(balls-share);i++) {
//				   lower2 *= i;
//			   }
//			   answer = upper/(lower*lower2);	   
//			   return answer;
	   
/*		�ַ��2 : �ַ��1���ٴ� ���� ����������, 4���� �׽�Ʈ���̽����� ������ ���� */
//	   Long answer = 0L;
//	   Long upper = 1L;
//	   Long lower = 1L;
//	   
//	   for(int i = 1; i <= share; i++) {
//		   upper *= i;
//	   }
//	   
//	   for(int i = 1; i <= balls-share; i++) {
//		   lower *= i;
//	   }
//	   answer = upper/lower;
//	   return answer;
	   
	   /* �ַ�� 3 : �׳� BigInteger �Ἥ �ذ�! */
	   // �ٵ� �� �״�� �����ߴ��� �и𿡼� Ʋ����
	   // �׳� �� ����ȭ�ؼ� �� 
	   // �� : n! / (n-m)!*m! �ε� �̰� �����غ��� 
	   // ���ڴ� n���� m+1���� ���� ��, �и�� 1���� n-m���� ���� ���̴�
	   // �״�� for�� �����༭ ������ ��!
	   
	   int answer = 0;
	   BigInteger upper = new BigInteger("1");
	   BigInteger lower = new BigInteger("1");
	   
	   for(int i = share+1; i <= balls; i++) {
		   upper = upper.multiply(BigInteger.valueOf(i));
	   }
	   
	   for(int i = 1; i <= balls-share; i++) {
		   lower = lower.multiply(BigInteger.valueOf(i));
	   }
	   	   
	   answer = (upper.divide(lower)).intValue();
	   
	   return answer;
   }
   
   
   // �迭�� ���絵
   // ���ڿ� �迭 s1�� s2, ���� ������ ���� return
   public int solution32(String[] s1, String[] s2) {
	   int answer = 0;
	   for(int i = 0; i < s1.length; i++) {
		   for(int j = 0; j < s2.length; j++) {
			   if(s1[i].equals(s2[j])) {
				   answer++;
			   }
		   }
	   }
	   return answer;
   }
   
   
   // �ڸ��� ���ϱ�
   // ���� n�� �� �ڸ� ������ ���� return
   public int solution33(int n) {
	   int answer = 0;
	   // n�� �ɰ� �� ���ϰų�, �� �ڸ� �� �� ������ 10�� �������� ���ݾ� ����� �� �������� ���ϴ� ��� ���
	   
	   while (n > 0) {
		   answer += n%10;
		   n /= 10;
	   }
	   return answer;
   }
   
   
   // ���ڿ� �ȿ� ���ڿ�
   // ���ڿ� str1 �ȿ� str2 �� ������ 1, �ƴϸ� 2 return
   public int solution34(String str1, String str2) {
	   int answer = 0;
	   if(str1.contains(str2)) {
		   answer = 1;
	   } else {
		   answer = 2;
	   }
	   return answer;
   }
   
   
   // �ֻ����� ����
   // �Ӿ��̴� ������ü�� ���ڸ� ���� ���� -> ������ ����, ����, ���̰� ����� �迭 box
   // �� ���� �ȿ� �ִ��� ���� ���� �ֻ����� �ְ� ���� -> �ֻ����� �𼭸� ���� n
   // �̶�, �ִ� ���� return
   public int solution35(int[] box, int n) {
	   int answer = 0;
	   answer = (box[0]/n)*(box[1]/n)*(box[2]/n); 
	   return answer;
   }
   
   
   // �ռ��� ã��
   // ��� ������ 3�� �̻� -> �ռ���
   // �ڿ��� n�� �־��� ��, n ������ �ռ����� ���� return
   public int solution36(int n) {
	   // �ռ����� �� 1�� �ڱ��ڽ� ���� �ٸ� �ֵ�� �������� �ֵ��� ���ϴ� �ǵ�......
	   // ��� ���� ī��Ʈ �� �װ� 3�� �̻��̸� �ǰԲ�?
	   int answer = 0;
	   int[] arr = new int[n+1]; // arr[0] ���� arr[n]���� ����
	   for(int i = 1; i <= n; i++) {
		   for(int j = 1; j <= i; j++) {
			   if(i%j == 0) {
				   arr[i]++;
			   }
		   }
	   } // arr[1] ���� arr[n]���� �� ����� ���� ���� 
	   
	   for(int i = 1; i <= n; i++) {
		   if(arr[i] >= 3) {
			   answer++;
		   }
	   }
	   return answer;
   }
   
   
   // ���丮��
   // ���� n�� �־��� �� ���� ������ �����ϴ� ���� ū ���� i �� return
   // ���� : i! <= n
   public int solution37(int n) {
	   int answer = 0;
	   int num = 1;
	   for(int i = 1; i <= n; i++) {
		   num *= i;
		   if(num == 1) {
			   answer = 1;
		   } else if(num == 2) {
			   answer = 2;
		   } else if (num > n) {
			   answer = i-1;
			   break;
		   }
	   }
	   return answer;
	   // num == 1�� üũ������ ���� �׽�Ʈ ���̽� 2�� ����. why? -> 2�� ���� �������� ��
	   // So, 2�϶��� �־������ �Ϸ�� :)
	   
	   /* �ٸ� ������� while ������ �ذ��� ��� */
//	   int answer = 0;
//	   int num = 1;
//	   
//	   while (true) { // true�϶� ��� ����
//		   if (num <= n) { // num �� n���� �۰ų� ���ٸ�
//			   num *= answer + 1; // num�� answer+1�� ��� ���ض� 
//			   answer++; // �׸��� �׶����� answer�� �� ���� ���� ��.
//		   } else break; // �׸��� num�� n���� Ŀ���� ��ž. (�̶� �츮�� ���ϴ� ������ +1�� ����)
//	   }
//	   
//	   return answer-1; // �츮�� ���ϴ� ������ +1�� ���¿��� ��ž������ -1�� ����� ��!
   }
   
   
   // ���� ����
   // ���ڿ� my_string���� a,e,i,o,u �� ������ ���ڿ� return
   public String solution38(String my_string) {
	   String answer = "";
	   // 2���� ������� �ذ� 
	   // �ַ�� 1 : replaceAll ���� -> �̶� �Ÿ����� �ϴ� �ڸ��� �������� ���ڿ��� �Ʒ��� ���� ����� �� ����
       answer = my_string.replaceAll("[aeiou]", "");
       								// "[a,e,i,o,u]" �ε� �� �� �ִ�.
       // �ַ�� 2 : replace ���� -> �׳� ������ my_string.replace()�ؼ� ���� ���
       //     answer = my_string.replace("a", "").replace("e", "").replace("i", "").replace("o","").replace("u","");
	   return answer;
   }
   
   
   // ���ڿ� �����ϱ� (1)
   // ���ڿ� my_string �ȿ� �ִ� ���ڸ� ������������ �����Ͽ� return
   public int[] solution39(String my_string) {	   
// �ַ�� 1 : �̷��� �ߴ��� �迭 ���̶����� ������	   
	   String[] arr = {};
	   my_string = my_string.replaceAll("[abcdefghijklmnopqrstuvwxyz]", "");
	   									// �̰� [a-z,A-Z] ��� ǥ���ص� ok 
	   arr = my_string.split(""); // �ϸ� �� ���Ұ� String�� �迭 ����
	   int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            answer[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(answer);
	   return answer;
   }
   
   
   // �����ִ� ������ ���� (1)
   // ���ڿ� my_string ���� ��� �ڿ����� �� return
   public int solution40(String my_string) {
	   int answer = 0;
	   String[] arr = {};
	   arr = my_string.replaceAll("[a-z,A-Z]", "").split("");
	   for(int i = 0; i < arr.length; i++) {
		   answer += Integer.parseInt(arr[i]);
	   }
	   
	   return answer;
   }
   
   
   // ���μ�����
   // ���μ����� : � ���� �Ҽ����� ������ ��Ÿ���� ��   ��) 12�� 2*2*3�̹Ƿ� ���μ��� 2,3�� ���� -> [2,3]
   // �ڿ��� n�� �־��� �� n�� ���μ��� ������������ ���� �迭 return
   public int[] solution41(int n) {
	   HashSet<Integer> set = new HashSet<>();
	   // �ٷ� while���� ������� �޸� �ʰ���. for������ ������
	   for(int i = 2; i <= n; i++) { // i�� n���� �����ؾ� �ϴ� i <= n
		   while (n != 1) {
			   if(n%i == 0) {
				   n /= i;
				   set.add(i);	   
			   } else { // else �� i++�� ó������ �ʾƼ� ��� ���� �ٶ��� �޸� �ʰ� ���� �߻�! �������� �ڡڡ�
				   i++;
			   }
		   	}
	   }
	   int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
	   // ������� �ߴµ� �׽�Ʈ 13 ������ ����. ã�ƺ��� ��������� �ȴٰ� ��.
	   Arrays.sort(answer);
	   return answer;
	   
	   // �̷��� �ߴ��� �ٸ� ���� Ǯ�̸� �������� �� ���� �ð��� ��� �ɸ�. 
	   // �׺��� Ǯ�̸� �����ϸ鼭 iterator�� ����� �� �ľ��ؾ� �ҵ�.
	   // �Ʒ��� �׺��� Ǯ��
// �ַ�� �� : �ٸ� ���� Ǯ���ε�, �� �ڵ庸�� �ξ� ������ ������. 
//	           Set<Integer> set = new HashSet<>();
//	           for (int i = 2; i <= n; i++) {
//	               while (n % i == 0) {
//	                   set.add(i);
//	                   n /= i;
//	               }
//	           }
//	           int[] answer = new int [set.size()];
//	           Iterator<Integer> it = set.iterator();
//	           int i=0;
//	           while (it.hasNext()){
//	               answer[i] = it.next();
//	               i++;
//	           }
//			   Arrays.sort(answer);
//	           return answer;
	   
// �ַ�� 1 : �̷��� �ߴ��� �ߺ����� ���ŵ��� �ʾƼ� Ʋ��. -> �˻��غ��� ���ʿ� �ߺ��� ������� �ʴ� HashSet���� �̿��϶�� ��!
//	   ArrayList<Integer> arr = new ArrayList<>();
//	   int i = 2;
//	   while (n != 1) {
//		   if(n%i == 0) {
//			   n /= i;
//			   arr.add(i);
//		   }
//		   i++;
//	   }
//	   int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
//	   return answer;
   }
   
   
   // ��Ʈ�� ��Ʈ
   // ���ڿ� Z�� �������� ���еǾ� �ִ� ���ڿ� s
   // ���ڿ��� �ִ� ���ڸ� ���ʴ�� ���ϵ�, Z ���� ���ڴ� ����
   // ���ڵ��� �� return
   public int solution42(String s) {
	   int answer = 0;
	   String[] arr = s.split(" ");
	   for(int i = 0; i < arr.length; i++) {
		   if(arr[i].equals("Z")) {
			   answer -= Integer.parseInt(arr[i-1]);
		   } else {
			   answer += Integer.parseInt(arr[i]);
		   }
	   }
	   return answer;
	   
// �ַ�� 1 : -�� ���� ������� ����
//	   String[] arr = new String[s.length()];
//	   for(int i = 0; i < s.length(); i++) {
//		   arr[i] = s.substring(i);
//	   }
//	   for(int i = 0; i < arr.length; i++) {
//		   if(arr[i].equals("Z")) {
//			   answer -= Integer.parseInt(arr[i-2]);
//		   } else {
//			   answer += Integer.parseInt(arr[i]);
//		   }
//	   }
   }
   
   
   
   // �ߺ��� ���� ����
   // ���ڿ� my_string�� �־��� ��, �ߺ��� ���ڸ� �����ϰ� �� �� �ϳ��� ���� ���ڿ� return
   // �� -> people �̸� peol�� ��ȯ
   // �̶�, ���鵵 ���ڷ� ������   ��) We are the world -> We arthwold
   public String solution43(String my_string) {
	   String answer = "";
	   // �� ���ھ� �ߺ� Ȯ�� �� �ֱ�
	   for(int i = 0; i < my_string.length(); i++) {
		   if(answer.contains(my_string.substring(i, i+1)) == false) {
			   answer = answer + my_string.substring(i, i+1);
		   }
	   }
	   return answer;
	   
	   // Ǯ��� �ߴµ� �׽�Ʈ���̽����� �� 1.30 ~ 1.8ms �ҿ�. �� ���� ����� ������?
	   // set�� �ߺ��� ������� �ʴ´ٴ� Ư���� �̿��� Ǭ ���� Ǯ�� �߰�. �� 0.3 ~ 0.8ms �ҿ�
//       String[] answer = my_string.split("");
//       Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));
//
//       return String.join("", set);
   }
   
   
   
   // ����� ��
   // ���� �迭 array, ���� n 
   // array �ȿ� �ִ� ���� �� n�� ���� ����� ���� return
   // ����� ���� ���� ����� �� ���� ���� return
   public int solution44(int[] array, int n) {
	   int answer = 0;
	   int[] arr = new int[array.length]; // ���� n���� ���̸� ���� �迭
	   for(int i = 0; i < array.length; i++) {
		   arr[i] = Math.abs(n-array[i]);
	   }
	   Arrays.sort(arr);
	   // �̷��� ���� ���� ���� arr[0]�̰�, n�� �׸�ŭ ���̳��� ���� ���� ����� ����
	   for (int i = 0 ; i < array.length; i++) {
		   
		   // �ַ�� 1 : �׽�Ʈ���̽� 1�� ����
//		   if (array[i] == (n-arr[0])) { // n���� �ش� ���� �� ���� ���ٸ�
//			   answer = array[i];
//		   } else if (array[i] == (n+arr[0])) { // n���� �ش� ���� �� ���� �ƴѵ�, n���� ���� ���� ���ٸ�
//			   answer = array[i];
//		   } else if (arr[0] == arr[1]) { 
//               answer = n-arr[0]; 
//               // �� �̷��� �ߴ��� 3���� �����ϰ� 4���� ����Ѱž�?
//               // �� ���� ���� ���̰� ���ٸ� ������ n���� ���� �ְ� ���;� ��.
//           } else if (array[i] == n) {
//               answer = n; 
//               // �̷��� 3���� ���. 3���� n�� �迭�� (2�� �̻�) �ִ� ����ε�.
//               // 4���� �ߺ��Ǵ� ��쿴�� ��.
//               // �� 1���� ��� ��������?
//           } 
	   }
	   return answer;   
   }
   
   
   
   // 369 ����
   // �Ӿ��̰� ���ؾ� �ϴ� ���� order
   // �Ӿ��̰� �ľ� �� �ڼ� Ƚ�� return
   public int solution45(int order) {
	   int answer = 0;
	   String str = String.valueOf(order);
	   String[] arr = str.split("");
	   for(int i = 0; i < arr.length; i++) {
		   if(arr[i].equals("3") || arr[i].equals("6") || arr[i].equals("9")) {
			   answer++;
		   }
	   }
	   return answer;
   }
   
   // �ٸ� ����� Ǯ�̸� ���� 10�� ������ �� �ڸ��� üũ�ϴ� ��쵵 �־���! 
//   while (order >= 1) {
//	   if(order % 10 == 3 || order % 10 == 6 || order % 10 == 9) {
//		   answer++;
//	   }
//	   order /= 10;
//   }
//   return answer;
   
   
   // ��ȣ �ص�
   // ��ȣȭ�� ���ڿ� cipher, �� ���ڿ����� code�� ��� ��° ���ڸ� ��¥ ��ȣ
   // �ص��� ��ȣ ���ڿ� return
   public String solution46(String cipher, int code) {
	   String answer = "";
	   for(int i = 1; i <= cipher.length()/code; i++) {
		   answer += cipher.charAt((i*code)-1);
	   }
	   return answer;
   }
   // �׽�Ʈ���̽��� ���� ���� 11ms�� �ɸ����� �� ���� ����� ������ ����غ��߰���
   
   
   
   // �빮�ڿ� �ҹ���
   // ���ڿ� my_string����, �빮�ڴ� -> �ҹ��ڷ�, �ҹ��ڴ� -> �빮�ڷ� ��ȯ�� return
   public String solution47(String my_string) {
	   String answer = "";
	   // ���� �ƽ�Ű�ڵ忡 �ͼ����� ������ �ƽ�Ű�ڵ�ε� Ǯ��� (�ַ��2)
	   // �ַ�� 1 : isUpperCase/ isLowerCase�� �̿��� Ǯ��
	   for(int i = 0; i < my_string.length(); i++) {
		   if(Character.isUpperCase(my_string.charAt(i))) {
			   answer += String.valueOf(my_string.charAt(i)).toLowerCase();
		   } else if (Character.isLowerCase(my_string.charAt(i))) {
			   answer += String.valueOf(my_string.charAt(i)).toUpperCase();			   
		   }
	   }
	   return answer;
	   
	   // �ַ�� 2 : �ƽ�Ű�ڵ带 �̿� -> �빮�ڴ� 65 ~ 90 / �ҹ��ڴ� 97 ~ 122 ��, ��ҹ��ڴ� 32�� ���̳�
	   // �ƽ�Ű�ڵ带 �̿��� Ǯ���� �� �ð��� �ξ� ���� �ɸ� (�� 11ms ���� / �ַ�� 1�� 1.6 ~ �ִ� 6.6ms) 
//	   for (int i = 0; i < my_string.length(); i++) {
//		   if(my_string.charAt(i) >= 65 && my_string.charAt(i) <= 90) { // ��, �ش� ���ڿ��� �빮�ڶ��
//			    answer += (char)(my_string.charAt(i) + 32);
//		   } else if (my_string.charAt(i) >= 97 && my_string.charAt(i) <= 122) {
//			   answer += (char)(my_string.charAt(i) - 32);
//		   }
//	   }
//	   
//	   return answer;
   }
   
   
   
   // ��� �Ⱦ��
   // ����� ǥ��Ǿ� �ִ� ���ڸ� ���� �ٲ� 
   // numbers�� �ҹ��ڷθ� �����Ǿ� �ְ�, zero ���� nine���� ������� ���յǾ� �ִ�
   // numbers�� ������ �ٲ� �� return
   public long solution48(String numbers) {
	   long answer = 0;
	   numbers = numbers.replace("zero","0");
	   numbers = numbers.replace("one", "1");
	   numbers = numbers.replace("two", "2");
	   numbers = numbers.replace("three", "3");
	   numbers = numbers.replace("four", "4");
	   numbers = numbers.replace("five", "5");
	   numbers = numbers.replace("six", "6");
	   numbers = numbers.replace("seven", "7");
	   numbers = numbers.replace("eight", "8");
	   numbers = numbers.replace("nine", "9");
	   answer = Long.valueOf(numbers);
	   return answer;
   }
   
   
   
   // �ε��� �ٲٱ�
   // ���ڿ� my_string�� ���� num1, num2
   // my_string���� �ε��� num1�� num2�� �ش��ϴ� ���ڿ��� �ٲ� ���ڿ� return
   public String solution49(String my_string, int num1, int num2) {
	   String answer = "";
	   // [num1]�� �ִ� ��, [num2]�� �ִ� �ָ� �ٲٴ� �Ŵϱ� �迭 �̿�
	   String[] array = my_string.split("");
	   // �ַ�� 2 : �ϳ��� ������ �̿��� �ΰ��� ���ڸ� �ٲٴ� ��
	   // -> �̰� �ڹ� ó�� ��ﶧ ����� �ǵ� ���� ��԰��־���, �ٺ��ٺ�! 
	   String temp = array[num1];
	   array[num1] = array[num2];
	   array[num2] = temp;
	   for(String str : array) { // ���� for�� -> �ش� �迭���� �ϳ��� �̾Ƽ� ���ٴ� �Ҹ�!
		   answer+= str;
	   }
	   // �ַ�� 1 : for���� ����ؼ� �ٲٱ� 
//	   for(int i = 0; i < array.length; i++) {
//		   if(i == num1) {
//			   answer = answer + str2;
//		   } else if (i == num2) {
//			   answer = answer + str1;
//		   } else {
//			   answer+= array[i];
//		   }
//	   }
	   
	   /* ���� */
//	    array.toString(); // �̷��� �ߴ��� [Ljava.lang.String;@ea30797 ���� ����
//		Arrays.toString(array); // ��� �迭 ��ü�� ���ڿ��� ��ȯ�ϴ� �Ŷ� ��� X 

	   return answer;
   }
   
   
   
   // �� ���� ������ ����
   // ���ڿ� s���� �� ���� �����ϴ� ���ڸ� ���� ������ ������ ���ڿ� return
   // ����, �� ���� �����ϴ� ���ڰ� ���ٸ� �� ���ڿ��� return
   public String solution50(String s) {
	   String answer = "";
	   // ī�����ؼ� cnt�� 1�� �ָ� ������ ���̴� �� ���� �� ����.
	   int[] cnt = new int[26];
	   // �ҹ����� �ƽ�Ű �ڵ� : 97 ~ 122 , ���ĺ� 26��, ��, �ش� ������ �ƽ�Ű�ڵ�-97�� �ε����� �������� cnt
	   // -> a�� cnt[0], b�� cnt[1] ..... z�� cnt[25]
	   for(int i = 0; i < s.length(); i++) {
		   cnt[s.charAt(i)-97]++;
	   } // �ؼ� �� ���� �� ȸ���� ī��Ʈ�Ǿ� ���� ��.
	   
	   for(int i = 0; i < cnt.length; i++) {
		   if(cnt[i] == 1) {
			   answer += (char)(i+97); // �ش� ���ڸ� answer���� �־�����.
			   /* ���⼭ �ſ� �ٺ� ���� ū �Ǽ� �� */
			   // �ڲ� String index out of range ������ �߱淡 �� �̷���, �ϰ�
			   // ���۸��ߴ��� ���� ���� ����ϰ� Ǭ ����� �־��µ� �� ��� Ǯ�̴� ��.
			   // ���ϱ�....�ϰ� ���ٺ��� ���� ���⿡ �ٺ����� s.charAt(i)�� ���� �־���......
			   // ���� �׽�Ʈ ���̽����� ��� �翬�� 26���� ���̰� ª���� �ɸ��� �ְڳİ��
			   // �Ǽ����� ����!
		   } 
	   }
	   return answer;
   }
   
   
   
   // ��� ���ϱ�
   // ���� n�� ����� ������������ ���� �迭 return
   public int[] solution51(int n) {
       int[] arr = new int[10000]; // n�� 1 �̻� 10000 �̸��� �����̹Ƿ� ũ��� 10000
       int index = 0;
       for(int i = 1; i <= n; i++) {
		   if(n%i == 0) { // i �� n�� ������
			   arr[index] = i; // arr�� �ش� ���� �ְ�
              index++; // index�� 1 ������Ų��. 
		   }
	   }
       int[] answer = new int[index]; // �׷��� �ؼ� �־��� ũ���� �迭 ����
       for(int i = 0; i < answer.length; i++){ 
               answer[i] = arr[i];  // answer �迭�� �ش� �� �ֱ�
       }
	   return answer;
	   /* ��� ���� �� �Ź� �迭 ũ�⶧���� ���� ��Ŵµ�, n�� �ִ� ������ŭ �����ؼ� Ǫ�� ���� �������! */
	   
	   
	   // ArrayList�� ����ؼ� Ǯ��� �;��µ� ������.
	   // �ٸ� ���� Ǯ�� : stream�� �̿�
//       List<Integer> answer = new ArrayList<>();
//       for(int i=1; i<=n; i++){
//           if(n % i == 0){
//               answer.add(i);
//           }
//       }
//       return answer.stream().mapToInt(x -> x).toArray();
   }
   
   
   
   // ���� ū �� ã��
   // ���� �迭 array�� ���� ū ����, �� ���� �ε����� ���� �迭 return
   // array ���ο� �ߺ��� �� X
   public int[] solution52(int[] array) {
	   int[] answer = new int[2];
	   int[] arr = Arrays.copyOf(array, array.length); // �׳� array�� �ٷ� �������� �����ϸ� �ε��� �� ����
	   Arrays.sort(arr);
	   answer[0] = arr[arr.length-1];
	   for(int i = 0; i < array.length; i++) {
		   if(array[i] == answer[0]) {
			   answer[1] = i;
		   }
	   }

	   // �ַ�� 1 : �׽�Ʈ���̽� 2������ ����. why?
//	   for(int i = 0; i < array.length; i++) {
//		   for(int j = 0; j < i; j++) {
//			   if(array[j] > array[i]) {
//				   answer[0] = array[j];
//				   answer[1] = j;
//			   }
//		   }
//	   }
	   
	   // �ٸ� ����� Ǯ�� -> �� ����� �ξ� �� �����ѵ� ������ ������! 
//	   for(int i = 0; i < array.length; i++) {
//		   if(array[i] > answer[0]) {
//			   answer[0] = array[i]; // �׳� �Էµ� �� ��� ���� �����
//			   answer[1] = i;
//		   }
//	   }
	   return answer;
   }
   
   
   
   // ���ڿ� ����ϱ�
   // my_string�� ���ڿ��� �� ����
   // �ش� ������ ����� �� return
   public int solution53(String my_string) {
	   String[] arr = my_string.split(" "); // ������ �������� ���⸦ �ϸ� ���� ����� ���ص� ��!
	   int answer = Integer.parseInt(arr[0]); // �켱 �� ù��° ���� answer�� ����
	   for(int i = 1; i < arr.length; i++) { // arr[1]���� �����鼭 ��ȣ�� ���� �������ش� 
		   if(arr[i].equals("-")) {
			   answer -= Integer.parseInt(arr[i+1]);
		   } else if(arr[i].equals("+")) {
			   answer += Integer.parseInt(arr[i+1]);
		   }
	   }
	   return answer;
   }
} // Ŭ������ ��


