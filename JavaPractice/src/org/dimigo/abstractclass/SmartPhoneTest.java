/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 5. 12.
 * </pre>
 *
 * @author : 김은상
 * @version : 1.0
 */
public class SmartPhoneTest {
	public static void main(String[] args) {

		SmartPhone[] sm = {
				new IPhone("iPhone 7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		
		for(SmartPhone v: sm) {
		System.out.println(v);
		v.turnOn();
		v.pay();
		v.useSpecialFunction();
		v.turnOff();
		System.out.println();
		}
	}
}
