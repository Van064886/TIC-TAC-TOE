package Van064886.tictactoetrain;

import java.util.Date;

public class ScoreItem {
    private int id;
    private String players;
    private String winner;
    private Date date;

    public ScoreItem(int id, String players, String winner, Date date){
        this.id = id;
        this.players = players;
        this.winner = winner;
        this.date = date;
    }

    public int getId(){return id;}
    public String getPlayers(){return players;}
    public String getWinner(){return winner;}
    public Date getDate(){return date;}
}