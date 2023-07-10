class Car {
    //Nitelikler değişkenler ile oluşturulur
    String model;
    String type;
    String color;
    int speed;
    int speedLimit;

    //Constructor Method
    Car(String model, int speed, String color){
       // System.out.println(this.model); => sınıfa ait değeri yazdırır.
       // System.out.println(model); // => Output : Audi
        this.model = model; //JARGON
        this.speed = speed;
        this.color = color;
        this.type = "Sedan";
        this.speedLimit = 180;
        System.out.println("Parametreli yapıcı metodu oluşturuldu");
    }

    //overloading bmw ve mercedesi çalıştırabilmek icin
    Car(){
        System.out.println("Boş yapıcı metodu oluşturuldu");
    }

    //Davranışlar metotla oluşturulur
    // arabanın hızlanması
    void increaseSpeed(int increment){
        if((this.speed+increment) < speedLimit){
            this.speed += increment;
        }
    }
    //arabanın yavaşlaması
    void decreaseSpeed(int decrease){
        if ( this.speed > 0){
            this.speed -= decrease;
        }
    }
    //hız göstergesi
    void printSpeed(){
        System.out.println(this.model + "Hızınız: " + this.speed);
    }

    void printInfo(){
        System.out.println("Model\t:" + this.model);
        System.out.println("Rengi\t:" + this.color);
        System.out.println("Type\t:" + this.type);
        System.out.println("Speed\t:" + this.speed);
    }

}
