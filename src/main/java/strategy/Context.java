package strategy;

import strategy.service.impl.AddOperation;
import strategy.service.impl.SubtractOperation;

import java.util.HashMap;
import java.util.Map;

/**
 * @author JC Liu
 * @date 2022/1/28
 */
public class Context {

    private volatile static Context instance;

    private final Map<String, GeneralOperation> operationMap = new HashMap<>();

    private Context() {

    }

    public static Context getInstance() {
        if (instance == null) {
            synchronized (Context.class) {
                if (instance == null) {
                    instance = new Context();
                    instance.init();
                }
            }
        }
        return instance;
    }

    private void init() {
        operationMap.put("add", new GeneralOperation(new AddOperation()));
        operationMap.put("subtract", new GeneralOperation(new SubtractOperation()));
        operationMap.put("divide", new GeneralOperation((num1, num2) -> num1/num2));
    }

    public int executeMethod(String type, int param1, int param2) {
        return operationMap.get(type).execute(param1, param2);
    }

}
