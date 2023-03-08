package OOP_Part_2;

public class ServiceStation {

    private void serviceVehicle(TyreVehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
    }
    public void check(Car car) {
        serviceVehicle(car);
        car.checkEngine();
    }
    public void check(Truck truck) {
        serviceVehicle(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }
    public void check(Bicycle bicycle) {
        serviceVehicle(bicycle);
    }
}
