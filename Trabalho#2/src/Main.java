public class Main {
    public static void main(String[] args) {


        cliente cliente1 = new cliente("Amanda", 20,1.60);
        cliente cliente2 = new cliente("Arthur", 30,1.80);

        Funcionario funcionario1 = new Funcionario("Jose", 40,1.90);

        Funcionario funcionario2 = new Funcionario("mike", 50,1.70);



        System.out.println("----------CLIENTE-------------");
        System.out.println("Nome :" +cliente1.nome + "\n");
        System.out.println("Salario :"+ cliente1.idade + "\n");
        System.out.println("Altura :" +cliente1.altura+ "\n");
        System.out.println("----------------------------------");

        System.out.println("----------CLIENTE-------------");
        System.out.println("Nome :" +cliente2.nome + "\n");
        System.out.println("Salario :"+ cliente2.idade + "\n");
        System.out.println("Altura :" +cliente2.altura+ "\n");
        System.out.println("----------------------------------");

        System.out.println(("----------FUNCIONARIO-------------"));
        System.out.println("Nome :" +funcionario1.nome + "\n");
        System.out.println("Salario :"+ funcionario1.idade + "\n");
        System.out.println("Altura :" +funcionario1.salario + "\n");
        System.out.println("----------------------------------");

        System.out.println("----------FUNCIONARIO-------------");
        System.out.println("Nome :" +funcionario2.nome + "\n");
        System.out.println("Salario :"+ funcionario2.idade + "\n");
        System.out.println("Altura :" +funcionario2.salario+ "\n");
        System.out.println("----------------------------------");

}}