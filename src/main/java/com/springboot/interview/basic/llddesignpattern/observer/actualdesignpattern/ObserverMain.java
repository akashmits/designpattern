package com.springboot.interview.basic.llddesignpattern.observer.actualdesignpattern;

public class ObserverMain {

    public static void main(String[] args) {
        YouTubeChannel youTubeChannel = new YouTubeChannelImpl();

        YouTubeSubscriber allen= new YouTubeSubscriber("allen");
        YouTubeSubscriber bob= new YouTubeSubscriber("bob");


        youTubeChannel.addSubscriber(allen);
        youTubeChannel.addSubscriber(bob);

        youTubeChannel.uploadVideo("Observer patten in action");
    }
}
