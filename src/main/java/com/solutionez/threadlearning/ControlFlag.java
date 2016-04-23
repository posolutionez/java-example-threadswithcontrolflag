package com.solutionez.threadlearning;

public class ControlFlag {
	
	private volatile static boolean flag;
	
	public static void toggleOn(){
		System.err.println("control flag toggled on");
		flag = true;
	}
	
	public static void toggleOff(){
		System.err.println("control flag toggled off");
		flag = false;
	}

	public static boolean getFlag() {
		return flag;
	}

	public static void setFlag(boolean f) {
		flag = f;
	}

}
