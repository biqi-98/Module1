/**
 * 3. 编程题 实现双色球抽奖游戏中奖号码的生成，中奖号码由 6 个红球号码和 1 个蓝球号码组成。 其中红球号码要求随机生成 6 个 1~33 之间不重复的随机号码。 其中蓝球号码要求随机生成 1 个 1~16 之间的随机号码。
 */
import java.util.Random;
import java.util.Arrays;

public class TestThree {
    public static void main(String[] args) {

        Random random = new Random();
        //声明一个数组存放双色球中奖号码
        int[] sysNum = new int[7];
        //
        for (int i = 0; i < sysNum.length - 1; i++) {
            //生成1~33 之间的随机号码
            int n = random.nextInt(33) + 1;
            boolean isExist = false;
            //循环数组，判断n是否已经存在于数组中,存在则重新生成
            for (int j = 0; j < i; j++) {
                if (sysNum[j] == n) {
                    isExist = true;
                    i--;
                    break;
                }
            }
            //不存在则放入数组
            if (!isExist) {
                sysNum[i] = n;
            }
        }
        //生成蓝球号码
        sysNum[6] = random.nextInt(16) + 1;

        System.out.println("双色球开奖号码为：" + Arrays.toString(sysNum));

    }
}
