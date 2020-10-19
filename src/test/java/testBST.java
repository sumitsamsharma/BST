import org.junit.Assert;
import org.junit.Test;

public class testBST
{
    @Test
    public void givenNodes_shouldReturnBST() {
        BinarySearchTree bTree = new BinarySearchTree();
        bTree.add(51);
        bTree.add(32);
        bTree.add(75);
        bTree.add(5);
        bTree.add(38);
        bTree.add(89);
        int size = bTree.getSize();
        Assert.assertEquals(6,size);
    }

    @Test
    public void given_BST_searchReturns()
    {
        BinarySearchTree bTree= new BinarySearchTree();
        bTree.add(51);
        bTree.add(32);
        bTree.add(75);
        bTree.add(5);
        bTree.add(38);
        bTree.add(89);
        Assert.assertTrue(bTree.searchKey(5));
    }
}
