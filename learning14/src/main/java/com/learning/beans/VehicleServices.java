package com.learning.beans;

import com.learning.interfaces.Speakers;
import com.learning.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VehicleServices {

    private final Speakers speakers;
    private final Tyres tyres;

    @Autowired
    public VehicleServices(
            @Qualifier("boseSpeakers") Speakers speakers,
            @Qualifier("michelinTyres") Tyres tyres) {
        this.speakers = speakers;
        this.tyres = tyres;
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }
}
