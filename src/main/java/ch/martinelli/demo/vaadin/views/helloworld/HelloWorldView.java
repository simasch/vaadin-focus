package ch.martinelli.demo.vaadin.views.helloworld;

import ch.martinelli.demo.vaadin.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Hello World")
@Route(value = "hello", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class HelloWorldView extends VerticalLayout {

    public HelloWorldView() {
        setMargin(true);

        add(new HelloWorldForm());

        add(new Button("Open Dialog", e -> new HelloWorldDialog().open()));
    }

}
