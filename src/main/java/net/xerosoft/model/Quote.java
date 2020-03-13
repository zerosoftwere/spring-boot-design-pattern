package net.xerosoft.model;

public class Quote {
    public Long id;
    public String name;
    public String quote;

    public Quote(String name, String quote) {
        this.name = name;
        this.quote = quote;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[id=" + id + ",name=" + name + ",quote=" + quote + "]";
    }
}
