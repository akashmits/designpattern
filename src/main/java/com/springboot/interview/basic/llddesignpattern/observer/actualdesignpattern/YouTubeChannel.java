package com.springboot.interview.basic.llddesignpattern.observer.actualdesignpattern;

public interface YouTubeChannel {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers();
    public void uploadVideo(String video);

}
