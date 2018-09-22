package controller;

public class SeqThreads extends Thread{
	
	private long thread;
	
	
	@Override
	public void run() {
		
		metodo();
		
	}
	
	public void metodo (){
		
		thread = getId();
		System.out.println("Thread nº " + thread + " rodou");
	}

}
