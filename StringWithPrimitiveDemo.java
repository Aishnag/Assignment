package com.aishwarya.string;

public class StringWithPrimitiveDemo {
	public static int toInt(String s) {
		return Integer.parseInt(s);
	}


	public static long tolong(String s) {
		return Long.parseLong(s);
	}

	public static double todouble(String s) {
		return Double.parseDouble(s);
	}

	public static float tofloat(String s) {
		return Float.parseFloat(s);
	}

	public static char[] toCharArray(String s) {
		return s.toCharArray();
	}

	public static byte[] toByteArray(String s) {
		return s.getBytes();
	}

	public static boolean toboolean(String s) {
		return Boolean.parseBoolean(s);
	}

	public static void main(String[] args) {
		String s = "123";
		System.out.println("To primitive int: " + toInt(s));
		
		}

	

}
