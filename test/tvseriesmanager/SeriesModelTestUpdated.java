/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tvseriesmanager;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for SeriesModel class using JUnit 4.
 * Tests cover searching, updating, deleting series and validating age restrictions.
 * 
 * Author: Alwande Ally
 * Version: 2025.08.30
 */
public class SeriesModelTestUpdated {

    private SeriesModel seriesModel;

    @Before
    public void setUp() {
        seriesModel = new SeriesModel();

        // Add some sample series for testing
        seriesModel.getSeriesList().add(new Series("101", "Extreme Sports", 12, 10));
        seriesModel.getSeriesList().add(new Series("102", "Bargain Hunters", 10, 8));
        seriesModel.getSeriesList().add(new Series("103", "Home Cooking", 10, 20));
    }

    @Test
    public void testSearchSeries() {
        Series series = seriesModel.getSeriesList().stream()
                .filter(s -> s.getSeriesId().equals("101"))
                .findFirst()
                .orElse(null);

        assertNotNull(series);
        assertEquals("Extreme Sports", series.getSeriesName());
        assertEquals(12, series.getSeriesAge());
        assertEquals(10, series.getNumberOfEpisodes());
    }

    @Test
    public void testSearchSeries_SeriesNotFound() {
        Series series = seriesModel.getSeriesList().stream()
                .filter(s -> s.getSeriesId().equals("999"))
                .findFirst()
                .orElse(null);

        assertNull(series);
    }

    @Test
    public void testUpdateSeries() {
        Series series = seriesModel.getSeriesList().stream()
                .filter(s -> s.getSeriesId().equals("102"))
                .findFirst()
                .orElse(null);

        assertNotNull(series);
        series.setSeriesName("Bargain Hunters 2025");
        series.setSeriesAge(11);
        series.setNumberOfEpisodes(12);

        assertEquals("Bargain Hunters 2025", series.getSeriesName());
        assertEquals(11, series.getSeriesAge());
        assertEquals(12, series.getNumberOfEpisodes());
    }

    @Test
    public void testDeleteSeries() {
        Series series = seriesModel.getSeriesList().stream()
                .filter(s -> s.getSeriesId().equals("103"))
                .findFirst()
                .orElse(null);

        assertNotNull(series);
        seriesModel.getSeriesList().remove(series);
        Series deletedSeries = seriesModel.getSeriesList().stream()
                .filter(s -> s.getSeriesId().equals("103"))
                .findFirst()
                .orElse(null);

        assertNull(deletedSeries);
    }

    @Test
    public void testDeleteSeries_SeriesNotFound() {
        Series series = seriesModel.getSeriesList().stream()
                .filter(s -> s.getSeriesId().equals("999"))
                .findFirst()
                .orElse(null);

        assertNull(series);
        // No removal should occur, list size remains the same
        assertEquals(3, seriesModel.getSeriesList().size());
    }

    @Test
    public void testSeriesAgeRestriction_AgeValid() {
        Series series = new Series("104", "Kids Show", 5, 15);
        assertTrue(series.getSeriesAge() >= 2 && series.getSeriesAge() <= 18);
    }

    @Test
    public void testSeriesAgeRestriction_AgeInvalid() {
        Series series = new Series("105", "Adult Show", 25, 12);
        assertFalse(series.getSeriesAge() >= 2 && series.getSeriesAge() <= 18);
    }
}
