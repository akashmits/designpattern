package com.springboot.interview.basic.utility;

import lombok.Data;

@Data
public class Utility {

    private int t;

    public static void main(String [] arf){
        Utility ut= new Utility();
        System.out.println(ut.getT());
    }
}
