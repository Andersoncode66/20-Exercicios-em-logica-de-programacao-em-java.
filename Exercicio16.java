public class Exercicio16 {
    public static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = celsius * 9 / 5 + 32;
        

        System.out.println("Portanto, graus em celsius e " + fahrenheit);




        double celsius2 = 25;
        double fahrenheit2;
        if (celsius2 > 0) {
            fahrenheit2 = celsius2 * 9 / 5 + 32;
            System.out.println("" + fahrenheit2);

        } else {
            System.out.println("Celsius inválido");
            
        }

    }
}
