package color.guard.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gen on 10/22/2016.
 */
public interface Configuration {
    void getJsonObject();

    void writeJsonConfigurationFile();

    public Map<String, String> keyValuePair = new HashMap<String, String>();
    public Constants constants = Constants.getInstance();

    Constants readJsonConfigurationFile();

}
