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
   
   
   
   // 숫자 찾기
   // 정수 num과 k -> k가 몇 번째에 등장하는지 return
   public int solution54(int num, int k) {
	   int answer = 0;
	   String str = String.valueOf(num);
	   if(str.contains(String.valueOf(k))) {
		   answer = str.indexOf(String.valueOf(k))+1; // 인덱스 + 1 해줘야 함
	   } else {
		   answer = -1;
	   }
	   return answer;
   }
   
   
   
   // n의 배수 고르기
   // 정수 n, 정수 배열 numlist -> numlist에서 n의 배수가 아닌 수들을 제거한 배열 return (즉, n의 배수만 담아서 return)
   public int[] solution55(int n, int[] numlist) {
	   ArrayList<Integer> arr = new ArrayList<Integer>();
	   for(int i = 0; i < numlist.length; i++) {
		   if(numlist[i]%n == 0) {
			   arr.add(numlist[i]);
		   }
	   }
	   return arr.stream().mapToInt(Integer::intValue).toArray();
	   // 이렇게 해서 풀기는 했는데, 시간이 오래 걸리는 듯!
	   // 그냥 리스트로 한 다음에 이걸 int[] answer 에 넣는 게 훨씬 적게 걸리고 편한 듯! (다른 분의 풀이 참고)
	   // 솔루션 2 : 다른 분의 풀이
	//   ArrayList<Integer> List = new ArrayList<>();
	//   for(int i = 0;i < numlist.length; i++){
//	       if(numlist[i] % n == 0){
//	           List.add(numlist[i]);
//	   		}
//		 }
//	     int[] answer = new int[List.size()];
//	     for(int i = 0; i< List.size(); i++){
//	         answer[i] = List.get(i);
//	     }
	//   return answer;
   } 

   
   
   // OX 퀴즈
   // 덧셈, 뺄셈 수식들이 X [연산자] Y = Z 형태로 들어가 있는 문자열 배열 QUIZ
   // 수식이 옳으면 O, 틀리면 X를 순서대로 담은 배열 return
   public String[] solution56(String[] quiz) {
	   String[] answer = new String[quiz.length]; // O와 X를 담을 배열
	   String[] array = new String[quiz.length];
	   
	   for(int i = 0; i < answer.length; i++) {
		   array = quiz[i].split(" "); // 공백 기준으로 나누어서, answer의 요소 하나씩 저장 -> 즉, 한 수식씩 저장해서 볼 것 
		   if (array[1].equals("+")) { // 이러면 array[0] + array[2]
			   if(Integer.parseInt(array[0]) + Integer.parseInt(array[2]) == Integer.parseInt(array[4])) {
				   answer[i] = "O";
			   } else {
				   answer[i] = "X";
			   }
		   }
		   
		   if (array[1].equals("-")) {
			   if(Integer.parseInt(array[0]) - Integer.parseInt(array[2]) == Integer.parseInt(array[4])) {
				   answer[i] = "O";
			   } else {
				   answer[i] = "X";
			   }
		   }
	   }
	   
	   /* 솔루션 1 : 나름대로 고민 많이 해서 풀었는데, X 나 Y가 음수일 땐 생각을 아예 못했다. 이러면 수식이 꼬일 수 밖에 없다.
	    * 공백을 생각해서 trim()을 해줬는데, 그냥 공백을 기준으로 split() 해줘야 했다. */
//	   for(int i = 0; i < quiz.length; i++) {
//		   quiz[i].trim(); // 우선 공백을 다 빼줌
//		   // 정답을 비교해야하니 먼저 정답을 담자. 정답은 = 뒤에 있는 애들
//		   int rightnum = 0;
//		   int num = 0;
//		   if(quiz[i].contains("=-")) {
//			   rightnum = Integer.parseInt(quiz[i].substring(quiz[i].indexOf("-")+1, quiz[i].length()))*-1;
//		   } else {
//			   rightnum = Integer.parseInt(quiz[i].substring(quiz[i].indexOf("=")+1, quiz[i].length()));
//		   }
//		   if (quiz[i].contains("+")) {
//			   num = Integer.parseInt(quiz[i].charAt(0)+"") + Integer.parseInt(quiz[i].charAt(2)+"");
//		   } else {
//			   num = Integer.parseInt(quiz[i].charAt(0)+"") - Integer.parseInt(quiz[i].charAt(2)+"");
//		   }
//
//		   if(num == rightnum) {
//			   answer[i] = "O";
//		   } else {
//			   answer[i] = "X";
//		   }
//	   }
	   return answer;
   }
   
   
   
   // 제곱수 판별하기
   // 제곱수 : 어떤 자연수를 제곱했을 때 나오는 정수
   // 정수 n이 제곱수면 1, 아니면 2 return
   public int solution57(int n) {
	   int answer = 0;
	   int cnt = 0; // 제곱근 카운팅
	   for(int i = 1; i <= 1000; i++) { // n은 1,000,000 까지니까 가능한 수는 1000까지임.
		   if(i*i == n) {
			   cnt++;
			   answer = 1;
		   } 
	   }
	   if(cnt != 1) {
		   answer = 2;
	   }
	   
	   // 솔루션 1 : 내가 너무 쉽게 생각했나? 144가 자꾸 2로 나옴. 
	   // answer에 값 넣는게 아니라 그냥 바로 if문에서 return 되게 하면 해결 (근데 왜 144에서 2로 나오는거지)
//	   // n이 1부터 1000000 이하의 수이므로 1 ~ 1000 까지의 수 중 하나의 제곱수가 됨
//	   int limit = 1000;
//	   for(int i = 1; i <= limit; i++) {
//		   if(n == (i*i)) {
//			   answer = 1;
//		   } else if (n != (i*i)) {
//			   answer = 2;
//		   }
//	   }
	   // 아마도 이 경우 answer가 그 뒤에 2가 될 수 있어서 오류가 발생한 듯 하다.
	   // if 문에서 break 걸어주면 해결! ★★★ 
	   
	   // 내가 생각한 방법대로 풀이한 다른 분의 풀이
//	   for(int i = 0; i <= 1000; i++) {
//		   if(n == (i*i)) {
//			   return 1;
//		   }
//	   }
//	   return 2;
	   return answer;
   }
   
   
   
   // 세균 증식
   // 1시간에 2배 증가하는 세균.
   // 처음 세균의 마리 수 n, 경과 시간 t / n은 1이상 10이하, t는 1이상 15이하의 수
   // 예) 7마리가 1시간 뒤엔 14마리, 2시간 뒤엔 28마리, ... 15시간 뒤 229,376마리가 됨
   // t 시간 후 세균의 수 return
   public int solution58(int n, int t) {
	   int answer = n;
	   for(int i = 1; i <= t; i++) {
		   answer *= 2;
	   }
	   return answer;
   }
   
   
   
   // 문자열 정렬하기 (2)
   // 영어 대소문자로 이루어진 문자열 my_string
   // my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬해 return
   public String solution59(String my_string) {
	   String answer = "";
	   // 아스키코드 이용하는 방법 : 대문자는 65 ~ 90 / 소문자는 97 ~ 122 즉, 대소문자는 32씩 차이남
	   char[] array = my_string.toCharArray();
	   for(int i = 0; i < array.length; i++) {
		   if(array[i] >= 65 && array[i] <= 90) {
			   array[i] += 32;
		   }
	   }
	   Arrays.sort(array);
	   for(int i = 0; i < array.length; i++) {
		   answer += array[i];
	   }
	   return answer;
   }
   // 내가 푼 방법은 코드가 제법 길기도 하고, 시간이 너무 걸려서 다른 분들의 풀이를 참조했는데,
   // 그냥 죄다 toLowerCase() 해버려도 되는 거였다...
//   	char[] array = my_string.toLowerCase().toCharArray();
//   	Arrays.sort(array);
//   	return new String(array);
   // 그나저나 이렇게 선언해서 바로 return 할 수도 있구나. 새로운 방법!
   
   
   // 7의 개수
   // 정수배열 array에 7이 몇 개 들었는지 카운트해서 return
   // 예) [7, 77, 17] -> 4 출력
   public int solution60 (int[] array) {
       int answer = 0;
       // String으로 바꿔서 담은 다음, contains() 메서드를 이용해서 있으면 answer++ 되도록 하자.
       String[] arr = new String[array.length];
       for(int i = 0; i < array.length; i++){
           arr[i] = array[i]+ "";
       }
//       for(int i = 0; i < arr.length; i++){
//           if(arr[i].contains("7")){
//               answer++; // 이렇게 했더니 그냥 7있으면 카운팅이라, 77은 카운팅이 안됨.
//           }
//           // 그럼 차라리 7 있을 때마다 카운팅해서, 그때마다 걔를 없애고 다음 7을 판단하는 건 어떨까? 
//       }
       for(int i = 0; i < arr.length; i++) {
    	   String[] num = arr[i].split("");
    	   for(int j = 0; j < num.length; j++) {
    		   if(num[j].equals("7")) {
    			   answer++;
    		   }
    	   }
       }
       return answer;       // 약 5-6ms 소요
       // -> 왜 자꾸 이 방법을 생각하지 못할까? 그냥 위에서 고민했던 방법 --> 10 으로 나눠서 나머지가 7이면 answer++ 시키면 됐는데.
       // 해당 방법 풀이
//       for(int num : array) {
//           while (num != 0) {
//               if (num % 10 == 7) {
//                   answer++;
//               }
//               num /= 10;
//           }
//       }
//       return answer;
   }
   
   
   
   // 잘라서 배열로 저장하기
   // 문자열 my_str 과 n이 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열 return
   public String[] solution61(String my_str, int n) {
	   // answer[0]은 my_str의 0-5, answer[1]은 my_str의 6-11, answer[2]은 my_str의 12-17...
	   // 즉, i++ 일 때 [i*6]부터 6개 / i++ 일때 [i*3]부터 3개
	   // 근데 my_str.length()/n+1은 테스트1처럼 길이가 n의 배수가 아닐 때나 적용가능함. -> 올림 메서드 사용! 
	   // 반올림 : Math.round() - int / 올림 : Math.ceil() - double
	   // ★ 문제 -> 이때 (int)Math.ceil(my_str.length()/n))을 했는데도 예시 1번의 경우 자꾸 배열의 크기가 2가 됨. 
	   // -> 결국 원시적인 방법 사용
       int index = 0;
       if(my_str.length()%n == 0){
           index = my_str.length()/n;
       } else if (my_str.length()%n != 0){
           index = my_str.length()/n+1;
       }
	   String[] answer = new String[index];
	   for(int i = 0; i < answer.length; i++) {
		   if ((i+1)*n <= my_str.length()) {
			   answer[i] = my_str.substring((i*n),((i+1)*n));
		   } else if ((i+1)*n > my_str.length()) {
			   answer[i] = my_str.substring((i*n));
		   }
	   }
	   return answer;
   }
   
   
   
   // 직사각형 넓이 구하기
   // 직사각형 네 꼭짓점의 좌표가 담긴 배열 dots / [[x1,y1],[x2,y2],[x3,y3],[x4,y4]]
   // 직사각형의 넓이 return
   public int solution62(int[][] dots) {
	   int answer = 0;
	   // 직사각형이니까 x값이 같은 애들은 각각 세로, y값이 같은 애들은 각각 가로임
	   // 직사각형의 넓이 = 가로 길이 x 세로 길이
	   int width = 0; // 가로
	   int height = 0; // 세로
	   for(int i = 0; i < dots.length; i++) {
		   if(dots[0][1] == dots[i][1]) { // 가로 길이 = y값 같은 애들의 x값 차이
			   width = Math.abs(dots[i][0]-dots[0][0]);
		   }
		   if(dots[0][0] == dots[i][0]) { // 세로 길이 = x값 같은 애들의 y값 차이
			   height = Math.abs(dots[i][1]-dots[0][1]);
		   }
	   }
	   answer = width*height;
	   return answer;   
   }
   
   
   
   // 캐릭터의 좌표
   // 머쓱이는 RPG 게임중. UP, DOWN, LEFT, RIGHT -> 키 누르면 한 칸씩 그 방향으로 이동
   // 즉, up : [0,1], down : [0,-1], left : [-1,0], right : [1,0]
   // 머쓱이가 입력한 방향키의 배열 keyinput, 맵 크기 board
   // 모든 입력이 끝난 뒤의 좌표 return
   public int[] solution63(String[] keyinput, int[] board) {
	   int[] answer = {0,0}; // 캐릭터는 [0, 0]에서 시작
	   // keyinput에서 하나씩 빼서 up/down이면 answer[1]을 올리고/내리고, left/right면 answer[0]을 올리고/내리고
	   // board의 크기도 고려해야 함. [0,0] 이 정 중앙 -> 최대 board[0]/2, board[1]/2 까지만 이동 가능.
	   // 다른분 풀이 중 내가 생각한 방식과 가장 유사한 방법을 참고했는데, 알고보니 더 짧게 풀 수도 있었다. (아래 풀이 있음)
	   for(int i = 0; i < keyinput.length; i++) {
		   switch(keyinput[i]) {
		   case "up" :
			   answer[1]++;
			   break;
		   case "down" :
			   answer[1]--;
			   break;
		   case "left" :
			   answer[0]--;
			   break;
		   case "right" :
			   answer[0]++;
			   break;
		   }
		   if(Math.abs(answer[0]) > Math.abs(board[0]/2)) {
			   if(answer[0] < 0) {
				   answer[0]++;
			   } else {
				   answer[0]--;
			   }
		   } else if (Math.abs(answer[1]) > Math.abs(board[1]/2)) {
			   if(answer[1] < 0) {
				   answer[1]++;
			   } else {
				   answer[1]--;
			   }
		   }
	   } // for 끝
	   return answer;
	   
	   // 다른 분의 풀이 -> 애초에 if문으로 비교할 때 크기 비교도 하면 되는거였음!
//       int[] answer = {0, 0};
//      int width = board[0]/2;
//      int height = board[1]/2;
//      for(String input: keyinput) {
//          if(input.equals("up") &&  answer[1] < height) {
//              answer[1]++;
//          } else if (input.equals("down") && answer[1] > -height) {
//              answer[1]--;
//          }else if (input.equals("left") && answer[0] > -width) {
//              answer[0]--;
//          }else if (input.equals("right") && answer[0] < width) {
//              answer[0]++;
//          }
//      }
//
//      return answer;
   }
   
   
   
   // 최댓값 만들기 (2)
   // 정수 배열 numbers > 원소 중 두개를 곱해 만들 수 있는 최댓값 return
   // 예) [1,2,-3,4,-5] -> 15 
   public int solution64(int[] numbers) {
	   int answer = 0;
	   // 구글링해보니 훨씬 간단한 방법이 있었다. 그분의 풀이를 참조해서 푼 풀이!
       Arrays.sort(numbers);
       // 각각 음수 제일 작은거 2개, 양수 제일 큰거 2개 곱해보고 그 중 큰 값 return!
       int posMax = numbers[numbers.length-1]*numbers[numbers.length-2];
       int negMax = numbers[0]*numbers[1];
       if(posMax > negMax){
           answer = posMax;
       } else {
           answer = negMax;
       }
	   return answer;
	   
	   // 솔루션 1 : 무식하게 쭉쭉 써서 풀었는데 테스트케이스 7번에서 통과X. 알고보니, 모든 원소의 곱이 음수일 때
	   // 내 케이스의 경우 positive, negative에 0도 들어가 있어서 0이 제일 큰게 되기 때문이었다. 헝.....
//       int answer = 0;
//       int[] positive = new int[numbers.length];
//       int[] negative = new int[numbers.length];
//       // 양수끼리 곱하거나, 음수끼리 곱하게 해야함.
//       for(int i = 0; i < numbers.length; i++){
//           if(numbers[i] >= 0){
//               positive[i] = numbers[i];
//           } else if (numbers[i] < 0){
//               negative[i] = numbers[i];
//           }
//       }
//       Arrays.sort(positive);
//       Arrays.sort(negative);
//       int posMax = positive[positive.length-2]*positive[positive.length-1];
//       int negMax = negative[0]*negative[1];
//       if (posMax >= negMax){
//           answer = posMax;
//       } else if (posMax < negMax) {
//           answer = negMax;
//       }
//
//       return answer;
   }
   
   
   
   // 다항식 더하기
   // 다항식 : 한 개 이상의 합으로 이루어진 식 -> 동류항끼리 계산해 정리
   // 덧셈으로 이루어진 다항식 polynomial (문자열)
   // 예) 3x + 7 + x = 4x + 7 , x + x + x = 3x
   // 동류항끼리 더한 값을 return
   public String solution65(String polynomial) {
	   // 솔루션 1 : 이렇게 했더니 테스트케이스는 통과하는데, 채점 시 3번 케이스 빼고 전부 실패...
	   // 게다가 시간도 너무 오래 걸린다. 
	   // 질문게시판을 보니 계수가 두 자리 수 이상일 경우를 고려하지 않아서 생긴 오류인듯. charAt() 말고 subString() 사용!
	   // 계속 틀린 테스트케이스 생겨서 봤더니 x가 없을 경우도 고려해야 한다고 함.
	   String answer = "";
	   String[] arr = polynomial.split(" ");
	   int cnt = 0; // x
	   int sum = 0; // 상수 합
	   for(int i = 0; i < arr.length; i++) {
		   if(arr[i].contains("x") && !arr[i].equals("x")) {
			   cnt += Integer.valueOf(arr[i].substring(0, arr[i].length()-1));
		   } else if (arr[i].contains("x") && arr[i].equals("x")) {
			   cnt++;
		   } else if (!arr[i].equals("+")) { // 즉, 상수라면
			   sum += Integer.valueOf(arr[i]);
		   }
	   }
	   if(!polynomial.contains("x")) {
		   answer = sum + "";
	   } else {
		   if (sum != 0) {
			   if (cnt == 1) {
				   answer = "x + " + sum;
			   } else {
				   answer = cnt + "x + " + sum;
			   }
		   } else {
			   if (cnt == 1) {
				   answer = "x";
			   } else {
				   answer = cnt + "x";
			   }
		   }   
	   }
	   return answer;
   }
   
   
   
   // 숨어있는 숫자의 덧셈 (2)
   // my_string은 소문자, 대문자, 자연수로 구성
   // my_string 안의 자연수의 합을 return 
   // 이때, my_string 안의 자연수는 1 이상 1000 이하이고, 연속된 수는 하나의 숫자로 간주
   // 문자열에 자연수 없으면 0 return
   public int solution66(String my_string) {
	   int answer = 0;
	   my_string = my_string.replaceAll("[A-Z]", " ");
	   my_string = my_string.replaceAll("[a-z]", " ");
	   String[] arr = my_string.split(" ");
	   for(int i = 0; i < arr.length; i++) {
		   if(!arr[i].equals(" ") && !arr[i].equals("")) {
			   answer += Integer.parseInt(arr[i]);
		   } else {
               answer += 0;
           }
	   }
	   return answer;
	   
	   // 더 짧게 쓴 풀이
//	   String[] arr = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
//	   for(String str : arr) {
//		   if(!str.equals("")) {
//			   answer += Integer.parseInt(str);
//		   }
//	   }
//	   return answer;
   }
   
   
   
   // 삼각형의 완성조건 (2)
   // 선분 세 개로 삼각형을 만들기 위한 조건 -> 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 한다
   // 삼각형의 두 변의 길이가 담긴 배열 sides
   // 나머지 한 변이 될 수 있는 정수의 개수 return
   // 예) [1,2] -> 1 / [3,6] -> 5
   public int solution67(int[] sides) {
	   int answer = 0;
	   Arrays.sort(sides);
	   // 1) sides[1]이 가장 긴 변일 경우 -> sides[1] < sides[0] + i && i <= sides[1]
	   // 2) 자신이 가장 긴 변일 경우 ->  sides[1] < i && i < sides[0] + sides[1] 
	   // 처음에 감이 오지 않았는데 차근차근 정리해보고 감 잡음!
	   // 첫 채점 시 테스트케이스 7번 실패. why? -> 처음에 범위를 1000까지로 잡았는데, [x, 1000]일 경우 무조건 1000 이상이므로
	   // 범위를 최대인 [999, 1000]의 경우까지 잡아서 1999로 잡아주어야 함.
	   for(int i = 1; i <= 1999; i++) {
		   if(sides[1] < sides[0]+i && i <= sides[1]) {
			   answer++;
		   } else if (sides[1] < i && i < sides[0] + sides[1]) {
			   answer++;
		   }
	   }
	   return answer;
   }
   
   
   
   // 외계어 사전
   // spell 안에 든 모든 문자가 들어간 단어를 dic에서 찾고,
   // 있으면 1, 없으면 2 return
   public int solution68(String[] spell, String[] dic) {
	   int answer = 2; 
	   for(int i = 0; i < dic.length; i++) {
           int cnt = 0; // 얘 위치에 유의! 
		   for(int j = 0; j < spell.length; j++) {
			   if(dic[i].contains(spell[j])) {
				   cnt++;
			   }
		   }
           if(cnt == spell.length){
               answer = 1;
               break; // 전부 들어가면 그 뒤는 볼 필요도 없음 
           }
	   }
	   return answer;
   }
   
   
   
   // 문자열 출력하기
   // 입력된 문자열 출력
   public void solution69() {
	   Scanner sc = new Scanner(System.in);
       String a = sc.next();
       // Scanner.nextLine() 과 Scanner.next()의 차이 
       // nextLine() : 해당 줄을 모두 return
       // next() : 공백 전까지의 문자열을 return
       System.out.println(a);
       sc.close();
   }
   
   
   
   // a와 b 출력하기
   // 입력받은 정수 a와 b를 특정 형식에 따라 출력
   // a = a, b = b
   public void solution70() {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt(); // int를 입력받을 땐 nextInt()
       int b = sc.nextInt();

       System.out.println("a = " + a);
       System.out.print("b = " + b);
       sc.close(); // 입력 시 리소스를 사용하고, 사용이 끝나면 해제해줘야 함 (파일같은 경우 손상이 일어날 수 있음)
   }
   
   
   
   // 문자열 반복해서 출력하기
   // 입력받은 문자열 str이 n번 반복되어 출력되게 하기
   public void solution71() {
       Scanner sc = new Scanner(System.in);
       String str = sc.next(); // 공백 앞까지만 문자열 입력받음
       int n = sc.nextInt(); // 정수 입력받음
       for(int i = 0; i < n; i++){
           System.out.print(str);
       }
       sc.close();
   }
   
   
   
   // 대소문자 바꿔서 출력하기
   // 입력받은 문자열 str의 대소문자를 바꿔서 출력
   public void solution72() {
       Scanner sc = new Scanner(System.in);
       String a = sc.next();
       String answer = "";
       for(char ch : a.toCharArray()){
           if(ch >= 65 && ch <= 90){
               answer += (char)(ch + 32);
           } else if (ch >= 97){
               answer += (char)(ch - 32);
           }
       }
       System.out.println(answer);
       sc.close();
   }
   
   
   
   // 특수문자 출력하기
   public void solution73() {
       System.out.println("!@#$%^&*(" + "\\" + "\'" + "\"" + "<>?:;");
       // 이스케이프 문자 : 원래 의미를 탈출해, 특수한 기능을 하는 문자들
       // 앞에 백슬래시(\)를 붙이면 사용 가능
       // System.out.println("!@#$%^&*(\\\'\"<>?:;");
   }
   
   
   
   // 덧셈식 출력하기
   // 입력받은 정수 a, b의 덧셈식을 출력
   // a + b = c 
   public void solution74() {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = a+b;

       System.out.println(a + " + " + b + " = " + c);
       // printf의 출력서식을 이용한 풀이
       // System.out.printf("%d + %d = %d", a, b, c);
       sc.close();
   }
   
   
   
   // 문자열 붙여서 출력하기
   // 입력받은 str1, str2를 이어서 출력 (공백으로 나눠져서 입력받음) 예) apple pen
   public void solution75() {
       Scanner sc = new Scanner(System.in);
       String a = sc.next();
       String b = sc.next();
       System.out.println(a+b);
       // Scanner.next()의 특성 상 공백 앞까지만 문자열을 받으므로,
       // 굳이 추가적인 작업 없이 그대로 써주면 된다.
       sc.close();
   }
   
   
   
   // 문자열 돌리기
   // 입력받은 문자열을 가로 -> 세로로 바꿔서 출력
   public void solution76() {
       Scanner sc = new Scanner(System.in);
       String a = sc.next();
       for(int i = 0; i < a.length(); i++){
           System.out.println(a.charAt(i));
       }
       // toCharArray()를 이용한다면
       // for(char ch : a.toCharArray()){
       //     System.out.println(ch);
       // }
       sc.close();
   }
   
   
   
   // 홀짝 구분하기
   // 자연수 n이 입력으로 주어졌을 때 n이 짝수이면 " is even"을, 홀수면 " is odd" 을 붙여서 출력
   public void solution77() {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       if((n%2) == 0){
           System.out.println(n + " is even");
       } else {
           System.out.println(n + " is odd");
       }
       // if 식을 간단하게 해서 표현하면
       // System.out.println(n + " is " + ((n%2) == 0 ? "even" : "odd"));
       sc.close();
   }
   
   
   
   // 문자열 겹쳐쓰기
   // 문자열 my_string, overwrite_string과 정수 s
   // my_string의 s 인덱스부터 overwrite_string을 덮어쓰기
   // 예) "He11oWor1d", "lloWorl", 2 -> "HelloWorld"
   public String solution78(String my_string, String overwrite_string, int s) {
       String answer = "";
       String str1 = my_string.substring(0, s); // my_string[0]부터 my_string[s-1]까지 복사. 즉, 필요한 부분 앞까지 복사!
       answer = str1 + overwrite_string; // 해당 문구 붙이기
       int a = answer.length(); // 다시 뒷부분을 붙이기 위한 index
       String str2 = my_string.substring(a); // my_string[a]부터 다시 붙이기
       answer += str2;
       return answer;
   }
   
   
   
   // 문자열 섞기
   // 길이가 같은 두 문자열 str1, str2
   // 앞에서부터 번갈아가며 한번씩 등장하는 문자열 return
   public String solution79(String str1, String str2) {
       String answer = "";
       // split()을 이용해 배열로 나눠서 처리하는 방법도 있음!
       // String[] arr1 = str1.split("");
       // String[] arr2 = str2.split("");
       // for(int i = 0; i < str1.length(); i++) {
       //     answer += arr1[i] + arr2[i];
       // }
       for(int i = 0; i < str1.length(); i++){
           answer += str1.charAt(i);
           answer += str2.charAt(i);
       }
       return answer;
   }
   
   
   
   // 문자 리스트를 문자열로 변환하기
   // 문자 배열 arr의 원소들을 이어붙인 문자열 return
   public String solution80(String[] arr) {
       String answer = "";
       for(String str : arr){
           answer += str;
       }
       return answer;
   }
   
   
   
   // 문자열 곱하기
   // 문자열 my_string과 정수 k
   // my_string을 k번 반복한 문자열 return
   public String solution81(String my_string, int k) {
       String answer = "";
       for(int i = 0; i < k; i++){
           answer += my_string;
       }
       return answer;
   }
   
   
   
   // 더 크게 합치기
   // 연산 ⊕ -> 	두 정수를 붙여서 쓴 값 반환
   // a, b가 주어졌을 때 a ⊕ b 와 b ⊕ a 중 더 큰 값 return
   // a ⊕ b = b ⊕ a 의 경우 a ⊕ b 반환
   public int solution82(int a, int b) {
       int answer = 0;
       // a (+) b 보다 b (+) a 가 더 크면 그걸 return
       String strA = String.valueOf(a); // a + ""
       String strB = String.valueOf(b); 
       String str = strA + strB;
       String str2 = strB + strA;
       if(Integer.valueOf(str) >= Integer.valueOf(str2)){
           answer = Integer.valueOf(str);
       } else {
           answer = Integer.valueOf(str2);
       }
       return answer;
       // 다른 사람의 풀이인데 이게 훨씬 시간이 덜 걸림. why?
       // String으로 변환할 때 + "" 하는 것보다 String.valueOf()로 처리하는 게
       // 처리 시간이 더 빠름!
       // String strA = String.valueOf(a);
       // String strB = String.valueOf(b);
       // String strSum1 = strA + strB;
       // String strSum2 = strB + strA;
       // return Math.max(Integer.valueOf(strSum1), Integer.valueOf(strSum2));
   }
   
   
   
   // 공배수
   // 정수 number, n, m
   // number가 n과 m의 배수라면 1을, 아니면 0을 return
   public int solution83(int number, int n, int m) {
       int answer = 0;
       answer = number % n == 0 && number % m == 0 ? 1 : 0;
       return answer;
   }
   
   
   
   // 홀짝에 따라 다른 값 반환하기
   // 양의 정수 n이 홀수일 경우 n이하 홀수인 모든 양의 정수의 합 return
   // 양의 정수 n이 짝수일 경우 n이하 짝수인 모든 양의 정수의 제곱의 합 return
   public int solution84(int n) {
	   // 내가 처음에 접근한 방법인데 이렇게 어렵게 접근할 필요가 없었음!
//	   int answer = 0;
//       // n%2 == 1 -> n 이하 모든 홀수의 합
//       // n%2 == 0 -> n 이하 모든 짝수의 제곱의 합
//       int[] oddArr = new int[n/2+1];
//       int[] evenArr = new int[n/2+1];
//       if(n%2 == 1){
//           for(int i = 0; i <= n/2; i++){
//               oddArr[i] = 1 + (i*2);
//               answer += oddArr[i];
//           }
//       } else if (n%2 == 0){
//           for(int i = 0; i <= n/2; i++){
//               evenArr[i] = i*2;
//               answer += evenArr[i]*evenArr[i];
//           }
//       }
//       return answer;
       int answer = 0;
       if(n%2 == 1){
           for(int i = 1; i <= n; i+= 2){
               answer += i;
           }
       } else if (n%2 == 0){
           for(int i = 0; i <= n; i+= 2){
               answer += i*i;
           }
       }
       return answer;
   }
   
   
   
   // 조건 문자열
   // ineq는 > 또는 < , eq는 = 또는 !
   // n과 m이 ineq와 eq의 조건에 맞으면 1, 아니면 0 return
   public int solution85(String ineq, String eq, int n, int m) {
       int answer = 0;
       // 만약 eq = !라면 그냥 무시하고 진행하면 됨
       String simbol = "";
       simbol = eq.equals("!") ? ineq : ineq + eq; // 사실 이 부분 없어도 되지만 그럼녀 시간이 더 오래 걸림! (기호를 if문마다 check 해야하므로)
       if((n > m) && simbol.contains(">")){
           answer = 1;
       } else if ((n < m) && simbol.contains("<")){
           answer = 1;
       } else if ((n == m) && simbol.contains("=")) {
           answer = 1;
       } else {
           answer = 0;
       }
       return answer;
   }
   
   
   
   // flag에 따라 다른 값 변환하기
   // 두 정수 a,b 와 boolean인 flag
   // flag가 true면 a+b, 아니면 a-b 를 return
   public int solution86(int a, int b, boolean flag) {
       int answer = 0;
       answer = flag == true ? a + b : a - b;
       return answer;
   }
   
   
   
   // 코드 처리하기
   // 문자열 code -> 앞에서부터 읽으면서 문자가 1이면 mode 바꾸기
   // mode에 따라 code를 읽어가며 만든 문자열 ret을 return 
   // mode는 0과 1 -> idx를 1씩 키워가며 code[idx]의 값에 따라 행동
   public String solution87(String code) {
	   // 풀이법 1번 
       String ret = "";
       String[] codeArr = code.split(""); // split("") 
       int mode = 0;
       for(int idx = 0; idx < codeArr.length; idx++){
           if(mode == 0){
               if(codeArr[idx].equals("1")){
                   mode = 1;
               } else {
                   if(idx%2 == 0){
                       ret += codeArr[idx];
                   }
               }
           } else if (mode == 1) {
               if(codeArr[idx].equals("1")){
                   mode = 0;
               } else {
                   if(idx%2 == 1){
                       ret += codeArr[idx];
                   }
               }
           }
       }
       ret = ret.equals("")? ret + "EMPTY" : ret;
       return ret;
	   
	   // 풀이법 2번 
//	   String ret = "";
//	   int mode = 0;
//	   for(int idx = 0; idx < code.length(); idx++) {
//		   if(code.charAt(idx) == '1') {
//			   mode = 1 - mode; // 1을 만나면 mode가 변경
//		   } else {
//			   if(mode == 0 && idx%2 == 0) {
//				   ret += code.charAt(idx);
//			   } else if (mode == 1 && idx%2 == 1) {
//				   ret += code.charAt(idx);
//			   }
//		   }
//	   }
//	   return ret.equals("") ? "EMPTY" : ret;
   }
   
   
   
   // 등차수열의 특정한 항만 더하기
   // 두 정수 a, d와 길이가 n인 boolean인 배열 included
   // 첫째항이 a, 공차가 d인 등차수열에서 included가 true인 항들만 더한 값을 return
   public int solution88(int a, int d, boolean[] included) {
       int answer = 0;
       for(int i = 0; i < included.length; i++){
           if(included[i]){
               answer += a + i*d;
           }
       }
       return answer;
   }
   
   
   
   // 주사위 게임 2
   // 1-6까지 적힌 주사위 3개, 각각 굴려 나온 숫자 a,b,c
   // 세 숫자가 다 다르면 a+b+c, 둘은 같고 하나는 다르면 (a+b+c)*(a^2+b^2+c^2)
   // 세 숫자가 모두 같으면 (a+b+c)*(a^2+b^2+c^2)*(a^3+b^3+c^3) return
   public int solution89(int a, int b, int c) {
       int answer = 0;
       int num1 = a + b + c;
       int num2 = a*a + b*b + c*c;
       int num3 = a*a*a + b*b*b + c*c*c;
       if(a == b && b == c){
           answer = num1*num2*num3;
       } else if (a != b && a != c && b != c){
           answer = num1;
       } else {
           answer = num1*num2;
       }
       return answer;
   }
   
   
   
   // 원소들의 곱과 합
   public int solution90(int[] num_list) {
       int sum = 0; 
       int multiple = 1;
       for(int num : num_list){
           sum += num;
           multiple *= num;
       }
       return multiple < sum*sum ? 1 : 0;
   }
   
   
   
   // 이어 붙인 수
   // 정수가 담긴 리스트 num_list 의 홀수만 이어붙인 수와 짝수만 이어붙인 수의 합을 return
   public int solution91(int[] num_list) {
       int answer = 0;
       String even = "";
       String odd = "";
       for (int num : num_list){
           if(num%2 == 0){
               even += Integer.toString(num); // 바로 String으로 바꿔주는 toString을 활용하자
           } else {
               odd += Integer.toString(num);
           }
       }
       // 이게 시간이 오래 걸리는 이유 : num2, num3가 계속해서 생성되어 처리되기 때문
       // for(int num : num_list){
       //     if(num%2 == 0){
       //         String num2 = num + "";
       //         even += num2;
       //     } else {
       //         String num3 = num + "";
       //         odd += num3;
       //     }
       // }
       answer = Integer.parseInt(even) + Integer.parseInt(odd);
       return answer;
   }
   
   
   
   // 마지막 두 원소
   // 정수 리스트 num_list가 주어질 때, 마지막 원소가 그 전 원소보다 크면 마지막 원소 - 그 전 원소 값을 
   // 마지막 원소가 그 전 원소보다 작으면 마지막 원소*2한 값을 추가해 return
   public int[] solution92(int[] num_list) {
       int[] answer = new int[num_list.length+1];
       int length = num_list.length;
       for(int i = 0; i < length; i++){
           answer[i] = num_list[i];
       }
       answer[length] = num_list[length-1] > num_list[length-2] ? num_list[length-1] - num_list[length-2] : num_list[length-1]*2;
       // if(num_list[length-1] > num_list[length-2]){
       //     answer[length] = num_list[length-1] - num_list[length-2];
       // } else {
       //     answer[length] = num_list[length-1]*2;
       // }
       return answer;
   }
   
   
   
   // 수 조작하기 1
   // 정수 n과 문자열 control -> control은 "w", "s", "d", "a" 로 이루어져 있음
   // control 순서대로 n의 값을 바꿈 (n+1, n-1, n+10, n-10)
   public int solution93(int n, String control) {
       for(int i = 0; i < control.length(); i++){
           // 풀이법 2 : switch ~ case 를 이용한 방법
           switch(control.charAt(i)){
               case 'w' : n++; // 해당 조건값 : 실행식 break;
                   break;
               case 's' : n--;
                   break;
               case 'd' : n += 10;
                   break;
               default : n-= 10; // 조건에 아무것도 해당하지 않을 때 실행
                   break;
                   
           }
           
           // 풀이법 1 : if 문을 활용한 방법
           // if(control.charAt(i) == 'w'){
           //     n++;
           // } else if (control.charAt(i) == 's') {
           //     n--;
           // } else if (control.charAt(i) == 'd') {
           //     n = n+10;
           // } else {
           //     n = n-10;
           // }
       }
       return n;
   }
   
   
   
   // 수 조작하기 2
   // 정수 배열 numLog 
   // "w", "s", "d", "a"를 입력받아 순서대로 조작 (+1, -1, +10, -10)해 그 값을 기록한 배열
   // 즉, numLog[i]는 numLog[0]으로부터 총 i번 조작을 가한 결과값
   // numLog에 대해 조작을 위해 입력받은 문자열을 return
   public String solution94(int[] numLog) {
       String answer = "";
       // String은 덧셈연산이 되면 처리시간이 길어진다! Stringbuilder를 사용해보자
       StringBuilder str = new StringBuilder();
       for(int i = 1; i < numLog.length; i++){
           switch (numLog[i] - numLog[i-1]) {
               case 1 : str.append("w"); // answer += "w";
                   break;
               case -1 : str.append("s"); // answer += "s";
                   break;
               case 10 : str.append("d"); // answer += "d";
                   break;
               default : str.append("a"); // answer += "a";
                   break;
           }
       }
//        int[] diff = new int[numLog.length-1];
//        for(int i = 0; i < diff.length; i++){
//            diff[i] = numLog[i+1]-numLog[i];
//        }
//        for(int num : diff){
//            switch(num){
//                case 1 : answer += "w";
//                    break;
//                case -1 : answer += "s";
//                    break;
//                case 10 : answer += "d";
//                    break;
//                default : answer += "a";
//                    break;
                   
//            }
//        }
       answer = str.toString();
       return answer;
   }
   
   
   
   // 수열과 구간 쿼리 3
   // 정수 배열 arr, 2차원 정수 배열 queries
   // queries의 원소는 각 하나의 query이며, [i, j] 꼴
   // query마다 순서대로 arr[i]와 arr[j]의 값을 서로 교환 -> 해당 규칙에 따라 queries 를 처리한 뒤의 arr을 return
   public int[] solution95(int[]arr, int[][] queries) {
       // int[] answer = new int[arr.length];
       // queries 의 query -> [0,3]의 경우 arr[0]과 arr[3]을 서로 바꿔주란 소리
       for(int[] query : queries){
           int num = arr[query[0]];
           arr[query[0]] = arr[query[1]];
           arr[query[1]] = num;
       }
       return arr;
   }
   
   
   
   // 수열과 구간 쿼리 2
   // 정수 배열 arr, 2차원 정수 배열 queries
   // 각 query마다 순서대로 s <= i <= e인 모든 i에 대해 k보다 크며 가장 작은 arr[i] 찾기
   // 각 쿼리의 순서에 맞게 답을 저장한 배열 return
   public int[] solution96(int[] arr, int[][] queries) {
       int[] answer = new int[queries.length];
       Arrays.fill(answer, -1);
       for(int i = 0; i < queries.length; i++){
           for(int j = queries[i][0]; j <= queries[i][1]; j++){
               if(arr[j] > queries[i][2]){
                   if(answer[i] == -1 || answer[i] > arr[j]){ 
                       answer[i] = arr[j];
                       // 조건 1 : 맨 처음에 채웠던 값 (-1) 이 들어가 있거나
                       // 조건 2 : 기존에 있는 값이 비교하는 값보다 크다면
                       // 비교값을 넣어준다.
                       
                      // 문제 이해에 주의
                      // query[0] ~ query[1] 안의 값을 인덱스로 가진 arr들 중
                      // query[2] 보다 큰 애 중 가장 작은 애를 가져오는 거였음!
                   }
               }
           }
       }
       return answer;
   }
   
   
   
   // 수열과 구간 쿼리 4
   // 정수 배열 arr, 2차원 정수 배열 queries
   // 각 query는 [s, e, k] 꼴
   // 각 query마다 순서대로 s <= i <= e 인 모든 i에 대해 i가 k의 배수면 arr[i]에 1 더하기
   // 해당 규칙에 따라 처리한 배열 arr을 return
   public int[] solution97(int[] arr, int[][] queries) {
       for(int i = 0; i < queries.length; i++){
           int s = queries[i][0];
           int e = queries[i][1];
           int k = queries[i][2];
           for(int j = s; j <= e; j++){
               if(j%k == 0){
                   arr[j] += 1;
               }
           }
       }
       return arr;
   }
   
   
   
   // 배열 만들기 2
   // 정수 l과 r이 주어졌을 때, l ~ r 사이에서 숫자 "0" 과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열 return
   // 만약 없다면, -1이 담긴 배열 return
   public int[] solution98(int l, int r) {
       ArrayList<Integer> list = new ArrayList<>();
       String str = "";
       for(int i = l; i <= r; i++){
           str = String.valueOf(i);
           String word = str.replace("5", "").replace("0", "");
           if(word.equals("")){
               list.add(i);
           }
       }
       int[] answer = new int[list.size()];
       int[] ans = {-1};
       if(answer.length == 0){
           return ans;
       } else {
           for(int j = 0; j < answer.length; j++){
               answer[j] = list.get(j);
           }
           return answer;
       }
   }
   
   
   
   // 카운트 업
   // 정수 start와 end가 주어질 때, start - end 까지의 숫자를 담은 리스트 return
   public int[] solution99(int start, int end) {
       ArrayList<Integer> list = new ArrayList<>();
       for(int i = start; i <= end; i++){
           list.add(i);
       }
       int[] answer = new int[list.size()];
       for(int j = 0; j < list.size(); j++){
           answer[j] = list.get(j);
       }
//       int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
       // list.stream() : int값을 꺼내어 배열로 저장하기 위해 stream 이용
       // Stream<Integer> 형으로 반환됨
       // mapToInt(Integer::intValue) : Integer의 intValue()를 이용해 int로 변환
       // toArray() : 해당 원소를 배열로 반환
       
       
       // 풀이법 2 : 그냥 쉽게 start ~ end 사이의 모든 정수 반환이므로
       // int[] answer = new int[end - start + 1];
       // for (int i = 0; i < answer.length; i++) {
       // answer[i] = start;
       // start++;
       // }
       return answer;
   }
   
   
   
   // 콜라츠 수열 만들기
   public int[] solution100(int n) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(n);
       while(n != 1){
           if(n%2 == 0){
               n = n/2;
               list.add(n);
           } else {
               n = n*3 + 1;
               list.add(n);
           }
       }
       int[] answer = new int[list.size()];
       for(int i = 0; i < list.size(); i++){
           answer[i] = list.get(i);
       }
       return answer;
   }
   
   
   
   // 간단한 논리 연산
   public boolean solution101(boolean x1, boolean x2, boolean x3, boolean x4) {
       boolean answer = true;
       boolean b1 = (x1 == x2 && x1 == false) ? false : true;
       boolean b2 = (x3 == x4 && x3 == false) ? false : true;
       answer = (b1 == b2 && b1 == true) ? true : false;
       return answer;
       
       // 풀이법 2 : 더 쉽게 하는 법
       // boolean을 이용한다 = if 문 등이 훨씬 쉬워진다!
       // x 또는 y 둘 중 하나가 T면 (x||y) 하나라도 만족하는 것이므로 T가 되고
       // 둘 다 만족하지 않으면 F가 된다. (if문에서 ||로 조건 만족할 때를 생각)
       // 고로 b1 = (x1||x2) , b2 = (x3||x4)
       // 둘 다 T라면 T가 되고, 둘 중 하나라도 F면 F가 된다.
       // (if문에서 &&로 조건 만족할 때 생각)
       // b1 && b2 -> 즉, (x1||x2)&&(x3||x4) 
       
       // return (x1||x2)&&(x3||x4);
       
       
       // 논리합, 논리곱 개념을 이해하자!
       // x ∨ y → 논리합 (||) 둘 중 하나라도 T면 T
       // x ∧ y → 논리곱 (&&) 둘 다 T여야지만 T
   }
   
   
   
   // 배열 만들기 4
   public int[] solution102(int[] arr) {
       ArrayList<Integer> list = new ArrayList<>();
       int i = 0;
       while(i < arr.length){
           if(list.size() == 0 || list.get(list.size()-1) < arr[i]){
               list.add(arr[i]);
               i++;
               continue;
           } else if (list.get(list.size()-1) >= arr[i]){
               list.remove(list.size()-1);
               continue;
           }
       }
       // 풀이법 2 : 실행은 되는데, 테스트케이스 전부 실패 → 찾아보니 i가 실제로는 더 돌아가야 한다고 함! 
       // ArrayList<Integer> list = new ArrayList<>();
       // for(int i = 1; i < arr.length; i++){
       //     if(arr[i] > arr[i-1]){
       //         list.add(arr[i-1]);
       //     } else if (i == arr.length-1) {
       //         list.add(arr[i]);
       //     }
       // }
       // int[] stk = new int[list.size()];
       // for(int i = 0; i < stk.length; i++){
       //     stk[i] = list.get(i);
       // }
       
       // 풀이법 1: 왜 안될까
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i = 0; i < arr.length; i++){
//            if(list.size() == 0 || list.get(i) < arr[i]){
//                list.add(arr[i]);
//            } else if (list.get(i) >= arr[i]) {
//                list.remove(list.get(i));
//            }
//        }
       
//        int[] stk = new int[list.size()];
//        for(int i = 0; i < stk.length; i++){
//            stk[i] = list.get(i);
//        }
       int[] stk = new int[list.size()];
       for(int j = 0; j < stk.length; j++){
           stk[j] = list.get(j);
       }
       return stk;
   }
   
   
   
   // 주사위 게임 3
   public int solution103(int a, int b, int c, int d) {
       int answer = 0;    
       // a, b, c, d가 모두 같으면 1111*a
       if(a == b && a == c && a == d){
           answer = 1111*a;
       } 
       // 3개가 같고 1개가 다른 경우 -> (a,b,c), (a,b,d), (a,c,d), (b,c,d)
       else if (a == b && a == c && a != d) {
           answer = (int)Math.pow(10*a+d, 2);
       } else if (a == b && a == d && a != c) {
           answer = (int)Math.pow(10*a+c, 2);
       } else if (a == c && a == d && a != b) {
           answer = (int)Math.pow(10*a+b, 2);
       } else if (b == c && b == d && b != a) {
           answer = (int)Math.pow(10*b+a, 2);
       }
       // 2개씩 같고 그 값이 서로 다른 경우 -> (ab,cd), (ac,bd), (ad,bc)
       else if (a == b && c == d && a != c) {
           answer = (a + c)*Math.abs(a-c);
       } else if (a == c && b == d && a != b) {
           answer = (a + b)*Math.abs(a-b);
       } else if (a == d && b == c && a != b) {
           answer = (a + b)*Math.abs(a-b);
       }
       // 2개는 같고 2개는 다른 경우 -> (ab, c, d), (ac, b, d), (ad, b, c), (bc, a, d), (bd, a, c), (cd, a, b)
       else if (a == b && c != d) {
           answer = c*d;
       } else if (a == c && b != d) {
           answer = b*d;
       } else if (a == d && b != c) {
           answer = b*c;
       } else if (b == c && a != d) {
           answer = a*d;
       } else if (b == d && a != c) {
           answer = a*c;
       } else if (c == d && a != b) {
           answer = a*b;
       }
       // 모두 다른 경우 -> 가장 작은 숫자
       else {
           int min = 6;
           if(min > a){
               min = a;
           } 
           if (min > b) {
               min = b;
           }
           if (min > c) {
               min = c;
           }
           if (min > d) {
               min = d;
           }
           answer = min;
       }
       return answer;
       
       /* 다른 분의 풀이! 이렇게 하면 훨씬 간단하게 풀 수 있었다 :) 보고 이해하기 */
//        int[] dice = {a, b, c, d};
//        Arrays.sort(dice);

//        int ans = 0;

//        if (dice[0] == dice[3]) {
//            ans = 1111 * dice[3];
//        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
//            ans = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
//        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
//            ans = (dice[0] + dice[3]) * (dice[3] - dice[0]);
//        } else if (dice[0] == dice[1]) {
//            ans = dice[2] * dice[3];
//        } else if (dice[1] == dice[2]) {
//            ans = dice[0] * dice[3];
//        } else if (dice[2] == dice[3]) {
//            ans = dice[0] * dice[1];
//        } else {
//            ans = dice[0];
//        }

//        return ans;
   }
   
   
   // 글자 이어 붙여 문자열 만들기
   public String solution104(String my_string, int[] index_list) {
       StringBuffer sb = new StringBuffer();
       for(int index : index_list){
           sb.append(my_string.charAt(index)); 
           // StringBuffer는 += 가 아니라 append()임을 명심하자!
       }
       return sb.toString();
   }
   
   
   // 9로 나눈 나머지
   public int solution105(String number) {
       int answer = 0;
       int sum = 0;
       for(int i = 0; i < number.length(); i++){
           char ch = number.charAt(i);
           sum += Integer.parseInt(String.valueOf(ch));
           // 이럴 필요 없이 간단하게
           // 문자 '0'이 48임을 이용해서 풀었어도 됨!
           // sum += number.charAt(i) - '0';
           // charAt(i) - '0' : charAt(i) 하면 해당 글자에 맞는 정수값으로 나오게 됨, 이때 아스키코드로 48의 값을 갖는 문자형 '0'을 빼주어서 그 숫자가 그대로 나오게 하는 것! (숫자는 아스키코드로 1 이 49임)
       }
       return sum%9;
   }
   
   
   // 문자열 여러번 뒤집기
   public String solution106(String my_string, int[][] queries) {
       String answer = "";
       StringBuffer anstemp = new StringBuffer(my_string);
       for(int[] query : queries){
           StringBuffer temp1 = new StringBuffer(anstemp.substring(0, query[0]));
           StringBuffer sb = new StringBuffer(anstemp.substring(query[0], query[1]+1));
           sb.reverse(); // 뒤집어야 할 문자열들 뒤집어서 저장
           StringBuffer temp2 = new StringBuffer(anstemp.substring(query[1]+1));
           anstemp = temp1.append(sb).append(temp2);
       }
       answer = anstemp.toString();
       return answer;
   }
   
   
   // 배열 만들기 5
   public int[] solution107(String[] intStrs, int k, int s, int l) {
       ArrayList<Integer> list = new ArrayList<>();
       for(int i = 0; i < intStrs.length; i++){
           int temp = Integer.parseInt(intStrs[i].substring(s, s+l));
           if(temp > k){
               list.add(temp);
           }
       }
       int[] answer = new int[list.size()];
       for(int j = 0; j < list.size(); j++){
           answer[j] = list.get(j);
       }
       return answer;
   }
   
   
   // 부분 문자열 이어 붙여 문자열 만들기
   public String solution108(String[] my_strings, int[][] parts) {
       StringBuffer answer = new StringBuffer();
       for(int i = 0; i < my_strings.length; i++){
           answer.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
       }
       return answer.toString();
       // String answer = "";
       // for(int i = 0; i < my_strings.length; i++){
       //     String temp = my_strings[i].substring(parts[i][0], parts[i][1]+1);
       //     answer += temp;
       // }
       // return answer;
   }
   
   
   // 문자열의 뒤의 n글자
   public String solution109(String my_string, int n) {        
       // 배열 이용한 풀이
       // char[] arr = my_string.toCharArray();
       // for(int i = arr.length-n; i < arr.length; i++){
       //     answer.append(arr[i]);
       // }
       return my_string.substring(my_string.length()-n);
   }
   
  
   // 접미사 배열
   public String[] solution110(String my_string) {
       String[] answer = new String[my_string.length()];
       for(int i = 0; i < my_string.length(); i++){
           answer[i] = my_string.substring(i);
       }
       Arrays.sort(answer);
       // 처음 했던 풀이 -> 알고보니 Arrays.sort()하면 문자도 사전순으로 정렬됨!
       // ArrayList<String> list = new ArrayList<>();
       // for(int i = 0; i < my_string.length(); i++){
       //     list.add(my_string.substring(i));
       // }
       // Collections.sort(list);
       // String[] answer = list.toArray(new String[list.size()]);

       return answer;
   }
   
   
   // 접미사인지 확인하기
   public int solution111(String my_string, String is_suffix) {
       int answer = 0;
       String[] arr = new String[my_string.length()];
       for(int i = 0; i < arr.length; i++){
           arr[i] = my_string.substring(i);
           if(arr[i].equals(is_suffix)){
               answer = 1;
               break;
           } else {
               answer = 0;
           }
       }
       return answer;
       // String.endsWith() -> 특정 문자로 끝나는지 체크할 수 있는 메서드
       // String.startsWith() -> 특정 문자로 시작하는지 체크할 수 있는 메서드
       // return my_string.endsWith(is_suffix) ? 1 : 0;
   }
   
   
   // 문자열의 앞의 n 글자
   public String solution112(String my_string, int n) {
       String answer = my_string.substring(0, n);
       return answer;
   }
   
   
   // 접두사인지 확인하기
   public int solution113(String my_string, String is_prefix) {
       return my_string.startsWith(is_prefix) ? 1 : 0;
   }
   
   
   // 문자열 뒤집기
   public String solution114(String my_string, int s, int e) {
        String answer = "";
        String temp1 = my_string.substring(0, s);
        String temp2 = my_string.substring(e+1);
        StringBuffer sb = new StringBuffer(my_string.substring(s, e+1));
        String reversed = sb.reverse().toString();
        answer = temp1 + reversed + temp2;
        return answer;
       
       // * 다른 분의 풀이 참조 -> 더 간단하게 쓴다면
       // answer 자체를 StringBuffer로 선언해서 써보기
//       StringBuilder sb = new StringBuilder(my_string.substring(s, e+1));
//       return my_string.substring(0,s) + sb.reverse().toString() + my_string.substring(e+1);
   }
   
   
   // 세로 읽기
   public String solution115(String my_string, int m, int c) {
       StringBuilder sb = new StringBuilder();
       for(int i = 0; i < my_string.length()/m; i++){
           sb.append(my_string.charAt(i*m+c-1));
       }
       return sb.toString();
       
       // String answer = "";
       // for(int i = 0; i < my_string.length()/m; i++){
       //     answer += my_string.charAt(i*m+c-1);
       // }
       // return answer;
   }
   
   
   // qr code
   public String solution116(int q, int r, String code) {
       // String answer = "";
       // for(int i = 0; i < code.length(); i++){
       //     if(i%q == r){
       //         answer += code.charAt(i);
       //     }
       // }
       // return answer;
       StringBuilder sb = new StringBuilder();
       for(int i = 0; i < code.length(); i++){
           if(i%q == r){
               sb.append(code.charAt(i));
           }
       }
       return sb.toString();
   }
   
   
   // 문자 개수 세기
   public int[] solution117(String my_string) {
       int[] answer = new int[52];
       // 해당 아스키코드가 있으면 해당 카운트가 증가하게 만들자
       // 대문자 : 65-90 / 소문자 : 97 - 122
       for(int i = 0; i < my_string.length(); i++){
           if(my_string.charAt(i) >= 65 && my_string.charAt(i) <= 90){ // 대문자의 경우
               answer[my_string.charAt(i) - 65]++;
           } else if (my_string.charAt(i) >= 97 && my_string.charAt(i) <= 122) { // 소문자의 경우
               answer[my_string.charAt(i) - 71]++; 
               // WHY 71? 
               // -> 97 (A)의 경우 answer[26]에 카운팅 되어야하므로 72 (65+7) 가 아닌 71!
           } 
       }
       return answer;
   }
   
   
   // 배열 만들기 1
   public int[] solution118(int n, int k) {
       // 내 풀이
       // 내가 너무 어렵게 생각했음! 다른 분의 풀이를 참조해서 더 쉬운 방법으로 해결
       // ArrayList<Integer> list = new ArrayList<>();
       // for(int i = 1; i <= n; i++){
       //     if(i%k == 0){
       //         list.add(i);
       //     }
       // }
       // int[] answer = new int[list.size()];
       // for(int j = 0; j < answer.length; j++){
       //     answer[j] = list.get(j);
       // }
       // return answer;
       
       // 다른 분의 풀이
       int[] answer = new int[n/k];
       for(int i = 1; i <= n/k; i++){
           answer[i-1] = i*k;
       }
       return answer;
   }
   
   
   // 글자 지우기
   public String solution119(String my_string, int[] indices) {   
       Arrays.sort(indices);
       StringBuilder sb = new StringBuilder(my_string);
       for(int i : indices){
           sb.replace(i, i+1, "0");
       }
       
       String answer = sb.toString();

       // 실행 결과 : pororapemep WHY? -> 중간에 변경되면서 인덱스가 바뀌어서 그럼!
       // StringBuilder sb = new StringBuilder(my_string);
       // for(int i = 0; i < indices.length; i++){
       //     sb.deleteCharAt(indices[i]);
       // }
       return answer.replace("0", "");
   }
   
   
   // 카운트 다운
   public int[] solution120(int start, int end) {
       int[] answer = new int[start-end+1];
       int num = 0;
       for(int i = start; i >= end; i--){
           answer[num] = i;
           num++;
       }
       return answer;
   }
   
   
   // 가까운 1 찾기
   public int solution121(int[] arr, int idx) {
       int answer = -1;
       for(int i = idx; i < arr.length; i++){
           // answer = arr[i] == 1 ? i : -1; 
           // 이렇게 했더니 테스트 3번 오류. WHY? 
           // 그 다음 원소까지 돌기 때문에 다시 -1이 됨
           if(arr[i] == 1){
               answer = i;
               break;
           }
       }
       return answer;
   }
   
   
   // 리스트 자르기
   public int[] solution122(int n, int[] slicer, int[] num_list) {
       ArrayList<Integer> list = new ArrayList<>();
       int a = slicer[0];
       int b = slicer[1];
       int c = slicer[2];
       switch (n) {
           case 1 : 
               for(int i = 0; i < b+1; i++){
                   list.add(num_list[i]);
               }
               break;
           case 2 : 
               for(int i = a; i < num_list.length; i++) {
                   list.add(num_list[i]);
               }
               break;
           case 3 : 
               for(int i = a; i < b+1; i++){
                   list.add(num_list[i]);
               }
               break;
           default :
               for(int i = a; i < b+1; i = i+c){ // 증감식 헷갈려하지 말기! 
                   list.add(num_list[i]);
               }
               break;
       }
       
       int[] answer = new int[list.size()];
       for(int i = 0; i < answer.length; i++){
           answer[i] = list.get(i);
       }
       
       return answer;
   }
   
   
   // 첫 번째로 나오는 음수
   public int solution123(int[] num_list) {
       int answer = -1;
       for(int i = 0; i < num_list.length; i++){
           if(num_list[i] < 0){
               answer = i;
               break;
           }
       }
       return answer;
       
       // 더 쉬운 방법 : 바로 return되게 하기
       // for(int i = 0 ; i < num_list.length; i++){
       //     if(num_list[i] < 0){
       //         return i;
       //     }
       // }
       // return -1;
   }
   
   
   // 배열 만들기 3 
   public int[] solution124(int[] arr, int[][] intervals) {
       // a1, b1, a2, b2
       int a1 = intervals[0][0];
       int b1 = intervals[0][1];
       int a2 = intervals[1][0];
       int b2 = intervals[1][1];
       int n = b1-a1+1+b2-a2+1; // answer의 길이
       int[] answer = new int[n];
       
       int[] arr1 = Arrays.copyOfRange(arr, a1, b1+1); // intervals[0]
       int[] arr2 = Arrays.copyOfRange(arr, a2, b2+1); // intervals[1]  
       
       // for(int i = 0; i < arr1.length; i++){
       //     answer[i] = arr1[i];
       // }
       // for(int j = arr1.length; j < answer.length; j++){
       //     answer[j] = arr2[j-arr1.length];            
       // }
       
//        // System.arraycopy를 활용한 방법 -> 이게 훨씬 시간이 덜 걸림!
//        // Arrays.copyOf(), Arrays.copyOfRange(), System.arraycopy()의 차이를 알아둘 것
       System.arraycopy(arr1, 0, answer, 0, arr1.length);
       System.arraycopy(arr2, 0, answer, arr1.length, arr2.length);
       
       return answer;
   }
   
   
   // 2의 영역
   public int[] solution125(int[] arr) {
       // 2 처음 나오는 인덱스 체크 -> 2가 나오는 마지막 인덱스 체크
       // 그만큼 copy 
       int start = -1; // 맨 처음 나오는 2의 인덱스
       int end = -1; // 맨 마지막에 나오는 2의 인덱스
       for(int i = 0; i < arr.length; i++){
           if(arr[i] == 2 && start == -1){
               start = i;
           } else if (arr[i] == 2 && start != -1) {
               end = i;
           } 
           // 이렇게만 하면 1개만 있을 때나, 2가 없을때엔 다른 값이 나오게 됨 (0번 인덱스를 복사)
           // 찾아보니 맨 처음에 start와 end를 인덱스가 나올 수 없는 다른 수로 만듬. (-1로 설정)
       }
       if(start == -1){
           int[] answer2 = {-1};
           return answer2;
       } else if (start != -1 && end == -1) {
           int[] answer3 = Arrays.copyOfRange(arr, start, start+1);
           return answer3;
       }
       int[] answer = Arrays.copyOfRange(arr, start, end+1);
       return answer;
   }
   
   
   // 배열 조각하기
   public int[] solution126(int[] arr, int[] query) {
       /* 풀이법  : 다른 분의 풀이 참고 */
       for(int i = 0; i < query.length; i++){
           if(i%2 == 0){
               arr = Arrays.copyOfRange(arr, 0, query[i]+1);
               // Arrays.copyOfRange(array, startIndex, endIndex) :
               // 복사할 배열의 길이가 endIndex보다 작을 경우 원본 배열의 마지막 인덱스 이후의 값은 배열의 타입 기본값으로 초기화되어 copy! 
               // 예) int[] array = {1,2,3,4,5};
               // arr = Arrays.copyOfRange(array, 4, 6); -> {5, 0};
               // startIndex가 복사할 배열의 길이보다 크면 exception 발생!
           } else {
               arr = Arrays.copyOfRange(arr, query[i], arr.length);
           }
       }
       return arr;
   }
   
   
   // n 번째 원소부터
   public int[] solution127(int[] num_list, int n) {
       int[] answer = Arrays.copyOfRange(num_list, n-1, num_list.length);
       return answer;
   }
   
   
   // 순서 바꾸기
   public int[] solution128(int[] num_list, int n) {    
       int[] answer = new int[num_list.length];
       int[] end = Arrays.copyOfRange(num_list, 0, n); // n번째까지의 원소
       int[] front = Arrays.copyOfRange(num_list, n, num_list.length); // n번째 이후의 원소
       System.arraycopy(front, 0, answer, 0, front.length);
       System.arraycopy(end, 0, answer, front.length, end.length);
       // System.arraycopy(복사할 배열, 복사할 배열의 시작 인덱스, 복사해서 넣을 배열, 복사해 넣을 배열의 시작 인덱스 (해당 배열의 어느 인덱스서부터 붙여넣을 것인가), 복사할 원소의 개수)
       // 리턴 타입 없음! 
       return answer;
       
       // 보고 감탄했던 다른 분의 풀이
       // int length = num_list.length;
       // for(int i = 0; i < n; i++){
       //     answer[i] = num_list[(i+n)%length];
       // --> 나머지를 이용해서 푸는 방법인데, 보고 진짜 감탄함!
       // i+n : n번째 원소부터 카운팅
       // % length : 인덱스는 어차피 length보다 클 수 없기때문에 나눠서, 필요한만큼 넣을 수 있음!
       // }
       // return answer;
   }
   
   
   // 왼쪽 오른쪽
   public String[] solution129(String[] str_list) {
       int check = 0;
       // check 안쓰고 그냥 바로 return하면 더 편함!
       for(int i = 0; i < str_list.length; i++){
           if(str_list[i].equals("l")){
               str_list = Arrays.copyOfRange(str_list, 0, i);
               check = 1;
               break;
           } else if (str_list[i].equals("r")) {
               str_list = Arrays.copyOfRange(str_list, i+1, str_list.length);
               check = 1;
               break;
           } 
       }
       if (check == 1) {
           return str_list;
       } else {
           return new String[0];
       }
   }

   
   // n 번째 원소까지
   public int[] solution130(int[] num_list, int n) {
       return Arrays.copyOfRange(num_list, 0, n);
   }
   
   
   // n개 간격의 원소들
   public int[] solution131(int[] num_list, int n) {        
       ArrayList<Integer> list = new ArrayList<>();
       for(int i = 0; i < num_list.length; i += n) {
           list.add(num_list[i]);
       }
       
       int[] answer = new int[list.size()];
       for(int i =0; i < answer.length; i++){
           answer[i] = list.get(i);
       }
       return answer;
   }
   
   
   // 홀수 vs 짝수
   public int solution132(int[] num_list) {
       // 실제로는 인덱스 0, 2, 4 얘네들이 홀수번째 원소
       // 실제로는 인덱스 1, 3, 5 얘네들이 짝수번째 원소
       int even = 0;
       int odd = 0;
       for(int i = 0; i < num_list.length; i++){
           if(i%2 == 0){
               odd += num_list[i];
           } else {
               even += num_list[i];
           }
       }
       
       return even >= odd ? even : odd;
   }
   
   
   // 5명씩
   public String[] solution133(String[] names) {
       int length = names.length%5 == 0 ? names.length/5 : names.length/5 + 1;
       String[] answer = new String[length];
       for(int i = 0; i < length; i++){
           answer[i] = names[i*5];
       }
       return answer;
   }
   
   
   // 할 일 목록
   public String[] solution134(String[] todo_list, boolean[] finished) {
       ArrayList<String> list = new ArrayList<>();
       for(int i = 0; i < finished.length; i++){
           if(!finished[i]){
               list.add(todo_list[i]);
           }
       }

       String[] answer = new String[list.size()];
       for(int i = 0; i < answer.length; i++){
           answer[i] = list.get(i);
       }
       return answer;
   }
   
   
   // n보다 커질 때까지 더하기
   public int solution135(int[] numbers, int n) {
       int answer = 0;
       for(int num : numbers){
           answer += num;
           if (answer > n){
               break;
           }
       }
       return answer;
   }
   
   
   // 수열과 구간 쿼리 1
   public int[] solution136(int[] arr, int[][] queries) {
       for(int[] query : queries){
           for(int i = query[0]; i < query[1]+1; i++){
               arr[i] += 1;
           }
       }
       return arr;
   }
   
   
   // 조건에 맞게 수열 변환하기 1
   public int[] solution137(int[] arr) {
       for(int i = 0; i < arr.length; i++){
           if(arr[i] >= 50 && arr[i]%2 == 0) {
               arr[i] = arr[i]/2;
           } else if (arr[i] < 50 && arr[i]%2 == 1) {
               arr[i] = arr[i]*2;
           } 
       }
       return arr;
   }
   
   
   // 조건에 맞게 수열 변환하기 2
   public int solution138(int[] arr) {
       // arr[i] >= 50 && arr[i]%2 == 0 -> arr[i] = arr[i]/2
       // arr[i] < 50 && arr[i]%2 == 1 -> arr[i] = arr[i]*2+1
       // x번 반복했을 때와 x+1번 반복했을 때가 같은 값일때. 즉, 위의 조건들을 모두 만족하지 않을 때
       // 해당 x 리턴
       int answer = 0; // x값
       for(int i = 0; i < 100000; i++){
           int[] copyarr = Arrays.copyOf(arr, arr.length);
           for(int j = 0; j < arr.length; j++){
               if(arr[j] >= 50 && arr[j]%2 == 0){
                   arr[j] = arr[j]/2;
               } else if (arr[j] < 50 && arr[j]%2 == 1){
                   arr[j] = arr[j]*2+1;
               }
           } // for문 돌려 조건에 맞는 원소 변경
           answer++;
           if(Arrays.equals(arr, copyarr)){
               return answer-1;
           }
       }
       return answer;
   }
   
   
   // 1로 만들기
   public int solution139(int[] num_list) {
       // num%2 == 0 -> num/2
       // num%2 == 1 -> num-1/2 
       // num_list의 원소가 전부 1일때 연산 횟수 return
       int answer = 0; // 카운트 될 횟수
       for(int num : num_list){
           while (num != 1) {
               num = num/2; // 나머지 관계없이 몫을 계속 나누다보면 되니 그대로 카운트!
               answer++;
           }
       }
       return answer;
   }
   
   
   // 길이에 따른 연산
   public int solution140(int[] num_list) {
       // num_list.length >= 11 -> 모든 합
       // num_list.length < 10 -> 모든 곱 
       int answer = 1;
       if(num_list.length >= 11){
           for(int num : num_list){
               answer += num;
           }
           return answer-1;
       } else {
           for(int num : num_list){
               answer *= num;
           }
           return answer;
       }
   }
   
   
   // 원하는 문자열 찾기
   public int solution141(String myString, String pat) {      
       myString = myString.toLowerCase();
       pat = pat.toLowerCase();
       if(myString.contains(pat)){
           return 1;
       } 
       return 0;
       
       // /* 이렇게 했더니 테스트 케이스 2번, 5번 실패. WHY? */
       // // i가 myString.length() - pat.length() 까지 와야하므로 < 가 아닌 <= 가 와야했음!
       // contains() 메서드를 제때 떠올리지 못해서 어렵게 돌아갔다!
       // for(int i = 0; i <= myString.length()-pat.length(); i++){
       //     String str = myString.substring(i, i+pat.length()); // i번부터 pat.length(); 
       //     if(str.equalsIgnoreCase(pat)){
       //         // String.equalsIgnoreCase(str) : 알파벳 대소문자를 무시하고 동일한지 체크하는 메서드
       //         return 1;
       //     } 
       // }
       // return 0;
   }
   
   
   // 대문자로 바꾸기
   public String solution142(String myString) {
       myString = myString.toUpperCase();
       return myString;
   }
   
   
   // 소문자로 바꾸기
   public String solution143(String myString) {
       return myString.toLowerCase();
   }
   
   
   // 배열에서 문자열 대소문자 변환하기
   public String[] solution144(String[] strArr) {
       for(int i = 0; i < strArr.length; i++){
           if(i%2 == 0){
               strArr[i] = strArr[i].toLowerCase();
           } else {
               strArr[i] = strArr[i].toUpperCase();
           }
           // 삼항연산자로 더 편하게 쓸 수 있음
           // strArr[i] = i%2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
       }
       return strArr;
   }
   
   
   // A 강조하기
   public String solution145(String myString) {   
       StringBuilder sb = new StringBuilder();
       for(int i = 0; i < myString.length(); i++){
           if(myString.charAt(i) >= 65 && myString.charAt(i) < 91 && myString.charAt(i) != 'A'){
               sb.append((char)(myString.charAt(i) + 32));
           } else if (myString.charAt(i) == 'a') {
               sb.append("A");
           } else {
               sb.append(myString.charAt(i));
           }
       }
       return sb.toString();
       /* 풀이법 1 : String을 이용한 풀이 (시간 오래 걸림) */
       // String answer = "";
       // for(int i = 0; i < myString.length(); i++){
       //     if(myString.charAt(i) == 'a'){
       //         answer += "A";
       //     } else if (myString.charAt(i) >= 65 && myString.charAt(i) < 91 && myString.charAt(i) != 'A') { 
       //         answer += (char)(myString.charAt(i) + 32);
       //         // 아스키코드로 대소문자는 32 차이 (65 - 90 / 97 - 122)
       //         // 계속 숫자로만 떠서 봤더니 charAt() + int = int형으로 나오므로
       //         // 앞에 (char)로 형변환해줘야 했음!
       //     } else {
       //         answer += myString.charAt(i);
       //     }
       // }
       // return answer;
       
       /* 풀이법 2 : 다른 사람의 풀이 참고 */
       // 문제를 생각해보면 전부 소문자로 먼저 바꾼 다음, a만 A로 바꾸면 됨!
       // myString = myString.toLowerCase();
       // return myString.replaceAll("a", "A");
       
       /* replace, replaceAll 메서드 */
       // String.replace(String a, String b) : a를 b로 치환
       // String.replaceAll(String a, String b) : a를 b로 치환
       // 차이점 : replaceAll()은 '정규표현식' 을 매개변수로 가질 수 있다.
   }
   
   
   // 특정한 문자를 대문자로 바꾸기
   public String solution146(String my_string, String alp) {
       StringBuilder sb = new StringBuilder();
       for(int i = 0; i < my_string.length(); i++){
           if(my_string.charAt(i) == alp.charAt(0)){
               sb.append((char)(my_string.charAt(i) -32));
           } else {
               sb.append(my_string.charAt(i));
           }
       }
       return sb.toString();
       
       /* 풀이법 2 : 다른 사람의 풀이 - replaceAll() */
       // return my_string.replaceAll(alp, alp.toUpperCase());
   }
   
   
   // 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
   public String solution147(String myString, String pat) {
       // 내 풀이법 1 : 그대로 for문 돌려서 사용
       int idx = 0;
       for(int i = 0; i <= myString.length()-pat.length(); i++){
           if(myString.substring(i, i+pat.length()).equals(pat)){
               idx = i+pat.length();
           }
       }
       return myString.substring(0, idx);
       
       /* 다른 분의 풀이법 : lastIndexOf() 메서드 사용 */
       // indexOf() -> "앞"에서부터 특정 문자/문자열을 찾아 "처음 발견되는" 인덱스 반환
       // 없으면 -1 반환 
       // lastIndexOf() -> "뒤"에서부터 특정 문자/문자열을 찾아 "처음 발견되는" 인덱스 반환
       // 없으면 -1 반환
       // int idx = myString.lastIndexOf(pat); // 해당 문자열의 맨 앞 인덱스 반환임!
       // return myString.substring(0, idx + pat.length());
   }
   
   
   // 문자열이 몇 번 등장하는지 세기
   public int solution148(String myString, String pat) {
       int answer = 0;
       for(int i = 0; i <= myString.length()-pat.length(); i++){
           if(myString.substring(i, i+pat.length()).equals(pat)){
               answer++;
           }
       }
       return answer;
   }
   
   
   // ad 제거하기
   public String[] solution149(String[] strArr) {
       ArrayList<String> list = new ArrayList<>();
       for(int i = 0; i < strArr.length; i++){
           if(!strArr[i].contains("ad")){
               list.add(strArr[i]);
           }
       }
       return list.toArray(new String[list.size()]);
       // toArray() 메서드 사용 시 매개변수에 사용할 배열을 꼭 넣어줘야함
   }
   
   
   // 공백으로 구분하기 1
   public String[] solution150(String my_string) {
       String[] answer = my_string.split(" ");
       return answer;
   }
   
   
   // 공백으로 구분하기 2
   public String[] solution151(String my_string) {
       ArrayList<String> list = new ArrayList<>();
       String[] arr = my_string.split(" ");
       for(int i = 0; i < arr.length; i++){
           if(!arr[i].equals("")){
               list.add(arr[i]);
           }
       }
       
       return list.toArray(new String[list.size()]);
       
       // 풀이법 2 : 정규표현식을 이용한 방법 
       // my_String = my_String.trim();
       // return my_String.split(" +");
   }
   
   
   // x 사이의 개수
   public int[] solution152(String myString) {
       String[] arr = myString.split("x", -1);
       // split(String regex, int limit)
       // regex에 따라 나누되, 나눠지는 크기를 limit으로 제한한다.
       // limit가 regex의 개수와 같거나 더 클 경우에는 해당하는 만큼의 String[]을 돌려주나,
       // 더 적을 경우에는 그 뒤에 구분하지 않고 그만큼의 크기를 가진 String[]을 반환한다.
       // split(String, -1) : 배열의 크기를 제한하지 않고 끝까지 체크한다는 소리다.
       // 테스트케이스 1의 경우 마지막 x때문에 그냥 split("x")를 해버리면 끝을 셀 수 없는데,
       // 이렇게하면 끝까지 읽어준다. split("x", myString.length())를 해도 OK.
       int[] answer = new int[arr.length];
       for(int i = 0; i < answer.length; i++){
           answer[i] = arr[i].length();
       }
       return answer;
  
//맨 처음 풀었던 방법 : 시간이 너무 오래 걸리고, for문을 여러번 돌려야함!
//        int xCount = 0;
//        for(int i = 0; i < myString.length(); i++){
//            if(myString.charAt(i) == 'x'){
//                xCount++;
//            }
//        }
//        int[] answer = new int[xCount+1];
//        String[] arr = myString.split("");
//        int cnt = 0;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i].equals("x")){
//                cnt++;
//            } else {
//                answer[cnt]++;
//            }
//        }

//        return answer;
   }
   
   
   // 문자열 잘라서 정렬하기
   public String[] solution153(String myString) {
       // 풀이법 1 : 이렇게 풀었더니 테스트케이스는 통과하는데 제출 시 전부 실패. why?
       // 반례 : "dxccxbbbxxaaaa" ["aaaa", "bbb", "cc", "d"] 
       // 이렇게 하면 반례의 경우 ["", "aaaa", "bbb", "cc", "d"]로 나옴
       // xx의 경우 공백이 생기며 해당 공백도 인식되기 때문.
       // split("x+")로 할 경우 뒤의 공백은 제거되나, 앞에 공백이 생기는 경우 ("xxccb"처럼) 가 해결되지 않음         
       String[] arr = myString.split("x+");
       Arrays.sort(arr);
       ArrayList<String> list = new ArrayList();
       for(String str : arr){
           if(!str.equals("")){ // isEmpty()를 써도 OK! 이때 isBlank()와의 차이를 알아둘 것
               list.add(str);
           }
       }
       return list.toArray(new String[0]);
   }
   
   
   // 간단한 식 계산하기
   public int solution154(String binomial) {
       int answer = 0;
       // 우선 binomial을 쪼개자
       String[] arr = binomial.split(" ");
       // arr[0]이 a, arr[1]이 op, arr[2]가 b임
       int a = Integer.parseInt(arr[0]);
       int b = Integer.parseInt(arr[2]);
       switch(arr[1]){
           case "+" : answer = a + b;
               break;
           case "-" : answer = a - b;
               break;
           case "*" : answer = a * b;
               break;
       }
       return answer;
   }
   
   
   // 문자열 바꿔서 찾기
   public int solution155(String myString, String pat) {
       String[] arr = myString.split("");
       StringBuilder sb = new StringBuilder();
       int answer = 0;
       for(String str : arr){
           if(str.equals("A")){
               sb.append("B");
           } else if (str.equals("B")){
               sb.append("A");
           } else {
               sb.append(str);
           }
       }
       String compare = sb.toString();
       if(compare.contains(pat)){
           answer = 1;
       }
       return answer;
   }
   
   
   // rny_string
   public String solution156(String rny_string) {
       String answer = rny_string.replace("m", "rn");
       return answer;
   }
   
   
   // 세 개의 구분자
   public String[] solution157(String myStr) {
       // a, b, c로 문자열 나누기
       String[] arr = myStr.split("[abc]");
       if(arr.length == 0){
           String[] answer = {"EMPTY"};
           return answer;
       } 
       ArrayList<String> list = new ArrayList<>();
       for(String str : arr){
           if(!str.isBlank()){
               list.add(str);
           }
       }
       return list.toArray(new String[0]);
   }
   
   
   // 배열의 원소만큼 추가하기
   public int[] solution158(int[] arr) {
       ArrayList<Integer> list = new ArrayList<>();
       // 5가 5번, 1이 1번, 4가 4번 이런 식으로 나와야 함
       // 각 숫자를 카운팅해서 같아지면 넘겨줘야 하나?
       for(int i = 0; i < arr.length; i++){
           for(int j = 0; j < arr[i]; j++){
               list.add(arr[i]);
           }
       }
       
       int[] answer = new int[list.size()];
       for(int i = 0; i < answer.length; i++){
           answer[i] = list.get(i);
       }
       return answer;
   }
   
   
   // 빈 배열에 추가, 삭제하기
   public int[] solution159(int[] arr, boolean[] flag) {
       // flag[i]가 true -> arr[i]를 arr[i]*2번 추가,
       // false -> 마지막 arr[i]개 원소 제거   
       
       ArrayList<Integer> list = new ArrayList<>();
       for(int i = 0; i < flag.length; i++){
           if(flag[i]){
               for(int j = 0; j < arr[i]*2; j++){
                   list.add(arr[i]);
               }
           } else {
               for(int j = 0; j < arr[i]; j++){ 
                   list.remove(list.size()-1);
                   // 계속 런타임 왜 실패하나 했더니 처음에 list.remove(list.size()-1-k)를 해놨다.
                   // 이미 for문을 통해 k번 지우는건데 바본가봄
               }
           }
       }
       
       int[] answer = new int[list.size()];
       for(int i = 0; i < answer.length; i++){
           answer[i] = list.get(i);
       }
       return answer;
   }
   
   
   // 배열 만들기 6
   public int[] solution160(int[] arr) {
       ArrayList<Integer> list = new ArrayList<>();
       for(int i = 0; i < arr.length; i++){
           if(i == 0){
               list.add(arr[i]);
               System.out.println("이 if문이 제대로 돌았음"); // if문 제대로 도는지 확인용
           } else if (i > 0 && list.get(list.size()-1) == arr[i]) {
               list.remove(list.size()-1);
           } else if (i > 0 && list.get(list.size()-1) != arr[i]){
               list.add(arr[i]);
           }
       }
       
       
       if(list.size() == 0){
           int[] answer = {-1};
           return answer;
       } else {
           int[] answer = new int[list.size()];
           for(int i = 0; i < list.size(); i++){
               answer[i] = list.get(i);
           }
           return answer;
       }
   }
   
   
   // 무작위로 K개의 수 뽑기
   public int[] solution161(int[] arr, int k) {
       // 서로 다른 수를 골랐을 때, 그 개수가 k보다 작으면 -1로 채우기
       ArrayList<Integer> list = new ArrayList<>();
       for(int num : arr){
           if(!list.contains(num) && list.size() < k){
               list.add(num);
           } else if (list.size() == k) {
               break;
           }
       }
       
       if(list.size() < k){
           for(int i = list.size(); i < k; i++){ // 조건문 생성 시 유의!
               list.add(-1);
           }
       }
       
       int[] answer = new int[list.size()];
       for(int i = 0; i < answer.length; i++){
           answer[i] = list.get(i);
       }

       return answer;
   }
   
   
   // 배열의 길이를 2의 거듭제곱으로 만들기
   public int[] solution162(int[] arr) {
       // 2의 10승이 1024니까, 2의 9승 (512) 까지만 생각하면 됨.
       // 바보였다............arr의 길이가 1000이므로 1024까지 해당되는 거였음
       int idx = 0;
       for(int i = 0; i < 11; i++){
           if(arr.length <= Math.pow(2, i)){
               idx = (int)Math.pow(2, i);
               break;
           }
       }
       int[] answer = new int[idx];
       
       for(int i = 0; i < arr.length; i++){
           answer[i] = arr[i];
       }
       
       // 어차피 배열 선언할 때 int[] 배열은 기본값인 0으로 채워지기때문에 굳이 안해도 됨! 
       // if(arr.length < answer.length) {
       //     for(int i = arr.length; i < answer.length; i++){
       //         answer[i] = 0;
       //     }
       // }
       return answer;
   }
   
   
   // 배열 비교하기
   public int solution163(int[] arr1, int[] arr2) {
       if(arr1.length > arr2.length){
           return 1;
       } else if (arr1.length < arr2.length) {
           return -1;
       } else if (arr1.length == arr2.length) {
           int sum1 = 0;
           int sum2 = 0;
           for(int i = 0; i < arr1.length; i++){
               sum1 += arr1[i];
               sum2 += arr2[i];
           }
           if(sum1 > sum2){
               return 1;
           } else if (sum1 < sum2) {
               return -1;
           } else {
               return 0;
           }
       }
       return 0;
   }
   
   
   // 문자열 묶기
   public int solution164(String[] strArr) {
       // 각 원소 str의 개수끼리 묶어서, 가장 긴 애의 개수를 return
       // 해당 원소의 길이는 30까지만 해당하니까, int 배열의 길이가 30인 애를 만들어서 카운팅하자
       int[] arr = new int[30]; // 0 ~ 29까지니까 -1 해줘야함.
       for(int i = 0; i < strArr.length; i++){
           arr[strArr[i].length()-1]++;
       }
       Arrays.sort(arr);
       return arr[29];
   }
   
   
   // 배열의 길이에 따라 다른 연산하기
   public int[] solution165(int[] arr, int n) {
       int[] answer = new int[arr.length];
       // arr.length%2 == 0 -> arr[n%2 != 0] + n 
       // arr.length%2 != 0 -> arr[n%2 == 0] + n
       if(arr.length%2 == 0){
           for(int i = 0; i < arr.length; i++){
               answer[i] = i%2 != 0 ? arr[i] + n : arr[i];
           }
       } else {
           for(int i = 0; i < arr.length; i++) {
               answer[i] = i%2 == 0 ? arr[i] + n : arr[i];
           }
       }
       return answer;
   }
   
   
   // 뒤에서 5등까지
   public int[] solution166(int[] num_list) {
       Arrays.sort(num_list);
       int[] answer = {num_list[0], num_list[1], num_list[2], num_list[3], num_list[4]};
       // Arrays.copyOfRange() 를 쓰면 더 간단함!
       // Arrays.copyOfRange(num_list, 0, 5);
       return answer;
   }
   
   
   // 뒤에서 5등 위로
   public int[] solution167(int[] num_list) {
       Arrays.sort(num_list);
       return Arrays.copyOfRange(num_list, 5, num_list.length);
   }
   
   
   // 전국 대회 선발 고사
   public int solution168(int[] rank, boolean[] attendance) {
       // "등수" 이므로 가장 낮은 순부터 체크해야 됨
       ArrayList<Integer> list = new ArrayList<>();
       for(int i = 0; i < rank.length; i++){
           if(attendance[i]){
               list.add(rank[i]);
           }
       }
       Collections.sort(list); // ArrayList를 오름차순으로 정렬하는 메서드
       int a = 0;
       int b = 0;
       int c = 0;
       // 등수이므로 list[0]부터 list[2]까지가 해당됨.
       for(int i = 0; i < rank.length; i++){
           if(rank[i] == list.get(0)){
               a = i;
           } else if (rank[i] == list.get(1)){
               b = i;
           } else if (rank[i] == list.get(2)){
               c = i;
           }
       }
       return 10000*a + 100*b + c;
   }
   
   
   // 정수 부분
   public int solution169(double flo) {
       return (int)flo;
   }
   
   
   // 문자열 정수의 합
   public int solution170(String num_str) {
       int answer = 0;
       String[] arr = num_str.split("");
       for(String str : arr){
           answer += Integer.parseInt(str);
       }
       return answer;
   }
} // 클래스의 끝


