// WebPage interface
public interface WebPage {
    String render();
}

// BasicWebPage (Concrete Component)
public class BasicWebPage implements WebPage {
    @Override
    public String render() {
        return "Basic Web Page";
    }
}

// Decorator (Abstract)
public abstract class WebPageDecorator implements WebPage {
    protected WebPage decoratedPage;

    public WebPageDecorator(WebPage page) {
        this.decoratedPage = page;
    }

    @Override
    public String render() {
        return decoratedPage.render();
    }
}

// AuthenticatedWebPage (Concrete Decorator)
public class AuthenticatedWebPage extends WebPageDecorator {

    public AuthenticatedWebPage(WebPage page) {
        super(page);
    }

    @Override
    public String render() {
        return super.render() + " with Authentication";
    }
}

// AuthorizedWebPage (Concrete Decorator)
public class AuthorizedWebPage extends WebPageDecorator {

    public AuthorizedWebPage(WebPage page) {
        super(page);
    }

    @Override
    public String render() {
        return super.render() + " with Authorization";
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        WebPage basicPage = new BasicWebPage();

        WebPage authenticatedPage = new AuthenticatedWebPage(basicPage);

        WebPage authorizedPage = new AuthorizedWebPage(authenticatedPage);

        System.out.println(authorizedPage.render());
    }
}
