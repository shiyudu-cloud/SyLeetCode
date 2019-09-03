package xuanze;

import java.util.Arrays;

/**
 * 选择排序
 * @Author: dushiyu
 * @Date: 2019-08-30 18:51
 * @Version 1.0
 */
public class XuanZe {

    /**
     * 选择排序 从第一个位置开始，这个位置与后面的所有的位置上面的数字进行比较， 如果不满足要求就交换位置
     */

    public static void main(String[] args) {
        int[] arr = {9, 6, 1, 3, 5};

        for (int x = 0; x < arr.length; x++) {
            for (int y = x + 1; y < arr.length; y++) {
                int temp;
                if (arr[x] > arr[y]) {
                    temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    }
