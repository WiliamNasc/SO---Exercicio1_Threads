package view;

import controller.SeqThreads;

public class Main {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 5;i ++){
		
		SeqThreads seqt = new SeqThreads();
		seqt.start();

		}
	}

}
