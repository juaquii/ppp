package Controller;

public class Maincontroller {public static void startApp(){
    int option=-1;
    do{
        option= ();
        //MenuPrincipal



    }while(option!=5);


}

    public static void mainController(int option){

        Parking parking = new Parking("IES Francisco de los Ríos",4);
        switch (option){

            case 1: //jugar

                System.out.println("*********");
                System.out.println(parking);
                System.out.println("*********");
                break;

            case 2:
                int nCars = parking.howManyCars();
                if(nCars==0){
                    System.out.println("No hay coches");
                } else if (nCars==1) {
                    System.out.println("Hay un coche");

                }else{
                    System.out.println("Hay"+nCars+" coche"+(nCars>1?"s":""));

                }
                break;

            case 3:
                if(parking.isFull()){
                    System.out.println("Lo siento no hay espacio");

                }else{
                    //pido datos del coche
                    String license = Menu.parkingMenu_Step1();
                    String model = Menu.parkingMenu_Step2();
                    int age = Menu.parkingMenu_Step3();
                    Car carToBeInserted = new Car(license,model,age);
                    int parked = parking.parkCar(carToBeInserted);
                    if(parked==-1){
                        System.out.println("Error al aparcar el coche");
                    }else{
                        System.out.println("Hemos aparcado su coche en la plaza "+parked);
                    }

                }


                break;
            case 4:
                String license = Menu.unparkingMenu();
                Car carToBeUnParked = parking.unParkCar(license);

                if(carToBeUnParked==null){
                    System.out.println("Error al sacar el coche");

                }else{

                    System.out.println("El coche que sacamos es "+ carToBeUnParked);
                }
                break;
            case 5:

                break;
}
