package src;

public class Park {
    public class Attraction {
        private String name;
        private String Workime;
        private double cost;

        public Attraction(String name, String Workime, double cost) {
            this.name = name;
            this.Workime = Workime;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время работы: " + Workime);
            System.out.println("Стоимость: " + cost);
        }

        public static void main(String[] args) {
            Park park = new Park();
            Attraction ferrisWheel = park.new Attraction("Колесо обозрения", "10:00 - 22:00", 300.0);
            Attraction rollerCoaster = park.new Attraction("Американские горки", "11:00 - 20:00", 500.0);
            ferrisWheel.printInfo();
            rollerCoaster.printInfo();

        }
    }
}
