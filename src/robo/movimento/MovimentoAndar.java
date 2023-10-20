package robo.movimento;

public class MovimentoAndar implements EstrategiaMovimento {
    @Override
    public void mover() {
        System.out.println("Robô está andando.");
    }
}