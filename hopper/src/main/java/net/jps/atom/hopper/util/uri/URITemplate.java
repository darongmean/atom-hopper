package net.jps.atom.hopper.util.uri;

public class URITemplate {
    private final String uriTemplate;

    public URITemplate(String uriTemplate) {
        this.uriTemplate = uriTemplate;
    }

    @Override
    public String toString() {
        return uriTemplate;
    }
}