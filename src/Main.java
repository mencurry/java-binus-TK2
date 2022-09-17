import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner object setup
        Scanner in = new Scanner(System.in);
        // declare crucial variables for user input
        boolean status = true;
        int userValue = 0, count = 0;
        String userName = "", userNIM = "";

        while (status) {
            // loop using do while to get user input
            // then validate the input to make sure its not over the 25 characters limit
            do {
                System.out.print("Masukkan nama (Maks 25 karakter) : ");
                try {
                    userName = in.nextLine();
                    if (userName.length() > 25 || userName.length() < 1) {
                        for (int i = 0; i < userName.length(); i++) {
                            if (userName.charAt(i) != ' ') {
                                count++;
                            }
                        }
                        System.out.println("Jumlah nama yang dimasukkan adalah: " + count);
                        System.out.println("Coba lagi, maksimal karakter nama adalah 25 karakter");
                        count = 0;
                    }
                } catch (Exception e) {
                    System.err.println(e);
                }
            } while (userName.length() >= 25);

            // loop using do while again to get user input
            // then validate the input to make sure its exactly 10 digits
            do {
                System.out.print("Masukkan NIM (Harus 10 angka) : ");
                try {
                    userNIM = in.nextLine();
                    if (userNIM.length() > 10 || userNIM.length() < 10) {
                        for (int i = 0; i < userNIM.length(); i++) {
                            count++;
                        }
                        System.out.println("Jumlah angka yang dimasukkan adalah: " + count);
                        System.out.println("Coba lagi, masukkan NIM dengan jumlah 10 digit");
                        count = 0;
                    }
                } catch (Exception e) {
                    System.err.println(e);
                }
            } while (userNIM.length() > 10 || userNIM.length() < 10);

            // print out user welcome and output their name as well as NIM
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
            System.out.println("Registrasi Sukses..");
            System.out.println("Selamat datang " + userName + " [NIM : " + userNIM + "].. ^^v\n");
            System.out.println("Mari belajar macam-macam deret bilangan..");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");

            // once again using do while to get user input
            // then validate the integer to be more than 5 and less than 20
            do {
                System.out.print("Masukkan sembarang angka [5..20] : ");
                try {
                    userValue = Integer.parseInt(in.nextLine());
                    if (userValue < 5 || userValue > 20) {
                        System.out.println("Angka yang diterima hanya 5 sampai dengan 20. Coba lagi.");
                    }
                } catch (Exception e) {
                    System.err.println(e);
                }
            } while (userValue < 5 || userValue > 20);

            // after taking userValue, output deret bilangan odd, even, and fibonacci sequence
            System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
            System.out.println("Deret Bilangan");
            System.out.println("###############");

            // start by declaring for bilangan genap the starting number is numEven = 2
            // then loop based on userValue, every sequence print numEven and adds 2 everytime
            System.out.println(userValue + " Bilangan Genap : ");
            int numEven = 2;
            for (int i = 1; i <= userValue; i++) {
                System.out.print(numEven + " ");
                numEven += 2;
            }

            // start by declaring for bilangan ganjil the starting number is numOdd = 1
            // then loop based on userValue, every sequence print numOdd and adds 2 everytime
            System.out.println("\n\n" + userValue + " Bilangan Ganjil : ");
            int numOdd = 1;
            for (int i = 1; i <= userValue; i++) {
                System.out.print(numOdd + " ");
                numOdd += 2;
            }

            // basically fibonacci has 3 individual variable that needs to be checked
            // every loop we know that num3 is the result of num1 + num2
            // then after we calculate num3, num1 takes the value of num2, and num2 takes the value of num3
            System.out.println("\n\n" + userValue + " Bilangan Fibonacci : ");
            int fibonacciNum1 = 0, fibonacciNum2 = 1, fibonaccinum3;
            System.out.print(fibonacciNum1 + " " + fibonacciNum2);
            for (int i = 2; i <= userValue; ++i) {
                fibonaccinum3 = fibonacciNum1 + fibonacciNum2;
                System.out.print(" " + fibonaccinum3);
                fibonacciNum1 = fibonacciNum2;
                fibonacciNum2 = fibonaccinum3;
            }

            // ask the user if they would like to retry the program
            System.out.print("\n\nApakah anda ingin mengulangi program?  [Y/T] ");
            String retry = in.nextLine();

            if (retry.equalsIgnoreCase("t")){
                status = false;
                System.out.println("Terima kasih atas kunjungan anda... \n");
            } else if (retry.equalsIgnoreCase("y")) {
                status = true;
            } else {
                status = false;
            }
        }


    }
}