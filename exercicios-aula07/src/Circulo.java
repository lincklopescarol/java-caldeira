public class Circulo implements Desenhavel{
    @Override
    public String desenhar(){
        return String.valueOf("Vou desenhar o nome da figura: " + getClass().getName());
    }
}
