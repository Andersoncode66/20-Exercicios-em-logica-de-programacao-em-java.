public class Exercicio11 {
    public static void main(String[] args) {
        int idade = 11;
        if (idade >= 0 && idade <= 12) {
            System.out.println("Categoria Criança: " + idade);
        }else if (idade >= 13 && idade <= 17){
            System.out.println("Categoria Adolescente: " + idade);
        }else if (idade >= 18 && idade <= 59) {
            System.out.println("Categoria Adulto: " + idade);
        } else if (idade >= 60) { 
            System.out.println("Idoso" + idade);
        } else {
            System.out.println("Idade inválida");
        }
    }
}