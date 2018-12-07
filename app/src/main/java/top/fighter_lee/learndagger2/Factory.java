package top.fighter_lee.learndagger2;

import javax.inject.Inject;

/**
 * @author fighter_lee
 * @date 2018/12/6
 */
public class Factory {

    Test1 test1;

    @Inject
    public Factory(Test1 test1) {
        this.test1 = test1;
    }

}
