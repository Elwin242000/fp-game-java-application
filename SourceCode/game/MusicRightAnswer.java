package game;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicRightAnswer extends Thread
{
	Clip clip;
	public void playMusic(String filepath, int repeat) throws UnsupportedAudioFileException, IOException, LineUnavailableException 
	{
		File file  = new File(filepath); 
		AudioInputStream audioStream  = AudioSystem.getAudioInputStream(file);
		clip = AudioSystem.getClip();
		clip.open(audioStream);
		clip.start();
		clip.loop(repeat);
	}
	
	public void stopMusic()
	{
		clip.close();
	}
	public MusicRightAnswer()
	{
		try
		{
			playMusic("C:/Users/HP/OneDrive/M?y t?nh/BTVN/mixkit-animated-small-group-applause-523.wav", 1);
		}
		catch(UnsupportedAudioFileException e1) {}
		catch(IOException e2) {}
		catch(LineUnavailableException e3) {}
	}
}
