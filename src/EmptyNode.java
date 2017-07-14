import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Created by nypham on 7/8/17.
 */
public class EmptyNode<T extends Comparable<T>> implements Node<T> {

    @Override
    public T getData() {
        return null;
    }

    @Override
    public Node add(T data) {
        return new ElementNode(data);
    }

    public Node getLeft() {
        return null;
    }

    public Node getRight() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    public boolean present(T data) {
        return false;
    }

    @Override
    public T minimum() {
        return null;
    }

    @Override
    public List<T> preOrder() {
        return new ArrayList<>();
    }

    @Override
    public List<T> inOrder() {
        return new ArrayList<>();
    }

    @Override
    public List<T> postOrder() {
        return new ArrayList<>();
    }

    public String toString() {
        return "";
    }

}

