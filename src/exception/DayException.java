
package exception;

public class DayException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    public DayException(){
        super("You cant enter because not is your day");
    }
}
