package debug;


import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * <p>类说明</p>
 *
 * @author 张华洋 2017/2/15 20:09
 * @version V1.2.0
 * @name GirlsApplication
 */
public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        login();
        ARouter.init(this);
    }

    /**
     * 在这里模拟登陆，然后拿到sessionId或者Token
     * 这样就能够在组件请求接口了
     */
    private void login() {

    }
}
