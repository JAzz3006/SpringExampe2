package org.example.beansexample;

public class App {
    public static void main( String[] args ){
        BeanFactory factory = new BeanFactory();
        factory.register(Injectable.class);
        factory.register(Source.class);

        Source source = factory.getBean(Source.class);
        source.call();
    }
}
