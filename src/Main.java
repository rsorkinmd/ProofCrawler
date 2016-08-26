import java.io.File;

/**
 * Created by roman on 26.08.16.
 */
public class Main {
    public static void main(String[] args) {
        SiteBase base = new SiteBase();
        for (String s:base.getSiteBase()) {
            new SiteReader(s, "/Users/roman/Dropbox/Программирование/IdeaProjects/ProofCrawler/" + s.substring(6) + ".txt").exec();
        }
    }
}
