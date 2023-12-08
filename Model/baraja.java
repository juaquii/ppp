package Model;

import java.util.Arrays;

public class baraja {
        private String name;
        private Card[] card;

        public void Card(String name, int num){
            this.name = name;
            if(num<=1){num=40;
            }
            this.card = new Card[num];
        }
        public Card(){
            this("Genérico",2);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Parking{" +
                    "name='" + name + '\'' +
                    ", cars=" + Arrays.toString(cars) +
                    '}';
        }


        public boolean isFull(){
            return howManyCars()==cars.length;
       /* boolean result=true;
        for(int i=0;i<cars.length&&result;i++){
            if(cars[i]==null){
                result=false;
            }
        }
        return result;*/
        }
        public int howManyCars(){
            int result = 0;
            for(Car car:cars){
                if(car!=null){
                    result++;
                }
            }
            return result;
        }
        public int searchCar(String license){
            int pos=-1;
            for(int i=0;i<cars.length&&pos==-1;i++){
                if(cars[i]!=null) {
                    if (cars[i].getLicense().equals(license)) { //==
                        pos = i;
                    }
                }
            }
            return pos;
        }
        public int parkCar(Car car){
            int pos=-1;
            if(!isFull() && searchCar(car.getLicense())==-1){
                for(int i=0;i<cars.length&&pos==-1;i++){
                    if(cars[i]==null) {
                        //hay hueco
                        cars[i]=car;    //aparcar el coche
                        pos=i;
                    }
                }
            }
            return pos;
            /**
             * pos = searFirstSpot();
             * if(pos>-1){
             *  cars[pos]=car;
             * }
             */
        }
        public Car unParkCar(String license){
            Car car=null;
            int pos = searchCar(license);
            if(pos>-1){
                car = cars[pos];
                cars[pos]=null; //dejo mi parking libre
            }
            return car;
        }
        public int searFirstSpot(){
            int pos=-1;
            for(int i=0;i<cars.length&&pos==-1;i++){
                if(cars[i]==null) {
                    pos = i;
                }
            }
            return pos;
        }
        public int moveCar(String license, int pos){
            return -1;
        }
    }
}
