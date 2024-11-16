package NameId;

class DisplayInfo {
    String name;
    int id;

    public DisplayInfo(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

public class Main {
    public static void main(String[] args) {
        DisplayInfo myInfo = new DisplayInfo("Your Name", 12345);
        myInfo.showInfo();
    }
}

