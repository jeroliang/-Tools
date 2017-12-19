/**
 * Created by Jero on 2017/11/25 0025.
 */

public class calculation {
    static int min = 2000;// 2000 *0.0005 = 1

    public static void main(String[] a) {
        int time = 365 * 5;
        int all = 1000000000;
        int getAll = getAll(0, time);
        int getTime = getTime(all);
        int getNum = getNum(all, time);
        System.out.println("最低情况下的值：" + getAll);
        System.out.println("跑到头需要几天：" + getTime
                + "(" + getTime / 365 + "年)");
        System.out.println("总值" + all + "(" + all / 100 + "y)"
                + "//这么久：" + time + "(" + time / 365 + "年)"
                + "//运算值" + getNum + "(" + getNum / 100 + "y)");
    }

    public static int getAll(int all, int time) {
        time--;
        if (time == 0)
            all = min;
        else
            all = getAll(all, time);
//        System.out.println("time = [" + time + "]" + "all = [" + all + "]");
        return (int) (all / 0.9995);
    }

    public static int getTime(int all) {
        int time = 0;
        int c;
        while (all >= min) {
            time++;
            c = (int) (all * 0.0005);
            all -= c;
//            System.out.println("all = [" + all + "]");
        }
        return time;
    }

    public static int getNum(int all, int time) {
        int c;
        while (all >= min && time >= 0) {
            time--;
            c = (int) (all * 0.0005);
            all -= c;
//            System.out.println("time = [" + time + "]" + "all = [" + all + "]");
        }
        return all;
    }

}
