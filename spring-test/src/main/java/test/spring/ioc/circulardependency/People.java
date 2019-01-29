package test.spring.ioc.circulardependency;

public class People {

    private String name;
    private Identity identity;

    public People(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + " " + identity.getId());
    }

    public String getName() {
        return name;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

}
