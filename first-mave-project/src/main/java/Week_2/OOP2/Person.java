package Week_2.OOP2;

public class Person {
    private String name;
    private int age;
    private String favoriteColor;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >=0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative!");
        }
    }
    public String getFavoriteColor() {
        return favoriteColor;
    }
    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }
}
