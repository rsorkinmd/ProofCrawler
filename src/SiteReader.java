import java.io.*;
import java.net.URL;

/**
 * Created by roman on 26.08.16.
 */
public class SiteReader {
    private String siteurl;
    private String filePath;

    public SiteReader(String siteurl, String filePath) {
        this.siteurl = siteurl;
        this.filePath = filePath;
    }

    public void exec () {
        BufferedReader siteReader = null;
         File outputFile = new File(filePath);
        try {
            URL site = new URL(siteurl);
            siteReader = new BufferedReader(new InputStreamReader(site.openStream()));
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)));
            String line = null;
            while ((line = siteReader.readLine()) != null) {
//                System.out.println(line);
                writer.print(line + "\n");
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                siteReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
         }
    }
}
