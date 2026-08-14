package Challenges;

class Dice {

    int roll(){
        double random = Math.random()*6;
        return (int)Math.ceil(random);
    }
    static void main(String[] args) {
        Dice dice = new Dice();
        for (int i = 0; i <100 ; i++) {
            System.out.println(dice.roll());
        }


    }


}
