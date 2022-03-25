class Application {
    fun createCar(string: String): Car {
        return CarFactory().create(string) as Car
    }

    fun createAircraft(string: String): Aircraft {
        return AircraftFactory().create(string) as Aircraft
    }
}