import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aula2 {
    public static void main(String[] args) {


        if(Objects.nonNull(args) && args.length>0){
            if("soma".equals(args[0])){   
                soma(args);
            } else if("multiplica".equals(args[0])){
                multiplica(args);
            } else if ("explica".equals(args[0])){
                explica();
            } else if ("add".equals(args[0])){
                adiciona(args);
            } else{
                System.out.println("Sem args");
          }
        }
    }
    public static void soma(String []args){
        Integer soma=0;
        for(int i=1;i<args.length;i++){
            soma+=Integer.valueOf(args[i]);
        }
        System.out.println("O resultado da Soma é : "+ soma);
    }
    public static void multiplica(String []args){
        Integer multiplica=1;
        for(int i=1;i<args.length;i++){
            multiplica*=Integer.valueOf(args[i]);
        }
        System.out.println("O resultado da multiplicação é "+ multiplica);
    }
    public static void adiciona(String[] args){
        List<String> compras = new ArrayList<>();
        Integer i =1;
        while(i < args.length){
            compras.add(args[i]);
            ++i;
        }
    }
    public static void explica(){
        Integer i = 0;
        Integer j = 0;
        i++;
        j++;
        System.out.println(i);
        System.out.println(j);
        System.out.println(i);
        System.out.println(j);
    }
}

