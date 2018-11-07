import java.util.Arrays;

public class ArtHomeWork6_2 {


    public static void main(String[] args) {

        System.out.println();
        System.out.println("============ 1 =============");
        System.out.println();

        int first[] = new int[50];
        int j = 0;
        for( int i=0; i < 100; i++ ) {
            if (i%2 == 1) {
                first[j] = i;
                j++;
            }
        }
        for ( int i = 0; i<50; i++) {
            System.out.print(first[i] + " ");
        }
        System.out.println();
        for ( int i = 49; i>=0; i--) {
            System.out.print(first[i] + " ");
        }
        System.out.println();
        System.out.println("============ 2 =============");
        System.out.println();

        int second[] = {1, 5, 9, 4, 6, 4, 3, 7, 9, 6, 2, 1, 6, 8, 7};
        System.out.println(Arrays.toString(second));
        int q = 0;
        for( int i=0; i < second.length; i++ ) {
            if (second[i] % 2 == 0) {
                q++;
            }
        }
         System.out.println();
         System.out.println("Количество четных элементов в массиве - " + q);

        System.out.println();
        System.out.println("============ 3 =============");
        System.out.println();

        int tri[] = {1, 5, 7, 9, 6, 2, 1, 6, 8, 7};
        System.out.println(Arrays.toString(tri));
        for ( int i=0; i<tri.length; i++ ) {
            if (i%2 == 1) {
                tri[i] = 0;
            }
        }
        System.out.println(Arrays.toString(tri));

        System.out.println();
        System.out.println("============ 4 =============");
        System.out.println();

        int che1[] = {1, 3, 5, 2, 4};
        int che2[] = {2, 2, 2, 2, 2};
        System.out.println(Arrays.toString(che1));
        System.out.println(Arrays.toString(che2));
        int c1 = 0;
        int c2 = 0;
        for (int i=0; i<5; i++) {
            c1 += che1[i];
            c2 += che2[i];
        }
        c1 = c1 / 5;
        c2 = c2 / 5;
        if (c1>c2) {
            System.out.println("Первое число больше");
        } else if (c2>c1) {
            System.out.println("Второе число больше");
        } else {
            System.out.println("Числа равны");
        }

        System.out.println();
        System.out.println("============ 5 =============");
        System.out.println();

        int fiv[] = {12, 22, 25, 42, 22};
        int f = 1;
        for (int i = 1; i<fiv.length; i++) {
            if (fiv[i] < fiv[i-1]){
                f = 2;
                break;
            }
        }
        switch (f) {
            case 1:
                System.out.println("Массив является строго возрастающей последовательностью");
                break;
            case 2:
                System.out.println("Массив не является строго возрастающей последовательностью");
        }
        System.out.println();
        System.out.println("============ 6 =============");
        System.out.println();

        int six[] = new int[20];
        int s = 1;
        six[0] = 1;
        six[1] = 1;
        for ( int i = 2; i<20; i++ ) {
            six[i] = six[i-1] + six[i-2];
        }
        System.out.println(Arrays.toString(six));

        System.out.println();
        System.out.println("============ 7 =============");
        System.out.println();

        int sev[] = {1, 13, 5, 2, 4, 8, -4, 12, -12, 4, -4, 0};
        int s1 = sev[11];
        int s2 = 11;
        for (int i = 10; i>=0; i--) {
            if (sev[i] > s1) {
                s1 = sev[i];
                s2 = i;
            }
        }
        System.out.println("Максимальное число " + s1 + ". Его индекс " + s2);

    }
}


