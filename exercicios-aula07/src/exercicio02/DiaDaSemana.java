public enum DiaDaSemana  {
    DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);

    private final int valor;
    DiaDaSemana(int escolha){
        valor = escolha;
    }
    public int getValor(){
        return valor;
    }
}

