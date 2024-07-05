package java_10.inter02;

import java.util.Scanner;

public class ExMain {

	public static void main(String[] args) {
		// Scanner를 통하여 char 문자열을 입력 받도록 한다.

		Scanner sc = new Scanner(System.in);

		System.out.println("상담원 선택 : ");
		String ch = sc.next();
		boolean isSupport = true;

		Scheduler scheduler = null;

		if ("r".equals(ch) || "R".equals(ch)) {
			scheduler = new RoundRobin();
		} else if ("l".equals(ch) || "L".equals(ch)) {
			scheduler = new LeastJob();
		} else if ("p".equals(ch) || "P".equals(ch)) {
			scheduler = new PriorityAllocation();
		} else {
			System.out.println("지원하지 않는 기능입니다.");
			isSupport = false;
		}

		if (isSupport == true) {
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}
	}

}
