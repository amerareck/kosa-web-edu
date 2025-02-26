package day13;

public class ExceptionTest2 {
	public static void main(String[] args) {
		System.out.println("수행시작");
		try {
			System.out.println("길이 : " + args.length);
			System.out.println("1번 입력값 : " + args[0] + " | 2번 입력값 : " + args[1]);
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = num1 / num2;
			System.out.println("연산 결과 : " + result);
		} catch (ArrayIndexOutOfBoundsException e) { // if 구문과 같음.
			 System.out.println("프로그램 아규먼트를 2 개 전달하세요!!"); 
		} catch (ArithmeticException e) { // else if? System.out.println(e.getMessage());
			 System.out.println("두번째 프로그램 아규먼트는 0이 아닌 값을 전달하세요!!"); return; 
		} catch (NumberFormatException e) { // else if? e.printStackTrace();
			 System.out.println("프로그램 아규먼트로 숫자를 전달하세요!!");
		} catch (Exception e) { // else !!!
			 System.out.println(e);
			 System.out.println("예외 발생 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		} finally {
			System.out.println("항상 수행!!");
		}
		System.out.println("수행종료");
	}
}
