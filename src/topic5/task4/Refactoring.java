package topic5.task4;

import java.util.Random;
import java.util.Vector;

public class Refactoring {

    public static void main(String[] args) {
        Random random = new Random();
        int n = 5;
        int[] a = new int[5];
        int[] d = new int[5];
        int[] p = new int[5];


        for (int i = 0; i < 5; i++) {
            a[i] = random.nextInt(50);
        }


        for (int i = 0; i < n; i++) {
            d[i] = 1;
            p[i] = -1;
            for (int j = 0; j < i; ++j) {
                if (a[j] < a[i]){
                    if (1+d[j]>d[i]){
                        d[i] = 1 + d[j];
                        p[i] = j;
                    }
                }
            }
        }

        int ans = d[0], pos = 0;
        for (int i = 0; i < n; ++i) {
            if (d[i]> ans){
                ans = d[i];
                pos = i;
            }
        }
        System.out.println(ans);

        Vector<Integer> path = new Vector<Integer>();
        while (pos != -1){
            path.addElement(pos);
            pos = p[pos];
        }

        System.out.println(path);

        for (int i = 0; i < path.size(); i++) {
            System.out.print(a[path.get(i)] + " ");
        }
    }

}
