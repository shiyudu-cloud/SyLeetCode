package maopao;

import java.util.Arrays;

/**
 *
 * @Author: dushiyu
 * @Date: 2019-08-20 16:38
 * @Version 1.0
 */
public class MaoPao1 {

    /**
     * 冒泡排序：依次比较相邻两个数，将小的数放在前面
     *  大的数放在后面
     * n 个数据 总共进行 n-1 轮比较，
     * 第 n 轮 的比较就是 length -n 次
     */

    public static void main(String[] args) {
        int[] arr = {9,6,1,3,5};

        for(int x =0 ; x < arr.length ; x++){
            for (int y= x +1 ; y < arr.length ; y++){
                int temp ;
                if(arr[x] > arr[y]){
                    temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }



}
