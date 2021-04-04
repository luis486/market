
package exception;

public class AgeException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    public AgeException(){
        super("You cant enter because not have the age");
    }
}
