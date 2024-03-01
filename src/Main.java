import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = inp.nextInt();
        System.out.println("Dizinin elemanlarını giriniz : ");
        int[] list = new int[n];
        int i = 1;
        while (i <= n) {
            System.out.print(i + ". Elemanı: ");
            list[i - 1] = inp.nextInt();
            i++;
        }

        Arrays.sort(list);
        int j = 0;
        int count = 1;
        while (1 + j < list.length) {
            if (list[j] != list[1 + j]) {
                System.out.println(list[j] + " sayısı " + count + " kere tekrar edildi.");
                count = 1;
                j++;
            } else if (list[j] == list[1 + j]) {
                count++;
                //System.out.println(count);
                j++;
                if (j == list.length - 1) {
                    System.out.println(list[j] + " sayısı " + count + " kere tekrar edildi.");
                }
            }
        }

    }
}