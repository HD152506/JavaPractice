/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ DBTest
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 5. 24.
 * </pre>
 *
 * @author : 김은상
 * @version : 1.0
 */
public class DBTest {
	public static void main(String[] args) {
		System.out.println("<<변경전>>");
		IDBManager s = IDBManager.getDBObject("SYBASE");
		crud(s);
		System.out.println();
		System.out.println("<<변경후>>");
		IDBManager o = IDBManager.getDBObject("ORACLE");
		crud(o);
		 
	}
	
	private static void crud(IDBManager db) {
		db.insert();
		db.search();
		db.update();
		db.delete();
	}
}
