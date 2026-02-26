package org.example.d_beanslifecycle;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class AnotherSimpleBean implements InitializingBean, DisposableBean {

    public AnotherSimpleBean() {
        System.out.println("AnotherSimpleBean is created");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Simple bean calling beforeDestroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SimpleBean calling afterInit");
    }
}
