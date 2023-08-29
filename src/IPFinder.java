import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class IPFinder {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://api64.ipify.org?format=json");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String response = reader.readLine();
            reader.close();

            String ipAddress = response.substring(response.indexOf(":\"") + 2, response.lastIndexOf("\""));

            System.out.println("Your external IP address: " + ipAddress);
        } catch (IOException e) {
            System.err.println("Error fetching external IP: " + e.getMessage());
        }
    }
}


