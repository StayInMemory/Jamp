package Jamp;

import java.io.*;
import javax.sound.sampled.*;

public class PlayerConcrete implements Player{
	protected boolean isPlayingNow = false;
	SourceDataLine soundLine = null;
	Thread playingThread = null;
    int nBytesRead = 0;
    int BUFFER_SIZE = 64*1024;  // 64 KB
    byte[] sampledData = new byte[BUFFER_SIZE];
    boolean puased = false; 
	File soundFile = new File("testFiles/test.wav");
    

	@Override
	public boolean isPlaying() {
		return isPlayingNow;
	}

	@Override
	public void play() {
	  	// TODO Auto-generated method stub
		isPlayingNow = true;
		playingThread = new Thread(new Runnable() {
			@Override
			public void run() {
		        // Set up an audio input stream piped from the sound file.
			    try {
			        //soundFile로 부터 AudioInputStream 객체 생성
			        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
			        AudioFormat audioFormat = audioInputStream.getFormat();
			        DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
			        soundLine = (SourceDataLine) AudioSystem.getLine(info);
			        soundLine.open(audioFormat);
			        soundLine.start();
			        //입력이 끝날때 까지 nByte단위로 반복적으로 읽어들인다.
			        while (nBytesRead != -1 && !puased) {
			            nBytesRead = audioInputStream.read(sampledData, 0, sampledData.length);
			            if (nBytesRead >= 0) {
			                // Writes audio data to the mixer via this source data line.
			                soundLine.write(sampledData, 0, nBytesRead);
			            }
			        }
			    } catch (UnsupportedAudioFileException ex) {
			        ex.printStackTrace();
			    } catch (IOException ex) {
			        ex.printStackTrace();
			    } catch (LineUnavailableException ex) {
			        ex.printStackTrace();
			    } finally {
			        soundLine.drain();
			        soundLine.close();
			    }
			}
		});
		playingThread.start();
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
		isPlayingNow = false;
		puased = true;
        //soundLine.write(b, offset, nBytesRead); 
        //this is the final invocation of write
        soundLine.drain();
        soundLine.stop();
        soundLine.close();
        soundLine = null;
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
	//	soundLine.write(b, offset, nBytesRead); 
		//this is the final invocation of write
		soundLine.drain();
		soundLine.stop();
		soundLine.close();
		soundLine = null;
	}
	@Override
	public void prev() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void next() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fastForward() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void rewind() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void help() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void report() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void about() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void quit() {
		// TODO Auto-generated method stub
		stop();
		System.exit(0);
	}
}
