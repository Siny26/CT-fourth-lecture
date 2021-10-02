// Создать базовый класс FootWear. На его основе создать подклассы: Shoes, Trainers, Boots, HighShoes, Sandals, Slippers.

    public class FootWear {
        public static void main(String[] args){

        }
        int cost;
        String model;
        String season;
        String color;
        static class Shoes extends FootWear {}
        static class Trainers extends FootWear{}
        static class HighShoes extends FootWear{
            double high;
        }
        static class Sandals extends FootWear {}
        static class Slippers extends FootWear {}
    }

