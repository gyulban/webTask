package day01;

public class Test01 {
	public static void main(String[] args) {
		// 한줄 주석 프로그램 실행에는 영향을 끼치지 않는다
		// 출력 메소드
		System.out.println(1);

		// 출력 메소드 단축키 : syso + ctrl + space bar > 엔터
		System.out.println(2);
		System.out.println(3);
		// 저장 : ctrl + s
		// 실행 단축키 : ctrl + F11
		// 자동 정렬 단축키 : 윈도우 ctrl + shift + f
		// 맥북 : command + shift + f
//		한줄 주석 단축키 : ctrl + / 맥북) command + /
/*		범위 주석 : ctrl + shift + / (설정)
  				  ctrl + shift + \ (해제)
  				
*/
		System.out.println("최정우"); 
		// 소괄호안에 있는 김영선이라는 값을 콘솔창에 출력한다
		System.out.println("2023년 11월 8일 1일차");
		String str = "안녕하세요";
		System.out.printf("하이는 한글로 %s", str);
		double doub = 1.234;
		System.out.printf("소수점 첫번째까지 %.2f", doub);
	}
}
