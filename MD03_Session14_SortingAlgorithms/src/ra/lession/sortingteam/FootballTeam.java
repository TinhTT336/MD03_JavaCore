package ra.lession.sortingteam;

public class FootballTeam {
    private int footballTeamId;
    static int count=10;
    private String name;
    private int numerOfPlayer;
    private int score;

    public FootballTeam() {
        this.footballTeamId=FootballTeam.count++;
    }

    public FootballTeam( String name, int numerOfPlayer, int score) {
        this.footballTeamId = FootballTeam.count++;
        this.name = name;
        this.numerOfPlayer = numerOfPlayer;
        this.score = score;
    }

    public int getFootballTeamId() {
        return footballTeamId;
    }

    public void setFootballTeamId(int footballTeamId) {
        this.footballTeamId = footballTeamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumerOfPlayer() {
        return numerOfPlayer;
    }

    public void setNumerOfPlayer(int numerOfPlayer) {
        this.numerOfPlayer = numerOfPlayer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "footballTeamId=" + footballTeamId +
                ", name='" + name + '\'' +
                ", numerOfPlayer=" + numerOfPlayer +
                ", score=" + score +
                '}';
    }
}
