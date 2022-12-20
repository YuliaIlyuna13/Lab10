abstract class Animal {

        // Инициализируем переменные
        private final int runMaxDistance; // Дистанция бега
        private final int swimMaxDistance; // Дистанция плавания
        private final float jumpMaxDistance; // Дистанция прыжка

        // конструктор
        public Animal(int runMaxDistance, int swimMaxDistance, float jumpMaxDistance) {
                this.runMaxDistance = runMaxDistance;
                this.swimMaxDistance = swimMaxDistance;
                this.jumpMaxDistance = jumpMaxDistance;
        }

        public void run(int runDistance) { // Бегать
                System.out.println("run: " + (runDistance <= runMaxDistance));
        }
        public void swim(int swimDistance) { // Плыть
                System.out.println("swim: " + (swimDistance <= swimMaxDistance));
        }
        public void jump(float jumpHeight) { // Прыгать
                System.out.println("jump: " + (jumpHeight <= jumpMaxDistance));
        }

}