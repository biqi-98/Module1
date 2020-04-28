/**
 * 1. 编程题 提示用户输入年月日信息，判断这一天是这一年中的第几天并打印。
 */

import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) {
        //提示用户输入
        System.out.println("请输入年月日并用空格间隔");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        //根据月份增加天数
        switch (month) {
            case 12: day += 30;
            case 11: day += 31;
            case 10: day += 30;
            case 9: day += 31;
            case 8: day += 31;
            case 7: day += 30;
            case 6: day += 31;
            case 5: day += 30;
            case 4: day += 31;
            case 3: day += 28;
            case 2: day += 31;
            //闰年且月份>2的时候天数+1
            default: day += (month >2 && year % 4 == 0 && (year%400 == 0 || year % 100 != 0)) ? 1 : 0;
        }
        System.out.println("这一天是这一年中的第" + day + "天");
    }
}
