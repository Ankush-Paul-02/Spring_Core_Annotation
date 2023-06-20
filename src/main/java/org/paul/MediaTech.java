package org.paul;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class MediaTech implements MobileProcessor{

    public void process() {
        System.out.println("This is media tech cpu");
    }
}
