package com.ganapas.sample;

public class SampleMain implements Runnable {

	public static void main(String[] args) {
		System.out.println("Here we Go ...");
		
		Runnable sm = new SampleMain();
		Thread t1 = new Thread(sm);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Gets Called ...");
	}

}
