package com.stray;

import java.util.Random;

public class Util {

	public static final int ultimateAnswer = 42;

	private Util(){}

	public static String reverse(String str){
		return (new StringBuilder(str)).reverse().toString();
	}

	public static boolean randomBoolean(){
		return (new Random()).nextBoolean();
	}

	public static String randomCase(String str){
		StringBuilder strBuilder = new StringBuilder();
		String strLower = str.toLowerCase();
		String strUpper = str.toUpperCase();
		for(int i = 0; i < str.length(); i++) {
			if( randomBoolean() ) {
				strBuilder.append( strUpper.charAt(i) );
			} else {
				strBuilder.append( strLower.charAt(i) );
			}
		}
		return strBuilder.toString();
	}

}
