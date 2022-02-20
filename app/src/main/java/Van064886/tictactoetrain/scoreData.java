package Van064886.tictactoetrain;

public class scoreData
{
    private static int id = 0;
    private String joueur1;
    private String joueur2;
    private String winner;
    private String date;

    // Constructeurs
    public scoreData()
    {
        this.id += 1;
    }
    public scoreData( String joueur1 , String joueur2 , String winner , String date )
    {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.date = date;
        this.winner = winner;
    }

    // Getters & setters
    public static int getId()
    {
        return id;
    }

    public String getJoueur1()
    {
        return joueur1;
    }

    public void setJoueur1(String joueur1)
    {
        this.joueur1 = joueur1;
    }

    public String getJoueur2()
    {
        return joueur2;
    }

    public void setJoueur2(String joueur2)
    {
        this.joueur2 = joueur2;
    }

    public String getWinner()
    {
        return winner;
    }

    public void setWinner(String winner)
    {
        this.winner = winner;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }
}
