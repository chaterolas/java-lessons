package com.nielsen.convensiondemo;

import java.util.List;
import java.util.Vector;

public class ThreadExample extends Thread {
	
	private static List<String> sharedStringList = new Vector<>();
	
	public ThreadExample() {
		super();
	}

	public ThreadExample(String name) {
		super(name);
	}

	@Override
	public void run() {
		try {
			int timeToSleep = (int)(Math.random() * 5000.0); 
			sleep(timeToSleep);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		sharedStringList.add(getName());
		System.out.println("Hola Mundo " + getName());
	}
	
	public static void main(String[] arguments) {
		System.out.println("Starting concurrent context");
		
		for(int i=1; i<=5; i++) {
			new ThreadExample("thread " + i).start();
		}
		
		try {
			Thread.sleep(15000);
			for(String currentValue : sharedStringList) {
				System.out.println(currentValue);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Thread thread = new Thread(new RunnableImpl());
		//thread.start();
		
		System.out.println("Ending concurrent context");
	}
}

class RunnableImpl implements Runnable {
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Hola Mundo from thread class that implements Runnable");
	}
}

