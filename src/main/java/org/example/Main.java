package org.example;
import java.util.ArrayList;

public class Main {

    static ArrayList<Car> carList = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.fillArray();

        main.recursionLoop(carList.size());
    }


    public void fillArray() {
        carList.add(new Car("Honda", "Civic", 5500));
        carList.add(new Car("Porsche", "911", 59000));
        carList.add(new Car("Skoda", "Favorit", 440000));
        carList.add(new Car("VW", "Golf", 120000));
        carList.add(new Car("Renault", "Clio", 99000));
    }


    public void recursionLoop (int counter){

        if (counter == 0) return;

        if(carList.get(counter).getMilage() > 100000){
            System.out.println(carList.get(counter).toString());
        }
        counter--;
        recursionLoop(counter);

    }
}

