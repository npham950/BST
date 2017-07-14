import java.util.List;
import java.util.Set;

/**
 * Created by nypham on 7/8/17.
 */
public interface Node<T extends Comparable<T>> {
    T getData();
    Node<T> add(T data);
    Node<T> getLeft();
    Node<T> getRight();
    int getSize();
    boolean present(T data);
    T minimum();
    List<T> preOrder();
    List<T> inOrder();
    List<T> postOrder();
}
