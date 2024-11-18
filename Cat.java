
package Super_Keyword;

public class Cat extends Animal2 {
    String color;
    String sound;

    public Cat() {
        this.color = "Brown";
        this.sound = "Meow";
    }
    void printColor()
            {
                System.out.println(color); //prints color of Cat class 
                System.out.println(sound); //prints sound of Cat class 
                System.out.println(super.color); //prints color of Animal class 
            }
}

/* In the above example, Animal and Cat both classes have a common property color. If we print color property, it will print the color of current class by default. To access the parent property, we need to use super keyword.*/
