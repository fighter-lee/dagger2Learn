package top.fighter_lee.learndagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author fighter_lee
 * @date 2018/12/6
 */

@Singleton
@Component(modules = TestModule.class,dependencies = AppComponent.class)
public interface ComponentInter {

    void inject(TestUser testUser);
}
