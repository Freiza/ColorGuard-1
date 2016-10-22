package color.guard;

import color.guard.state.GameState;
import color.guard.utils.GameConfig;
import com.badlogic.gdx.Game;
import squidpony.SquidStorage;

/**
 * Entry
 */
public class ColorGuardGame extends Game {
    GameState state;
    SquidStorage storage;

    @Override
    public void create() {
        storage = new SquidStorage("ColorGuard");
        state = storage.get("save0", "state", GameState.class);
//        GameConfig configure = new GameConfig();
//        configure.getJsonObject();
//        configure.writeJsonConfigurationFile();
        if (state == null)
            state = new GameState(9999L);
        setScreen(new GameplayScreen(state));
    }
}