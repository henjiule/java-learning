
/**
 * @ClassName Factorial
 * @Description
 * @Author
 * @Date 2020/10/5
 **/
public class Factorial {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            count *= i;
        }
        System.out.println("5的阶乘是"+count);
    }
}
