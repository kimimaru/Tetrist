/**
 * Created by Николай on 1/31/2017.
 */
public interface Cell<T>  {

    boolean isBomb();

    boolean isSuggestBomb();

    boolean isSuggestEmpty();

    void suggectEmpty();

    void suggectBomb();

    void draw(T paint, boolean real);

    void draw(T paint,int x,int y, boolean real);

}
