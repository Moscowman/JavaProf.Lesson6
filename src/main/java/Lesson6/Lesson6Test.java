package Lesson6;
import org.junit.Assert;
import org.junit.Test;

public class Lesson6Test {
    @Test
    public void testArrayAfter4() {
        Assert.assertArrayEquals(new int[] {}, Lesson6.arrayAfter4(new int[]  {1, 4, 4, 4, 4, 4}));
        Assert.assertArrayEquals(new int[] {7, 3}, Lesson6.arrayAfter4(new int[]  {1, 4, 4, 7, 3}));
        Assert.assertArrayEquals(new int[] {5, 7, 3}, Lesson6.arrayAfter4(new int[]  {4, 5, 7, 3}));
    }

    @Test(expected = RuntimeException.class)
    public void testArrayAfter4Exception() {
        Assert.assertArrayEquals(new int[] {}, Lesson6.arrayAfter4(new int[]  {9, 1, 7, 6}));
    }

    @Test
    public void testCheckArrayFor1And4() {
        Assert.assertEquals(true, Lesson6.checkArrayFor1And4(new int[]  {1, 4, 4, 4, 4, 4}));
        Assert.assertEquals(false, Lesson6.checkArrayFor1And4(new int[]  {4, 4, 4, 4, 4, 4}));
        Assert.assertEquals(false, Lesson6.checkArrayFor1And4(new int[]  {1, 1, 1}));
        Assert.assertEquals(false, Lesson6.checkArrayFor1And4(new int[]  {1, 4, 4, 3}));
    }

}
