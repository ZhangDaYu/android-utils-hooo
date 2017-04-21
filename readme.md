* DPLog : 日志打印工具，要在 MyApplication 中打开 DEBUG_MODE 开关。


* ByteUtil : int , long , byte 数组间相互转换的工具。byte 数组区分大小端。


* PowerUtils :  唤醒屏幕的工具类。systemWakeup( ) 和 release( ) 方法搭配使用。

​	记得添加权限：

    <uses-permission android:name="android.permission.WAKE_LOCK" />
    <uses-permission android:name="android.permission.DISABLE_KEYGUARD" />



