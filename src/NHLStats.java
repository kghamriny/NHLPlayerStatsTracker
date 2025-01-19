public class NHLStats {
    private List<PlayerRecord> allPlayersStats;

    public NHLStats() {
        allPlayersStats = new List<PlayerRecord>();
    }

    public List<PlayerRecord> getPlayersWithMostPoints() {

        List<PlayerRecord> playersWithMostPoints = new List<PlayerRecord>();
        int currentPoints = 0;
        int mostPoints = 0;
        int size = allPlayersStats.size();

        for (int i = 0; i < size; i++) {
            currentPoints = allPlayersStats.getAt(i).getAssists() + allPlayersStats.getAt(i).getGoalsScored();

            if (currentPoints > mostPoints) {
                mostPoints = currentPoints;
                //Clear so that we can remove all previous players that had fewer points.
                playersWithMostPoints.clear();
                playersWithMostPoints.add(allPlayersStats.getAt(i));
            }
            //If two players have the same number of points, add both to the list.
            else if (currentPoints == mostPoints) {

                playersWithMostPoints.add(allPlayersStats.getAt(i));
            }
        }

        return playersWithMostPoints;
    }

    public List<PlayerRecord> getMostAggressivePlayers() {

        List<PlayerRecord> mostAggressivePlayers = new List<PlayerRecord>();
        int currentPenaltiesMinutes = 0;
        int mostPenaltiesMinutes = 0;
        int size = allPlayersStats.size();

        for (int i = 0; i < size; i++) {
            currentPenaltiesMinutes = allPlayersStats.getAt(i).getPenaltiesMinutes();

            if (currentPenaltiesMinutes > mostPenaltiesMinutes) {
                mostPenaltiesMinutes = currentPenaltiesMinutes;
                //Clear so that we can remove all previous players that had fewer penalty minutes.
                mostAggressivePlayers.clear();
                mostAggressivePlayers.add(allPlayersStats.getAt(i));
            }
            //If two players have the same number of penalty minutes, add both to the list.
            else if (currentPenaltiesMinutes == mostPenaltiesMinutes) {

                mostAggressivePlayers.add(allPlayersStats.getAt(i));
            }
        }

        return mostAggressivePlayers;
    }

    public List<PlayerRecord> getMVPPlayers() {

        List<PlayerRecord> mvpPlayers = new List<PlayerRecord>();
        int currentGameWinningGoals = 0;
        int mostGameWinningGoals = 0;
        int size = allPlayersStats.size();

        for (int i = 0; i < size; i++) {
            currentGameWinningGoals = allPlayersStats.getAt(i).getGameWinningGoals();

            if (currentGameWinningGoals > mostGameWinningGoals) {
                mostGameWinningGoals = currentGameWinningGoals;
                //Clear so that we can remove all previous players that had fewer game winning goals.
                mvpPlayers.clear();
                mvpPlayers.add(allPlayersStats.getAt(i));
            }
            //If two players have the same number of game winning goals, add both to the list.
            else if (currentGameWinningGoals == mostGameWinningGoals) {

                mvpPlayers.add(allPlayersStats.getAt(i));
            }
        }

        return mvpPlayers;
    }

    public List<PlayerRecord> getMostPromisingPlayers() {

        List<PlayerRecord> mostPromisingPlayers = new List<PlayerRecord>();
        int currentShotsOnGoal = 0;
        int mostshotsOnGoal = 0;
        int size = allPlayersStats.size();

        for (int i = 0; i < size; i++) {
            currentShotsOnGoal = allPlayersStats.getAt(i).getShotsOnGoals();

            if (currentShotsOnGoal > mostshotsOnGoal) {
                mostshotsOnGoal = currentShotsOnGoal;
                //Clear so that we can remove all previous players that had fewer shots on goal.
                mostPromisingPlayers.clear();
                mostPromisingPlayers.add(allPlayersStats.getAt(i));
            }
            //If two players have the same number of shots on goal, add both to the list.
            else if (currentShotsOnGoal == mostshotsOnGoal) {

                mostPromisingPlayers.add(allPlayersStats.getAt(i));
            }
        }

        return mostPromisingPlayers;
    }

    public void add(PlayerRecord playerRecord) {
        allPlayersStats.add(playerRecord);
    }

//    public List<PlayerRecord> getTeamWithMostPenaltiesMinutes() {
//
//        List<String> allTeams = new List<String>();
//        List<Integer> allTeamPenaltyMinutes = new List<Integer>();
//        List<PlayerRecord> TeamWithMostPenaltiesMinutes = new List<PlayerRecord>();
//  //
//        return TeamWithMostPenaltiesMinutes;
//    }

}
