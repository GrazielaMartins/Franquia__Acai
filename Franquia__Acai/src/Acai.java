public class Acai {
    String tamanho;
    Double valor;
    Boolean acrescimoSorvete;

    public  double CalcularValor(Boolean acrescimoSorvete, String tamanho) {
        if (tamanho.equals("P")){
        valor = 8.00;


    } else if (tamanho.equals("M")){
            valor = 10.00;
        } else {
            valor= 12.0;

            }if (acrescimoSorvete){
                valor += 2.0;
            }
            return valor;
        }
        }



