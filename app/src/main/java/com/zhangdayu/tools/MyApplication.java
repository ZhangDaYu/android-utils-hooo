package com.zhangdayu.tools;

import android.app.Application;

/**
 * Created by Administrator on 2017/4/18.
 */

public class MyApplication extends Application {
    /**
     * 开发过程中 ，把DEBUG_MODE设为true，即打开调试模式，可打印日志；
     * 发布时，把DEGUB_MODE设为false，即可关闭调试模式，日志就不会打印了。
     */
    public static final boolean DEBUG_MODE = true;
}
