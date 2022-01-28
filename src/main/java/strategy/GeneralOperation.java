package strategy;

import strategy.service.Operation;

/**
 * @author JC Liu
 * @date 2022/1/28
 */
public class GeneralOperation {

    private final Operation strategy;

    public GeneralOperation(Operation strategy) {
        this.strategy = strategy;
    }

    public int execute(int num1, int num2) {
        return strategy.doSomething(num1, num2);
    }
}
