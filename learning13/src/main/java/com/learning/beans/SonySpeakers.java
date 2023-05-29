package com.learning.beans;

import com.learning.interfaces.Speakers;

public class SonySpeaker implements Speakers {
    @Override
    public String makeSound() {
        return "sound from Sony";
    }
}
