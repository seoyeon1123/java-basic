package exception.perform;

public class PropagationMain {
    public static void main(String[] args) {
        Propagation propagation = new Propagation();
        try {
            propagation.perform();
        }catch (CustomException e){
            System.out.println(e.getMessage());
        }

    }
}
