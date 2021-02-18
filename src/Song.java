import java.util.Arrays;
/**
 * A class that represents songs.
 * 
 * 
 * @author Jaden Mason
 * @version 1.0
 * 
 */


public class Song 
{
	
	private String title;
	private String artist;
	private int[] time;
	
	/**
	 * Initialize a Song object using the variables artist, title, and time.
	 * 
	 * 
	 * @param title  A string variable for a song's title
	 * @param artist A string variable for a song's artist
	 * @param time   An integer array for the duration of a song
	 */
	public Song(String title, String artist, int[] time) 
	{
		this.title = title;
		this.artist = artist;
		this.time = Arrays.copyOf(time, time.length);
	}
	
	public String getTitle() 
	{
		return title;
	}
	
	public String getArtist() 
	{
		return artist;
	}
	
	public int[] getTime() 
	{
		return Arrays.copyOf(time, time.length);
	}
}
