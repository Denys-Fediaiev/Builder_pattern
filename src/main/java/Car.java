public class Car {
    int capacity;
    String model;
    int maxSpeed;
    double price;

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    // other setters,getters...

    public static class Builder{
        private Car newCar;
        public Builder(){
            newCar = new Car();
        }
        public Builder itsCapacity(int capacity){
            newCar.capacity = capacity;
            return this;
        }
        public Builder itsModel(String model){
            newCar.model = model;
            return this;
        }
        public Builder itsMaxSpeed(int maxSpeed){
            newCar.maxSpeed = maxSpeed;
            return this;
        }
        public Builder itsPrice(double price){
            newCar.price = price;
            return this;
        }
        public Car build(){
            return newCar;
        }
    }
}
