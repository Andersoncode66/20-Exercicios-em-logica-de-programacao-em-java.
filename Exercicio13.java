public class Exercicio13 {
    public static void main(String[] args) {
        int temperatura = 17;

        if (temperatura <= 0) {
            System.out.println("Muito Frio: " + temperatura);

        } else if (temperatura >= 1 && temperatura <= 15) {
            System.out.println("Frio: " + temperatura);

        } else if (temperatura >= 16 && temperatura <= 25) {
            System.out.println("Agradável: " + temperatura);

        } else if (temperatura >= 26 && temperatura <= 35) {
            System.out.println("Quente: " + temperatura);

        } else if (temperatura > 35) {
            System.out.println("Muito Quente: " + temperatura);
        }
    }
}
