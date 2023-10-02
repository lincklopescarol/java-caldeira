public class IdadeInvalidaException extends RuntimeException{
    public IdadeInvalidaException(String alerta){
        // super chama o construtor da classe pai
        super(alerta);
    }
}
