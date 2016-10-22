package color.guard.utils;

/**
 * Created by Gen on 10/22/2016.
 */
public class ConvertKeyStringToInt {

    public static int convert(String str) {

        for (int i = 65; i <= 90; i++) {
            if (str.charAt(0) == i) {
                return i - 36;
            }
        }

        return -1;

    }

}
