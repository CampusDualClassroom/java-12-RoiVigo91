package com.campusdual.classroom;

public class Car {
    public static final int MAX_SPEED = 120;


    public String brand;
    public String model;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;
    public boolean isStarted = false;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }
    public Car() {

    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            this.isStarted = true;
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("El vehículo ya está encendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            if (this.isStarted) {
                this.tachometer = 0;
                this.isStarted = false;
                System.out.println("Vehículo apagado");
            } else {
                System.out.println("El vehículo ya está apagado");
            }
        } else {
            System.out.println("No se puede apagar el vehículo mientras está en movimiento");
        }
    }


    public void accelerate() {
        if (this.speedometer < Car.MAX_SPEED) {
            this.speedometer += 5;
            if (this.speedometer > Car.MAX_SPEED) this.speedometer = Car.MAX_SPEED;
            System.out.println("La nueva velocidad es: " + this.speedometer);
        } else {
            System.out.println("La velocidad máxima ha sido alcanzada");
        }
    }

    public void brake() {
        if (this.speedometer > 0) {
            this.speedometer -= 5;
            if (this.speedometer < 0) this.speedometer = 0;
            System.out.println("La nueva velocidad es: " + this.speedometer);
        } else {
            System.out.println("El vehículo ya está detenido");
        }
    }

    public void turnAngleOfWheels(int angle) {
        int newAngle = this.wheelsAngle + angle;

        if (newAngle > 45) {
            this.wheelsAngle = 45;
            System.out.println("No se puede girar más allá de 45 grados.");
        } else if (newAngle < -45) {
            this.wheelsAngle = -45;
            System.out.println("No se puede girar más allá de -45 grados.");
        } else {
            this.wheelsAngle = newAngle;
            System.out.println("El ángulo de las ruedas es ahora: " + this.wheelsAngle);
        }
    }


    public void setReverse(boolean reverse) {
        if (this.speedometer == 0 && this.tachometer > 0) {
            if (this.reverse != reverse) {
                this.reverse = reverse;
                this.gear = reverse ? "R" : "N";
                System.out.println("La marcha actual es: " + this.gear);
            } else {
                System.out.println("El vehículo ya tiene esa marcha.");
            }
        } else if (this.speedometer > 0) {
            System.out.println("No se puede cambiar a marcha atrás mientras el vehículo está en movimiento.");
        }
    }

    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    public void showDetails() {
        StringBuilder builder = new StringBuilder();
        builder.append("El coche marca ").append(this.brand)
                .append(" modelo ").append(this.model)
                .append(" tiene una velocidad de ").append(this.speedometer)
                .append(". \nEl tacógrafo marca ").append(this.tachometer)
                .append(" y el sentido de la marcha es ").append(this.gear)
                .append(". El ángulo de giro es ").append(this.wheelsAngle);

        System.out.println(builder.toString());
    }
}
