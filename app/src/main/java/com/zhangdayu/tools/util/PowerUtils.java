package com.zhangdayu.tools.util;

import android.app.Activity;
import android.app.KeyguardManager;
import android.app.KeyguardManager.KeyguardLock;
import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.view.WindowManager;

public class PowerUtils {
	private KeyguardLock keyguardLock = null;
	private WakeLock mWakelock = null;

	public static void setFlageWakeup(Activity act) {

		act.getWindow().addFlags(
				WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);// ��������Ļ��֮�ϡ�
		PowerManager pm = (PowerManager) act
				.getSystemService(Context.POWER_SERVICE);
		// if (!pm.isScreenOn()) {//��Ļʱ�򱣳ָ���
		act.getWindow()
				.addFlags(
						WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON
								| WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON
								| WindowManager.LayoutParams.FLAG_ALLOW_LOCK_WHILE_SCREEN_ON
								| WindowManager.LayoutParams.FLAG_LAYOUT_INSET_DECOR);
		// }
		act.getWindow().addFlags(
				WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);
	}

	public void systemWakeup(Context c) {
		PowerManager pm = (PowerManager) c
				.getSystemService(Context.POWER_SERVICE);
		mWakelock = pm.newWakeLock(PowerManager.ACQUIRE_CAUSES_WAKEUP
				| PowerManager.SCREEN_BRIGHT_WAKE_LOCK, "SimpleTimer");
		mWakelock.acquire();// ����
		KeyguardManager mKeyguardManager = (KeyguardManager) c
				.getSystemService(Context.KEYGUARD_SERVICE);
		keyguardLock = mKeyguardManager.newKeyguardLock("");
		keyguardLock.disableKeyguard();
	}

	public void release() {
		if (keyguardLock != null) {
			keyguardLock.reenableKeyguard();
			keyguardLock = null;
		}
		if (mWakelock != null) {
			mWakelock.release();
			mWakelock = null;
		}
	}
}
