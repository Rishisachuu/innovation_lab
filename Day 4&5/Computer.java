public class Computer {

    class Processor {
        private String brand;
        private int speed;

        public Processor(String brand, int speed) {
            this.brand = brand;
            this.speed = speed;
        }

        public void showDetails() {
            System.out.println("Processor Brand: " + brand);
            System.out.println("Processor Speed: " + speed + " GHz");
        }
    }

    public void showComputerDetails() {
        class GraphicsCard {
            private String model;
            private int memory;

            public GraphicsCard(String model, int memory) {
                this.model = model;
                this.memory = memory;
            }

            public void showDetails() {
                System.out.println("Graphics Card Model: " + model);
                System.out.println("Graphics Card Memory: " + memory + " GB");
            }
        }

        GraphicsCard graphicsCard = new GraphicsCard("NVIDIA RTX 3080", 10);
        graphicsCard.showDetails();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();

        Computer.Processor processor = computer.new Processor("Intel", 3);
        processor.showDetails();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous inner class is running!");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        computer.showComputerDetails();
    }
}
