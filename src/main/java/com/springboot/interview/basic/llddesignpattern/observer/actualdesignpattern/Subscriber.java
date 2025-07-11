package com.springboot.interview.basic.llddesignpattern.observer.actualdesignpattern;

/*
1. The Observer Interface 📝
In the Observer Design Pattern, the Observer is the one that reacts to the changes (like a subscriber reacting to a new video).
To make this pattern work, we create an interface called Subscriber.
The job of this interface is to define what methods a subscriber (observer) should have.
In our case, the update() method is the one we use to notify a subscriber when something happens (like a new video).
 */
public interface Subscriber {
    void update(String video);
}
