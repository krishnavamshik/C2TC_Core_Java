package com.cg.exception;

import javax.sound.midi.*;

public class Music {
	public void play() {
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			
		} catch (MidiUnavailableException e) {
			System.out.println("wrong");
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		Music m = new Music();
		m.play();
		

	}

}
