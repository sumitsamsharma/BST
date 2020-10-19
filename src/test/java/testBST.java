import org.junit.Assert;
import org.junit.Test;

public class testBST
{
    @Test
    public void givenNodes_shouldReturnBST() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(51);
        bst.add(32);
        bst.add(75);
        bst.add(5);
        bst.add(38);
        bst.add(89);
        int size = bst.getSize();
        Assert.assertEquals(6,size);
    }
}
