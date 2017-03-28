/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ CarTest
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 3. 23.
 * </pre>
 *
 * @author : 김은상
 * @version : 1.0
 */
public class CarTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car = new Car();
		
		System.out.println("<<자동차 목록>>");
		System.out.println(car.getCompany());
		System.out.println(car.getModel());
		System.out.println(car.getColor());
		System.out.println(car.getMaxSpeed() + "km");
		System.out.println(String.format("%,d", car.getPrice()) + "원");
		
		System.out.println();
		
		Car3 car2 = new Car3("기아자동차", "K7", "흰색", 246);
		
		System.out.println(car2.getCompany());
		System.out.println(car2.getModel());
		System.out.println(car2.getColor());
		System.out.println(car2.getMaxSpeed() + "km");
		System.out.println(String.format("%,d", car2.getPrice()) + "원");

		System.out.println();
		Car3 car3 = new Car3("삼성자동차", "SM7", "회색");

		System.out.println(car3.getCompany());
		System.out.println(car3.getModel());
		System.out.println(car3.getColor());
		System.out.println(car3.getMaxSpeed() + "km");
		System.out.println(String.format("%,d", car3.getPrice()) + "원");
		

	}

}
