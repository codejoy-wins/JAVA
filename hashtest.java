import java.util.*;
public class hashtest {
    public static void main (String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("!sad", "suicide");
        trackList.put("moonlight", "spotlight");
        trackList.put("look at me", "can't keep my _ in my pants");
        trackList.put("jocelyn flores", "wanna put 10 shots in my brain");
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.print(key + ": ");
            System.out.println(trackList.get(key));
        }
        String name = trackList.get("moonlight");
        System.out.println("the lyrics you requested are: " + name);
    }
}
