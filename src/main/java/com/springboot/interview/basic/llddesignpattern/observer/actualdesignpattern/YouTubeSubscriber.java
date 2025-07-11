package com.springboot.interview.basic.llddesignpattern.observer.actualdesignpattern;

public class YouTubeSubscriber implements Subscriber{
    private String name;

    public YouTubeSubscriber(String name){
        this.name=name;
    }

    @Override
    public void update(String video) {
        System.out.println(name +" wathcing this video :"+video);
    }
}
