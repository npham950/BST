import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nypham on 7/9/17.
 */
public class ElementNodeTest {

    private ElementNode te1;
    private ElementNode te2;
    private Node te3;
    private ElementNode te4;
    private ElementNode te5;
    private ElementNode te6;

    @org.junit.Before
    public void setUp() throws Exception {
        this.te1 = new ElementNode(5, new ElementNode(4), new ElementNode(7));
        this.te2 = new ElementNode(6);
        this.te3 = new EmptyNode();
        this.te4 = new ElementNode(6, te1, new ElementNode(9));
        this.te5 = new ElementNode(12, new ElementNode(11), new ElementNode(14));
        this.te6 = new ElementNode(10, te4, te5);
    }

    @org.junit.Test
    public void getLeft() throws Exception {
        assertEquals(4, te1.getLeft().getData());
        assertEquals(null , te2.getLeft().getData());
        assertEquals(5, te4.getLeft().getData());
        assertEquals(11, te5.getLeft().getData());
        assertEquals(6, te6.getLeft().getData());
    }

    @org.junit.Test
    public void getRight() throws Exception {
        assertEquals(7, te1.getRight().getData());
        assertEquals(null , te2.getRight().getData());
        assertEquals(9, te4.getRight().getData());
        assertEquals(14, te5.getRight().getData());
        assertEquals(12, te6.getRight().getData());
    }

    @org.junit.Test
    public void getData() throws Exception {
        assertEquals(5, te1.getData());
        assertEquals(6, te2. getData());
        assertEquals(null, te3.getData());
        assertEquals(6, te4.getData());
        assertEquals(12, te5.getData());
        assertEquals(10, te6.getData());
    }

    @org.junit.Test
    public void add() throws Exception {
        assertEquals("4 5 6 7 ", te1.add(6).toString());
    }

    @Test
    public void testToString() throws Exception {
        assertEquals("4 5 7 ", te1.toString());
        assertEquals("4 5 7 6 9 10 11 12 14 ", te6.toString());
    }

    @Test
    public void getSize() throws Exception {
        assertEquals(3, te1.getSize());
        assertEquals(1, te2.getSize());
        assertEquals(0, te3.getSize());
        assertEquals(5, te4.getSize());
        assertEquals(3, te5.getSize());
        assertEquals(9, te6.getSize());
    }

}