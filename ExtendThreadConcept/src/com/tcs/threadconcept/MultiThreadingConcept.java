package com.tcs.threadconcept;

class Table {
	synchronized public void Printable(int n) {
		int i;
		for (i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i*n);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 extends Thread {
	Table t;

	public MyThread1(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.Printable(5);
	}
}

class Mythread2 extends Thread {
	Table t;

	public Mythread2(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.Printable(100);
	}
}

class Mythread3 extends Thread {
	Table t;

	public Mythread3(Table t) {

		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.Printable(1000);
	}
}

class Mythread4 extends Thread {
	Table t;

	public Mythread4(Table t) {

		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		t.Printable(10000);
	}
}

public class MultiThreadingConcept {

	public static void main(String[] args) {

		Table tt = new Table();
		MyThread1 t1 = new MyThread1(tt);
		Mythread2 t2 = new Mythread2(tt);
		Mythread3 t3 = new Mythread3(tt);
		Mythread4 t4 = new Mythread4(tt);
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
