package com.learning.beans;

import com.learning.interfaces.Speakers;

public class SonySpeakers implements Speakers {
    @Override
    public void makeSound() {
        System.out.println("sound from Sony");
    }
}
