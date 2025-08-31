/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tvseriesmanager;

/**
 * Series represents a TV series object in the TV Series Manager application.
 * Each Series has an ID, a name, an age restriction, and a number of episodes.
 * 
 * This class uses encapsulation to protect data and provides getter and setter
 * methods to access and update series information safely.
 * 
 * Example usage:
 * Series s = new Series("101", "Extreme Sports", 12, 10);
 * System.out.println(s.getSeriesName()); // Prints "Extreme Sports"
 * 
 * @author Alwande Ally
 * @version 2025.08.30
 */
public class Series {

    private String seriesId;
    private String seriesName;
    private int seriesAge; // age restriction
    private int numberOfEpisodes;

    /**
     * Constructor to create a new Series object.
     * 
     * @param seriesId         Unique identifier for the series
     * @param seriesName       Name of the series
     * @param seriesAge        Age restriction for the series (2-18)
     * @param numberOfEpisodes Number of episodes in the series
     */
    public Series(String seriesId, String seriesName, int seriesAge, int numberOfEpisodes) {
        this.seriesId = seriesId;
        this.seriesName = seriesName;
        this.seriesAge = seriesAge;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    // -------------------- Getters --------------------

    /**
     * Returns the series ID.
     * @return seriesId
     */
    public String getSeriesId() {
        return seriesId;
    }

    /**
     * Returns the series name.
     * @return seriesName
     */
    public String getSeriesName() {
        return seriesName;
    }

    /**
     * Returns the age restriction for the series.
     * @return seriesAge
     */
    public int getSeriesAge() {
        return seriesAge;
    }

    /**
     * Returns the number of episodes.
     * @return numberOfEpisodes
     */
    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    // -------------------- Setters --------------------

    /**
     * Sets the series ID.
     * @param seriesId Unique identifier for the series
     */
    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    /**
     * Sets the series name.
     * @param seriesName Name of the series
     */
    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    /**
     * Sets the age restriction for the series.
     * @param seriesAge Age restriction (must be between 2 and 18)
     */
    public void setSeriesAge(int seriesAge) {
        this.seriesAge = seriesAge;
    }

    /**
     * Sets the number of episodes.
     * @param numberOfEpisodes Number of episodes in the series
     */
    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    // -------------------- Utility Methods --------------------

    /**
     * Returns a formatted string representation of the series.
     * @return Formatted series details
     */
    public String toString() {
        return "SERIES ID: " + seriesId +
               "\nSERIES NAME: " + seriesName +
               "\nSERIES AGE RESTRICTION: " + seriesAge +
               "\nNUMBER OF EPISODES: " + numberOfEpisodes;
    }
}
