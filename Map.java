import java.util.HashMap;
import java.util.Set;

public class Map {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        
        //Create HashMap
        trackList.put("Track 1", "Sample Lyrics 1");
        trackList.put("Track 2", "Sample Lyrics 2");
        trackList.put("Track 3", "Sample Lyrics 3");
        trackList.put("Track 4", "Sample Lyrics 4");
        
        //Pull one song
        System.out.println(trackList.get("Track 1"));

        //List all tracks and lyrics.
        Set<String> tracks = trackList.keySet();
        for(String track : tracks) {
            System.out.println(track + ": " + trackList.get(track));
        }
    }
}