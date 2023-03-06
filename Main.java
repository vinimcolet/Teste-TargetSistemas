public class Main {
    public static void main(String[] args) {
        System.out.println("questão 1");
        Soma s= new Soma();
        s.questao1();

        System.out.println();
        System.out.println("questão 2");
        Fibonacci f = new Fibonacci();
        f.questao2(23);
        f.questao2(5);

        System.out.println();
        System.out.println("questão 5");
        String x ="Me contrata vai";
        InversorDeString i = new InversorDeString();
        i.questao5(x);


    }
}