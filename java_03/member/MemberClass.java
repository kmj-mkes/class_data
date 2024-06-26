package member;

public class MemberClass {
	
	public static void main(String[] args) {

		
	}

	public static void classMemberInfo() {
		// 여러명의 멤버 생성 (회원 아이디와 이름으로만 구성)
		
		// Member(String, String) - 회원 아이디와 이름으로 구성된 생성자
		// 우리 강좌 회원님들 정보
		Member mem1 = new Member("id_11", "김이슬");
		Member mem2 = new Member("id_12", "박은주");
		Member mem3 = new Member("id_13", "서여진");
		Member mem4 = new Member("id_14", "현정화");
		Member mem5 = new Member("id_15", "정다현");
		
		System.out.println("[ 우리 강좌 회원1 ] " + mem1.getMemberId() + " :: " + mem1.getMemberName());
		System.out.println("[ 우리 강좌 회원2 ] " + mem2.getMemberId() + " :: " + mem2.getMemberName());
		System.out.println("[ 우리 강좌 회원3 ] " + mem3.getMemberId() + " :: " + mem3.getMemberName());
		System.out.println("[ 우리 강좌 회원4 ] " + mem4.getMemberId() + " :: " + mem4.getMemberName());
		System.out.println("[ 우리 강좌 회원5 ] " + mem5.getMemberId() + " :: " + mem5.getMemberName());

	}

}