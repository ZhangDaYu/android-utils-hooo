package com.zhangdayu.tools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangdayu.tools.util.DPLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //日志工具类的使用示例
        logUtilExample();


    }

    /**
     * 日志工具类的使用示例
     */
    private void logUtilExample() {
        DPLog.print(DPLog.LOG_VERBOSE, "this is verbose log");
        DPLog.print(DPLog.LOG_DEBUG, "this is debug log");
        DPLog.print(DPLog.LOG_INFO, "this is info log");
        DPLog.print(DPLog.LOG_WARN, "this is warn log");
        DPLog.print(DPLog.LOG_ERROR, "this is error log");
    }
}
