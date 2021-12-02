package com.tcs.threadconcept;

class ExThread extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    int i;
	    for(i=1;i<=10;i++){
	    	try {
				Thread.sleep(2000);
				System.out.println("CSI");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}
}

public class ExtendThreadConcept {
	public static void main(String[] args) {
		ExThread t1= new ExThread();
		t1.start();
	}

}
