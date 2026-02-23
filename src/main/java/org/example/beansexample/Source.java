package org.example.beansexample;

import org.example.beansexample.Inject;
import org.example.beansexample.Injectable;

public class Source {
    @Inject
    private Injectable injectable;

    public void call(){
        System.out.println("Source calling call()");
        injectable.doWork();
    }
}
