package top.fighter_lee.learndagger2;

import android.content.Context;
import android.util.Log;

import org.json.JSONObject;

import javax.inject.Inject;

import dagger.Lazy;

/**
 * @author fighter_lee
 * @date 2018/12/6
 */
public class TestUser {

    private static final String TAG = "TestUser";

    @Inject
    Factory factory;

    @Inject
    Test1 test1;

    @Inject
    JSONObject test2;

    @Inject
    JSONObject test3;

    @Inject
    JsonBean jsonBean;

    @Inject
    JsonBean jsonBean2;

    @Inject
    Context context;

    @Inject
    Lazy<JsonBean> jsonBeanLazy;

    private TestUser() {
        AppComponent appComponent = DaggerAppComponent.builder().appModule(new AppModule(App.sContext)).build();

        DaggerComponentInter.builder().appComponent(appComponent).build().inject(this);
    }

    public static TestUser getInstance() {
        return TestUserHolder.sInstance;
    }

    private static class TestUserHolder {
        private static final TestUser sInstance = new TestUser();
    }

    public void getTest() {
        Log.d(TAG, "getTest() " + factory.test1.s);
        Log.d(TAG, "getTest() " + test1.s);
        Log.d(TAG, "getTest() " + test2.toString() + ",hash:" + test2.hashCode());
        Log.d(TAG, "getTest() " + test3.toString() + ",hash:" + test3.hashCode());
        Log.d(TAG, "getTest() " + jsonBean.toString() + ",hash:" + jsonBean.hashCode());
        Log.d(TAG, "getTest() " + jsonBean2.toString() + ",hash:" + jsonBean2.hashCode());
        Log.d(TAG, "getTest() " + context);
        Log.d(TAG, "getTest() " + jsonBeanLazy.get().toString());
    }

}
