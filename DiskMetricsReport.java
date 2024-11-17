import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class DiskMetricsReport {

    public static void main(String[] args) {
        String apiUrl = "https://challenge.logicmonitor.dev/api/diskmetrics";
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer your_api_key_here"); 

            int status = connection.getResponseCode();
            if (status != 200) {
                System.out.println("Error: API request failed with status code " + status);
                return;
            }

            
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JsonArray disks = JsonParser.parseString(response.toString()).getAsJsonArray();
            double totalUsedBytes = 0;
            double totalFreeBytes = 0;

            for (int i = 0; i < disks.size(); i++) {
                JsonObject disk = disks.get(i).getAsJsonObject();

                System.out.println("Disk " + (i + 1) + " keys: " + disk.keySet());

                String model = disk.has("model") ? disk.get("model").getAsString() : "Unknown Model";
                String serialNumber = disk.has("serial") ? disk.get("serial").getAsString() : "Unknown Serial";

                long totalBytes = disk.get("totalBytes").getAsLong();
                long freeBytes = disk.get("freeBytes").getAsLong();
                long usedBytes = totalBytes - freeBytes;
                double usagePercentage = (double) usedBytes / totalBytes * 100;


                System.out.printf("[%s - %s] is using %d byte(s) out of a total of %d byte(s), giving it a current usage of %.2f%%\n",
                                  model, serialNumber, usedBytes, totalBytes, usagePercentage);

    
                totalUsedBytes += usedBytes;
                totalFreeBytes += freeBytes;
            }

            double totalBytesInTB = (totalUsedBytes + totalFreeBytes) / (1024.0 * 1024 * 1024 * 1024);
            double usedBytesInTB = totalUsedBytes / (1024.0 * 1024 * 1024 * 1024);
            double freeBytesInTB = totalFreeBytes / (1024.0 * 1024 * 1024 * 1024);


            System.out.printf("The machine has %.2f/%.2f TB available.\n", freeBytesInTB, totalBytesInTB);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}