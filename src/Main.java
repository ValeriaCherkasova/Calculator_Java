import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String stroka = sc.nextLine();
        String[] array = stroka.split("\\s");

        if (array.length != 3) {
            System.out.println("ERROR");
            throw new Exception();
        }
        String[] rare = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] erar = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] rar = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

        int a = 0;
        int b = 0;
        int t;
        String h = "-";
        boolean cc = true;


        for (int tt = 0; tt < erar.length; tt++) {
            for (int i = 0; i < rare.length; i++) {
                if (array[0].equals(erar[tt]) && array[2].equals(rare[i])) {
                    System.out.println("ERROR");
                    throw new Exception();
                }
                if (array[0].equals(rare[tt]) && array[2].equals(erar[i])) {
                    System.out.println("ERROR");
                    throw new Exception();
                }
                if (array[0].equals(erar[tt]) && array[2].equals(erar[i])) {
                    cc = false;
                }
            }
        }

        if (cc) {

            for (int m = 0; m < rar.length; m++) {
                if (array[0].equals(rar[m])) {
                    a = m;
                }
            }

            for (int m = 0; m < rar.length; m++) {
                if (array[2].equals(rar[m])) {
                    b = m;
                }
            }

            if (a <= 10 & a > 0 & b <= 10 & b > 0) {

                if (array[1].equals("-")) {
                    t = a - b;
                    if (t >= 0) {
                        for (int m = 0; m < rar.length; m++) {
                            if (t == m) {
                                h = rar[m];
                            }
                        }
                        System.out.println(h);
                    } else {
                        System.out.println("ERROR");
                        throw new Exception();
                    }
                }

                if (array[1].equals("+")) {
                    t = a + b;
                    for (int m = 0; m < rar.length; m++) {
                        if (t == m)
                            h = rar[m];
                    }
                    System.out.println(h);
                }
                if (array[1].equals("*")) {
                    t = a * b;
                    for (int m = 0; m < rar.length; m++) {
                        if (t == m)
                            h = rar[m];
                    }
                    System.out.println(h);
                }

                if (array[1].equals("/")) {
                    t = a / b;
                    for (int m = 0; m < rar.length; m++) {
                        if (t == m)
                            h = rar[m];
                    }
                    System.out.println(h);

                }
            } else {
                System.out.println("ERROR");
                throw new Exception();
            }
        }


        if (!cc) {
            a = Integer.parseInt(array[0].trim());
            b = Integer.parseInt(array[2].trim());

            if (a <= 10 & a > 0 & b <= 10 & b > 0) {

                if (array[1].equals("+")) {
                    System.out.println(a + b);
                }

                if (array[1].equals("-")) {
                    System.out.println(a - b);
                }

                if (array[1].equals("/")) {
                    System.out.println(a / b);

                }

                if (array[1].equals("*")) {
                    System.out.println(a * b);
                }
            } else {
                System.out.println("ERROR");
                throw new Exception();
            }
        }
    }
}