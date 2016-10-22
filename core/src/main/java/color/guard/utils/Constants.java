package color.guard.utils;

/**
 * Created by Gen on 10/22/2016.
 */
public class Constants {

    private static Constants ConstantsInstance;

    private Constants() {
    }

    public static Constants getInstance() {
        if (ConstantsInstance == null) {
            ConstantsInstance = new Constants();
        }
        return ConstantsInstance;
    }

    public String ConfigPath = "../core/src/main/java/color/guard/Configuration/Config";
    public String ZoomInKey = "Z";
    public String ZoomOutKey = "X";
    public float defaultZoomSpeed = 2f;
    public float CameraMaxZoomLimit = 2f;
    public float CameraMinZoomLimit = 0.5f;

}
