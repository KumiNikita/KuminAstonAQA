public class ANimals {

    abstract class Animal {
        protected String name;
        protected int runLimit;
        protected int swimLimit;

        public Animal(String name, int runLimit, int swimLimit) {
            this.name = name;
            this.runLimit = runLimit;
            this.swimLimit = swimLimit;
        }

        public void run(int distance) {
            if (distance <= runLimit) {
                System.out.println(name + " пробежал " + distance + " м.");
            } else {
                System.out.println(name + " не может пробежать " + distance + " м., так как его лимит составляет " + runLimit + " м.");
            }
        }

        public void swim(int distance) {
            if (swimLimit == 0) {
                System.out.println(name + " не умеет плавать.");
            } else if (distance <= swimLimit) {
                System.out.println(name + " проплыл " + distance + " м.");
            } else {
                System.out.println(name + " не может проплыть " + distance + " м., так как его лимит составляет " + swimLimit + " м.");
            }
        }
    }

    class Dog extends Animal {
        private static int count = 0;

        public Dog(String name) {
            super(name, 500, 10);
            count++;
        }

        public static int getCount() {
            return count;
        }
    }

    class Cat extends Animal {
        private static int count = 0;
        private boolean satiety;

        public Cat(String name) {
            super(name, 200, 0);
            this.satiety = false;
            count++;
        }

        public void eat(int amount) {
            if (amount <= 0) {
                System.out.println("Неверное количество еды.");
            } else {
                System.out.println(name + " пытается поесть " + amount + " еды.");
                if (amount <= amountInBowl) {
                    amountInBowl -= amount;
                    satiety = true;
                    System.out.println(name + " наелся.");
                } else {
                    System.out.println("В миске недостаточно еды для " + name + ".");
                }
            }
        }

        public boolean isSatiety() {
            return satiety;
        }

        private static int amountInBowl = 30;

        public static void addFood(int amount) {
            amountInBowl += amount;
            System.out.println("Добавлено " + amount + " еды в миску.");
        }

        public static int getCount() {
            return count;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            ANimals animals = new ANimals();

            Cat[] cats = {
                    animals.new Cat("Мурзик"),
                    animals.new Cat("Барсик"),
                    animals.new Cat("Васька")
            };

            System.out.println("Всего создано котов: " + Cat.getCount());

            Cat.addFood(20);

            for (Cat cat : cats) {
                cat.eat(10); // Пытаемся покушать 10 еды каждому коту
            }

            System.out.println("\nИнформация о сытости котов:");
            for (Cat cat : cats) {
                System.out.println(cat.name + " сытость: " + cat.isSatiety());
            }
        }
    }
}


