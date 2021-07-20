import java.util.Objects;

public class Programa{

    public static void main(String[] args) {
        if(Objects.nonNull(args) && args.length >0) {
            System.out.println("Bom dia");
            if(args[0].equals("soma")){
                Integer soma=0;
                    for(int i=1 ; i<args.length;i++){
                        soma=soma+Integer.valueOf(args[i]);
                    }
            System.out.println("Resultado da soma : "+ soma);
        }
            if(args[0].equals("multiplicação")){
                Integer multiplicação=1;
                   for(int i=1 ; i<args.length;i++){
                      multiplicação=multiplicação*Integer.valueOf(args[i]);
                    }
            System.out.println("resultado da multiplicação : "+ multiplicação);
            }
        }
        else{
            System.out.println("Sem args");
        }
    }
}