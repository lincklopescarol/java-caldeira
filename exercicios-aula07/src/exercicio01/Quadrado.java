public class Quadrado implements Desenhavel {
    @Override
    public String desenhar() {
        return String.valueOf("Vou desenhar o nome da figura: " + getClass().getName());
    }
}
