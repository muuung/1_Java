package edu.kh.ex;

public class VariableExample3 {
	
	public static void main(String[] args) {

	// 트레이 아이콘 -> 인텔HD 그래픽 -> 그래픽 옵션
	// -> 바로가기 키 -> 사용안함
	
	// ctrl + alt + 방향키 위 or 아래 : 해당 줄 복사
	
	/* 출력 메서드
	 * System.out.print("내용")
	 * -> ()안의 내용 출력 (줄바꿈X)
	 * 
	 * System.out.println("내용")
	 * -> () 안의 내용 출력 (줄바꿈O)
	 * 
	 * System.out.printf("내용 + 패턴", 패턴에 들어갈 값)
	 * 
	 */
		System.out.print("aaaa");
		System.out.print("bbbb");
		System.out.println("cccc");
		System.out.println("dddd");
		
		String name = "현진";
		int age = 25;
		char gender = '여';
		double height = 188.8;
		boolean tf = true;
		
		System.out.println(name + "님은 " + age + "세 " + gender + "성, 키는 "
				+ height + "cm 입니다 (" + tf + ")");
		
		System.out.printf("%s님은 %d세 %c성, 키는 %.1fcm 입니다 (%b)\n",
				name, age, gender, height, tf);
		
		System.out.println("줄 바꼈나요??");
		
		System.out.println("내가 추가한 내용");
	}
}
