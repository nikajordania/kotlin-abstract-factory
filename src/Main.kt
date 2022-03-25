fun main() {
    val app = Application()

    val audi = app.createCar("Audi")
    val maserati = app.createCar("Maserati")

    val aircraft1 = app.createAircraft("Boeing737")
    val aircraft2 = app.createAircraft("Boeing777")

    audi.drive()
    maserati.drive()

    aircraft1.fly()
    aircraft2.fly()

}