package com.jbk.day26thread;

public class TestRunnable {
	public static void main(String[] args) throws InterruptedException {
		RunnableThread t1 = new RunnableThread();
		Thread t = new Thread(t1);
		System.out.println(t.getState());
		t.start();
		System.out.println(t.getState());
		t.join();
	}

}
