// Создать базовый класс Horse. На его основе создать подклассы: Zebra, Donkey, Pegasus.
public class Horse {
    public static void main(String[] args){

    }
    int legs;

    public void getLocatione(){
        System.out.println("На лугу " );
    }
    static class Zebra extends Horse{
        String color;
        @Override
     public void getLocatione(){
            System.out.println("Африка" );
        }

    }
    static class Donkey extends Horse{
        String ears;
        @Override
        public void getLocatione(){
            System.out.println(" Северная и Западная Африка " );
        }
    }
    static class Pegasus extends Horse{
        String wings;
        @Override
        public void getLocatione(){
            System.out.println(" Не существуют " );
        }

    }


}
