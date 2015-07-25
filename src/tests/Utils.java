package tests;

/**
 * Created by pkarpala on 7/25/2015.
 */
public class Utils {
    public static String ReadResourceString(String path) {

        try {
            java.net.URL url = Utils.class.getClassLoader().getResource(path);
            java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
            String contents = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");

            return contents.trim();
        } catch (Exception ex) {

        }

        return null;
    }
}
