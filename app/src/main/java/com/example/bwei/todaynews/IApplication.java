package com.example.bwei.todaynews;

import android.app.Application;

import com.umeng.socialize.Config;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareConfig;
import com.umeng.socialize.common.QueuedWork;

/**
 * Created by muhanxi on 17/5/1.
 */
//

public class IApplication extends Application {

    public UMShareAPI umShareAPI ;

    @Override
    public void onCreate() {
        super.onCreate();
        umShareAPI = UMShareAPI.get(this);
        Config.DEBUG = true;
        QueuedWork.isUseThreadPool = true;
        PlatformConfig.setSinaWeibo("3921700954", "04b48b094faeb16683c32669824ebdad","http://sns.whalecloud.com");

    }
}