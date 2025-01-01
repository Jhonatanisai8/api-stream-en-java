package MetodoReduce;

import java.util.List;
import java.util.Optional;

public class EjemploReduceConObjetos {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = List.of(
                new Estudiante("daniel", 12),
                new Estudiante("juancito", 23),
                new Estudiante("flor", 23),
                new Estudiante("walter", 34));
        System.out.println("lista de estudiantes.");
        System.out.println(estudiantes);


        Integer sumaEdades = estudiantes.stream()
                .reduce(0, (acumulador, estudiante2) -> acumulador + estudiante2.getEdad(),
                        (parcial, parcial02) -> parcial + parcial02);
        System.out.println("suma Edades = " + sumaEdades);
    }
}
