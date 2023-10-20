package robo;

import robo.ataque.AtaqueNormal;
import robo.ataque.EstrategiaAtaque;
import robo.defesa.DefesaEscudo;
import robo.defesa.EstrategiaDefesa;
import robo.movimento.EstrategiaMovimento;
import robo.movimento.MovimentoAndar;

public class RoboFacade {
    private EstrategiaMovimento estrategiaMovimento;
    private EstrategiaAtaque estrategiaAtaque;
    private EstrategiaDefesa estrategiaDefesa;

    public RoboFacade(EstrategiaMovimento estrategiaMovimento, EstrategiaAtaque estrategiaAtaque, EstrategiaDefesa estrategiaDefesa) {
        this.estrategiaMovimento = estrategiaMovimento;
        this.estrategiaAtaque = estrategiaAtaque;
        this.estrategiaDefesa = estrategiaDefesa;
    }

    public void realizarAcao() {
        estrategiaMovimento.mover();
        estrategiaAtaque.atacar();
        estrategiaDefesa.defender();
    }

    public static void main(String[] args) {
        Robo robo = Robo.getInstance();

        EstrategiaMovimento movimentoAndar = new MovimentoAndar();
        EstrategiaAtaque ataqueNormal = new AtaqueNormal();
        EstrategiaDefesa defesaEscudo = new DefesaEscudo();

        RoboFacade facade = new RoboFacade(movimentoAndar, ataqueNormal, defesaEscudo);
        facade.realizarAcao();
    }
}