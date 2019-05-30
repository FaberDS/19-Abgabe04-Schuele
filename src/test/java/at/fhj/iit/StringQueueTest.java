package at.fhj.iit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringQueueTest {
    private StringQueue sq1;
    private StringQueue sq2;

    /**
     * Initilize two instances of StringQueue
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        sq1= new StringQueue();
        sq2 = new StringQueue(2);
    }

    /**
     * Reset the two instances of StringQueue
     * @throws Exception
     */
    @After
    public void tireDown() throws Exception{
        sq1=null;
        sq2=null;
    }

    /**
     * Tests with the default constructor (maxSize=5).
     * @result Return true because passing one String.
     */
    @Test
    public void offer() {
        assertTrue( sq1.offer("1"));
    }
    /**
     * Tests with the default constructor (maxSize=5).
     * @result Return false beacause passing six Strings.
     */
    @Test
    public void offer2() {
        sq1.offer("1");
        sq1.offer("2");
        sq1.offer("3");
        sq1.offer("4");
        sq1.offer("5");
        assertFalse( sq1.offer("6"));
    }
    /**
     * Tests with the second constructor maxSize is passed as argument (2).
     * @result Return true because passing two Strings.
     */
    @Test
    public void offer3() {
        sq2.offer("1");
        assertTrue( sq2.offer("2"));
    }
    /**
     * Tests with the second constructor maxSize is passed as argument (2).
     * @result Return false because passing three Strings.
     */
    @Test
    public void offer4() {
        sq2.offer("1");
        sq2.offer("2");
        assertFalse( sq2.offer("3"));
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
