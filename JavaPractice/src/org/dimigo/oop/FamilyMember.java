/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ FamilyMember
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 4. 18.
 * </pre>
 *
 * @author : 김은상
 * @version : 1.0
 */
public class FamilyMember {
	private static int memberCnt;
	private String membername;
	
	public FamilyMember(String memberName) {
		this.membername = memberName;
		memberCnt++;
	}

	// getter 멤버네임
	public String getMembername() {
		return membername;
	}
	
	// print MemberCnt
	public static void printMemberCnt() {
		System.out.println("가족 총 인원 수 : " + memberCnt);
	}
	
}
