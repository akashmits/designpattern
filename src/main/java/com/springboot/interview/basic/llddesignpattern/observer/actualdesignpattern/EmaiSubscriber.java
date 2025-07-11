package com.springboot.interview.basic.llddesignpattern.observer.actualdesignpattern;

public class EmaiSubscriber implements Subscriber{
    private String email;

    public EmaiSubscriber(String email){
        this.email=email;
    }


    @Override
    public void update(String video) {
        System.out.println(email+"Sending for video :"+video);
    }
}
