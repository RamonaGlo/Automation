public class exercitii {

    public static void main(String[] args) {
        int x = 10;
        int y = 15;

        if (x < y) {
            System.out.print(" x is lower than y");
        }
        else {
            System.out.print(" x is greater than y");
        }

        System.out.print("\n");

        if (x > y) {
            System.out.print(" x is lower than y");
        }
        else {
            System.out.print(" x is greater than y");
        }

        System.out.print("\n");

        switch (x-y){
             case 3: System.out.print(y);
             break;
             case 9: System.out.print(x);
             break;
             case -5: System.out.print(x+y);
             break;
             default: System.out.print("sorry...try again");
             break;
        }
    }


}
