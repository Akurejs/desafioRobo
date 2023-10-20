package robo.defesa;

public class DefesaEscudo implements EstrategiaDefesa {
    @Override
    public void defender() {
        System.out.println("Robô está se defendendo com um escudo.");
    }
}