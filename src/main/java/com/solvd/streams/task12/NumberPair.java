package com.solvd.streams.task12;

public class NumberPair {
     public int value_1;
     public int value_2;

    public NumberPair(int value_1, int value_2) {
        this.value_1 = value_1;
        this.value_2 = value_2;
    }

    @Override
    public  String toString() {
        return "NumberPair("+ value_1 + ", "+ value_2 + ")";
    }
}
