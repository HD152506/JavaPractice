/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 3. 31.
 * </pre>
 *
 * @author : 김은상
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] questions = { "가장 좋아하는 가수는? ", "가장 좋아하는 배우는? ", "가장 좋아하는 과목은? " };
		String[] answer = { "빅뱅", "조인성", "응용 프로그래밍" };

		for (int i = 0; i < 3; i++) {
			System.out.println(questions[i]);
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			if(input.equals(answer[i])) {
				System.out.println("정답입니다!");
			}
			else
				System.out.println("틀렸습니다!");
			}
		System.out.println("<<결과 출력>>");
		
		StringBuilder Ok = new StringBuilder();
		
		for (int i = 0; i < 3; i++) {
			Ok.append(questions[i]).append(answer[i]).append("입니다.\n");
		}
		System.out.println(Ok);
		}

	}

