import java.util.List;

/**
 * Created by nypham on 7/8/17.
 */
interface BinarySearchTree<T extends Comparable<T>> {
    void add(T data);
    int getSize();
    boolean present(T data);
    T minimum();
    List<T> preOrder();
    List<T> inOrder();
    List<T> postOrder();
}
