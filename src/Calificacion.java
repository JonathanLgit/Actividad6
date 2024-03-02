public class Calificacion {
    private String nombre;
    private int[] arr;

    public Calificacion(String nombre, int[] arr) {
        this.nombre = nombre;
        this.arr = arr;
    }
    public String getNombre() {
        return nombre;
    }

    public int[] getArr() {
        return arr;
    }

    public int calcularPromedio (){
        return (arr[0]+arr[1]+arr[2]+arr[3]+arr[4])/arr.length;
    }

    public char obtenerCalificacion (){
        int promedio = calcularPromedio();
        char calificacion = 'n';

        if (promedio <= 50) {
            calificacion = 'F';
        }
        else if (promedio <= 60) {
            calificacion = 'E';
        }
        else if (promedio <= 70) {
            calificacion = 'D';
        }
        else if (promedio <= 80) {
            calificacion = 'C';
        }
        else if (promedio <= 90) {
            calificacion = 'B';
        }
        else if (promedio <= 100){
            calificacion = 'A';
        }
        return calificacion;
    }

}
