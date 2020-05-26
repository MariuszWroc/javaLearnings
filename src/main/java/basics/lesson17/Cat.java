package basics.lesson17;

public class Cat {
    private String name;
    private String race;
    private double age;
    private double value;
    private char sex;

    public Cat(String name, String race, int age, double value, char sex) {
	this.name = name;
	this.race = race;
	this.age = age;
	this.value = value;
	this.sex = sex;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getRace() {
	return race;
    }

    public void setRace(String race) {
	this.race = race;
    }

    public double getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public double getValue() {
	return value;
    }

    public void setValue(double value) {
	this.value = value;
    }

    public char getSex() {
	return sex;
    }

    public void setSex(char sex) {
	this.sex = sex;
    }

}
