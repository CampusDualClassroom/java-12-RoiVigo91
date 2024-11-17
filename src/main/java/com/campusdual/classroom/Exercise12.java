package com.campusdual.classroom;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercise12 {
    public static void main(String[] args) {
        Car myCar = new Car("Citroen", "C3", "Diesel");


        // 1. Encender el coche
        myCar.start();
        assertTrue(myCar.isStarted);
        myCar.start(); // Intentar encenderlo nuevamente

        // 2. Apagar el coche
        myCar.stop();
        myCar.accelerate(); // Acelerar
        myCar.stop(); // Intentar apagar mientras está en movimiento

        // 3. Acelerar el coche
        myCar.accelerate(); // Alcanzar el límite de velocidad

        // 4. Frenar el coche
        myCar.brake(); // Frenar más allá de 0

        // 5. Girar el volante 20 grados
        myCar.turnAngleOfWheels(20);

        // 6 .Girar el volante más de 45 grados ó -45 grados (y comprobar que no se puede)
        myCar.turnAngleOfWheels(30);

        // 7. Poner marcha atrás
        myCar.brake(); // Asegurarse de estar detenido
        myCar.setReverse(true);

        // 8. Intentar marcha atrás en movimiento
        myCar.accelerate();
        myCar.setReverse(true);

        // 9. Mostrar detalles finales del coche
        myCar.showDetails();
    }
}
