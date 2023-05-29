package com.learning.beans;

import com.learning.interfaces.Speakers;

public class BoseSpeakers implements Speakers {
    @Override
    public void makeSound() {
        System.out.println("sound from Bose");
    }
}
