package Exercise12;

public class Student {
    private String name;
    private String email;
    private int room;

    public Student(){}

    public Student(String name, String email, int room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getRoom() {
        return room;
    }
}

