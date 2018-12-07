package top.fighter_lee.learndagger2;

import org.json.JSONException;
import org.json.JSONObject;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author fighter_lee
 * @date 2018/12/6
 */
@Module
public class TestModule {

    @Provides
    public JSONObject provideJson() {
        try {
            return new JSONObject("{\"s\": \"abc\"}");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Singleton
    @Provides
    public JsonBean provideJsonBean(JSONObject jsonObject) {
        return new JsonBean(jsonObject);
    }
}
