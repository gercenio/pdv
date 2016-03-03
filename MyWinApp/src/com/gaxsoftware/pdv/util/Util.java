package com.gaxsoftware.pdv.util;

public class Util {
	
	public static java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
	    return new java.sql.Date(date.getTime());
	}
	
	public static final String RESOURCE_PATH = "/resources";
    public static final String IMAGES_PATH = "/images";
    public static final String FILE_NAME_SEPERATOR = "/";
}


