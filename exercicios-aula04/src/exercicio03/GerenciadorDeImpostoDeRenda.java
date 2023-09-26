package exercicio03;

public class GerenciadorDeImpostoDeRenda {
    private double somaTotalTributos;

    public GerenciadorDeImpostoDeRenda() {
        this.somaTotalTributos = 0;
    }

    public double adicionar(Tributavel tributavel) {
        double tributo = tributavel.calculaTributos();
        somaTotalTributos += tributo;
        return tributo;
    }

    public double totalTributos() {
        return somaTotalTributos;
    }


}
