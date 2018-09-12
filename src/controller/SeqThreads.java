package controller;

public class SeqThreads extends Thread{
	
	private long thread;
	private int cont;
	
	
	public void SeqThreads (long thread){
		
		this.thread = thread;
		this.cont = cont;
		
	}
	
	@Override
	public void run() {
		
		metodo();
		
	}
	
	public void metodo (){
		
		thread = getId();
		System.out.println("Thread nº " + thread + " rodou");
	}

}
