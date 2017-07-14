import sun.jvm.hotspot.debugger.win32.coff.COMDATSelectionTypes;

import java.util.List;

/**
 * Created by nypham on 7/8/17.
 */
public class BinarySearchTreeImpl<T extends Comparable<T>> implements BinarySearchTree<T> {
    private Node<T> root;

    public BinarySearchTreeImpl() {
        this.root = new EmptyNode();
    }

    public BinarySearchTreeImpl(Node<T> node) {
        this.root = node;
    }

    @Override
    public void add(T data) {
        this.root = this.root.add(data);
    }

    @Override
    public int getSize() {
        return root.getSize();
    }

    @Override
    public boolean present(T data) {
        return this.root.present(data);
    }

    @Override
    public T minimum() {
        return this.root.minimum();
    }

    @Override
    public List<T> preOrder() {
        return null;
    }

    @Override
    public List<T> inOrder() {
        return null;
    }

    @Override
    public List<T> postOrder() {
        return null;
    }


    @Override
    public String toString() {
        return this.root.toString();
    }

    public static void main(String[] args) {
        Node te1 = new ElementNode(5, new ElementNode(4), new ElementNode(7));
        Node te2 = new ElementNode(6);
        Node te3 = new EmptyNode();
        Node te4 = new ElementNode(6, te1, new ElementNode(9));
        Node te5 = new ElementNode(12, new ElementNode(11), new ElementNode(14));
        Node te6 = new ElementNode(10, te4, te5);

        BinarySearchTree<Integer> bst = new BinarySearchTreeImpl<>(te6);
        System.out.println(te1.minimum());
    }
}
