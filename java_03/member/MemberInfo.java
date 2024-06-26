package member;

public class MemberInfo {

	public static void main(String[] args) {

		// Member 객체 생성 - 기본 생성자
		Member member = new Member();
		
		member.setMemberId("mjkwon");
		member.setMemberName("권민정");
		member.setMemberEmail("mjkwon@naver.com");
		member.setMemberGender("여성");
		member.setMemberPhone("010-2232-4444");
		
		System.out.println(member.getMemberId());
		System.out.println(member.getMemberName());
		System.out.println(member.getMemberEmail());
		System.out.println(member.getMemberGender());
		System.out.println(member.getMemberPhone());
		
		member.setMemberId("mjkwon111");
		System.out.println(member.getMemberId());

		// 드라마 오징어 게임 시즌 1 출연자 정보 호출
		MemberDrama.dramaMemberInfo();
		MemberClass.classMemberInfo();

		// 여러명의 멤버 생성 (회원 아이디와 이름으로만 구성)


	}

}