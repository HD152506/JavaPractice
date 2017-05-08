/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ PiggyBankTest
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 4. 18.
 * </pre>
 *
 * @author : 김은상
 * @version : 1.0
 */
public class PiggyBankTest {

	public static void main(String[] args) {
		FamilyMember[] fam = {
				new FamilyMember("아빠"),
				new FamilyMember("엄마"),
				new FamilyMember("나"),
				new FamilyMember("남동생"),
		};
		
		FamilyMember.printMemberCnt();
		
		PiggyBank.putMoney(fam[0], 10000);
		PiggyBank.putMoney(fam[1], 5000);
		PiggyBank.putMoney(fam[2], 2000);
		PiggyBank.putMoney(fam[3], 1000);
			
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(fam[3], 1000);
		
		PiggyBank.printBalance();
	}

}
