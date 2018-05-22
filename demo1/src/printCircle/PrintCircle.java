package printCircle;

import java.lang.Math;
public class PrintCircle {
    public static void main(String[] args) {
        paint(10); //�뾶10
    }
    public static void paint(int r) {
     //�ٶ�Բ��������(r,r);
        int y = r * 2; //y�����꿪ʼ
        int x = 0;
        int c = 0; //�м�ո�����
        int z = 2; //ÿ�еݼ���
        for (int j = r * 2; j >= 0; j=j-z) {
            x = getX(r, y);
            System.out.print(getSpace(x) + "*");
            c = (r-x)*2;
            System.out.println(getSpace(c) + "*");
            y-=z;
        }
    }
    public static int getX(int r, int y) {
        //��Բ��׼���̵�
        int x = y - r;       
        double t = Math.sqrt((r * r) - (x * x));
        return (int) Math.round(r-t);
    }
    public static String getSpace(int i) {
        String s = "";
        for (int j = 0; j < i; j++) {
            s += " ";
        }
        return s;
    }
}