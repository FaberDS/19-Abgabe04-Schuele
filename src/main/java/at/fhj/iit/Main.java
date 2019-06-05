package at.fhj.iit;

/**
 * For testing purposes
 * To check out the functionality of the queue
 */
public class Main {

    public static void main(String[] args){

        StringQueue sq = new StringQueue();
        sq.offer("Hallo Log4j2 schön das es dich gibt!");
        System.out.println(sq.element());
        System.out.println(sq.remove());
        System.out.println(sq.remove());

    }
}
