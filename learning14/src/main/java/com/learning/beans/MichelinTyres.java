package com.learning.beans;

import com.learning.interfaces.Tyres;

public class MichelinTyres implements Tyres {
    @Override
    public void makeMove() {
        System.out.println("make move from Michelin.");
    }
}
