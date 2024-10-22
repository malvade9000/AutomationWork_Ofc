package Sept.ex_13092024;

public class Lab024 {

    public static void main(String[] args) {
        // ✅ Literals
        // Boolean
        // Integral

        // Char
        //  Single Char
        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r';

        System.out.println("Aniket" + new_line + "Malvade");
        // System.out.println("Aniket"+ '\n' +  "Malvade");
        System.out.println("Aniket" + tab_line + "Malvade");
        System.out.println("Aniket" + back_space + "Malvade");
        System.out.println("Aniket" + car_r + "Malvade");

        char c11 = '\u1F60'; //65 - ASCII
        // chinese - india, japanese -> unicode
        // /u09878

        System.out.println(c11); // ὠ - :)
    }

}
