public class Exercicio20 {
    public static void main(String[] args) {
        double altura = 1.70;
        double peso = 73.4;
        double imc = peso / (altura * altura);
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso: " + imc);
        } else if (imc <= 18.5 && imc >= 24.9) {
            System.out.println("Peso normal: " + imc);
        } else if (imc <= 25 && imc >= 29.9) {
            System.out.println("Sobrepeso: " + imc);
        } else if (imc <= 30 && imc >= 34.9){
            System.out.println("Obesidade Grau 1: " + imc);
        } else if (imc <= 35 && imc >= 39.9) {
            System.out.println("Obesidade Grau 2:" + imc);
        } else if(imc >= 40) {
            System.out.println("Obesidade de grau 3: " + imc);
            
        }
        }
    }
