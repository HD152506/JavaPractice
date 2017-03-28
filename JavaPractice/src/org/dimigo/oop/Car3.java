/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Car
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 3. 23.
 * </pre>
 *
 * @author : 김은상
 * @version : 1.0
 */
public class Car3 {
	private String company = "현대자동차";
	private String model = "제네시스";
	private String color = "검정색";
	private int maxSpeed = 225;
	private int price = 50000000;
	
	// Constructor
	public Car3() {
		
	}
	
	public Car3(String Company, String Model, String Color, int MaxSpeed, int Price) {
		this.company = Company;
		this.model = Model;
		this.color = Color;
		this.maxSpeed = MaxSpeed;
		this.price = Price;
	}
	
	public Car3(String Company, String Model, String Color, int MaxSpeed) {
		this(Company, Model, Color, MaxSpeed, 0);
	}
	
	public Car3(String Company, String Model, String Color) {
		this(Company, Model, Color, 0);
	}
	
	// getter
	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getPrice() {
		return price;
	}
	
}
