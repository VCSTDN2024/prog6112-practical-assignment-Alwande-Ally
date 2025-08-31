/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 /*

*/
package tvseriesmanager;

import java.util.Scanner;

/**
 * MainApp is the entry point for the TV Series Manager application.
 * 
 * This console-based application allows users to:
 * - Capture new TV series
 * - Search for a series
 * - Update series details
 * - Delete a series
 * - Print series reports
 * 
 * The class interacts with SeriesModel which manages the series data in memory.
 * Users can navigate through the menu and perform CRUD operations on TV series.
 * 
 * Example usage:
 * 1. Launch the menu
 * 2. Choose an option (1-6)
 * 3. Follow prompts to perform operations
 * 
 * @author Alwande Ally
 * @version 2025.08.30
 */
public class MainApp {

    /**
     * Main method that launches the TV Series Manager application.
     * Handles the menu display and calls appropriate SeriesModel methods
     * based on user input.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SeriesModel seriesModel = new SeriesModel();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nLATEST SERIES - 2025");
            System.out.println("Enter (1) to launch menu or any other key to exit");
            String launch = scanner.nextLine();

            if (!launch.equals("1")) {
                System.out.println("Exiting application...");
                break;
            }

            boolean backToMenu = false;

            while (!backToMenu) {
                System.out.println("\nPlease select one of the following menu items:");
                System.out.println("(1) Capture a new series");
                System.out.println("(2) Search for a series");
                System.out.println("(3) Update series age restriction");
                System.out.println("(4) Delete a series");
                System.out.println("(5) Print series report - 2025");
                System.out.println("(6) Exit Application");
                System.out.print("Enter your choice: ");

                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        seriesModel.captureSeries();
                        break;
                    case "2":
                        seriesModel.searchSeries();
                        break;
                    case "3":
                        seriesModel.updateSeries();
                        break;
                    case "4":
                        seriesModel.deleteSeries();
                        break;
                    case "5":
                        seriesModel.seriesReport();
                        break;
                    case "6":
                        System.out.println("Exiting application...");
                        exit = true;
                        backToMenu = true;
                        break;
                    default:
                        System.out.println("Invalid choice! Please select 1-6.");
                        break;
                }

                if (!exit) {
                    System.out.println("\nEnter (1) to return to menu or any other key to exit");
                    String back = scanner.nextLine();
                    if (!back.equals("1")) {
                        System.out.println("Exiting application...");
                        backToMenu = true;
                        exit = true;
                    }
                }
            }
        }
    }
}
 


 