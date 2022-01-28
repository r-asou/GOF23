package strategy.service.impl;

import strategy.service.Operation;

/**
 * @author JC Liu
 * @date 2022/1/28
 */
public class SubtractOperation implements Operation {

    @Override
    public int doSomething(int num1, int num2) {
        return num1 - num2;
    }
}
