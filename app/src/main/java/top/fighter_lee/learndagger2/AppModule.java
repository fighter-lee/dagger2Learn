package top.fighter_lee.learndagger2;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * @author fighter_lee
 * @date 2018/12/7
 */
@Module
public class AppModule {

    Context mCx;

    public AppModule(Context context) {
        this.mCx = context;
    }

    @Provides
    public Context getContext() {
        return mCx;
    }
}
