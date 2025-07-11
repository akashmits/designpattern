package com.springboot.interview.basic.llddesignpattern.observer.actualdesignpattern;

public class PushSubscriber implements Subscriber{
    String device;

    public PushSubscriber(String device){
        this.device=device;
    }


    @Override
    public void update(String video) {
        System.out.println("sending push notificaiton for device"+device+" video id:"+video);
    }
}
