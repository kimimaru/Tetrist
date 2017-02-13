/**
 * Created by Николай on 1/31/2017.
 */
public interface UserAction {
    void initGame();

    void select(int x, int y, boolean bomb);
}
