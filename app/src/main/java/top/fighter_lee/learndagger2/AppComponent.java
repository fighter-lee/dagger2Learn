package top.fighter_lee.learndagger2;

import android.content.Context;

import dagger.Component;

/**
 * @author fighter_lee
 * @date 2018/12/6
 */

@Component(modules = AppModule.class)
public interface AppComponent {

    Context getContext();

}
