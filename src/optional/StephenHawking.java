package optional;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

public class StephenHawking {

	// 1. make a main method and put steps 2, 3 & 4 inside it
	// 2. ask the user for a sentence
	// 3. call the speak method below and send it the sentence
	// 4. repeat steps 2 and 3 a lot of times

	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++) {
			String sentence = JOptionPane.showInputDialog("Type sentence:");
			if (sentence == null) System.exit(0);
			speak(sentence);
		}
	}
	
	
	/* Don’t change this…. */
	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}
