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
        System.out.println("�������µ�ֵ��" + getAll);
        System.out.println("�ܵ�ͷ��Ҫ���죺" + getTime
                + "(" + getTime / 365 + "��)");
        System.out.println("��ֵ" + all + "(" + all / 100 + "y)"
                + "//��ô�ã�" + time + "(" + time / 365 + "��)"
                + "//����ֵ" + getNum + "(" + getNum / 100 + "y)");
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
