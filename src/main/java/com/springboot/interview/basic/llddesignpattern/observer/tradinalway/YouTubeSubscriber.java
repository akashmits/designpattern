package com.springboot.interview.basic.llddesignpattern.observer.tradinalway;

public class YouTubeSubscriber {
    private String name;
    public YouTubeSubscriber(String name){
        this.name=name;
    }

    public void subscribe(YouTubeChannel channel){
        channel.addSubscribers(name);
    }

    public void watchVideo(YouTubeChannel channel){
        System.out.println(name+" watching video "+channel.getVideo());
    }
}
