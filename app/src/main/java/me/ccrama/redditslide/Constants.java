package me.ccrama.redditslide;

/**
 * Constants used throughout the app
 */
public class Constants {
    // Maximum posts to request from Reddit
    public static final int PAGINATOR_POST_LIMIT = 25;

    /**
     * This is the estimated height of the Tabs view mode in dp.
     * Use this for calculating the SwipeToRefresh (PTR) progresses indicator offset when using
     * "Tabs" view mode.
     */
    public static final int TAB_HEADER_VIEW_OFFSET = Reddit.dpToPx(108);

    /**
     * This is the estimated height of the toolbar height in dp.
     * Use this for calculating the SwipeToRefresh (PTR) progresses indicator offset when using
     * "Single" view mode.
     */
    public static final int SINGLE_HEADER_VIEW_OFFSET = Reddit.dpToPx(56);

    /**
     * These offsets are used for the SwipeToRefresh (PTR) progress indicator.
     * The TOP offset is used for the starting point of the indicator (underneath the toolbar).
     * The BOTTOM offset is used for the end point of the indicator (below the toolbar).
     * This is used whenever we call mSwipeRefreshLayout.setProgressViewOffset().
     */
    public static final int PTR_OFFSET_TOP = Reddit.dpToPx(40);
    public static final int PTR_OFFSET_BOTTOM = Reddit.dpToPx(18);
}
