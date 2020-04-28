/**
 * 编程题 使用二维数组和循环实现五子棋游戏棋盘的绘制
 */
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class TestThree {
    public static void main(String[] args) {
        //声明数组
        char[] arr = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        char[][] arrs = new char[arr.length+1][arr.length+1];
        arrs[0][0]=' ';
        //赋值
        for(int i=0;i<arrs.length;i++){
            for(int j=0;j<arrs.length;j++){
                if(0 == i && j !=0){
                    arrs[i][j]=arr[j-1];
                }
                else if(0 == j && i != 0){
                    arrs[i][j]=arr[i-1];
                }else if(i != 0 && j !=0){
                    arrs[i][j]='+';
                }
            }
        }
        //打印
        for(int i=0;i<arrs.length;i++){
            for(int j=0;j<arrs.length;j++){
                System.out.print(arrs[i][j]+" ");
            }
            System.out.println();
        }

    }
}
