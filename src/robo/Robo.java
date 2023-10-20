package robo;

public class Robo {
    private static Robo instance;

    private Robo() {
        // Construtor privado para evitar a criação direta.
    }

    public static Robo getInstance() {
        if (instance == null) {
            instance = new Robo();
        }
        return instance;
    }

    public void executar() {
        System.out.println("Robô está pronto para a ação.");
    }
}