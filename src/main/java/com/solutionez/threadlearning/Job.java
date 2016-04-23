package com.solutionez.threadlearning;


public class Job extends Thread{
	


	public void run() {
		spitOut();
	}
	

	
	public void spitOut(){
		
		while (true){
			
			if (ControlFlag.getFlag()){			

				try {
					System.out.println("Doing work");
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		
		
		}
	}
		
		
}
	


