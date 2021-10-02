// Создать базовый класс Building. На его основе создать подклассы: House, School, Library, Supermarket.

public class Building {
    public static void main(String[] args){

    }

   int number_of_floors;

    static class House extends Building{
        int number_of_rooms;
    }
    static class School extends Building{
        int number_of_classes;
    }
    static class Library extends Building{
        boolean isOpen;
    }
    static class Supermarket extends Building{
        int number_of_entrances;
    }
}
