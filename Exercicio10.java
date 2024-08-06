public class Exercicio10 {
    public static void main(String[] args) {
        double produto = 100.00;
        double desconto = 20;
        double descontoAplicado = produto * desconto / 100;
        double valorFinal = produto - descontoAplicado;

        System.out.println("O desconto de " + produto + " e " + descontoAplicado + " e o valor final e "  + valorFinal);
        

    }
}