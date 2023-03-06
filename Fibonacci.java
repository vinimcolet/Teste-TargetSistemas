public class Fibonacci {

    public void questao2(int n){
        int atual=0;
        int anterior=0;

        for (int i = 0; i <= n; i++) {

            if (i == 0) {
                atual = 1;
                anterior = 0;
            } else {
                atual += anterior;
                anterior = atual - anterior;
            }
            if(atual == n){
                System.out.println("Valor: " + n + " pertence a fibonacci");
                break;
            }
            if (atual > n){
                System.out.println("Valor: " + n + " não pertence a fibonacci");
                break;
            }
        }

    }

}
