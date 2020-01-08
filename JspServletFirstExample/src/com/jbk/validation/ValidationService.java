package com.jbk.validation;

public class ValidationService {
	public static boolean isBlankorEmpty(String anyName){
		//your code goes here
		if( anyName==null || anyName.trim().equals("") || "".equals(anyName)){
			return true;
		}
		return false;
	}

	public static boolean isLengthMoreThanSpecified(String anyName,int lengthRequired){
		if (anyName !=null){
			anyName = anyName.trim();
			}
		if(!isBlankorEmpty(anyName) && anyName.length() == lengthRequired){
			return true;
		}
		return false;
		}
	}
