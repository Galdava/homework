package by.belhard.j2.project;


import java.util.Scanner;

public class ATM {
    public static void startWork() {
        Scanner sc = new Scanner(System.in);
        Banking b = new Banking();

        while (true) {
            System.out.println("1.Данные о счёте" + '\n' + "2.Пополнить счёт" + '\n' + "3.Снять деньги со счёта" + '\n' + "4.Перевод");

            while (!sc.hasNextInt()) {
                System.out.println("Неправильная команда");
                System.out.println("1.Данные о счёте" + '\n' + "2.Пополнить счёт" + '\n' + "3.Снять деньги со счёта" + '\n' + "4.Перевод");

                sc.next();

            }
            int x = sc.nextInt();


            switch (x) {
                case 1:
                    System.out.println("Введите номер счёта");
                    while (!sc.hasNextInt()) {
                        System.out.println("Неправильная команда");
                        sc.next();
                    }
                    int s = sc.nextInt();

                    //System.out.println("Choose right option");

                    System.out.println("Введите пинкод:");
                    while (!sc.hasNextInt()) {
                        System.out.println("Неправильная команда");
                        sc.next();
                    }
                    int p = sc.nextInt();
                    int ps = b.checkPass(s);
                    if (p == ps) b.checkAcc(s);
                    else System.out.println("Неправильный пинкод");


                    break;
                case 2:
                    System.out.println("Введите номер счёта");
                    while (!sc.hasNextInt()) {
                        System.out.println("Неправильная команда");
                        sc.next();
                    }
                    int s1 = sc.nextInt();
                    System.out.println("Введите пинкод:");
                    while (!sc.hasNextInt()) {
                        System.out.println("Неправильная команда");
                        sc.next();
                    }
                    int p1 = sc.nextInt();
                    int ps1 = b.checkPass(s1);
                    if (p1 == ps1) {
                        b.checkAcc(s1);
                        System.out.println("Введите сумму пополнения");
                        while (!sc.hasNextDouble()) {
                            System.out.println("Неправильная команда");
                            sc.next();
                        }
                        double ss = sc.nextDouble();
                        System.out.println("Итого");
                        b.addBalance(s1, ss);
                    } else System.out.println("Неправильный пинкод");
                    break;
                case 3:
                    System.out.println("Введите номер счёта");
                    int s2 = sc.nextInt();
                    System.out.println("Введите пинкод:");
                    int p2 = sc.nextInt();
                    int ps2 = b.checkPass(s2);
                    if (p2 == ps2) {
                        b.checkAcc(s2);
                        System.out.println("Введите желаемую сумму");
                        double ss = sc.nextDouble();
                        System.out.println("Итого");
                        b.addBalance(s2, -ss);
                    } else System.out.println("Неправильный пинкод");
                    break;
                case 4:
                    System.out.println("Введите номер счёта с которого будут забирать деньги");
                    while (!sc.hasNextInt()) {
                        System.out.println("Неправильная команда");
                        sc.next();
                    }
                    int s3 = sc.nextInt();
                    System.out.println("Введите номер счёта на который зачисляют деньги");
                    while (!sc.hasNextInt()) {
                        System.out.println("Неправильная команда");
                        sc.next();
                    }
                    int s03 = sc.nextInt();
                    System.out.println("Введите пинкод счета 1");
                    while (!sc.hasNextInt()) {
                        System.out.println("Неправильная команда");
                        sc.next();
                    }
                    int p3 = sc.nextInt();
                    int ps3 = b.checkPass(s3);
                    if (p3 == ps3) {
                        b.checkAcc(s3);
                        System.out.println("Введите желаемую сумму");
                        while (!sc.hasNextDouble()) {
                            System.out.println("Неправильная команда");
                            sc.next();
                        }
                        double ss = sc.nextDouble();
                        System.out.println("Итого");
                        b.transfer(s3, s03, ss);
                    } else System.out.println("Неверные данные");
                    break;
                default:
                    System.out.println("Неправильная команда");
                    break;
            }
        }
    }
}
