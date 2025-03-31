public class FormataorCepExemplo {


    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("72115075");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
     
            System.out.println("O cep não e Valido !");
        }
        
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() !=8)
        throw new CepInvalidoException();

        return  cep.substring(0, 2)+"."+cep.substring(2,5)+"-"+cep.substring(5) ;
    }

    
}
