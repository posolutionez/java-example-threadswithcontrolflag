package com.solutionez.threadlearning;

import java.util.Scanner;


public class InputChecker extends Thread{
	

	public void run() {
		checkInput();
	}
	
	
	private void evalInput(String input){
		
		if(input.equals("stop")){
			System.out.println("got a stop cmd");
			ControlFlag.toggleOff();
	    }
	    
	    if(input.equals("run")){
	    	System.out.println("got a run cmd");
	    	ControlFlag.toggleOn();
	    }
		
	}
	public void checkInput(){
		Scanner sc = null;
		while(true){
			
			try{
				sc = new Scanner(System.in);
				evalInput(sc.nextLine());
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		
	}
}
