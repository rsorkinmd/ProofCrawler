import javax.sound.midi.Track;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by roman on 26.08.16.
 */
public class SiteBase {
    private TreeSet<String> siteBase = new TreeSet();

    public SiteBase() {
        siteBase.add("http://proofmed.ru");
        siteBase.add("http://www.javaprobooks.ru");
    }

    public TreeSet<String> getSiteBase() {
        return siteBase;
    }
}
