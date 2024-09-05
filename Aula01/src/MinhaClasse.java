public class MinhaClasse {
    //Seu código AQUI
    
    public static void main (String [] args ) {
        String primeiroNome = "Yasmin";
        String segundoNome = "Araujo";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }


}
