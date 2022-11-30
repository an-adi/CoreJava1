// Java Program for Inheritance
class Player {
    void displayInfo() {
        System.out.println("I'm a Player");
    }
}
class CricketPlayer extends Player {
    CricketPlayer() {
        super.displayInfo();
        this.displayInfo();
    }
    void displayInfo() {
        System.out.println("Cricket player\n");
    }
}
class FootballPlayer extends Player {
    FootballPlayer() {
        super.displayInfo();
        this.displayInfo();
    }
    void displayInfo() {
        System.out.println("Football player\n");
    }
}
class HockeyPlayer extends Player {
    HockeyPlayer() {
        super.displayInfo();
        this.displayInfo();
    }
    void displayInfo() {
        System.out.println("Hockey player\n");
    }
}
class Demo {
    public static void main (String args[]){
        Player obj1 = new CricketPlayer(); 
        Player obj2 = new FootballPlayer(); 
        Player obj3 = new HockeyPlayer();
    }
} 