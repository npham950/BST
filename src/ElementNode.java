import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by nypham on 7/8/17.
 */
public class ElementNode<T extends Comparable<T>> implements Node<T> {
    private T data;
    private Node<T> left;
    private Node<T> right;
    private int size;

    public ElementNode(T data) {
        this(data, new EmptyNode<>(), new EmptyNode<>());
    }

    public ElementNode(T data, Node<T> left, Node<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.size = 0;
        initialSize(this);
    }

    private void initialSize(Node<T> node) {
        if (node.getData() == null) {
            return;
        }
        this.size++;
        initialSize(node.getLeft());
        initialSize(node.getRight());
    }

    public Node<T> getLeft() {
        return this.left;
    }

    public Node<T> getRight() {
        return this.right;
    }

    @Override
    public T getData() {
        return this.data;
    }


    @Override
    public Node<T> add(T data) {
        if (data.compareTo(this.data) < 0) {
            this.size++;
            this.left = this.left.add(data);
        } else if (data.compareTo(this.data) > 0) {
            this.size++;
            this.right = this.right.add(data);
        }
        return this;
    }

    public String toString() {
        return this.getLeft().toString() + this.getData() + " " + this.getRight().toString();
    }

    public int getSize() {
        return this.size;
    }

    public boolean present(T data) {
        if (this.getData() == data) {
            return true;
        }
        return this.getLeft().getData() == data || this.getRight().getData() == data;
    }

    public T minimum() {
        if (this.getLeft() instanceof EmptyNode){
            return this.getData();
        }
        return this.getLeft().minimum();
    }

    @Override
    public List<T> preOrder() {
        List<T> list;
        list = this.getLeft().preOrder();
        list.addAll(this.getRight().preOrder());
        list.add(0, this.getData());
        return list;
    }

    @Override
    public List<T> inOrder() {
        List<T> list;
        list = this.getLeft().inOrder();
        list.add(this.getData());
        list.addAll(this.getRight().inOrder());
        return list;
    }

    @Override
    public List<T> postOrder() {
        List<T> list;
        list = this.getLeft().postOrder();
        list.addAll(this.getRight().postOrder());
        list.add(this.getData());
        return list;
    }


    public static void main(String[] args) {
        Node te1 = new ElementNode(5, new ElementNode(4), new ElementNode(7));
        Node te2 = new ElementNode(6);
        Node te3 = new EmptyNode();
        Node te4 = new ElementNode(6, te1, new ElementNode(9));
        Node te5 = new ElementNode(12, new ElementNode(11), new ElementNode(14));
        Node te6 = new ElementNode(10, te4, te5);
        Node te7 = new ElementNode(1, new ElementNode(2, new ElementNode<>(4), new ElementNode(5)), new ElementNode(3));
        System.out.println(te7.inOrder());
        System.out.println(te7.preOrder());
        System.out.println(te7.postOrder());
    }

}
