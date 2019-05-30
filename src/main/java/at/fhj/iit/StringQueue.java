package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
/**
 * The StringQueue, implements the Queue interface and store a list of String's.
 * The class has two constructors. The first without parameter then the maxSize is set to 5.
 * The second constructor accepts an integer for the maxSize.
 * Strings can be added with offer until the maxSize is reached.
 * The StringQueue is based on the FIFO-principal, the StringQueue just return the first element, this means no random access.
 * The method <code>peek()</code> returns the first element without removing it from the queue, if the queue is empty it returns null.
 * The method <code>poll()</code> returns the first element and deletes it, if the queue is empty it returns null.
 * The method <code>remove()</code> returns the first element and deletes it, if the queue is empty it throws a {@link NoSuchElementException}.
 * The method <code>element()</code> returns the first element without removing it from the queue, if the queue is empty it throws a {@link NoSuchElementException}.
 *
 * @author	Denis Schüle
 * @version 1.0
 * @since	29.05.2019
 * @see		at.fhj.iit.Queue
 * @see		java.util.ArrayList
 * @see		java.util.List
 * @see    	java.util.NoSuchElementException
 */
public class StringQueue implements Queue {

	private List<String> elements = new ArrayList<String>();

	/**
	 *
	 */
	private int maxSize = 5;

	/**
	 * Constructor without parameter. The maxSize of this instance is set to {@link StringQueue#maxSize}.
	 *
	 */
	public StringQueue(){
		this.maxSize = maxSize;
	}

	/**
	 * Constructor with one int parameter. The maxSize of this instance is set to the parameter value.
	 * @param maxSize int
	 * @since 1.0
	 */
	public StringQueue(int maxSize){
		this.maxSize = maxSize;
	}

	/**
	 *	Offer is adding a String to the queue until the maxSize is reached.
	 * @param obj 	This String is added to the queue
	 * @return boolean If the size() of the queue is less then the maxSize, it return true another false.
	 * @since 1.0
	 */
	@Override
	public boolean offer(String obj) {
		if(elements.size()!= maxSize)
			elements.add(obj);
		else
			return false;

		return true;
	}

	/**
	 * Poll returns the first element of the queue and remove the element from the queue,
	 * if the queue is empty the method return null.
	 * The first element is selected with the {@link StringQueue#peek()} method.
	 * @return String The first element in the queue, if the queue is empty it return null.
	 *  @since 1.0
	 */
	@Override
	public String poll() {
		String element = peek();
		if(elements.size() > 0){
			elements.remove(0);
		}
		return element;
	}

	/**
	 *	Remove returns the first element in the queue and deletes the element. If the queue is empty the method thows {@link NoSuchElementException}.
	 *	The first element is selected and removed with the {@link StringQueue#poll()} method.
	 * @return String The first element in the queue, if the queue is empty it throws a {@link NoSuchElementException}.
	 * @exception NoSuchElementException If the queue is empty.
	 *  @since 1.0
	 */
	@Override
	public String remove() {
		String element = poll();
		//element = "";
		if(element == null)
			throw new NoSuchElementException("there's no element any more");

		return element;
	}

	/**
	 *	Peek returns the first element of the queue without deleting the element, if the queue is empty the method return null;
	 * @return String The first element in the queue, if the queue is empty it return null.
	 *  @since 1.0
	 */
	@Override
	public String peek() {
		String element;
		if(elements.size() > 0)
			element = elements.get(0);
		else
			element = null;

		return element;
	}

	/**
	 *	Element returns the first element of the queue without deleting the element, if the queue is empty the method throws {@link NoSuchElementException};
	 * @return String The first element in the queue, if the queue is empty the method throws {@link NoSuchElementException}.
	 * @exception NoSuchElementException If the element returned from {@link StringQueue#peek()} equals null.
	 *  @since 1.0
	 */
	@Override
	public String element() {
		String element = peek();
		if(element == null)
			throw new NoSuchElementException("there's no element any more");

		return element;
	}

}
