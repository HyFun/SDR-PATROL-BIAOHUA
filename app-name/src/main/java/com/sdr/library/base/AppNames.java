package com.sdr.library.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/**
 * Created by HyFun on 2019/10/30.
 * Email: 775183940@qq.com
 * Description: 记录APP的名字的接口，用于区分app做不同的功能
 * <p>
 * AppName位于gradle的mainplaceholder中，用于更新APP和用来区分APP名称的标识
 */
public class AppNames {

    public static String 大树刘 = "biaohua-dsl";

    public static String 丽水 = "biaohua-lishui";


    /**
     * 判断当前app
     */
    public static boolean isTheApp(Context context, String appName) {
        try {
            ApplicationInfo info = context.getApplicationContext().getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            if (info.metaData == null) {
                return false;
            }
            return appName.equals(info.metaData.getString("AppName"));
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }


}
