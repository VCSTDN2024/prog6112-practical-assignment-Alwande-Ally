/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tvseriesmanager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * SeriesModel manages the TV series data for the TV Series Manager application.
 * It allows capturing, searching, updating, deleting series and generating series reports.
 * All series are stored in-memory using an ArrayList.
 * 
 * Author: Alwande Ally
 * Version: 2025.08.30
 */
public class SeriesModel {

    private final ArrayList<Series> seriesList;
    private final Scanner scanner;

    /**
     * Constructor initializes the series list and the scanner for user input.
     */
    public SeriesModel() {
        seriesList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    /**
     * Returns the list of series.
     * @return ArrayList of Series objects
     */
    public ArrayList<Series> getSeriesList() {
        return seriesList;
    }

    /**
     * Captures a new series from user input and adds it to the series list.
     */
    public void captureSeries() {
        System.out.println("\nCAPTURE A NEW SERIES");
        System.out.print("Enter the series id: ");
        String id = scanner.nextLine();
        System.out.print("Enter the series name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the series age restriction: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the number of episodes for " + name + ": ");
        int episodes = Integer.parseInt(scanner.nextLine());

        Series series = new Series(id, name, age, episodes);
        seriesList.add(series);

        System.out.println("Series processed successfully!");
    }

    /**
     * Searches for a series by its ID and prints the details if found.
     */
    public void searchSeries() {
        System.out.print("\nEnter the series id to search: ");
        String id = scanner.nextLine();

        Series series = seriesList.stream()
                .filter(s -> s.getSeriesId().equals(id))
                .findFirst()
                .orElse(null);

        if (series != null) {
            System.out.println(series);
        } else {
            System.out.println("Series with Series Id: " + id + " was not found!");
        }
    }

    /**
     * Updates a series' details including name, age restriction, and number of episodes.
     */
    public void updateSeries() {
        System.out.print("\nEnter the series id to update: ");
        String id = scanner.nextLine();

        Series series = seriesList.stream()
                .filter(s -> s.getSeriesId().equals(id))
                .findFirst()
                .orElse(null);

        if (series != null) {
            System.out.print("Enter the new series name: ");
            String name = scanner.nextLine();
            System.out.print("Enter the new age restriction: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the new number of episodes: ");
            int episodes = Integer.parseInt(scanner.nextLine());

            series.setSeriesName(name);
            series.setSeriesAge(age);
            series.setNumberOfEpisodes(episodes);

            System.out.println("Series updated successfully!");
        } else {
            System.out.println("Series with Series Id: " + id + " was not found!");
        }
    }

    /**
     * Deletes a series by its ID.
     */
    public void deleteSeries() {
        System.out.print("\nEnter the series id to delete: ");
        String id = scanner.nextLine();

        Series seriesToDelete = seriesList.stream()
                .filter(s -> s.getSeriesId().equals(id))
                .findFirst()
                .orElse(null);

        if (seriesToDelete != null) {
            seriesList.remove(seriesToDelete);
            System.out.println("Series deleted successfully!");
        } else {
            System.out.println("Series with Series ID: " + id + " was not found!");
        }
    }

    /**
     * Prints a report of all series stored in memory.
     */
    public void seriesReport() {
        System.out.println("\n--- SERIES REPORT 2025 ---");
        if (seriesList.isEmpty()) {
            System.out.println("No series available.");
        } else {
            for (Series series : seriesList) {
                System.out.println(series);
                System.out.println("------------------------");
            }
        }
    }
}

        
