/* Создать базовый класс Animal с полями: private boolean vegetarian; private String eats; private int noOfLegs;. На его основе создать подкласс Cat
с полями суперкласса и private String color.
 */
// Базовый класс Animal
public class Animals {

    public static void main(String[] args){

    }

private boolean vegetarian;

	private String eats;

	private int noOfLegs;

	public Animals(boolean veg, String food, int legs){
		this.vegetarian = veg;
		this.eats = food;
		this.noOfLegs = legs;
	}

    public boolean getVegetarian() {
        return vegetarian;
    }
    public String getEats() {
        return eats;
    }
    public int getNoOfLegs() {
        return noOfLegs;
    }
    // Подкласс Cat
    static class Cat extends Animals{
        private String color;
        public Cat(boolean veg, String food, int legs,String c) {
            super(veg, food, legs);
            this.color = c;
        }
            public String getColor() {
                return color;
            }
    }

}


