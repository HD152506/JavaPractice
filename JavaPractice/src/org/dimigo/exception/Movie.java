/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_ Movie
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 5. 29.
 * </pre>
 *
 * @author : 김은상
 * @version : 1.0
 */
public class Movie {
	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge) {
		this.title = title;
		this.limitAge = limitAge;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getLimitage() {
		return this.limitAge;
	}
	
	public void buyTicket(int age) throws Exception {
		if (getLimitage() > age) {
			throw new Exception(getTitle() + "은/는"  + getLimitage() + "세 이상 관람가입니다.");
		}
		else {
			System.out.println(getTitle() + " 즐감하세요.");
		}
	}
}
