package top.fighter_lee.learndagger2;

import android.app.Application;
import android.content.Context;

/**
 * @author fighter_lee
 * @date 2018/12/7
 */
public class App extends Application {

    public static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
    }
}
