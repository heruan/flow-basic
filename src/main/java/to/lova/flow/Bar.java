package to.lova.flow;

import com.vaadin.router.Route;
import com.vaadin.router.RouterLayout;
import com.vaadin.ui.html.Div;
import com.vaadin.ui.html.H3;

@Route(value = "foo/bar", layout = Foo.class)
@SuppressWarnings("serial")
public class Bar extends Div implements RouterLayout {

    public Bar() {
        this.add(new H3("You have reached Bar."));
    }

}
