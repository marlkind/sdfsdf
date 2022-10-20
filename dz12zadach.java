import java.util.Scanner;
import java.lang.Math;
public class dz12zadach
{
    public static void main(String[] args) {

        //1
        System.out.println((101+0)/3); //1
        System.out.println(3.0e-6*10000000.1); //b
        System.out.println(true && true); //c
        System.out.println(false && false); //d
        System.out.println((false && false) || (true && true) || (false || false) && (true && true)); //e
        Scanner s = new Scanner(System.in);


        //2
        int[] ch;
        ch = new int[4];

        for (int i = 0; i<4; i++)
        {
            System.out.print("Введите число\n");
            ch[i] = s.nextInt();

        }

        if ((ch[0]==ch[1]) &  (ch[1] == ch[2]) & (ch[3] == ch[2]))
        {
            System.out.println("Равно");
        }
        else {
            System.out.println("Не равно");
        }

        //3
        int[] Massive = {1, 10, 100, 1000, 10000, 100000};
        int max = Massive[0];
        for (int i : Massive) {
            if (i > max)
                max = i;
        }
        System.out.println("Наибольшее число = " + max);

        //4
        int[] Massiv = {1, 10, 100, 1000, 10000, 100000};
        int min = Massive[0];
        for (int i : Massive) {
            if (i < min)
                min = i;
        }
        System.out.println("Наименьшое число = " + max);

        //5
        double[] mas = new double[100];
        double sred  = 0;
        for (int h=0; h<100; h++){
            mas[h] = Math.random()*5000;
            sred = sred + mas[h];
        }
        sred = sred / 100;
        System.out.println("Среднее значение = " + sred);
        for (int h=0; h<100; h++){
            if(mas[h]>sred) {
                System.out.println(mas[h]);

                //6
                int sum = 0;
                System.out.println("Введите число");
                int umn = s.nextInt();
                System.out.println("Введите степень");
                int st = s.nextInt();
                for (int i = 0; i < st; i++) {
                    sum += umn;
                }
                System.out.println(sum);

                //7
                int[] array = new int[20];
                for (int i = 0; i < 20; i++) {
                    array[i] = (int) (Math.random() * (100) + 0);
                }
                for (int b = 0; b < 20; b++) {
                    if (array[b] % 2 != 0) {
                        System.out.println(array[b] + " нечет");
                    } else
                        System.out.println(array[b] + " чет");


                    //8

                    System.out.println("Введите температуру");
                    int temper = s.nextInt();
                    System.out.println((temper - 32) * 5 / 9);

                    //9
                    System.out.println("Введите вес");
                    double ves = s.nextInt();
                    System.out.println("Введите рост");
                    double ros = s.nextInt();
                    System.out.println(ves / (ros * ros));

                    //10

                    System.out.println("Введите число");
                    int cs = s.nextInt();

                    System.out.println(Math.pow(cs, 2));
                    System.out.println(Math.pow(cs, 3));
                    System.out.println(Math.pow(cs, 4));

                    //11

                    System.out.println();
                    int a = s.nextInt();

                    System.out.println();
                    int d = s.nextInt();

                    System.out.println();
                    int c = s.nextInt();

                    if (((a + d) > c) && ((a + c) > d) && ((c + d) > a)) {
                        System.out.println("Может");
                    } else {
                        System.out.println("Не может");
                    }

                }
            }
    }

 }
}