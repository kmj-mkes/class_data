package java_12.service;

import java.util.Scanner;

import java_12.dao.ForYouDAO;

public class ForYouServiceImpl implements ForYouService {

	/*
	문제) 고민해결책과 포춘쿠키 세트가 준비되어 있습니다.
		 각 메뉴를 선택했을 때, 랜덤으로 ArrayList에 담긴 내용 중 하나를 보여주세요.
	 */

	public static ForYouDAO forYouDAO;
	public static Scanner sc = new Scanner(System.in);

	// 생성자
	public ForYouServiceImpl() {
		forYouDAO = new ForYouDAO();
	}

	// 시작 메서드
	public void programStart() {
		System.out.println("**************************************");
		System.out.println("    원하는 메뉴를 선택해 주세요. ");
		System.out.println("**************************************");
		System.out.println();

		// 메뉴 출력 및 선택

	}

	// 메뉴를 출력하고 작업 번호를 입력 받아 반환하는 메서드
	public int displayMenu() {
		System.out.println();
		System.out.println("------------------------");
		System.out.println(" 1. 마법의 고민 해결책");
		System.out.println(" 2. 행운의 포춘쿠키");
		System.out.println(" 0. 프로그램 종료");
		System.out.println("------------------------");
		System.out.print("선택 >> ");

		return sc.nextInt();
	}

	// 마법의 고민해결책
	public void solutionBook() {
		System.out.println();
		System.out.println("************* 고민해결책 사용법 *************");
		System.out.println("1. 복잡한 고민이나 질문을 생각합니다.");
		System.out.println("2. 가슴에 손을 올리고 10초 이상 집중하며 생각합니다.");
		System.out.println("3. 마음의 준비가 되었다면 이름을 입력해 주세요.");
		System.out.println("4. 엔터를 누르는 순간 궁금해 하던 답이 나옵니다.");
		System.out.print("이 름 >> ");

		System.out.println();

		// 고민해결책의 답 가져오기


		System.out.println("님의 고민에 대한 저의 대답이에요.");
		System.out.println("-------------------------");

		// 상세 로직 구현

		System.out.println("-------------------------");
	}

	// 행운의 포춘쿠키
	public void fortuneBook() {
		System.out.println();
		System.out.println("************* 행운의 포춘쿠키 사용법 *************");
		System.out.println("1. 눈을 감고 잠시 머리를 비워보세요.");
		System.out.println("2. 마음의 준비가 되었다면 이름을 입력해 주세요.");
		System.out.println("3. 엔터를 누르는 순간 궁금해 하던 답이 나옵니다.");
		System.out.print("이 름 >> ");

		System.out.println();

		// 고민해결책의 답 가져오기


		System.out.println("님이 고르신 행운의 포춘쿠키 입니다.");
		System.out.println("-------------------------");

		// 상세 로직 구현

		System.out.println("-------------------------");
	}

}