package at.fhj.iit;

/**
 *The Queue Interface should be implemented for Classes where the FIFO-principal is required.
 * The five methods which needs to be implemented from the class are the basic operations for queues.
 * @author	Denis Schüle
 * @version 1.0
 * @since 	29.05.2019
 *
 */
public interface Queue {
	
	/**
	 *  Adds the element obj to the queue. 
	 *  If the addition is successful, the method returns true else false.
	 * @param obj String
	 * @return
	 */
	public abstract boolean offer(String obj);

	/**
	 *  Returns the head (first) element and also deletes it. That is, we cannot get it again. 
	 *  If no element exists (when queue is empty), the method returns null.
	 * @return
	 */
	public abstract String poll();
	
	/**
	 * It also returns and deletes the head element like poll(), but with a small difference. 
	 * This method throws NoSuchElementException if the queue is empty. 
	 * 
	 * @return
	 */
	public abstract String remove();
	
	/**
	 *  Returns the head element but it does not delete it. That is, we can get it again. 
	 *  Returns null when the queue is empty. 
	 * @return
	 */
	public abstract String peek();
	
	/**
	 *  It works similar to peek() but with a small difference (returns but does not delete the element). 
	 *  It throws NoSuchElementException when the queue is empty.
	 * @return
	 */
	public abstract String element();
	
}

