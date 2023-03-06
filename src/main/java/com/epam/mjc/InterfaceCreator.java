package com.epam.mjc;

import java.util.LinkedList;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
return input ->{
    LinkedList<Integer> out = new LinkedList<>();
    for (int tmp : input) {
        out.add(tmp/divider);
    }
    return out;
};
    }
}
