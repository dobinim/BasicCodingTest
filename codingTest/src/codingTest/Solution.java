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


    
    
    
    // 정수 배열 array에 n 이 몇개 들었는지 카운팅
    
    public int solution(int[] array, int n) {
    	int answer = 0;
    	for(int i = 0;i<array.length;i++) {
    		if(array[i] == n) {
    			answer++;
    		}
    	}
    	
    	return answer;

    }
    
    // 양꼬치 가게에선 1인분이 12,000원, 음료수가 2,000 원
    // 10인분마다 음료수 1병이 무료
    // n 인분을 먹었고 음료수를 k 병을 마셨다면 지불해야 하는 금액은?
    
    public int solution2(int n, int k) {
    	int answer = 0;
    	int drink = 0; // 지불해야되는 음료수의 개수
    	drink = k - n/10;
    	answer = 12000*n + 2000*drink;
    	return answer;
    }
    
    
    // 피자 가게에선 slice 만큼 조각을 잘라줌
    // n명이 먹으려면 최소한 몇 판을 주문해야 하는가?
    
    public int solution3(int slice, int n) {
    	int answer = 0;
    	if (n%slice != 0) {
    		answer = n/slice + 1;
    	} else {
    		answer = n/slice;
    	}
    	
    	return answer;
    }
    
    
    // 정수가 들어있는 배열 num_list
    // 해당 배열의 원소 순서를 거꾸로 해서 return
    
    public int[] solution4(int[] num_list) {
    	int[] answer = {};

    	for(int i = num_list.length;i<0;i--) {
    		answer[i] = num_list[i];
    	}
    	return answer;
    }
    
    
    // 피자 나눠먹기 (2)
    
    public int solution5(int n) {
    	int answer = 1; // 0으로 설정하면 맨 처음 굴릴때 끝나버려서 답이 나오지 않음.
    	while ((6*answer%n != 0)) {
    		answer++;
    	}
    	return answer;
    }
    
    
    // 옷가게 할인받기
    // 10만원 이상은 5%, 30만원 이상은 10%, 50만원 이상은 20% 할인 (가격은 최대 100만원)
    // 구매 가격 price. 지불해야하는 금액을 return
    
    public int solution6(int price) {
    	int answer = 0; // 지불해야하는 금액
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
    
    
    // 아이스 아메리카노
    // 아아의 가격은 5500. 머쓱이가 가진 돈은 money
    // 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열 return
    
   public int[] solution7(int money) {
	   int[] answer = new int[2]; // 값이 2개 든 배열을 내뱉어야 함.
	   answer[0] = money/5500;
	   answer[1] = money%5500;
	   return answer;
   }
   
   
   // 문자열 뒤집기
   // 문자열 my_string을 거꾸로 뒤집은 문자열을 return
   
   public String solution8 (String my_string) {
	   String answer = "";
	   StringBuffer sb = new StringBuffer(my_string);
	   // String은 한번 값이 정해지면 변경할 수 없지만, StringBuffer는 따로 객체를 생성하지 않고
	   // 그 자리에서 바로바로 추가한다. -> String은 문자열 추가하면 그만큼 새로운 객체를 만들어서 저장
	   // 문자열을 추가할 때에는 append() 메서드를 사용하고 toString() 을 통해 String 형으로 반환.
	   // StringBuffer / StringBuilder
	   // StringBuffer : 멀티쓰레드 환경에서 안전 / StringBuilder : 성능이 우수
	   // 동기화 고려할 이유 없으면 StringBuilder를 쓰는 것이 편하다.
	   answer = sb.reverse().toString();
	   // 순서를 바꾼 뒤 String 형으로 바꿔서 내놓아라
	   return answer;
   }
   
   
   // 배열 자르기
   // 정수 배열 numbers와 정수 num1, num2가 주어질 때 
   // numbers의 num1 번째 인덱스부터 num2 번째 인덱스까지의 정수 배열을 return
   public int[] solution9 (int[] numbers, int num1, int num2) {
	   int num3 = num2-num1+1;
	   int[] answer = new int[num3];
	   for(int i = 0; i < num3; i++) {
		   answer[i] = numbers[num1+i];
	   }
	   return answer;
	   
	   /* 더 쉬운 방법 */
	   // Arrays.copyOfRange(numbers, num1, num2+1);
	   // copyOfRange(a,b,c); : a 배열의 범위를 b번 인덱스부터 c 미만 (즉, c-1번째 인덱스까지) 복사 
   }
   
   
   // 최댓값 만들기(1)
   // 정수 배열 numbers
   // numbers의 원소 중 2 개를 곱해 만들 수 있는 최댓값을 return
   public int solution10 (int[] numbers) {
	   int answer = 0;
	   Arrays.sort(numbers);
	   int num1 = numbers[numbers.length-1];
	   int num2 = numbers[numbers.length-2];
	   answer = num1*num2;
	   return answer;
   }
   
   
   // 짝수 홀수 개수
   // 정수가 담긴 리스트 num_list
   // 해당 원소 중 짝수, 홀수의 개수를 담은 배열 return
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
   
   
   // 삼각형 만들기
   // 각 변의 길이가 담긴 배열 sides
   // 삼각형의 조건 : 가장 긴 변이 나머지 두 변의 합보다 작아야 한다
   // 만약 조건을 만족하면 1, 아니면 2를 return
   public int solution12(int[] sides) {
	   int answer = 0;
	   Arrays.sort(sides);
	   if(sides[2] < sides[0] + sides[1]) {
		   answer = 1;
	   } else {
		   answer = 2;
	   }
	   return answer;
   /* 더 쉽게 하는 법 */
	   // return (side[2] < sides[0] + sides[1]) ? 1 : 2; 
   
   }
   
   
   // 특정 문자 제거하기
   // 문자열 my_string, 문자 letter
   // my_string에서 letter를 제거한 문자열 return
   public String solution13(String my_string, String letter) {
		   String answer = "";
		   answer = my_string.replaceAll(letter, "");
		   // String.replaceAll(바꿀글자, 대체할글자);
		   return answer;
   }
   
   
   // 점의 위치 구하기
   // x 좌표와 y 좌표가 모두 양수이면 제 1사분면
   // x 는 음수, y는 양수이면 제 2사분면
   // x , y 모두 음수이면 제 3사분면
   // x 는 양수, y 는 음수이면 제 4사분면
   // 좌표 x,y를 담은 정수배열 dot
   // dot 이 사분면 중 어디에 속하는지 return
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
   
   
   // 배열 원소의 길이
   // 문자열 배열 strlist
   // 각 원소의 길이를 담은 배열을 return
   public int[] solution15(String[] strlist) {
	   int[] answer = new int[strlist.length];
	   for (int i = 0; i < strlist.length; i++) {
		   answer[i] = strlist[i].length();
	   }
	   return answer;
   }
   
   
   // 편지
   // 머쓱이가 할머니에게 생신 축하 편지 씀
   // 글자 당 가로 2cm. 
   // 축하 문구 message (매개변수) 를 적기 위해 필요한 편지지의 최소 가로 길이 return
   public int solution16(String message) {
	   int answer = 0;
	   answer = 2*message.length();
	   return answer;
   }
   
   
   // 직각삼각형 출력
   // "*" 의 높이와 너비가 1일 때, "*"를 이용해 직각 이등변 삼각형을 그림
   // 정수 n 이 주어지면 높이와 너비가 n인 직각 이등변 삼각형을 출력하도록 코드 작성
   public static void solution17() {
 	   Scanner sc = new Scanner(System.in);
 	   int n = sc.nextInt();
 	   for(int i = 0; i < n; i++) {
 		   for(int j = 0; j <= i; j++) {
 			   System.out.print("*");
 		   }
 		   System.out.println();
 	   }
 	   
 	   /* 별 출력할 때에는 이중 for문 잊지 말기 */
   }
   
   
   // 문자 반복 출력하기
   // 문자열 my_string과 정수 n이 매개변수
   // my_string에 들어있는 각 문자를 n만큼 반복한 문자열 return
   public String solution18(String my_string, int n) {
	   String answer = "";
	   // 새로 문자열을 생성해서 거기다가 각 글자를 n씩 반복해서 넣기
	   
	   return answer;
   }
   
   
   // 직사각형 좌표 구하기
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
   
     
   
   // 문자열을 각각 n 번 반복해서 출력
   public String solution20(String my_string, int n) {
	   String answer = "";
	   String[] arr = new String[my_string.length()];
	   for(int i = 0; i < my_string.length();i++) {
		  arr[i] = String.valueOf(my_string.charAt(i)).repeat(n);
	   }
	   // 여기까지 하면 hello의 경우 ["hhh","eee","lll","ooo","ooo"] 완성
	   // 그럼 이걸 문자열로 차곡차곡 더해야 하나?
	   for (int j = 0; j < arr.length; j++) {
		   answer+=arr[j];
	   }
	   
//	   String answer = Arrays.toString(arr); -> 이렇게 했더니 배열 자체를 문자열로 바꾸는거라 []나 , 가 같이 나옴
	   return answer;
   }
   
   
   
   // 외계 행성의 이름
   // a는 0, b는 1, .... j는 9. 
   // 매개변수 나이 age를 알파벳으로 치환할 것
   public String solution21(int age) {
	   String answer = "";
	   String[] arr = {"a","b","c","d","e","f","g","h","i","j"};
	   // 나이를 String 배열로 나눠서 넣음
	   String[] ageArr = String.valueOf(age).split(""); 
	   // ageArr의 각 원소 값에 해당하는 애들을 answer에 넣는다 (순서대로)
	   for(int i = 0; i < ageArr.length;i++) {
		   answer += arr[Integer.parseInt(ageArr[i])];
	   }
	   return answer;
   }
   
   
   
   // 진료 순서 정하기
   // 응급실 환자의 응급도를 기준으로 진료 순서 정하기 (높을수록 응급 상황!)
   // 정수 배열 emergency -> 응급도가 높은 순서대로 진료 순서를 정한 배열 return
   public int[] solution22(int[] emergency) {
	   int[] answer = new int[emergency.length];
	   // 1. 높은 순으로 차례대로 넣어서 그 인덱스를 저장한 배열을 반환하면 되지 않을까?
	   // -> No. why? 순서가 지켜져야 됨!

//	   // 내림차순 정렬 시, int 배열은 integer 배열로 바꿔줘야 함! 
//	   Integer[] arr = (Integer[])Arrays.stream(emergency).boxed().toArray();
//	   Arrays.sort(arr, Collections.reverseOrder());
//	   // 위의 과정을 통해 각 수에 해당하는 값을 얻어낼 수 있게 만듬. (각 해당 인덱스 값)
//	   for(int i = 0; i < arr.length; i++) {
//		   // 문제! indexOf 를 쓰려 했더니 이건 list 구조에서 지원하는듯. ArrayList로 만들어야됨!
//	   }
//	   
	   ArrayList<Integer> arr = new ArrayList<Integer>();

	   /* 향상된 for문 : 주로 해당 배열이나 문자열에서 값을 꺼낼 때 씀 
	    * 앞 : 값을 빼어내 저장할 변수 선언 / 뒤 : 값을 빼어낼 배열 */
	   
	   for(int i : emergency) {
		   arr.add(i); // emergency를 하나씩 빼서 arr에 입력
	   }
	   
	   // 내림차순으로 정렬
	   Collections.sort(arr, Collections.reverseOrder());
	   for(int j = 0; j < answer.length; j++) {
		   answer[j] = arr.indexOf(emergency[j]) + 1;
	   }
	   
	   return answer;
   }
   
   
   // 순서쌍의 개수
   // 순서쌍 : 두 개의 숫자를 순서를 정해 짝으로 지어낸 쌍. (a, b)로 표기
   // 자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 순서쌍의 개수를 return
   public int solution23(int n) {
	   int answer = 0;
	   for(int i = 1; i <= n; i++) {
		   if(n % i == 0) {
			   answer++;
		   }
	   }
	   return answer;
   }
   
   
   // 개미 군단
   // 사냥감의 체력에 딱 맞는 병력을 데리고 나감
   // 장군개미 5, 병정개미 3, 일개미 1의 공격력
   // 사냥감의 체력 hp -> 최소한의 병력 return
   public int solution24(int hp) {
	   int answer = 0; // 병력
	   int leftHp = 0; // 남은 체력
	   if (hp%5 == 0) {
		   answer += hp/5;
	   } else { // 장군개미만으로 안된다면
		   answer += hp/5; // 일단 장군개미만으로 싸우고 
		   leftHp = hp%5; // 남은 hp를 확인한다
		   
		   if(leftHp%3 == 0) { // 이후 병정개미로 싸워서 끝난다면
			   answer += leftHp/3; // 병정개미만 더하고
		   } else {
			   answer += leftHp/3;
			   leftHp = leftHp%3;
			   answer += leftHp; // 아니면 남은 애들도 더해줌
		   }
	   }
	   return answer;
	   
	   /* 다른 사람 풀이 */
	   // 어차피 나눠지는 수가 0이면 상관 없으니
	   // hp/5 + (hp%5)/3 + ((hp%5)%3) 해도 됨
   }
   
   
   // 모스부호 (1)
   // 머쓱이는 모스부호 해독 프로그램을 만듬
   // 문자열 letter가 매개변수일때, letter를 영어 소문자로 바꾼 문자열을 return
   // 모스부호 배열 주어짐
   // 모스부호는 공백으로 구분됨
   public String solution25(String letter) {
	   String answer = "";
	   // 문제 보자마자 map 이용해야겠다 생각함!
	   Map<String, String> morse = new HashMap<>();
	   // 해당 모스부호 값들 넣어주기
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
	   // letter를 한 글자씩 분리
	   String[] arr = letter.split(" "); 
	   for(int i = 0; i < arr.length;i++) {
		   if(morse.containsKey(arr[i])) {
			   answer += morse.get(arr[i]);
		   }
	   }
	   
	   // for문을 향상된 for문으로 단순화한다면
//	   for(String str : arr) {
//		   answer = morse.get(str);
//	   }
	   return answer;
   }
   
   
   // 가위 바위 보
   // 가위는 2, 바위는 0, 보는 5
   // 내는 순서대로 나타낸 문자열 rsp
   // rsp에 저장된 가위바위보를 모두 이기는 경우를 순서대로 나타낸 문자열 return
   
   public String solution26(String rsp) {
	   String answer = "";
	   // 2가 주어지면 0으로, 0이 주어지면 5로, 5가 주어지면 2로 바꿔서 내란 소리!
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
	   
	   // case문 활용해보자 -> 이렇게 했더니 테스트 시 시간이 좀 더 걸림!
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
   
   
   // 구슬 나누는 경우의 수
   // 머쓱이는 구슬을 친구들한테 나눠줄 것
   // 머쓱이가 가진 구슬 개수 balls, 친구들에게 줄 구슬 개수 share
   // balls 개 중 share 개를 구하는 가능한 모두의 수를 return
   
   /* 1. int로 시도했더니 많은 테스트 케이스에서 오류 발생
    -> 알고보니 수가 int보다 커질 수 있어서 int를 쓰면 안된단다
      2. Long으로 시도해도 마찬가지의 오류 발생
      3. 찾아보니 BigInteger를 써야 한단다 :(  */
   public Long solution27(int balls, int share) {
	   Long answer = 0L;
	   Long upper = 1L; // 나눠질 값 
	   Long lower = 1L; // 나눌 값
	   Long lower2 = 1L; // n-m!의 값
	   
	   // 팩토리얼 함수 처리 
	   for(int i = 2;i<=balls;i++) {
		   upper *= i;
	   }
	   // 팩토리얼 함수 처리
	   for(int i = 2;i<=share;i++) {
		   lower *= i;
	   }
	   for(int i = 2; i<=(balls-share);i++) {
		   lower2 *= i;
	   }
	   answer = upper/(lower*lower2);	   
	   return answer;
   }
   
   
   // 2차원으로 만들기
   // 정수 배열 num_list 와 정수 n
   // num_list를 2차원 배열로 바꿔 return 
   // n개씩 담기
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
	   
	   /* 나는 Arrays.copyOfRange()를 쓰고 싶었는데 어떻게 해야하는지 감이 안 잡혔음 */
//	   int[][] answer = new int[num_list.length/n][n];
//	   
//	   for(int i = 0; i < num_list.length/n;i++) {
//		   answer[i] = Arrays.copyOfRange(num_list, i*n, (i+1)*n);
//	   }
//	   return answer;
//	   
	   /* 다른 사람 풀이를 보니 애초에 선언할 때 int[][] answer = new int[num_list.length/n][];
	    * 이런 식으로 선언하면 num_list 사용 가능 :) */

   }
   
   
   // 공 던지기
   // 머쓱이는 친구들이랑 동그랗게 서서 공 던지기 중. 1번부터 던지고 오른쪽으로 1명 건너 뛰고
   // 그 다음 사람에게 전달. 친구들의 번호가 든 정수 배열 numbers, 정수 k
   // k번째로 공을 던지는 사람의 번호 return
   public int solution29(int[] numbers, int k) {
	   int answer = 0; // k 번째 애의 번호
	   
	   // 예를 들어 1번이 던진다면 그 다음엔 3번, 그 다음엔 5번....
	   // 마지막 애 바로 옆에 1번 있음.
	   answer = numbers[2 * (k-1) % numbers.length];

	   return answer;
   }
   
   
   // 배열 회전시키기
   // 정수가 담긴 배열 numbers, 문자열 direction이 매개변수
   // numbers의 원소를 direction 방향으로 한 칸씩 회전시킨 배열을 return
   public int[] solution30(int[] numbers, String direction) {
	   int[] answer = new int[numbers.length];
	   // direction에 따라서 배열이 다르게 되어야 함.
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
   
   
   // 구슬을 나누는 경우의 수
   // 머쓱이가 가진 구슬의 개수 balls, 나누어줄 구슬 개수 share
   // balls 개 중 share 개를 고르는 경우의 수 return
   public int solution31(int balls, int share) {
	   // 솔루션1,2를 고민하다가 안되어서 질문탭 확인하니 BigInteger를 사용하라고 한다. Long도 범위가 오바되는 듯.

	   
/*		솔루션1 : 수가 너무 커서인지 다수 케이스에서 실패  */
//			   Long answer = 0L;
//			   Long upper = 1L; // 나눠질 값 
//			   Long lower = 1L; // 나눌 값
//			   Long lower2 = 1L; // n-m!의 값
//			   
//			   // 팩토리얼 함수 처리 
//			   for(int i = 2;i<=balls;i++) {
//				   upper *= i;
//			   }
//			   // 팩토리얼 함수 처리
//			   for(int i = 2;i<=share;i++) {
//				   lower *= i;
//			   }
//			   for(int i = 2; i<=(balls-share);i++) {
//				   lower2 *= i;
//			   }
//			   answer = upper/(lower*lower2);	   
//			   return answer;
	   
/*		솔루션2 : 솔루션1보다는 많이 성공했으나, 4개의 테스트케이스에서 여전히 실패 */
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
	   
	   /* 솔루션 3 : 그냥 BigInteger 써서 해결! */
	   // 근데 식 그대로 구현했더니 분모에서 틀려서
	   // 그냥 식 간편화해서 함 
	   // 식 : n! / (n-m)!*m! 인데 이걸 정리해보면 
	   // 분자는 n부터 m+1까지 곱한 값, 분모는 1부터 n-m까지 곱한 값이다
	   // 그대로 for문 돌려줘서 나누면 됨!
	   
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
   
   
   // 배열의 유사도
   // 문자열 배열 s1과 s2, 같은 원소의 개수 return
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
   
   
   // 자릿수 더하기
   // 정수 n의 각 자리 숫자의 합을 return
   public int solution33(int n) {
	   int answer = 0;
	   // n을 쪼갠 뒤 더하거나, 한 자리 수 씩 빼려면 10의 제곱으로 조금씩 나누어서 그 나머지를 더하는 방법 사용
	   
	   while (n > 0) {
		   answer += n%10;
		   n /= 10;
	   }
	   return answer;
   }
   
   
   // 문자열 안에 문자열
   // 문자열 str1 안에 str2 가 있으면 1, 아니면 2 return
   public int solution34(String str1, String str2) {
	   int answer = 0;
	   if(str1.contains(str2)) {
		   answer = 1;
	   } else {
		   answer = 2;
	   }
	   return answer;
   }
   
   
   // 주사위의 개수
   // 머쓱이는 직육면체의 상자를 갖고 있음 -> 상자의 가로, 세로, 높이가 저장된 배열 box
   // 이 상자 안에 최대한 많은 수의 주사위를 넣고 싶음 -> 주사위의 모서리 길이 n
   // 이때, 최대 개수 return
   public int solution35(int[] box, int n) {
	   int answer = 0;
	   answer = (box[0]/n)*(box[1]/n)*(box[2]/n); 
	   return answer;
   }
   
   
   // 합성수 찾기
   // 약수 개수가 3개 이상 -> 합성수
   // 자연수 n이 주어질 때, n 이하의 합성수의 개수 return
   public int solution36(int n) {
	   // 합성수란 곧 1과 자기자신 말고도 다른 애들로 나눠지는 애들을 말하는 건데......
	   // 약수 개수 카운트 후 그게 3개 이상이면 되게끔?
	   int answer = 0;
	   int[] arr = new int[n+1]; // arr[0] 부터 arr[n]까지 생성
	   for(int i = 1; i <= n; i++) {
		   for(int j = 1; j <= i; j++) {
			   if(i%j == 0) {
				   arr[i]++;
			   }
		   }
	   } // arr[1] 부터 arr[n]까지 각 약수의 개수 저장 
	   
	   for(int i = 1; i <= n; i++) {
		   if(arr[i] >= 3) {
			   answer++;
		   }
	   }
	   return answer;
   }
   
   
   // 팩토리얼
   // 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i 를 return
   // 조건 : i! <= n
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
	   // num == 1만 체크해줬을 때도 테스트 케이스 2번 실패. why? -> 2일 때도 고려해줘야 함
	   // So, 2일때도 넣어줬더니 완료됨 :)
	   
	   /* 다른 사람들이 while 문으로 해결한 방법 */
//	   int answer = 0;
//	   int num = 1;
//	   
//	   while (true) { // true일때 계속 수행
//		   if (num <= n) { // num 이 n보다 작거나 같다면
//			   num *= answer + 1; // num에 answer+1을 계속 곱해라 
//			   answer++; // 그리고 그때마다 answer는 그 다음 수가 됨.
//		   } else break; // 그리고 num이 n보다 커지면 스탑. (이땐 우리가 원하는 값보다 +1된 상태)
//	   }
//	   
//	   return answer-1; // 우리가 원하는 값보다 +1된 상태에서 스탑했으니 -1을 해줘야 함!
   }
   
   
   // 모음 제거
   // 문자열 my_string에서 a,e,i,o,u 를 제거한 문자열 return
   public String solution38(String my_string) {
	   String answer = "";
	   // 2가지 방법으로 해결 
	   // 솔루션 1 : replaceAll 쓰기 -> 이때 거르고자 하는 자리에 여러개의 문자열을 아래와 같이 사용할 수 있음
       answer = my_string.replaceAll("[aeiou]", "");
       								// "[a,e,i,o,u]" 로도 쓸 수 있다.
       // 솔루션 2 : replace 쓰기 -> 그냥 일일이 my_string.replace()해서 쓰는 방법
       //     answer = my_string.replace("a", "").replace("e", "").replace("i", "").replace("o","").replace("u","");
	   return answer;
   }
   
   
   // 문자열 정렬하기 (1)
   // 문자열 my_string 안에 있는 숫자를 오름차순으로 정렬하여 return
   public int[] solution39(String my_string) {	   
// 솔루션 1 : 이렇게 했더니 배열 길이때문에 에러남	   
	   String[] arr = {};
	   my_string = my_string.replaceAll("[abcdefghijklmnopqrstuvwxyz]", "");
	   									// 이거 [a-z,A-Z] 라고 표현해도 ok 
	   arr = my_string.split(""); // 하면 각 원소가 String인 배열 등장
	   int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            answer[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(answer);
	   return answer;
   }
   
   
   // 숨어있는 숫자의 덧셈 (1)
   // 문자열 my_string 안의 모든 자연수의 합 return
   public int solution40(String my_string) {
	   int answer = 0;
	   String[] arr = {};
	   arr = my_string.replaceAll("[a-z,A-Z]", "").split("");
	   for(int i = 0; i < arr.length; i++) {
		   answer += Integer.parseInt(arr[i]);
	   }
	   
	   return answer;
   }
   
   
   // 소인수분해
   // 소인수분해 : 어떤 수를 소수들의 곱으로 나타내는 것   예) 12는 2*2*3이므로 소인수로 2,3을 가짐 -> [2,3]
   // 자연수 n이 주어질 때 n의 소인수를 오름차순으로 담은 배열 return
   public int[] solution41(int n) {
	   HashSet<Integer> set = new HashSet<>();
	   // 바로 while문을 써버리니 메모리 초과됨. for문으로 감싸자
	   for(int i = 2; i <= n; i++) { // i가 n까지 도달해야 하니 i <= n
		   while (n != 1) {
			   if(n%i == 0) {
				   n /= i;
				   set.add(i);	   
			   } else { // else 로 i++을 처리하지 않아서 계속 도는 바람에 메모리 초과 상태 발생! 유의하자 ★★★
				   i++;
			   }
		   	}
	   }
	   int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
	   // 여기까지 했는데 테스트 13 번에서 실패. 찾아보니 정렬해줘야 된다고 함.
	   Arrays.sort(answer);
	   return answer;
	   
	   // 이렇게 했더니 다른 분의 풀이를 복붙했을 때 보다 시간이 배로 걸림. 
	   // 그분의 풀이를 참고하면서 iterator의 기능을 잘 파악해야 할듯.
	   // 아래는 그분의 풀이
// 솔루션 ★ : 다른 분의 풀이인데, 내 코드보다 훨씬 성능이 좋았음. 
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
	   
// 솔루션 1 : 이렇게 했더니 중복값이 제거되지 않아서 틀림. -> 검색해보니 애초에 중복을 허용하지 않는 HashSet등을 이용하라고 함!
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
   
   
   // 컨트롤 제트
   // 숫자와 Z가 공백으로 구분되어 있는 문자열 s
   // 문자열에 있는 숫자를 차례대로 더하되, Z 앞의 숫자는 제외
   // 숫자들의 합 return
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
	   
// 솔루션 1 : -일 때를 고려하지 않음
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
   
   
   
   // 중복된 문자 제거
   // 문자열 my_string이 주어질 때, 중복된 문자를 제거하고 그 중 하나만 남긴 문자열 return
   // 예 -> people 이면 peol만 반환
   // 이때, 공백도 문자로 구분함   예) We are the world -> We arthwold
   public String solution43(String my_string) {
	   String answer = "";
	   // 한 글자씩 중복 확인 후 넣기
	   for(int i = 0; i < my_string.length(); i++) {
		   if(answer.contains(my_string.substring(i, i+1)) == false) {
			   answer = answer + my_string.substring(i, i+1);
		   }
	   }
	   return answer;
	   
	   // 풀기는 했는데 테스트케이스에서 약 1.30 ~ 1.8ms 소요. 더 빠른 방법은 없을까?
	   // set이 중복을 허용하지 않는다는 특성을 이용해 푼 분의 풀이 발견. 약 0.3 ~ 0.8ms 소요
//       String[] answer = my_string.split("");
//       Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));
//
//       return String.join("", set);
   }
   
   
   
   // 가까운 수
   // 정수 배열 array, 정수 n 
   // array 안에 있는 정수 중 n과 가장 가까운 수를 return
   // 가까운 수가 여러 개라면 더 작은 수를 return
   public int solution44(int[] array, int n) {
	   int answer = 0;
	   int[] arr = new int[array.length]; // 각각 n과의 차이를 담을 배열
	   for(int i = 0; i < array.length; i++) {
		   arr[i] = Math.abs(n-array[i]);
	   }
	   Arrays.sort(arr);
	   // 이러면 가장 적은 차는 arr[0]이고, n과 그만큼 차이나는 수가 가장 가까운 수임
	   for (int i = 0 ; i < array.length; i++) {
		   
		   // 솔루션 1 : 테스트케이스 1번 실패
//		   if (array[i] == (n-arr[0])) { // n에서 해당 차를 뺀 수와 같다면
//			   answer = array[i];
//		   } else if (array[i] == (n+arr[0])) { // n에서 해당 차를 뺀 수는 아닌데, n에서 더한 수는 같다면
//			   answer = array[i];
//		   } else if (arr[0] == arr[1]) { 
//               answer = n-arr[0]; 
//               // 왜 이렇게 했더니 3번은 실패하고 4번은 통과한거야?
//               // 두 수가 같은 차이가 난다면 무조건 n보다 작은 애가 나와야 함.
//           } else if (array[i] == n) {
//               answer = n; 
//               // 이러면 3번은 통과. 3번은 n이 배열에 (2개 이상) 있는 경우인듯.
//               // 4번은 중복되는 경우였던 듯.
//               // 왜 1번은 계속 실패하지?
//           } 
	   }
	   return answer;   
   }
   
   
   
   // 369 게임
   // 머쓱이가 말해야 하는 숫자 order
   // 머쓱이가 쳐야 할 박수 횟수 return
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
   
   // 다른 사람의 풀이를 보니 10씩 나누어 한 자리씩 체크하는 경우도 있었음! 
//   while (order >= 1) {
//	   if(order % 10 == 3 || order % 10 == 6 || order % 10 == 9) {
//		   answer++;
//	   }
//	   order /= 10;
//   }
//   return answer;
   
   
   // 암호 해독
   // 암호화된 문자열 cipher, 그 문자열에서 code의 배수 번째 글자만 진짜 암호
   // 해독된 암호 문자열 return
   public String solution46(String cipher, int code) {
	   String answer = "";
	   for(int i = 1; i <= cipher.length()/code; i++) {
		   answer += cipher.charAt((i*code)-1);
	   }
	   return answer;
   }
   // 테스트케이스가 심한 경우는 11ms도 걸리던데 더 빠른 방법이 없을지 고민해봐야겠음
   
   
   
   // 대문자와 소문자
   // 문자열 my_string에서, 대문자는 -> 소문자로, 소문자는 -> 대문자로 변환해 return
   public String solution47(String my_string) {
	   String answer = "";
	   // 아직 아스키코드에 익숙하지 않으니 아스키코드로도 풀어보자 (솔루션2)
	   // 솔루션 1 : isUpperCase/ isLowerCase를 이용한 풀이
	   for(int i = 0; i < my_string.length(); i++) {
		   if(Character.isUpperCase(my_string.charAt(i))) {
			   answer += String.valueOf(my_string.charAt(i)).toLowerCase();
		   } else if (Character.isLowerCase(my_string.charAt(i))) {
			   answer += String.valueOf(my_string.charAt(i)).toUpperCase();			   
		   }
	   }
	   return answer;
	   
	   // 솔루션 2 : 아스키코드를 이용 -> 대문자는 65 ~ 90 / 소문자는 97 ~ 122 즉, 대소문자는 32씩 차이남
	   // 아스키코드를 이용해 풀었을 때 시간이 훨씬 오래 걸림 (약 11ms 정도 / 솔루션 1은 1.6 ~ 최대 6.6ms) 
//	   for (int i = 0; i < my_string.length(); i++) {
//		   if(my_string.charAt(i) >= 65 && my_string.charAt(i) <= 90) { // 즉, 해당 문자열이 대문자라면
//			    answer += (char)(my_string.charAt(i) + 32);
//		   } else if (my_string.charAt(i) >= 97 && my_string.charAt(i) <= 122) {
//			   answer += (char)(my_string.charAt(i) - 32);
//		   }
//	   }
//	   
//	   return answer;
   }
   
   
   
   // 영어가 싫어요
   // 영어로 표기되어 있는 숫자를 수로 바꿈 
   // numbers는 소문자로만 구성되어 있고, zero 부터 nine까지 공백없이 조합되어 있다
   // numbers를 정수로 바꾼 수 return
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
   
   
   
   // 인덱스 바꾸기
   // 문자열 my_string과 정수 num1, num2
   // my_string에서 인덱스 num1과 num2에 해당하는 문자열을 바꾼 문자열 return
   public String solution49(String my_string, int num1, int num2) {
	   String answer = "";
	   // [num1]에 있는 애, [num2]에 있는 애를 바꾸는 거니까 배열 이용
	   String[] array = my_string.split("");
	   // 솔루션 2 : 하나의 변수를 이용해 두개의 글자를 바꾸는 것
	   // -> 이거 자바 처음 배울때 배웠던 건데 완전 까먹고있었다, 바보바보! 
	   String temp = array[num1];
	   array[num1] = array[num2];
	   array[num2] = temp;
	   for(String str : array) { // 향상된 for문 -> 해당 배열에서 하나씩 뽑아서 쓴다는 소리!
		   answer+= str;
	   }
	   // 솔루션 1 : for문을 사용해서 바꾸기 
//	   for(int i = 0; i < array.length; i++) {
//		   if(i == num1) {
//			   answer = answer + str2;
//		   } else if (i == num2) {
//			   answer = answer + str1;
//		   } else {
//			   answer+= array[i];
//		   }
//	   }
	   
	   /* 유의 */
//	    array.toString(); // 이렇게 했더니 [Ljava.lang.String;@ea30797 으로 나옴
//		Arrays.toString(array); // 얘는 배열 자체를 문자열로 반환하는 거라 사용 X 

	   return answer;
   }
   
   
   
   // 한 번만 등장한 문자
   // 문자열 s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열 return
   // 만약, 한 번만 등장하는 문자가 없다면 빈 문자열을 return
   public String solution50(String s) {
	   String answer = "";
	   // 카운팅해서 cnt가 1인 애만 가져와 붙이는 게 나을 거 같음.
	   int[] cnt = new int[26];
	   // 소문자의 아스키 코드 : 97 ~ 122 , 알파벳 26개, 즉, 해당 문자의 아스키코드-97인 인덱스를 기준으로 cnt
	   // -> a는 cnt[0], b는 cnt[1] ..... z는 cnt[25]
	   for(int i = 0; i < s.length(); i++) {
		   cnt[s.charAt(i)-97]++;
	   } // 해서 각 글자 당 회수가 카운트되어 담기게 됨.
	   
	   for(int i = 0; i < cnt.length; i++) {
		   if(cnt[i] == 1) {
			   answer += (char)(i+97); // 해당 글자를 answer에다 넣어주자.
			   /* 여기서 매우 바보 같고 큰 실수 함 */
			   // 자꾸 String index out of range 오류가 뜨길래 왜 이럴까, 하고
			   // 구글링했더니 나랑 거의 비슷하게 푼 사람도 있었는데 그 사람 풀이는 됨.
			   // 왜일까....하고 보다보니 내가 여기에 바보같이 s.charAt(i)를 쓰고 있었음......
			   // 실행 테스트 케이스들의 경우 당연히 26보다 길이가 짧으니 될리가 있겠냐고요
			   // 실수하지 말자!
		   } 
	   }
	   return answer;
   }
   
   
   
   // 약수 구하기
   // 정수 n의 약수를 오름차순으로 담은 배열 return
   public int[] solution51(int n) {
       int[] arr = new int[10000]; // n이 1 이상 10000 미만의 정수이므로 크기는 10000
       int index = 0;
       for(int i = 1; i <= n; i++) {
		   if(n%i == 0) { // i 가 n의 약수라면
			   arr[index] = i; // arr에 해당 수를 넣고
              index++; // index를 1 증가시킨다. 
		   }
	   }
       int[] answer = new int[index]; // 그렇게 해서 주어진 크기의 배열 생성
       for(int i = 0; i < answer.length; i++){ 
               answer[i] = arr[i];  // answer 배열에 해당 값 넣기
       }
	   return answer;
	   /* 약수 구할 때 매번 배열 크기때문에 많이 헤매는데, n의 최대 범위만큼 생성해서 푸는 법을 기억하자! */
	   
	   
	   // ArrayList를 사용해서 풀어보고 싶었는데 실패함.
	   // 다른 분의 풀이 : stream을 이용
//       List<Integer> answer = new ArrayList<>();
//       for(int i=1; i<=n; i++){
//           if(n % i == 0){
//               answer.add(i);
//           }
//       }
//       return answer.stream().mapToInt(x -> x).toArray();
   }
   
   
   
   // 가장 큰 수 찾기
   // 정수 배열 array의 가장 큰 수와, 그 수의 인덱스를 담은 배열 return
   // array 내부에 중복된 수 X
   public int[] solution52(int[] array) {
	   int[] answer = new int[2];
	   int[] arr = Arrays.copyOf(array, array.length); // 그냥 array를 바로 오름차순 정렬하면 인덱스 못 구함
	   Arrays.sort(arr);
	   answer[0] = arr[arr.length-1];
	   for(int i = 0; i < array.length; i++) {
		   if(array[i] == answer[0]) {
			   answer[1] = i;
		   }
	   }

	   // 솔루션 1 : 테스트케이스 2번에서 실패. why?
//	   for(int i = 0; i < array.length; i++) {
//		   for(int j = 0; j < i; j++) {
//			   if(array[j] > array[i]) {
//				   answer[0] = array[j];
//				   answer[1] = j;
//			   }
//		   }
//	   }
	   
	   // 다른 사람의 풀이 -> 이 방법이 훨씬 더 간단한데 생각을 못했음! 
//	   for(int i = 0; i < array.length; i++) {
//		   if(array[i] > answer[0]) {
//			   answer[0] = array[i]; // 그냥 입력된 값 계속 덮어 씌우기
//			   answer[1] = i;
//		   }
//	   }
	   return answer;
   }
   
   
   
   // 문자열 계산하기
   // my_string은 문자열로 된 수식
   // 해당 수식을 계산한 값 return
   public int solution53(String my_string) {
	   String[] arr = my_string.split(" "); // 공백을 기준으로 띄어쓰기를 하면 공백 고려를 안해도 됨!
	   int answer = Integer.parseInt(arr[0]); // 우선 맨 첫번째 값을 answer에 저장
	   for(int i = 1; i < arr.length; i++) { // arr[1]부터 돌리면서 부호에 따라 가감해준다 
		   if(arr[i].equals("-")) {
			   answer -= Integer.parseInt(arr[i+1]);
		   } else if(arr[i].equals("+")) {
			   answer += Integer.parseInt(arr[i+1]);
		   }
	   }
	   return answer;
   }
} // 클래스의 끝


