public class Main {
    public static void main(String[] args) {
        Calificacion alumno1 = new Calificacion("Jonathan",new int[]{90,50,70,80,75});


        System.out.println("Nombre del estudiante: " + alumno1.getNombre());

        int[] calificaciones1 = alumno1.getArr();
        for (int i = 0; i < calificaciones1.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones1[i]);
        }

        System.out.println("Promedio: " + alumno1.calcularPromedio());
        System.out.println("Calificacion: " + alumno1.obtenerCalificacion());
    }
}