/**
 * 2.编程找出 1000 以内的所有完数并打印出来。 所谓完数就是一个数恰好等于它的因子之和，如：6=1＋2＋3
 */
public class TestTwo {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 1000){
            int sum = 0;
            for (int j = 1;j <= i/2;j++){
                if(0 == i%j){
                    sum += j;
                }
            }
            if(sum == i){
                System.out.println(i+"是完数");
            }
            i++;
        }

    }
}
