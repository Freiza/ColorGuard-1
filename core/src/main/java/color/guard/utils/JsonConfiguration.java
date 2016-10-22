package color.guard.utils;

import com.badlogic.gdx.utils.Json;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Gen on 10/22/2016.
 */
public class JsonConfiguration {

    private static Json json;

    private static JsonConfiguration JsonInstance;
    private Configuration configure;

    private JsonConfiguration() {
        json = new Json();
    }

    public static JsonConfiguration getInstance() {
        if (JsonInstance == null) {
            JsonInstance = new JsonConfiguration();
        }
        return JsonInstance;
    }

    public Json getJson() {
        return json;
    }

    //In case future needs it, remove comment.
//    public static void setJson(Json json) {
//        JsonConfiguration.json = json;
//    }

    public void toJson(Configuration config) {

        json.setTypeName(null);
        json.setUsePrototypes(false);
        json.setIgnoreUnknownFields(true);
        configure = config;

        System.out.println(json.toJson(config.constants));

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(config.constants.ConfigPath), "utf-8"))) {

            writer.write(json.toJson(config.constants));
        } catch (IOException e) {
            System.out.println("config file problem");
        }
    }

    public Constants readJsonFile(Configuration config) {

        String content = "Cannot read configuration file.";
        Constants constant = null;

        try {
            content = new String(Files.readAllBytes(Paths.get(config.constants.ConfigPath)));
            constant = json.fromJson(config.constants.getClass(), content);
        } catch (IOException e) {
            System.out.println("Cannot read configuration file.");
        }

        return constant;

    }
}
