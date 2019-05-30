package at.fhj.iit;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

public class StringQueueTest {
    private StringQueue sq1;
    @Before
    public void setUp() throws Exception {
        sq1= new StringQueue(4);
    }

    @Test
    public void offer() {
        sq1.offer("1");
        sq1.offer("2");
        sq1.offer("3");
        sq1.offer("4");
        assertFalse( sq1.offer("6"));
    }

    @Test
    public void poll() {
    }

    @Test
    public void remove() {
    }

    @Test
    public void peek() {
    }

    @Test
    public void element() {
    }


    /**
     * TODO Write your own tests
     */

}
