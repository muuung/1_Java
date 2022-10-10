import java.nio.channels.ScatteringByteChannel;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
			
			if(i % 2 == 0) {
				sum += arr[i];
			}
		}
		
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	}
	
	public void practice2() {
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = arr.length; i > 0; i--) {
			arr[i-1] = i;
			System.out.print(arr[i-1] + " ");
			
			if((i-1) % 2 == 1) {
				sum += arr[i-1];
			}
		}
		
		System.out.println("\n홀수 번째 인덱스 합 : " + sum);
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int[] arr = new int[sc.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("입력 "+ i + " : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		boolean no = true;
		
		for(int i = 0; i < arr.length; i++) {
			if(search == arr[i]) {
				System.out.println("인덱스 : " + i);
				no = false;
				break;
			}
		}
		
		if(no == true) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String arr = sc.next();
		
		System.out.print("문자 : ");
		String letter = sc.next();
		
		String index = "";
		int count = 0;
		
		for(int i = 0; i < arr.length(); i++) {
			if(letter.charAt(0) == arr.charAt(i)) {
				index += i + " ";
				count++;
			}
		}
		
		System.out.println(arr + "에 " + letter + "가 존재하는 위치(인덱스) : " + index);
		System.out.println(letter + " 개수 : " + count);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int[] arr = new int[sc.nextInt()];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n총 합 : " + sum);
	}

	public void practice7() {
		char[] arr;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		arr = sc.next().toCharArray();
		
		for(int i = 8; i < arr.length; i++) {
			arr[i] = '*';
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);;
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		while(true) {
			System.out.print("정수 : ");
			input = sc.nextInt();
			
			if((input < 3) || (input % 2 == 0)) {
				System.out.println("다시 입력하세요.");
			} else {
				break;
			}
		}
		
		int[] arr = new int[input];
		int a = 0;
		String str = "";
		
		for(int i = 0; i < arr.length; i++) {
			if(i <= (arr.length/2)) {
				arr[i] = ++a;
			
			} else {
				arr[i] = --a;
			}
			
			str += arr[i] + ", ";
		}
		
		System.out.print(str.substring(0, str.length()-2));
	}
	
	public void practice9() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		
		System.out.print("발생한 난수 : ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice10() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		
		System.out.print("발생한 난수 : ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	public void practice11() {
		int[] arr = new int[10];
		boolean boo = false;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j = 0; j < i; j++) {
				if(arr[j] == arr[i]) {
					i--;
					boo = true;
				}
			}
			
			if(boo == true) {
				boo = false;
				continue;
			}
			
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() {
		int[] arr = new int[6];
		boolean boo = false;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 50 + 1);
			
			for(int j = 0; j < i; j++) {
				if(arr[j] == arr[i]) {
					i--;
					boo = true;
				}
			}
			
			if(boo == true) {
				boo = false;
				continue;
			}
			
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.next();
		
		String str = "";
		boolean boo = false;
		int count = 0;
		
		for(int i = 0; i < input.length(); i++) {
			for(int j = 0; j < i; j++) {
				if(input.charAt(j) == input.charAt(i)) {
					boo = true;
				}
			}
			
			if(boo == true) {
				boo = false;
				continue;
			}
			
			str += input.charAt(i) + ", ";
			count++;					
		}
		
		System.out.print("문자열에 있는 문자 : " + str.substring(0, str.length()-2));
		System.out.println("\n문자 개수 : " + count);
	}
	
	public void practice14() {
		
	}
	
	public void practice15() {
		String[][] arr = new String[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice16() {
		int[][] arr = new int[4][4];
		int a = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = a++;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}		
	}
	
	public void practice17() {
		int[][] arr = new int[4][4];
		int a = 16;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = a--;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}			
	}
	
	public void practice18() {
		
	}
	
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 크기 : ");
		int input1 = sc.nextInt();
		
		System.out.print("열 크기 : ");
		int input2 = sc.nextInt();
		
		char[][] arr = new char[input1][input2];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char)(Math.random() * 27 + 65);
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public void practice20() {
		
	}
	
	public void practice21() {
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
							 "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		int a = 0;
		
		System.out.println("== 1분단 ==");
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = students[a++];
				System.out.print(arr1[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = students[a++];
				System.out.print(arr2[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public void practice22() {
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				 "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};

		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		int a = 0;
		
		System.out.println("== 1분단 ==");
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = students[a++];
				System.out.print(arr1[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = students[a++];
				System.out.print(arr2[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("====================");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String input = sc.next();
		
		int dan = 0;
		String rl = "";
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
					if(j == 0) {
						rl = "왼쪽";
					} else {
						rl = "오른쪽";
					}
					
					if(arr1[i][j].equals(input)) {
						dan = 1;
						System.out.printf("검색하신 %s 학생은 %d분단 %d번째 줄 %s에 있습니다.\n",
										  arr1[i][j], dan, i+1, rl);
						
					} else if (arr2[i][j].equals(input)) {
						dan = 2;
						System.out.printf("검색하신 %s 학생은 %d분단 %d번째 줄 %s에 있습니다.\n",
										  arr2[i][j], dan, i+1, rl);
				}
			}
		}
	}
	
	public void practice23() {
		String[][] arr = new String[6][6];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = " ";
			}
		}
		
		for(int i = 1; i < arr.length; i++) {
			arr[0][i] = Integer.toString(i-1);
			arr[i][0] = Integer.toString(i-1);
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 인덱스 입력 : ");
		int input1 = sc.nextInt();
		
		System.out.print("열 인덱스 입력 : ");
		int input2 = sc.nextInt();
		
		arr[input1+1][input2+1] = "X";
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public void practice24() {
		String[][] arr = new String[6][6];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = " ";
			}
		}
		
		for(int i = 1; i < arr.length; i++) {
			arr[0][i] = Integer.toString(i-1);
			arr[i][0] = Integer.toString(i-1);
		}
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("행 인덱스 입력 : ");
			int input1 = sc.nextInt();
			
			if(input1 == 99) {
				System.out.println("프로그램 종료");
				break;
			}
			
			System.out.print("열 인덱스 입력 : ");
			int input2 = sc.nextInt();
			
			arr[input1+1][input2+1] = "X";
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				
				System.out.println();
			}
			
			System.out.println();
		}
	}
	
	public void BingoGame() {
		
	}
	
}