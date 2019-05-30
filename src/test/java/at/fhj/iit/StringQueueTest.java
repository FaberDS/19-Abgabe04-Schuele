package at.fhj.iit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class StringQueueTest {
    private StringQueue sq1;
    private StringQueue sq2;
    private static int maxSizeTestParameter = 2;

    /**
     * Initilize two instances of StringQueue
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        sq1= new StringQueue();
        sq2 = new StringQueue(maxSizeTestParameter);
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
     * @result Is false beacause passing six Strings.
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
     * @result Is true because passing two Strings.
     */
    @Test
    public void offer3() {
        sq2.offer("1");
        assertTrue( sq2.offer("2"));
    }
    /**
     * Tests with the second constructor maxSize is passed as argument (2).
     * @result Is false because passing three Strings.
     */
    @Test
    public void offer4() {
        sq2.offer("1");
        sq2.offer("2");
        assertFalse( sq2.offer("3"));
    }

    /**
     * Tests polling from empty StringQueue.
     * @result Is null, because the queue is empty.
     */
    @Test
    public void poll() {
        assertNull(sq1.poll());
    }
    /**
     * Tests polling from StringQueue with an element.
     * @result Return true, because the queue is not empty.
     */
    @Test
    public void poll2() {
        sq1.offer("1");
        assertNotNull(sq1.poll());
    }
    /**
     * Tests polling from StringQueue, after adding and removing one element.
     * @result Is null, because the queue is empty.
     */
    @Test
    public void poll3() {
        sq1.offer("1");
        sq1.poll();
        assertNull(sq1.poll());
    }

    /**
     * Tests polling from StringQueue, after adding and removing two element.
     * @result Is null, because the queue is empty.
     */
    @Test
    public void poll4() {
        for(int i=0; i<maxSizeTestParameter; i++){
            sq2.offer(String.valueOf(i));
        }
        for(int i=0; i<maxSizeTestParameter; i++){
            sq2.poll();
        }
        assertNull(sq2.poll());
    }
    /**
     * Tests polling from StringQueue, after adding one element.
     * @result Is equals, because we offer() an element and get the same back.
     */
    @Test
    public void poll5(){
        String parameter = "1";
        sq1.offer(parameter);
        assertEquals(parameter, sq1.poll());
    }
    /**
     * Tests polling if the StringQueue is working like the FIFO principal, by adding three elements.
     * @result Is equals, because the first offered parameter is tested and the queue works like the FIFO principal.
     */
    @Test
    public void poll6(){
        String parameter1 = "1";
        sq1.offer(parameter1);
        sq1.offer("2");
        sq1.offer("3");
        assertEquals(parameter1, sq1.poll());
    }
    /**
     * Tests polling from StringQueue, after adding one element.
     * @result Is equals, because we offer() an element and get the same back.
     */
    @Test
    public void remove(){
        String parameter = "1";
        sq1.offer(parameter);
        assertEquals(parameter, sq1.poll());
    }
    /**
     * Tests polling from StringQueue, after adding two elements.
     * @result Is not same, because after offering two elements we we compare the first passed parmeter.
     */
    @Test
    public void remove2(){
        String parameter = "2";
        sq1.offer("1");
        sq1.offer(parameter);
        assertNotSame(parameter, sq1.poll());
    }

    /**
     * Tests to remove from empty StringQueue.
     * @result {@link NoSuchElementException} is thrown.
     */
    @Test (expected = NoSuchElementException.class)
    public void remove3(){
        sq1.remove();
    }
    /**
     * Tests to remove more elements from  StringQueue than offered.
     * @result {@link NoSuchElementException} is thrown.
     */
    @Test (expected = NoSuchElementException.class)
    public void remove4(){
        sq1.offer("1");
        sq1.offer("2");
        sq1.offer("3");
        sq1.remove();
        sq1.remove();
        sq1.remove();
        sq1.remove();
    }

    /**
     * Tests the Exception message from NoSuchElementException thrown by StringQueue.remove()
     * @result Is equals.
     */
    @Test (expected = NoSuchElementException.class)
    public void remove5()
    {
        try
        {
            sq1.remove();
        }
        catch(RuntimeException re)
        {
            String message = "there's no element any more";
            assertEquals(message, re.getMessage());
            throw re;
        }
        fail("Employee Id Null exception did not throw!");
    }
    @Test
    public void peek() {

    }

    @Test
    public void element() {
    }


}
