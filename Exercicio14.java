public class Exercicio14 {
    public static void main(String[] args) {
        double peso = 73.4;
        double altura = 1.76;
        double imc = peso / (altura * altura);
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso: " + imc);
        }else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso normal: " + imc);
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso: " + imc);
        }else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade: " + imc);
        }else if (imc >= 35) {
            System.out.println("Obesidade grave: ");
            
        }
    }
}