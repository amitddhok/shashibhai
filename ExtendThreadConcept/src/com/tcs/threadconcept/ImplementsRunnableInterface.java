package com.tcs.threadconcept;

class Implrun implements Runnable{

	@Override
	public void run() {

		int i;
		for(i=1;i<=5;i++){
		
		try {
			Thread.sleep(4000);
			System.out.println("CSI");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

}
public class ImplementsRunnableInterface {

	public static void main(String[] args) {
		
		Implrun ir= new Implrun();
		Thread t1= new Thread(ir);
		t1.start();
	}
	
}
