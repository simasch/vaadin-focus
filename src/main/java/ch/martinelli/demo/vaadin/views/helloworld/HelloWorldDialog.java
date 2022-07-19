package ch.martinelli.demo.vaadin.views.helloworld;

import com.vaadin.flow.component.dialog.Dialog;

public class HelloWorldDialog extends Dialog {

    HelloWorldDialog() {
        add(new HelloWorldForm());
    }
}
