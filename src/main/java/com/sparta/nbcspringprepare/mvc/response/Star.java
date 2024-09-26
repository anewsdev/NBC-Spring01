package com.sparta.nbcspringprepare.mvc.response;

import lombok.Getter;

@Getter
public class Star {
    String name;
    int age;

    public Star(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Star() {}
}
