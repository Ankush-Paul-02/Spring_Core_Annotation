package org.paul;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * By, component we can specify the class object
 */
@Component
public class Vivo {

    /**
     * Autowired - it will search for the object itself
     */
    @Autowired
//    @Qualifier("mediaTech")
    @Qualifier("snapDragon")
    MobileProcessor processor;

    public MobileProcessor getProcessor() {
        return processor;
    }
    public void setProcessor(MobileProcessor processor) {
        this.processor = processor;
    }
    public void config() {
        System.out.println("Media tech processor, 6 gb Ram, 50MP camera front and back both.");
        processor.process();
    }
}
