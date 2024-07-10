package UE04_Queue;

public class Person {
    // *** Membervariablen ***
    private int id;
    private String FName;
    private String LName;

    // *** Konstruktor ***
    public Person(int id, String FName, String LName) {
        this.id = id;
        this.FName = FName;
        this.LName = LName;
    }

    // *** Getter- und Setter-Methoden ***
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }
}
