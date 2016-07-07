package test.spring.ioc.circulardependency;

public class Identity {

    private String id;
    private People people;

    public Identity(String id) {
        this.id = id;
    }

    public void show() {
        System.out.println(id + " " + people.getName());
    }

    public String getId() {
        return id;
    }

    public void setPeople(People people) {
        this.people = people;
    }

}
