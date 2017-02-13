/**
 * Created by Николай on 1/31/2017.
 */
public interface SaperLogic {
    void loadBoard(Cell[][] cells);

    boolean shouldBang(int x, int y);

    boolean finish();
    boolean finish(int bomb);

    void suggest(int x, int y, boolean bomb);
}
