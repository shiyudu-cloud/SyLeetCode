package maopao;

import java.util.Arrays;

/**
 * 冒泡排序
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
        int[] arr = {9, 6, 1, 3, 5};
        // type2
        //外层循环控制排序趟数
        for(int x =0 ; x < arr.length -1 ; x++){
            //内层循环控制每一趟排序多少次
            for (int y = 0 ; y < arr.length -1 -x ; y++ ){
                if(arr[y]> arr[y+1]){
                    int temp  = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                }
            }
        }
        System.out.println("Type 2"+Arrays.toString(arr));
    }




}
