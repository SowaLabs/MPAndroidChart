package com.github.mikephil.charting.listener;

/**
 * Listener for callbacks when selecting values inside the chart by
 * touch-gesture.
 *
 * @author Anze Vavpetic
 */
public interface OnChartScrollListener {

    /**
     * Called when a user starts to scroll through the chart
     */
    void onScrollStart();

    /**
     * Called when a user has stopped scrolling through the chart.
     */
    void onScrollEnd();
}
