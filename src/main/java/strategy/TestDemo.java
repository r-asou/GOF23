package strategy;

/**
 * @author JC Liu
 * @date 2022/1/280
 */
public class TestDemo {

    public static void main(String[] args) {
        System.out.println(Context.getInstance().executeMethod(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2])));
    }
}
