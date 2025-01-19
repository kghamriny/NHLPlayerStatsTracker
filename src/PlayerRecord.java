public class PlayerRecord {

    private String name;
    private String position;
    private String teamName;
    private int gamesPlayed;
    private int goalsScored;
    private int assists;
    private int penaltiesMinutes;
    private int shotsOnGoals;
    private int gameWinningGoals;

    public PlayerRecord(String name, String position, String teamName, int gamesPlayed, int goalsScored, int assists, int penaltiesMinutes,
                        int shotsOnGoals, int gameWinningGoals) {
        this.name = name;
        this.position = position;
        this.teamName = teamName;
        this.gamesPlayed = gamesPlayed;
        this.goalsScored = goalsScored;
        this.assists = assists;
        this.penaltiesMinutes = penaltiesMinutes;
        this.shotsOnGoals = shotsOnGoals;
        this.gameWinningGoals = gameWinningGoals;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getAssists() {
        return assists;
    }

    public int getPenaltiesMinutes() {
        return penaltiesMinutes;
    }

    public int getShotsOnGoals() {
        return shotsOnGoals;
    }

    public int getGameWinningGoals() {
        return gameWinningGoals;
    }

    public String toString() {
        return name + " " + position + " " + teamName + " " + gamesPlayed + " " + goalsScored + " " + assists + " " + penaltiesMinutes + " " + shotsOnGoals + " " + gameWinningGoals;
    }
}
