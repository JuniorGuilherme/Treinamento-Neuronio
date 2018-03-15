public class Principal {
    public static void main(String[] args) {
        int x11=0, x12=0, x21=1, x22=1;
        int peso1 = -1;
        int peso2 = -1;
        int soma1, soma2;
        int y1=1, y2=0;



        do{
            //CONJUNTO 1
                soma1 = (x11 * peso1) + (x12 * peso2);
            System.out.println("Soma C1: "+soma1);
                if (soma1 < 0) {
                    y1 = 0;
                    System.out.println("Saida parcial C1: " + y1);
                } else if (soma1 >= 0 && soma1 <= 1) {
                    y1 = soma1;
                    System.out.println("Saida parcial C1: " + y1);
                } else if (soma1 > 1) {
                    y1 = 1;
                    System.out.println("Saida parcial C1: " + y1);
                }
                if (y1 != 0) {
                    System.out.println("Aplicou delta atraves do conjunto 1.");
                    peso1 = ((peso1 + 1) * (0-y1) * x11);
                    peso2 = ((peso2 + 1) * (0-y1) * x12);
                    System.out.println("Peso 1: "+ peso1);
                    System.out.println("Peso 2: "+ peso2);
                }

            // CONJUNTO 2

                soma2 = (x21 * peso1) + (x22 * peso2);
            System.out.println("Soma C2: "+soma2);
                if (soma2 < 0) {
                    y2 = 0;
                    System.out.println("Saida parcial C2:  " + y2);
                } else if (soma2 >= 0 && soma2 <= 1) {
                    y2 = soma2;
                    System.out.println("Saida parcial C2:  " + y2);
                } else if (soma2 > 1) {
                    y2 = 1;
                    System.out.println("Saida parcial C2: " + y2);
                }
                if (y2 != 1) {
                    System.out.println("Aplicou delta através do conjunto 2.");
                    peso1 = peso1 + 1 * (1-y2) * x21;
                    peso2 = peso2 + 1 * (1-y2) * x22;
                    System.out.println("Peso 1: "+ peso1);
                    System.out.println("Peso 2: "+ peso2);
                }

        }while(y1!=0 || y2!=1);

        System.out.println("");
        System.out.println("RESULTADOS FINAIS");

        System.out.println("Soma C1: "+soma1);
        System.out.println("Soma C2: "+soma2);

        System.out.println("Saida Conjunto 1: "+y1);
        System.out.println("Saida COnjunto 2: "+y2);

        System.out.println("Peso 1: "+peso1);
        System.out.println("Peso 2: "+peso2);
    }
}
