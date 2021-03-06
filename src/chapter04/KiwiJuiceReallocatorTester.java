package chapter04;

import java.util.Arrays;

/**
 * Created by Juv on 2017-06-11.
 */
public class KiwiJuiceReallocatorTester {

    public static void main(String[] args) {

        System.out.println(check(
                new int[]{0, 10}, new int[]{5, 8}, new int[]{0}, new int[]{1}, new int[]{3, 10}));

        System.out.println(check(
                new int[]{30, 20, 10}, new int[]{10, 5, 5},
                new int[]{0, 1, 2}, new int[]{1, 2, 0},
                new int[]{10, 10, 0}));

        System.out.println(check(
                new int[]{14, 35, 86, 58, 25, 62},
                new int[]{6, 34, 27, 38, 9, 60},
                new int[]{1, 2, 4, 5, 3, 3, 1, 0},
                new int[]{0, 1, 2, 4, 2, 5, 3, 1},
                new int[]{0, 14, 65, 35, 25, 35}));

        System.out.println(check(
                new int[]{700000, 800000, 900000, 1000000},
                new int[]{478478, 478478, 478478, 478478},
                new int[]{2, 3, 2, 0, 1},
                new int[]{0, 1, 1, 3, 2},
                new int[]{0, 156956, 900000, 856956}));
    }

    private static boolean check(
            int[] capacities, int[] bottles, int[] fromId, int[] toId, int[] expected) {

        int[] result = new KiwiJuiceReallocator()
                .capacities(capacities)
                .bottles(bottles)
                .fromId(fromId)
                .toId(toId)
                .reallocate();

        if (!Arrays.equals(expected, result)) {
            return false;
        }
        return true;
    }
}
