
    class Animal {
        public void sleep() {
            System.out.println("Zwierzę śpi...");
        }

        public void makeNoise() {
            System.out.println("Zwierzę wydaje dźwięk..");
        }

        public void roam() {
            System.out.println("Zwierzę wędruje...");
        }
    }


    class Lion extends Animal {
        @Override
        public void makeNoise() {
            System.out.println("Lew ryczy!");
        }
    }

    class Cat extends Animal {
        @Override
        public void makeNoise() {
            System.out.println("Kot miauczy!");
        }
    }

    class Wolf extends Animal {
        @Override
        public void makeNoise() {
            System.out.println("Wilk wyje!");
        }
    }

    class Dog extends Animal {
        @Override
        public void makeNoise() {
            System.out.println("Pies szczeka!");
        }
    }
