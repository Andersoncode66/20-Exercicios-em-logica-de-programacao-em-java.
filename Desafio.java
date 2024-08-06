public class Desafio {
   public static void main(String[] args) {
    double salario = 4200;
    System.out.println("O salario de  de 30%: " + salario * 0.3 + salario * 0.10);




    double salario2 = 5000.00;
    double porcetagem;
    String mensagem;
    
    if (salario > 4500) {
        porcetagem = salario2 * 0.3;
        mensagem = "30% do salário é: " + porcetagem;
    }else{
        porcetagem = salario2 * 0.1;
        mensagem = "10% do salário é: " + porcetagem;
    }

    System.out.println(mensagem);




    //-----------------------------//

    float salario3 = 4700.50F;
    float resultado3 = 0F;
    String porcetagem3 = "";
    if (salario > 4500) {
        resultado3 = salario3 * 0.3F;
        porcetagem3 = "30%";


    }else {
        resultado3 = salario3 * 0.1F;
        porcetagem3 = "10%";
        
    }

    System.out.println("O valor final em porcetagem " + porcetagem3 + " é de " + resultado3);











   } 

}




