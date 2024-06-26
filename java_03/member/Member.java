package member;

public class Member {
	
	// 회원 아이디
	// 회원 명
	// 성별
	// 이메일
	// 연락처
	
	private String memberId;
	private String memberName;
	private String memberGender;
	private String memberEmail;
	private String memberPhone;
	
	public Member() {
		
	}
	
	public Member(String memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

}