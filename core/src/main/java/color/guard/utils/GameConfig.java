package color.guard.utils;

import com.badlogic.gdx.utils.Json;

/**
 * Created by Gen on 10/22/2016.
 */
public class GameConfig implements Configuration {
    private Json json;

    @Override
    public void getJsonObject() {
        json = JsonConfiguration.getInstance().getJson();
    }

    @Override
    public void writeJsonConfigurationFile() {

        JsonConfiguration.getInstance().toJson(this);

    }

    @Override
    public Constants readJsonConfigurationFile() {
        return JsonConfiguration.getInstance().readJsonFile(this);

    }
}
