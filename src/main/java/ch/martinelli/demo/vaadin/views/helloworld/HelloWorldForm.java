package ch.martinelli.demo.vaadin.views.helloworld;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.textfield.TextField;

public class HelloWorldForm extends FormLayout {

    HelloWorldForm() {
        TextField name = new TextField("Your name");
        name.setValue("This is my name");
        name.setAutoselect(true);
        name.setAutofocus(true);
        add(name);

        Button sayHello = new Button("Say hello");
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
        });
        sayHello.addClickShortcut(Key.ENTER);
        add(sayHello);
    }
}
