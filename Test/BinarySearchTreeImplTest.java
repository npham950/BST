import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by nypham on 7/9/17.
 */
public class BinarySearchTreeImplTest {
    private BinarySearchTree<Integer> bstInt;

    @Before
    public void setUp() throws Exception {
        this.bstInt = new BinarySearchTreeImpl<>();
        bstInt.add(5);
        bstInt.add(1);
    }

    @Test
    public void testAdd() throws Exception {
        assertEquals("5 ", this.bstInt.toString());
    }

    @Test
    public void testGetSize() throws Exception {
        assertEquals(1, bstInt.getSize());
    }

    @Test
    public void testPresent() throws Exception {
        assertEquals(true, bstInt.present(5));
        assertEquals(false, bstInt.present(6));
    }

    @Test
    public void testMinimum() throws Exception {
    }

}