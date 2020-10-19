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
        int size = bst.getSize();
        Assert.assertEquals(3,size);
    }
}
