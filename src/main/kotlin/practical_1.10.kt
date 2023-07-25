class Car(type:String, model:Int, price: Double, owner:String, milesDrive: Double){
    var carType=type;
    val carModel=model;
    val carPrice=price;
    var carOwner=owner;
    val carMilesDrive=milesDrive;
    init{
        println("Object of class is created and Init is called.");
    }
    fun getCarInformation(){
        println("Car Information : ${carType} , ${carModel}");
        println("Car Owner : ${carOwner}");
        println("Miles Drive : ${carMilesDrive}");
    }

    fun getOriginalCarPrice():Double{
        return carPrice;
    }

    fun getCurrentCarPrice():Double{
        return carPrice-(carPrice*0.1);
    }
    fun displayCarInfo(){
        println("------------------------");
        getCarInformation();
        println("Original Car Price : ${getOriginalCarPrice()}");
        println("Current Car Price : ${getCurrentCarPrice()}");
        println("------------------------");
    }
}

fun main()
{
    println("Creating Car class Object car1 in next line.");
    var c1=Car("BMW",2018,500000.0,"Parth Chauhan",36420.0);
    c1.displayCarInfo();
    println("Creating Car class Object car2 in next line.");
    var c2=Car("Suzuki",2010,200000.0,"Het Chauhan",100080.0);
    c2.displayCarInfo();

    println("************ ArrayList of Car *************")
    var l= ArrayList<Car>();
    l.add(Car("Audi",2015,3000000.0,"Dinesh Chauhan",5069.10))

    l.add(Car("Hyundai",2023,600000.0,"Malti Chauhan",1005.23))
    for(i in l){
        i.displayCarInfo();
    }
}
