//Autor: Johan felipe vargas macias


package operadores;

public class PrecedenciaOperadores {

    public static void main(String[] args) {
        System.out.println("===Operaciones===");
        int Resultado =((3+5) * 2) -4;
        
        System.out.println("El resultado es : " + Resultado);
        
        
        double Nota1 = 5;
        double Nota2 = 8;
        double Nota3 = 4;
        double promedio = 0;
        
        promedio =(Nota1 + Nota2 + Nota3)/3;
        
        System.out.println("El promedio del estudiante Es:" + promedio);
        
        //Una Institucion Educativa cuenta  con un numero determinado de estudiante
        //Teniendo en cuenta el total de estudiantes se estregaran a cada uno,
        //¿Cuantas boletas  es necesario imprimir? hacer la operacion en una linea
        
        int Sede1 = 85;
        int Sede2 = 64;
        int Sede3 = 97;
        int total = 0;
        int Suma = 0;
        
        Suma = Sede1 + Sede2 + Sede3;
        total = (Sede1  * 3) +(Sede2 * 3) +(Sede3 * 3);
        
        System.out.println("La cantidad de boletas que se necesitara imprimir para los" + Suma + "estudiante de las 3 sedes, sera: " + total );
        
        
        
                
    }
}
