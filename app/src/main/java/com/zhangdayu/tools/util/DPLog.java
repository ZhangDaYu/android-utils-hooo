package com.zhangdayu.tools.util;

import android.util.Log;

import com.zhangdayu.tools.MyApplication;

/**
 * Created by Administrator on 2017/4/18.
 *
 */

public class DPLog {

    public static final int LOG_VERBOSE = 0;
    public static final int LOG_DEBUG = 1;
    public static final int LOG_INFO = 2;
    public static final int LOG_WARN = 3;
    public static final int LOG_ERROR = 4;

    public static void println(String msg) {
        if (!MyApplication.DEBUG_MODE) {
            return;
        }
        Log.i("--TAG--", msg);
    }

    public static void print(int flag, String content) {
        if (!MyApplication.DEBUG_MODE) {
            return;
        }
        String tag = "--TAG--";
        switch (flag) {
            case LOG_VERBOSE:
                Log.v(tag, "" + content);
                break;
            case LOG_DEBUG:
                Log.d(tag, "" + content);
                break;
            case LOG_INFO:
                Log.i(tag, "" + content);
                break;
            case LOG_WARN:
                Log.w(tag, "" + content);
                break;
            case LOG_ERROR:
                Log.e(tag, "" + content);
            default:
                break;
        }
    }
}
