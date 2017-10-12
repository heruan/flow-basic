package to.lova.flow;

import com.vaadin.router.Route;
import com.vaadin.router.RouterLayout;
import com.vaadin.router.RouterLink;
import com.vaadin.ui.html.Div;
import com.vaadin.ui.html.H1;

@Route("")
@SuppressWarnings("serial")
public class AppShell extends Div implements RouterLayout {

    public AppShell() {
        this.add(new H1("Main navigation"));
        this.add(new RouterLink("Foo", Foo.class));
    }

}
