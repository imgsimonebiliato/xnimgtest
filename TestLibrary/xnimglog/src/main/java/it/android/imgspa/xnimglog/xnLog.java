package it.android.imgspa.xnimglog;

import android.util.Log;

public class xnLog {
    static String tag = "xn.log";

    public static String getTag() {
        return tag;
    }

    public static void setTag(String tag) {
        xnLog.tag = tag + ".xn.log";
    }

    public static void e(String msg) {
        Log.e(getTag(), msg);
    }

    public static void i(String msg) {
        Log.i(getTag(), msg);
    }
}
