package com.cg.exception;
import javax.sound.midi.*;

public class MusicMini {

	public static void main(String[] args) {
		MusicMini mini = new MusicMini();
		mini.play();
	}
	public void play() {
		try {
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			Sequence seq = new Sequence(Sequence.PPQ,4);
			Track track = seq.createTrack();
			
			ShortMessage a = new ShortMessage();
			a.setMessage(192,1,102,0);
			MidiEvent noteon = new MidiEvent(a,1);
			track.add(noteon);
			
			ShortMessage b = new ShortMessage();
			b.setMessage(128,1,44,100);
			MidiEvent noteoff = new MidiEvent(b,200);
			track.add(noteoff);
			
			player.setSequence(seq);
			player.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
