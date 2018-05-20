package leetcode.easy;

/**
 * @author apktool
 * @date 2018-05-17 20:49
 * *
 * 给你一根长度为n绳子，请把绳子剪成m段（m、n都是整数，n>1并且m>1）。每段的绳子的长度记为k[0]、k[1]、...、k[m]。
 * k[0] * k[1] * ... * k[m]可能的最大乘积是多少？
 *
 * 例如当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到最大的乘积18。
 * *
 * 解法如下:
 * F(k)表示长度为k时的最大乘积
 * 下述公式的意思为不切割长度为k的绳子与将长度为k的绳子切割成 i * (k - i)的乘积的最大值
 *
 * F(k) = Max{F(k), F(i) * F(k-i)}
 */

public class CuttingCrop {
    private int result;

    public int MaxMulti(int n) {
        int length = n + 1;

        if (n < 4) {
            return n;
        }

        int[] array = new int[length];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;

        for (int k = 4; k < n + 1; k++) {
            for (int i = 0; i < k; i++) {
                int result = array[i] * array[k - i];
                array[k] = Math.max(result, array[k]);
            }
        }

        return array[array.length - 1];
    }

    public static void main(String[] args) {
        int n = 6;
        int result;

        CuttingCrop haha = new CuttingCrop();
        result = haha.MaxMulti(n);
        System.out.println(result);
    }
}
