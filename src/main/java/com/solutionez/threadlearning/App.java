package com.solutionez.threadlearning;


public class App {
	
	
	
	public static void main (String[] args){
	
		/*
		 * create instance of the InputChecker class (thread) this, will use the Jave
		 * Scanner to read strings from command line that will be the means to control 
		 * this simple example
		 * 
		 */
		InputChecker inputCheckerThread = new InputChecker();
		inputCheckerThread.setName("inputChecker");
    
    
		/*
		 * create instance of the Job class (thread). This is just a class to output 
		 * some strings to the console such that I know it's running
		 */
		Job j1 = new Job();
		j1.setName("j1");
       
		//start the threads
		inputCheckerThread.start();
		j1.start();
    
	}
}
