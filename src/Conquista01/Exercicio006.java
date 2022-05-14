package Conquista01;

public class Exercicio006 {

    public static void main(String[] args) {


        // int,long,double,float,short

        int numeroint = 10;
        long numerolong = 2000;
        double numerodouble=300.456D;
        short numeroshort=3;
        float numerofloat=200.0F;

        boolean isNumerolongMaiorQueNumeroint=2000>10;
        boolean isNumerofloatMenorQueNumeroshort=200.0F<3;
        boolean isNumerodoubleIgualNumerolong=300.456D==2000;
        boolean isNumerointMaiorQueNumeroshort=10>3;
        boolean isNumerodoubleMenorQueNumerofloat=300.456D<200.0F;
        System.out.println("isNumerolongMaiorQueNumeroint "+isNumerolongMaiorQueNumeroint);
        System.out.println("isNumerofloatMenorQueNumeroshort "+isNumerofloatMenorQueNumeroshort);
        System.out.println("isNumerodoubleIgualNumerolong "+isNumerodoubleIgualNumerolong);
        System.out.println("isNumerointMaiorQueNumeroshort "+isNumerointMaiorQueNumeroshort);
        System.out.println("isNumerodoubleMenorQueNumerofloat "+isNumerodoubleMenorQueNumerofloat);

    }

}
