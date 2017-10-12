package to.lova.flow;

import com.vaadin.router.Route;
import com.vaadin.router.RouterLayout;
import com.vaadin.router.RouterLink;
import com.vaadin.ui.html.Div;
import com.vaadin.ui.html.H2;

@Route(value = "foo", layout = AppShell.class)
@SuppressWarnings("serial")
public class Foo extends Div implements RouterLayout {

    public Foo() {
        this.add(new H2("Foo navigation"));
        this.add(new RouterLink("Bar", Bar.class));
    }

}
