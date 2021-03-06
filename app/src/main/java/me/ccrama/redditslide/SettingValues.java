package me.ccrama.redditslide;

import android.content.SharedPreferences;

import net.dean.jraw.models.CommentSort;
import net.dean.jraw.paginators.Sorting;
import net.dean.jraw.paginators.TimePeriod;

import me.ccrama.redditslide.Views.CreateCardView;
import me.ccrama.redditslide.Visuals.Palette;

/**
 * Created by ccrama on 9/19/2015.
 */
public class SettingValues {
    public static final String PREF_SINGLE = "Single";
    public static final String PREF_FAB = "Fab";
    public static final String PREF_UPVOTE_PERCENTAGE = "upvotePercentage";
    public static final String PREF_FAB_TYPE = "FabType";
    public static final String PREF_DAY_TIME = "day";
    public static final String PREF_NIGHT_TIME = "nightTime";
    public static final String PREF_AUTOHIDE_COMMENTS = "autohideComments";
    public static final String PREF_NO_IMAGES = "noImages";
    public static final String PREF_AUTOTHEME = "autotime";
    public static final String PREVIEWS_LEFT = "previewsLeft";
    public static final String PREF_COLOR_BACK = "colorBack";
    public static final String PREF_COLOR_NAV_BAR = "colorNavBar";
    public static final String PREF_COLOR_EVERYWHERE = "colorEverywhere";
    public static final String PREF_EXPANDED_TOOLBAR = "expandedToolbar";
    public static final String PREF_SWAP = "Swap";
    public static final String PREFS_WEB = "web";
    public static final String PREF_ACTIONBAR_VISIBLE = "actionbarVisible";
    public static final String PREF_SMALL_TAG = "smallTag";
    public static final String PREF_ACTIONBAR_TAP = "actionbarTap";
    public static final String PREF_CUSTOMTABS = "customtabs";
    public static final String PREF_STORE_HISTORY = "storehistory";
    public static final String PREF_STORE_NSFW_HISTORY = "storensfw";
    public static final String PREF_SCROLL_SEEN = "scrollSeen";
    public static final String PREF_TITLE_FILTERS = "titleFilters";
    public static final String PREF_TEXT_FILTERS = "textFilters";
    public static final String PREF_DOMAIN_FILTERS = "domainFilters";
    public static final String PREF_ALWAYS_EXTERNAL = "alwaysExternal";
    public static final String PREF_DRAFTS = "drafts";
    public static final String PREF_SUBREDDIT_FILTERS = "subredditFilters";
    public static final String PREF_COMMENT_LAST_VISIT = "commentLastVisit";
    public static final String PREF_VOTES_INFO_LINE = "votesInfoLine";
    public static final String PREF_TYPE_INFO_LINE = "typeInfoLine";
    public static final String PREF_COMMENT_PAGER = "commentPager";
    public static final String PREF_COLLAPSE_COMMENTS = "collapseCOmments";
    public static final String PREF_COLLAPSE_COMMENTS_DEFAULT = "collapseCommentsDefault";
    public static final String PREF_RIGHT_HANDED_COMMENT_MENU = "rightHandedCommentMenu";
    public static final String PREF_DUAL_PORTRAIT = "dualPortrait";
    public static final String PREF_CROP_IMAGE = "cropImage";
    public static final String PREF_COMMENT_FAB = "commentFab";
    public static final String PREF_SWITCH_THUMB = "switchThumb";
    public static final String PREF_LOW_RES_ALWAYS = "lowResAlways";
    public static final String PREF_LOW_RES_MOBILE = "lowRes";
    public static final String PREF_IMAGE_LQ = "imageLq";
    public static final String PREF_COLOR_SUB_NAME = "colorSubName";
    public static final String PREF_OVERRIDE_LANGUAGE = "overrideLanguage";
    public static final String PREF_SHOW_DOMAIN = "showDomain";
    public static final String PREF_CARD_TEXT = "cardText";
    public static final String PREF_ZOOM_DEFAULT = "zoomDefault";
    public static final String PREF_SUBREDDIT_SEARCH_METHOD = "subredditSearchMethod";
    public static final String PREF_IMGUR_LQ = "imgurLq";

    public static final String PREF_FULL_COMMENT_OVERRIDE = "fullCommentOverride";
    public static final String PREF_ALBUM = "album";
    public static final String PREF_GIF = "gif";
    public static final String PREF_EXIT = "Exit";
    public static final String PREF_FASTSCROLL = "Fastscroll";
    public static final String PREF_FAB_CLEAR = "fabClear";
    public static final String PREF_HIDEBUTTON = "Hidebutton";
    public static final String PREF_SAVE_BUTTON = "saveButton";
    public static final String PREF_IMAGE = "image";
    public static final String PREF_SELFTEXT_IMAGE_COMMENT = "selftextImageComment";
    public static final String SYNCCIT_AUTH = "SYNCCIT_AUTH";
    public static final String SYNCCIT_NAME = "SYNCCIT_NAME";
    public static final String PREF_BLUR = "blur";
    public static final String PREF_ALBUM_SWIPE = "albumswipe";
    public static final String PREF_COMMENT_NAV = "commentVolumeNav";
    public static final String PREF_COLOR_COMMENT_DEPTH = "colorCommentDepth";

    public static CreateCardView.CardEnum defaultCardView;
    public static Sorting defaultSorting;
    public static TimePeriod timePeriod;
    public static CommentSort defaultCommentSorting;
    public static boolean middleImage;
    public static boolean bigPicEnabled;
    public static boolean bigPicCropped;
    public static ColorMatchingMode colorMatchingMode;
    public static ColorIndicator colorIndicator;
    public static Palette.ThemeEnum theme;
    public static SharedPreferences prefs;
    public static boolean expandedToolbar;
    public static boolean single;
    public static boolean swap;
    public static boolean album;
    public static boolean cache;
    public static boolean expandedSettings;
    public static boolean fabComments;
    public static boolean cacheDefault;
    public static boolean image;
    public static boolean video;
    public static boolean upvotePercentage;
    public static boolean colorBack;
    public static boolean colorNavBar;
    public static boolean actionbarVisible;
    public static boolean actionbarTap;
    public static boolean commentAutoHide;
    public static boolean fullCommentOverride;
    public static boolean lowResAlways;
    public static boolean noImages;
    public static boolean lowResMobile;
    public static boolean blurCheck;
    public static boolean swipeAnywhere;
    public static boolean commentLastVisit;
    public static boolean storeHistory;
    public static boolean storeNSFWHistory;
    public static boolean scrollSeen;
    public static boolean saveButton;
    public static boolean colorEverywhere;
    public static boolean gif;
    public static boolean colorCommentDepth;
    public static boolean web;
    public static boolean commentVolumeNav;
    public static boolean postNav;
    public static boolean exit;
    public static boolean cropImage;
    public static boolean smallTag;
    public static boolean typeInfoLine;
    public static boolean votesInfoLine;
    public static boolean collapseComments;
    public static boolean collapseCommentsDefault;
    public static boolean rightHandedCommentMenu;
    public static int subredditSearchMethod;

    public static int previews;

    public static String synccitName;
    public static String synccitAuth;

    public static String titleFilters;
    public static String textFilters;
    public static String domainFilters;
    public static String subredditFilters;
    public static String alwaysExternal;
    public static boolean loadImageLq;

    public static boolean fastscroll;
    public static boolean fab = true;
    public static int fabType = R.integer.FAB_POST;
    public static boolean hideButton;
    public static boolean tabletUI;
    public static boolean customtabs;
    public static boolean dualPortrait;
    public static int nighttime;
    public static int daytime;
    public static boolean autoTime;
    public static boolean albumSwipe;
    public static boolean switchThumb;
    public static boolean commentPager;
    public static boolean colorSubName;
    public static boolean hideSelftextLeadImage;
    public static boolean overrideLanguage;
    public static boolean showDomain;
    public static boolean cardText;
    public static boolean alwaysZoom;
    public static boolean imgurLq = true;
    public static int currentTheme; //current base theme (Light, Dark, Dark blue, etc.)

    public static void setAllValues(SharedPreferences settings) {
        prefs = settings;
        defaultCardView = CreateCardView.CardEnum.valueOf(settings.getString("defaultCardViewNew", "LARGE").toUpperCase());
        middleImage = settings.getBoolean("middleImage", false);

        bigPicCropped = settings.getBoolean("bigPicCropped", true);
        bigPicEnabled = settings.getBoolean("bigPicEnabled", true);

        colorMatchingMode = ColorMatchingMode.valueOf(settings.getString("ccolorMatchingModeNew", "MATCH_EXTERNALLY"));
        colorIndicator = ColorIndicator.valueOf(settings.getString("colorIndicatorNew", "CARD_BACKGROUND"));
        defaultSorting = Sorting.valueOf(settings.getString("defaultSorting", "HOT"));
        timePeriod = TimePeriod.valueOf(settings.getString("timePeriod", "DAY"));
        defaultCommentSorting = CommentSort.valueOf(settings.getString("defaultCommentSortingNew", "CONFIDENCE"));

        single = prefs.getBoolean(PREF_SINGLE, false);
        blurCheck = prefs.getBoolean(PREF_BLUR, false);
        overrideLanguage = prefs.getBoolean(PREF_OVERRIDE_LANGUAGE, false);

        commentVolumeNav = prefs.getBoolean(PREF_COMMENT_NAV, false);
        postNav = false;

        fab = prefs.getBoolean(PREF_FAB, true);
        fabType = prefs.getInt(PREF_FAB_TYPE, R.integer.FAB_DISMISS);
        subredditSearchMethod = prefs.getInt(PREF_SUBREDDIT_SEARCH_METHOD, R.integer.SUBREDDIT_SEARCH_METHOD_DRAWER);
        nighttime = prefs.getInt(PREF_DAY_TIME, 20);
        daytime = prefs.getInt(PREF_NIGHT_TIME, 6);
        autoTime = prefs.getBoolean(PREF_AUTOTHEME, false);
        colorBack = prefs.getBoolean(PREF_COLOR_BACK, false);
        cardText = prefs.getBoolean(PREF_CARD_TEXT, false);
        colorNavBar = prefs.getBoolean(PREF_COLOR_NAV_BAR, false);
        colorEverywhere = prefs.getBoolean(PREF_COLOR_EVERYWHERE, true);
        colorCommentDepth = prefs.getBoolean(PREF_COLOR_COMMENT_DEPTH, true);
        alwaysZoom = prefs.getBoolean(PREF_ZOOM_DEFAULT, true);
        collapseComments = prefs.getBoolean(PREF_COLLAPSE_COMMENTS, false);
        collapseCommentsDefault = prefs.getBoolean(PREF_COLLAPSE_COMMENTS_DEFAULT, false);
        rightHandedCommentMenu = prefs.getBoolean(PREF_RIGHT_HANDED_COMMENT_MENU, false);
        commentAutoHide = prefs.getBoolean(PREF_AUTOHIDE_COMMENTS, false);

        typeInfoLine = prefs.getBoolean(PREF_TYPE_INFO_LINE, false);
        votesInfoLine = prefs.getBoolean(PREF_VOTES_INFO_LINE, false);

        imgurLq = prefs.getBoolean(PREF_IMGUR_LQ, true);
        noImages = prefs.getBoolean(PREF_NO_IMAGES, false);

        lowResAlways = prefs.getBoolean(PREF_LOW_RES_ALWAYS, false);
        lowResMobile = prefs.getBoolean(PREF_LOW_RES_MOBILE, false);
        loadImageLq = prefs.getBoolean(PREF_IMAGE_LQ, false);
        showDomain = prefs.getBoolean(PREF_SHOW_DOMAIN, false);
        expandedToolbar = prefs.getBoolean(PREF_EXPANDED_TOOLBAR, false);
        fullCommentOverride = prefs.getBoolean(PREF_FULL_COMMENT_OVERRIDE, false);
        commentPager = prefs.getBoolean(PREF_COMMENT_PAGER, false);
        smallTag = prefs.getBoolean(PREF_SMALL_TAG, false);
        swap = prefs.getBoolean(PREF_SWAP, false);
        hideSelftextLeadImage = prefs.getBoolean(PREF_SELFTEXT_IMAGE_COMMENT, false);
        web = prefs.getBoolean(PREFS_WEB, true);
        image = prefs.getBoolean(PREF_IMAGE, true);
        cache = true;
        cacheDefault = false;
        customtabs = prefs.getBoolean(PREF_CUSTOMTABS, true);
        storeHistory = prefs.getBoolean(PREF_STORE_HISTORY, true);
        upvotePercentage = prefs.getBoolean(PREF_UPVOTE_PERCENTAGE, false);
        storeNSFWHistory = prefs.getBoolean(PREF_STORE_NSFW_HISTORY, true);
        scrollSeen = prefs.getBoolean(PREF_SCROLL_SEEN, false);
        synccitName = prefs.getString(SYNCCIT_NAME, "");
        synccitAuth = prefs.getString(SYNCCIT_AUTH, "");

        previews = prefs.getInt(PREVIEWS_LEFT, 10);

        fabComments = prefs.getBoolean(PREF_COMMENT_FAB, false);
        titleFilters = prefs.getString(PREF_TITLE_FILTERS, "");
        textFilters = prefs.getString(PREF_TEXT_FILTERS, "");
        domainFilters = prefs.getString(PREF_DOMAIN_FILTERS, "");
        subredditFilters = prefs.getString(PREF_SUBREDDIT_FILTERS, "");
        alwaysExternal = prefs.getString(SettingValues.PREF_ALWAYS_EXTERNAL, "");

        dualPortrait = prefs.getBoolean(PREF_DUAL_PORTRAIT, false);
        colorSubName = prefs.getBoolean(PREF_COLOR_SUB_NAME, false);

        cropImage = prefs.getBoolean(PREF_CROP_IMAGE, true);
        switchThumb = prefs.getBoolean(PREF_SWITCH_THUMB, true);

        swipeAnywhere = true; //override this always now
        album = prefs.getBoolean(PREF_ALBUM, true);
        albumSwipe = prefs.getBoolean(PREF_ALBUM_SWIPE, true);

        commentLastVisit = prefs.getBoolean(PREF_COMMENT_LAST_VISIT, false);
        gif = prefs.getBoolean(PREF_GIF, true);
        video = true;
        exit = prefs.getBoolean(PREF_EXIT, true);
        fastscroll = prefs.getBoolean(PREF_FASTSCROLL, false);

        hideButton = prefs.getBoolean(PREF_HIDEBUTTON, false);
        saveButton = prefs.getBoolean(PREF_SAVE_BUTTON, false);
        actionbarVisible = prefs.getBoolean(PREF_ACTIONBAR_VISIBLE, true);
        actionbarTap = prefs.getBoolean(PREF_ACTIONBAR_TAP, false);
    }

    public static void setPicsEnabled(String sub, boolean checked) {
        prefs.edit().putBoolean("picsenabled" + sub.toLowerCase(), checked).apply();
    }

    public static void resetPicsEnabled(String sub) {
        prefs.edit().remove("picsenabled" + sub.toLowerCase()).apply();
    }

    public static boolean isPicsEnabled(String subreddit) {
        if (subreddit == null) return bigPicEnabled;
        return prefs.getBoolean("picsenabled" + subreddit.toLowerCase(), bigPicEnabled);
    }

    public static boolean isSelftextEnabled(String subreddit) {
        if (subreddit == null) return cardText;
        return prefs.getBoolean("cardtextenabled" + subreddit.toLowerCase(), cardText);
    }

    public static void setSelftextEnabled(String sub, boolean checked) {
        prefs.edit().putBoolean("cardtextenabled" + sub.toLowerCase(), checked).apply();
    }

    public static void resetSelftextEnabled(String subreddit) {
        prefs.edit().remove("cardtextenabled" + subreddit.toLowerCase()).apply();
    }

    public static void setDefaultCommentSorting(CommentSort commentSorting, String subreddit) {
        prefs.edit().putString("defaultComment" + subreddit.toLowerCase(), commentSorting.name()).apply();
    }

    public static CommentSort getCommentSorting(String sub) {
        return CommentSort.valueOf(prefs.getString("defaultComment" + sub.toLowerCase(), defaultCommentSorting.name()));
    }
    public static void setDefaultSubmissionSorting(Sorting sort, String subreddit) {
        prefs.edit().putString("defaultSort" + subreddit.toLowerCase(), sort.name()).apply();
    }

    public static Sorting getSubmissionSorting(String sub) {
        return Sorting.valueOf(prefs.getString("defaultSort" + sub.toLowerCase(), defaultCommentSorting.name()));
    }

    public enum ColorIndicator {
        CARD_BACKGROUND, TEXT_COLOR, NONE

    }

    public enum ColorMatchingMode {
        ALWAYS_MATCH, MATCH_EXTERNALLY
    }


}
