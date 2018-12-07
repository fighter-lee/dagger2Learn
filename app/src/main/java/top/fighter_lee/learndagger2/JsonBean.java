package top.fighter_lee.learndagger2;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author fighter_lee
 * @date 2018/12/6
 */
public class JsonBean {

    String key;
    String value;

    public JsonBean(JSONObject jsonObject) {
        if (jsonObject == null) {
            return;
        }
        if (jsonObject.has("s")) {
            try {
                key = "s";
                value = jsonObject.getString("s");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "JsonBean{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
