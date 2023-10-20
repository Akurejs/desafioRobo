package robo.ataque;

public class AtaqueNormal implements EstrategiaAtaque {
    @Override
    public void atacar() {
        System.out.println("Robô está atacando normalmente.");
    }
}