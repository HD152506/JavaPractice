/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ IDBManager
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 5. 24.
 * </pre>
 *
 * @author : 김은상
 * @version : 1.0
 */
public interface IDBManager {
	
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";
	
	public void insert();
	public void search();
	public void update();
	public void delete();
	
	public static IDBManager getDBObject(String database) {
		if(database == null){
			return null;
		}
		else if(ORACLE_DATABASE.equals(database)) {
			return new OracleDB();
		}
		else if(SYBASE_DATABASE.equals(database)) {
			return new SybaseDB();
		}
		return null;
	} 

}
