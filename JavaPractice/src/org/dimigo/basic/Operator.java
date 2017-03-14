/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Operator
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 3. 14.
 * </pre>
 *
 * @author : 김은상
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int salary = 1700000;
		int mem = 3;
		int num = 1500;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : " + String.format("%,d", salary) + "원");
		System.out.println("점포 내 직원 수 : " + String.format("%,d", mem) + "명");
		System.out.println("점포 수 : " + String.format("%,d", num) + "개" + "\n\n");
		System.out.println("연간 인건비 : " + String.format("%,d", (long)salary * 12* mem * num)  + "원");
		
	}

}
