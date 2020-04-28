/**
 * 4. 编程题 自定义数组扩容规则，当已存储元素数量达到总容量的 80%时，扩容 1.5 倍。 例如，总容量是 10，当输入第 8 个元素时，数组进行扩容，容量从 10 变 15。
 */
import java.util.Arrays;
import java.util.Scanner;

public class TestThree {
    public static void main(String[] args) {
        //提示用户输入数组需要的长度
        System.out.println("请输入数组需要的长度");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 初始化一个数组
        int[] arr = new int[num];

        //循环赋值
        for(int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
            if(i+1 >= arr.length*0.8){
                //扩容
                int[] brr=new int[arr.length*3/2];
                System.arraycopy(arr,0,brr,0,i);
                arr=brr;
                break;
            }
        }
        System.out.println("扩容后的数组大小为"+arr.length);
        System.out.println("扩容后的数组内容为"+Arrays.toString(arr));


    }
}
