package me.everything.android.ui.overscroll.util;

import android.util.Log;

import me.everything.android.ui.overscroll.BuildInfo;

/**
 * 先写个简单的，以后方便替换log输入框架
 *
 * @author makee
 */
public final class Logger {

    public static void d(String tag, String msg) {
        if (BuildInfo.DEBUG_MODE) {
            Log.d(tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (BuildInfo.DEBUG_MODE) {
            Log.w(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (BuildInfo.DEBUG_MODE) {
            Log.e(tag, msg);
        }
    }

    public static void d(String tag, String msg, Throwable throwable) {
        if (BuildInfo.DEBUG_MODE) {
            Log.d(tag, msg, throwable);
        }
    }

    public static void w(String tag, String msg, Throwable throwable) {
        if (BuildInfo.DEBUG_MODE) {
            Log.w(tag, msg, throwable);
        }
    }

    public static void e(String tag, String msg, Throwable throwable) {
        if (BuildInfo.DEBUG_MODE) {
            Log.e(tag, msg, throwable);
        }
    }

}
