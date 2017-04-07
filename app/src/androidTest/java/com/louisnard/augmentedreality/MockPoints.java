package com.louisnard.augmentedreality;



import com.louisnard.augmentedreality.model.objects.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Test class that provides a list of mock points: {@link List<Point>}.
 *
 * @author Alexandre Louisnard
 */

public class MockPoints {

    private static List<Point> mPoints = new ArrayList<>(Arrays.asList(new Point("Fort de La Bastille", 45.1987f, 5.7253f, 476),
            new Point("Mont Rachais", 45.2417f, 5.7436f, 1046),
            new Point("Mont Jalla", 45.2041f, 5.7242f, 635),
            new Point("Appartement du développeur :-)", 45.1916626f, 5.7385538f, 250),
            new Point("Moucherotte", 45.1472f, 5.6382f, 1901)));

    /**
     * Returns a list of mock points.
     * @return {@link List<Point>} the list of mock points.
     */
    public static List<Point> getPoints() {
        return mPoints;
    }
}