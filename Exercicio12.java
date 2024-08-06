public class Exercicio12{
    public static void main(String[] args) {
        double salario = 3200.00;
        double imposto;

        if (salario <= 2500.00) {
            imposto = salario * 0.05;
            System.out.println("O imposto sobre o salario " + salario + " e " + imposto);
        } else if (salario <= 4000.00){
            imposto = salario * 0.10;
            System.out.println("O imposto sobre o salario " + salario + " e " + imposto);
        } else if (salario <= 6000.00) {
            imposto = salario * 0.15;
            System.out.println("O imposto sobre o salario " + salario + " e " + imposto);
        } else {
            imposto = salario * 0.20;
            System.out.println("O imposto sobre o salario " + salario + " e " + imposto);

            
        }


    
        double salario2 = 3200.00;
        double imposto2;
        double porcetagem;

        if (salario2 <= 2500) {
            porcetagem = 5; // 5% de imposto
        } else if (salario <= 4000) {
            porcetagem = 10; // 10% de imposto   
        } else if (salario <= 6000){
            porcetagem = 15; // 15% de imposto
        } else {
            porcetagem = 20; // 20% de imposto     
        }
        
        imposto2 = (salario2 * porcetagem) / 100;
        System.out.println("O imposto sobre o salário de " + salario + " e " + imposto2);
    }
}