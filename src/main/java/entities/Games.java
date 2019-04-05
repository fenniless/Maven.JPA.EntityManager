package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Games {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private int platform;
    @Column
    private String dateReleased;
    @Column
    private int numOfPlayers;
    @Column
    private String overview;
    @Column
    private String rating;
    @Column
    private int genre;

    public Games() {
    }

    public Games(String name, int platform, String dateReleased,
                    int numOfPlayers, String overview, String rating, int genre) {
        this.name = name;
        this.platform = platform;
        this.dateReleased = dateReleased;
        this.numOfPlayers = numOfPlayers;
        this.overview = overview;
        this.rating = rating;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlatform() {
        return platform;
    }

    public void setPlatform(int platform) {
        this.platform = platform;
    }

    public String getDateReleased() {
        return dateReleased;
    }

    public void setDateReleased(String dateReleased) {
        this.dateReleased = dateReleased;
    }

    public int getNumOfPlayers() {
        return numOfPlayers;
    }

    public void setNumOfPlayers(int numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }
}
