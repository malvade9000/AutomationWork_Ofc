package Sept.ex_16092024;

public class Lab035 {

   /* public static void main(String[] args) {
        String first_name = "Pramod";
        String last_name = "Dutta";
        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + a + b);
        System.out.println(first_name + last_name + (a + b));
        System.out.println(a + b + first_name + last_name);
        */

    public static void main(String[] args) {
        String first_name = "Aniket";
        String last_name = "Malvade";

        int a = 10;
        int b = 20;

        System.out.println(first_name + last_name + a + b); //it will not add a + b, it will treat as a string only
        System.out.println(first_name + last_name + (a + b)); // it will add as because added into ()
        System.out.println(a + b + first_name + last_name); //it will also add because it is at the start
    }

    }


