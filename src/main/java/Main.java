public class Main {
    public static void main(String[] args) {
        Car porsche = new Car.Builder()
                .itsModel("911 Turbo S")
                .itsMaxSpeed(330)
                .itsCapacity(2641)
                .itsPrice(247222)
                .build();
        System.out.println("your Car: \n" + "it's price is " + porsche.price + "\n it's model is " + porsche.model + "\n it's Max speed is " + porsche.maxSpeed + "\n it's Capacity is " + porsche.capacity);


    }
}