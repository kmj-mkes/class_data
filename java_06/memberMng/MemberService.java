package memberMng;

import java.util.List;
import java.util.Scanner;

public class MemberService {

	MemberDAO mDAO;
	Scanner sc = new Scanner(System.in);

	public MemberService() {
		mDAO = new MemberDAO();
	}

	// ===== 회원 관리 프로그램 =====
	// 1. 회원 정보 등록
	// 2. 회원 정보 수정
	// 3. 회원 정보 삭제
	// 4. 회원 정보 출력(이름)
	// 5. 회원 전체 정보 출력
	// 6. 프로그램 종료

	public void startProgram() {

		int count = 0;

		while (true) {

			int choice = printMenu();

			switch(choice) {
			case 1 :
				displayMsg("1. 회원 정보 등록");
				insertMember();
				break;
			case 2 :
				displayMsg("2. 회원 정보 수정");
				updateMember();
				break;
			case 3 :
				displayMsg("3. 회원 정보 삭제");
				deleteMember();
				break;
			case 4 :
				displayMsg("4. 회원 정보 출력(이름)");
				printMember();
				break;
			case 5 :
				displayMsg("5. 회원 전체 정보 출력");
				printAllMembers();
				break;
			case 6 :
				displayMsg("프로그램 종료 ~!!");
				count++;
				break;
			default :
				// "잘못된 숫자가 입력됨. 1~6 사이의 숫자 입력 가능");
				break;
			}

			if (count == 1) {
				break;
			}
		}
	}

	// 0. 프로그램 메뉴 출력 및 선택
	public int printMenu() {
		displayMsg("===== 회원 관리 프로그램 =====");
		displayMsg("1. 회원 정보 등록");
		displayMsg("2. 회원 정보 수정");
		displayMsg("3. 회원 정보 삭제");
		displayMsg("4. 회원 정보 출력(이름)");
		displayMsg("5. 회원 전체 정보 출력");
		displayMsg("6. 프로그램 종료");
		System.out.print("[선택] : ");

		int choice = sc.nextInt();

		return choice;
	}

	// 1. 회원 정보 등록
	public void insertMember() {
		//		private String memberId;	// 회원 아이디
		//		private String memberPw;	// 회원 비밀번호
		//		private String memberName;	// 회원 이름
		//		private String email;		// 이메일
		//		private String phone;		// 연락처

		// 회원 정보를 등록할 member 객체 생성자
		Member member = new Member();

		// 회원 정보 입력받기
		System.out.print("회원 아이디를 입력해 주세요 : ");
		String memberId = sc.next();

		System.out.print("회원 비밀번호 : ");
		String memberPw = sc.next();

		System.out.print("회원 이름 : ");
		String memberName = sc.next();

		System.out.print("이메일 주소를 입력해 주세요. : ");
		String email = sc.next();

		System.out.print("연락처 정보를 입력해 주세요. : ");
		String phone = sc.next();

		// member에 회원정보 셋팅
		member.setMemberId(memberId);
		member.setMemberPw(memberPw);
		member.setMemberName(memberName);
		member.setEmail(email);
		member.setPhone(phone);

		// 셋팅된 member를 List<Member>
		mDAO.insertMember(member);

	}

	// 2. 회원 정보 수정
	public void updateMember() {

		List<Member> members = mDAO.findMember();

		System.out.print("수정하고 싶은 아이디를 입력해 주세요. : ");
		String findId = sc.next();
		
		boolean flag = false;

		for (int i=0; i<members.size(); i++) {
			Member member =  members.get(i);

			if (findId.equals(member.getMemberId())) {
				System.out.println(member.getMemberName() + "님의 정보를 수정해 주세요.");
				
				System.out.print("비밀번호 : ");
				member.setMemberPw(sc.next());
				
				System.out.print("이메일 : ");
				member.setEmail(sc.next());
				
				System.out.print("연락처 : ");
				member.setPhone(sc.next());
				
				flag = true;
				break;
			}
		}
		
		if (flag == false) {
			displayMsg("회원 아이디가 존재하지 않습니다.");
		}
	}
	
	// 3. 회원 정보 삭제
	public void deleteMember() {
		
		List<Member> members = mDAO.findMember();
		
		System.out.print("삭제할 회원 아이디를 입력해 주세요 : ");
		String findId = sc.next();
		
		boolean flag = false;
		
		for (int i=0; i<members.size(); i++) {
			Member member = members.get(i);
			
			if (findId.equals(member.getMemberId())) {
				mDAO.deleteMember(member);
				displayMsg("삭제 완료!!");
				
				flag = true;
				break;
			}
		}
		
		if (flag == false) {
			displayMsg("회원 정보가 없습니다.");
		}
		
	}

	// 4. 회원 정보 출력(이름)
	public void printMember() {

		List<Member> members = mDAO.findMember();

		System.out.print("조회할 회원 아이디를 입력해 주세요 : ");
		String findId = sc.next();

		boolean flag = false;

		for (int i=0; i<members.size(); i++) {
			Member member = members.get(i);

			if (findId.equals(member.getMemberId())) {
				displayMsg("회원 아이디 : "  + member.getMemberId());
				displayMsg("회원 비밀번호 : "  + member.getMemberPw());
				displayMsg("회원 이름 : "  + member.getMemberName());
				displayMsg("회원 이메일 : "  + member.getEmail());
				displayMsg("회원 연락처 : "  + member.getPhone());

				flag = true;
				break;	
			}
		}

		if (flag == false) {
			displayMsg("회원 아이디가 존재하지 않습니다.");
		}

	}

	// 5. 회원 전체 정보 출력
	public void printAllMembers() {

		List<Member> members = mDAO.findAllMember();

		for (int i=0; i<members.size(); i++) {
			Member member = members.get(i);

			displayMsg("회원 아이디 : "  + member.getMemberId());
			displayMsg("회원 비밀번호 : "  + member.getMemberPw());
			displayMsg("회원 이름 : "  + member.getMemberName());
			displayMsg("회원 이메일 : "  + member.getEmail());
			displayMsg("회원 연락처 : "  + member.getPhone());
			displayMsg("-----------------------------------------");
		}


	}

	// 메시지 출력용
	public void displayMsg(String msg) {
		System.out.println(msg);
	}

}
