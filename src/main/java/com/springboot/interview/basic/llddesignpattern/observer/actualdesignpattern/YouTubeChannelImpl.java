package com.springboot.interview.basic.llddesignpattern.observer.actualdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannelImpl implements YouTubeChannel{

    List<Subscriber> list = new ArrayList<>();
    private String video;

    @Override
    public void addSubscriber(Subscriber subscriber) {
        list.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        list.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(Subscriber s:list){
            s.update(video);
        }
    }

    public void uploadVideo(String video){
        this.video=video;
        notifySubscribers();
    }
}
