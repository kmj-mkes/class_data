package memberMng;

import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

	//	Member member = new Member();

	List<Member> members;	// 전역변수

	// Member List를 저장소로 가지고 있으며 추가, 수정, 삭제, 출력하는 메소드 작성
	// insertMember, updateMember, deleteMember, findMember, findAllMember

	public MemberDAO() {
		members = new ArrayList<Member>();
	}
	
	//저장
	public void insertMember(Member member) {
		members.add(member);
	}

	//수정
	public void updateMember(Member member) {
		int index = 0;
		members.set(index, member);
	}

	//삭제
	public void deleteMember(Member member) {
		members.remove(member);
	}

	//출력
	public List<Member> findMember() {
		return members;
	}

	//전체출력
	public List<Member> findAllMember() {
		return members;
	}

}
