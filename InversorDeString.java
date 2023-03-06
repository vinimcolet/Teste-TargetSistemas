public class InversorDeString {

    public void questao5(String x){
        String invertida = "";

        for (int i = x.length()-1; i >= 0; i--){
            invertida += x.charAt(i);
        }
        System.out.println(invertida);
    }
}
