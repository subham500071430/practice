package restapi;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


class Result {

    /*
     * Complete the 'getTotalGoals' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING team
     *  2. INTEGER year
     */

    public static int getTotalGoals(String team, int year) {

        try {

            URL url1 = new URL("https://jsonmock.hackerrank.com/api/football_matches?year="
                    + year + "&team1=" + team + "&page=1");

            URL url2 = new URL("https://jsonmock.hackerrank.com/api/football_matches?year="
                    + year + "&team2=" + team + "&page=1");

            int total_pages = getTotalPages(url1, "GET");
            int page = 1;
            int total_goals = 0;

            while (page <= total_pages) {
                total_goals += getTotalGoalsByTeam(url1, "GET", "team1");
                page++;
            }

            page = 1;
            total_pages = getTotalPages(url2, "GET");

            while (page <= total_pages) {
                total_goals += getTotalGoalsByTeam(url2, "GET", "team2");
                page++;
            }

            return total_goals;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }


    }


    public static int getTotalPages(URL url, String requestMethod) {

        try {
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod(requestMethod);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            JSONObject object = new JSONObject(response.toString());
            int total_pages = (Integer) object.get("total_pages");
            return total_pages;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int getTotalGoalsByTeam(URL url, String requestMethod, String teamName) {

        try {
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod(requestMethod);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            JSONObject object = new JSONObject(response.toString());
            JSONArray data = (JSONArray) object.get("data");
            int len = (Integer) object.get("total");
            int goals = 0;
            for (int i = 0; i < len; i++) {
                JSONObject obj = (JSONObject) data.get(i);
                goals += Integer.parseInt((String) obj.get(teamName + "goals"));
            }
            return goals;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String team = bufferedReader.readLine();

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.getTotalGoals(team, year);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
