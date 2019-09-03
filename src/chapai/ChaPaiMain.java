package chapai;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.util.Arrays;

/**
 *
 * 插入排序
 * @Author: dushiyu
 * @Date: 2019-09-02 20:57
 * @Version 1.0
 */
public class ChaPaiMain {

    /**
     * 从第一个值开始往前插入 后面的数往前比较的时候前面已经排序完成 ， 找到他对应的位置
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {9,6,1,3,5};

        for (int x = 1;x < arr.length; x++){
           for (int y = x ;y >0 ; y--){
               if (arr[y] < arr[y - 1]){
                   int temp  = arr[y];
                   arr[y] = arr[y-1];
                   arr[y-1] = temp;
               }
               System.out.println(Arrays.toString(arr));
           }
        }
        System.out.println(Arrays.toString(arr));
    }
}
