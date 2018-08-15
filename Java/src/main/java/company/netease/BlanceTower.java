package company.netease;

import javafx.util.Pair;

import java.util.*;

/**
 * @author apktool
 * @date 2018-08-12 18:05
 * *
 * 小易有一些立方体，每个立方体的边长为1，他用这些立方体搭了一些塔。
 * 现在小易定义：这些塔的不稳定值为它们之中最高的塔和最低的塔的高度差
 * 小易溪想要让这些塔尽量稳定，所以他进行了如下操作：每次从某座塔上取下一块立方体，并把它放到另一座塔上。
 * 注意，小易不会把立方体放到它原本的那座塔上，因为他认为这样毫无意义。
 * 现在小易想要知道，他进行了不超过K次操作后，不稳定值最小为多少。
 * *
 * 输入描述：
 * 第一行两个数n, k(1 <=n <= 100, 1 <= k <= 1000)表示塔的数量以及最多操作的次数
 * 第二行n个数，a_i(1 <= a_i <= 10^4)表示第i座塔的初始高度
 * 输出描述：
 * 第一行两个数s, m,表示最小的不稳定值和操作次数(m <= k)
 * 接下来m行，每行两个数x, y表示从第x座塔上取下一块立方体放到第y座塔上。
 * *
 * 示例1
 * 输入：
 * 3 2
 * 5 8 5
 * 输出：
 * 0 2
 * 2 1
 * 2 3
 */

public class BlanceTower {
    public static void main(String[] args) {
        Vector<Pair<Integer, Integer>> vector = new Vector<>();
        Vector<Pair<Integer, Integer>> ans = new Vector<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            vector.add(new Pair<>(sc.nextInt(), i + 1));
        }

        for (int i = 1; i < k + 1; i++) {
            Collections.sort(vector, (a, b) -> {
                if (b.getKey() == a.getKey()) {
                    return b.getValue() - a.getValue();
                }
                return b.getKey() - a.getKey();
            });

            if(vector.get(0).getKey() == vector.get(n - 1).getKey() || vector.get(0).getKey() == vector.get(n - 1).getKey() + 1) {
                break;
            }

            vector.set(0, new Pair<>(vector.get(0).getKey() - 1, vector.get(0).getValue()));
            vector.set(n - 1, new Pair<>(vector.get(n - 1).getKey() + 1, vector.get(n - 1).getValue()));

            ans.add(new Pair<>(vector.get(0).getValue(), vector.get(n - 1).getValue()));
        }

        Collections.sort(vector, (a, b) -> {
            if (b.getKey() == a.getKey()) {
                return b.getValue() - a.getValue();
            }
            return b.getKey() - a.getKey();
        });

        System.out.println(vector.get(0).getKey() - vector.get(n - 1).getKey() + " " + ans.size());
        for (Pair item: ans) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
    }
}
