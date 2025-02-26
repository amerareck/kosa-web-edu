package day18;

public class ThreadEx13 {
	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		// 실행 중인 스레드의 일시 중지.
		thread.interrupt();
	}
}

class PrintThread2 extends Thread {
	public void run() {
		while (true) {
			System.out.println("실행 중");
			if (Thread.interrupted()) {
				// 자원 정리
				break;
			}
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
