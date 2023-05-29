package com.learning.beans;

import com.learning.interfaces.Tyres;

public class BridgeStoneTyres implements Tyres {
    @Override
    public void makeMove() {
        System.out.println("make move from Bridge Stone");
    }
}
