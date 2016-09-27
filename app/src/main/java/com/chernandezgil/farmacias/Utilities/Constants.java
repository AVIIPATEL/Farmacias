package com.chernandezgil.farmacias.Utilities;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Carlos on 04/08/2016.
 */
public class Constants {

    public static final String SPACE = " ";
    public static final String COMMA = ",";
    public static final String CR = "\n";
    public static final String EMPTY_STRING = "";
    public static final String SEMI_COLON=":";

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({SCROLL_DOWN, SCROLL_UP})
    public @interface ScrollDirection {
    }

    public static final int SCROLL_DOWN = 0;
    public static final int SCROLL_UP = 1;
}
