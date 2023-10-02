public class ImplementarCalculavel implements Calculavel {
    @Override
    public int adicionar(int primeiroValor, int segundoValor) {
        return primeiroValor + segundoValor;
    }

    @Override
    public int subtrair(int primeiroValor, int segundoValor) {
        return primeiroValor - segundoValor;
    }

    @Override
    public int multiplicar(int primeiroValor, int segundoValor) {
        return primeiroValor * segundoValor;
    }

    @Override
    public int dividir(int primeiroValor, int segundoValor) throws ArithmeticException {
        if (segundoValor == 0) {
            throw new ArithmeticException("A divisão não pode ser por zero. Tente novamente com outro número!");
        } else {
            return primeiroValor / segundoValor;
        }
    }
}
