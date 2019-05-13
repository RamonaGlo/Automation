public class WhileForDoWhile {

    public static void main(String args[]){
        int a = 12;
        int b = 14;

         while (a<b){
             System.out.println(a);
             a++;
         }
         ex2();
         ex3();
    }

    public static void ex2 (){

        int a = 14;
        int b = 14;
        do {
            System.out.println(a);
            a++;
        }

        while (a<b);

    }

    public static void ex3(){
        int a = 12;
        int b = 14;

        for (int i=0;i<b-a;i++) {
            System.out.println(b-a);
        }
    }
}
