package company.alibaba;

import java.util.Scanner;

/**
 * @author apktool
 * @date 2018-07-18 22:20
 * *
 * 阿里巴巴测评题目
 * *
 * +-+-+-+-+-+-+-+
 * +-a-+-+-+-+-+-+
 * +-+-+-+-+-b-+-+
 * +-+-c-+-+-+-+-+
 * +-+-+-d-+-+-+-+
 * ·-+-+-+-+-+-+-+
 * *
 * 如图，某物流派送员p，需要给a、b、c、d4个快递点派送包裹，请问派送员需要选择什么的路线，才能完成最短路程的派送。假设如图派送员的起点坐标(0,0)，派送路线只能沿着图中的方格边行驶，每个小格都是正方形，且边长为1，如p到d的距离就是4。随机输入n个派送点坐标，求输出最短派送路线值（从起点开始完成n个点派送并回到起始点的距离）。
 * 输入
 * 4
 * 2,2
 * 2,8
 * 4,4
 * 7,2
 * 输出 30
 * 输入
 * 3
 * 2,2
 * 2,8
 * 6,6
 * 输出28
 */

class Point {
    int px;
    int py;
    boolean visited;

    public Point(int px, int py) {
        this.px = px;
        this.py = py;
        this.visited = false;
    }

    public int getLength(Point p) {
        return Math.abs(px - p.px) + Math.abs(py - p.py);
    }
}

public class AliKuaiDi {
    final static Point START = new Point(0, 0);
    int minpath = Integer.MAX_VALUE;

    public int calculate(Point start, Point[] points, int sum, int count) {
        if (count == points.length) {
            minpath = Math.min(minpath, sum + start.getLength(START));
            return minpath;
        }
        for (int i = 0; i < points.length; i++) {
            if (points[i].visited == false) {
                sum += points[i].getLength(start);
                if (sum < minpath) {
                    points[i].visited = true;
                    calculate(points[i], points, sum, count + 1);
                }
                sum -= points[i].getLength(start);
                points[i].visited = false;
            }
        }
        return minpath;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pnum = Integer.parseInt(input.nextLine().trim());

        Point[] points = new Point[pnum];
        for (int i = 0; i < pnum; i++) {
            String[] locations = input.nextLine().trim().split(",");
            points[i] = new Point(Integer.parseInt(locations[0]), Integer.parseInt(locations[1]));
        }

        AliKuaiDi akd = new AliKuaiDi();
        int min = akd.calculate(START, points, 0, 0);
        System.out.println(min);
    }
}
