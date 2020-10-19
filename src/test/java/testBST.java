import org.junit.Assert;
import org.junit.Test;

public class testBST
{
    @Test
    public void givenNodes_whenInitialize_shouldReturnBinarySearchTree() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(56);
        bst.add(30);
        bst.add(70);
        int size = bst.getSize();
        Assert.assertEquals(3,size);
    }
}
