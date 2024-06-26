package UE10_HashtableDemo;

public class CitizenHash {
    public String[] citizens;
    public int size;

    public CitizenHash(int size) {
        this.citizens = new String[size];
        this.size = size;
    }

    public void add(int socialSecurityNumber, String name) {
        //Position calculation
        int pos = socialSecurityNumber % size;
        //Save in the array
        citizens[pos] = name;
    }

    public String search(int socialSecurityNumber) {
        //Position calculation
        int pos = socialSecurityNumber % size;
        //Return this value
        return citizens[pos];
    }

    public void printAll(String[] citizens) {
        for (String citizen: citizens) {
            if (citizen != null) {
                System.out.println(citizen);
            }
        }
    }

}
