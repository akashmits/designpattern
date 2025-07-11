package com.springboot.interview.basic.llddesignpattern.observer.tradinalway;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class YouTubeChannel {

    private List<String> subscribers = new ArrayList<>();
    private String video;

    public void addSubscribers(String s){
        subscribers.add(s);
    }

    public void addVideo(String s){
        this.video=s;
        notifySubscribers();
    }

    public void notifySubscribers(){
        for(String s:subscribers){
            System.out.println("Notify Subscribers:"+s+" | For video |"+video);
        }
    }
}
