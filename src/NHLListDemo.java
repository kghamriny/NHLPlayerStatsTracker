import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NHLListDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the file to read from: ");
        String inputFilename = in.nextLine();
        NHLStats stats = new NHLStats();

            File inFile = new File(inputFilename);
            Scanner input = new Scanner(inFile);

            while (input.hasNext()) {
                String line = input.nextLine();
                StringTokenizer token = new StringTokenizer(line);
                String name = token.nextToken();
                String position = token.nextToken();
                String teamName = token.nextToken();
                int gamesPlayed = Integer.parseInt(token.nextToken());
                int goalsScored = Integer.parseInt(token.nextToken());
                int assists = Integer.parseInt(token.nextToken());
                int penaltiesMinutes = Integer.parseInt(token.nextToken());
                int shotOnGoals = Integer.parseInt(token.nextToken());
                int gameWinningGoals = Integer.parseInt(token.nextToken());


                //Create the player to add to the list
                PlayerRecord playerRecord = new PlayerRecord(name, position, teamName, gamesPlayed, goalsScored, assists, penaltiesMinutes, shotOnGoals, gameWinningGoals);
                stats.add(playerRecord);

            }
            input.close();

        PrintWriter output = new PrintWriter("nhlStatsOutput.txt");

        output.println("NHL Results Summary:");
        output.println("Players with highest points and their teams: ");
        List<PlayerRecord> highestPoints = stats.getPlayersWithMostPoints();
        for (int i = 0; i < highestPoints.size(); i++) {
            output.println(highestPoints.getAt(i));
        }

        output.println("Most aggressive players, their teams and their positions: ");
        List<PlayerRecord> mostAggressivePlayers = stats.getMostAggressivePlayers();
        for (int i = 0; i < mostAggressivePlayers.size(); i++) {
            output.println(mostAggressivePlayers.getAt(i));
        }

        output.println("Most valuable players and their teams: ");
        List<PlayerRecord> mostValuablePlayers = stats.getMVPPlayers();
        for (int i = 0; i < mostValuablePlayers.size(); i++) {
            output.println(mostValuablePlayers.getAt(i));
        }

        output.println("Most promising players and their teams: ");
        List<PlayerRecord> mostPromisingPlayers = stats.getMostPromisingPlayers();
        for (int i = 0; i < mostPromisingPlayers.size(); i++) {
            output.println(mostPromisingPlayers.getAt(i));
        }

        output.close();
        System.out.println("The output will be printed to nhlStatsOutput.txt and wont print to the console.");
    }

}

