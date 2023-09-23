/*
 * Chimaltenango 12 agosto de 2023.
 * Programador: Ricardo José Sis Cabrera
 * Descripción del programa: CRUD de administración de productos con ficheros + función extra
 */
package I_PARCIAL;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException; //PERMITE PODER DETECTAR ERRORES
import java.io.PrintWriter; //PERMITE INGRESAR DATOS A UN ARCHIVO
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;   //PERMITE LA CAPTURA DE DATOS
public class PrimerParcial {
  static Scanner teclado = new Scanner(System.in);
  //MÉTODOS
  public void registrar(){
    //ATRIBUTOS
    String registro;
    String codigoProducto;
    String nombreProducto;
    int cantidadExistente;
    float precioUnitario;
  
    //INGRESO DE DATOS
    System.out.print("Ingrese código del producto: ");
    codigoProducto = teclado.nextLine();
    while(codigoProducto.contains("_")){ //VALIIDACIÓN (EL CODIGP DEL PRODUCTO NO PUEDE INCLUIR "_")
        System.out.print("ERROR! Código no válido, Ingrese otro código: ");
        codigoProducto = teclado.nextLine();
    }
    System.out.print("Ingrese nombre del producto: ");
    nombreProducto = teclado.nextLine();
    while(nombreProducto.contains("_")){ //VALIIDACIÓN (EL NOMBRE DEL PRODUCTO NO PUEDE INCLUIR "_")
        System.out.print("ERROR! Nombre no válido, Ingrese otro nombre: ");
        nombreProducto = teclado.nextLine();
    }
    System.out.print("Ingrese cantidad del producto: ");
    cantidadExistente = Integer.parseInt(teclado.nextLine());
    while(cantidadExistente<0){ //VALIIDACIÓN (LA CANTIDAD EXISTENTE NO PUEDE SER NEGATIVA)
        System.out.print("ERROR! Cantidad no válida, Ingrese otra cantidad: ");
        cantidadExistente = Integer.parseInt(teclado.nextLine());
    }
    System.out.print("Ingrese precio del producto: ");
    precioUnitario = Float.parseFloat(teclado.nextLine());
    while(precioUnitario<0){ //VALIIDACIÓN (EL PRECIO UNITARIO NO PUEDE SER NEGATIVO)
        System.out.print("ERROR! Precio no válido, Ingrese otro precio: ");
        precioUnitario = Float.parseFloat(teclado.nextLine());
    }
    registro = codigoProducto + "_" + nombreProducto + "_" + cantidadExistente + "_" + precioUnitario; //CONCATENA LOS DATOS Y LOS TRANSFORMA EN UN SOLO REGISTRO
    try(FileWriter fw = new FileWriter("c:/Users/ricar/Desktop/registros/datos.txt", true); PrintWriter salida = new PrintWriter(fw)){
        salida.println(registro);
        System.out.println("--------------------------------------");
        System.out.println("PRODUCTO INGRESADO EXISTOSAMENTE!");
    }catch(IOException ex){
        System.out.println("--------------------------------------");
        System.out.println(ex.getMessage());
    }
  }
  
  public void mostrar(){
      String linea;
      float granTotal = 0, total = 0;
      boolean vacio = true;
      try (BufferedReader br = new BufferedReader(new FileReader("c:/Users/ricar/Desktop/registros/datos.txt"))) {
            while ((linea = br.readLine()) != null) {
                vacio = false;
                // DIVIDE EL REGISTRO EN SUS COMPONENTES TOMANDO COMO SEPARACIÓN EL SIMBOLO "_"
                String[] componente = linea.split("_");
                if (componente.length >= 4){ //VERIFICA SI HAY 4 COMPONENTES (Código, Nombre, Cantidad y Precio)
                    // MUESTRA LOS DATOS
                    System.out.println("Código: " + componente[0]);
                    System.out.println("Nombre: " + componente[1]);
                    System.out.println("Cantidad: " + componente[2]);
                    System.out.println("Precio Unitario: Q" + componente[3]);
                    total =  Float.parseFloat(componente[2]) * Float.parseFloat(componente[3]);
                    System.out.println("Total: Q" + total);
                    granTotal = granTotal + total;
                    System.out.println("--------------------------------------");
                } else {
                    System.out.println("Registro incompleto: " + linea);
                }
            }
            if(vacio){
                System.out.println("El documento está vacío, no hay datos");
            }else{
                System.out.println("GRAN TOTAL: Q" + granTotal);
            }
        } catch (IOException e) {
            System.out.println("Error de lectura del archivo: " + e.getMessage());
        }
  }
  
  public void ingresar(){
      String cod, nuevoRegistro;
      int cantidad;
      float total;
      boolean vacio = true, productoInexistente = true;
      System.out.println("Ingrese el código del producto: ");
      cod = teclado.nextLine();
      try {
            // Crear objetos para leer y escribir en archivos
            BufferedReader reader = new BufferedReader(new FileReader("c:/Users/ricar/Desktop/registros/datos.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("c:/Users/ricar/Desktop/registros/datos_temp.txt"));
            String linea;
            while ((linea = reader.readLine()) != null) {
                vacio = false;
                // Dividir la línea en partes usando el "_" como separador
                String[] componente = linea.split("_");
                if (componente.length >= 4) {
                    // Verificar si el registro coincide con el que se va a modificar
                    if (cod.equals(componente[0])) {
                        productoInexistente = false;
                        // MUESTRA LOS DATOS
                        System.out.println("Código: " + componente[0]);
                        System.out.println("Nombre: " + componente[1]);
                        System.out.println("Cantidad: " + componente[2]);
                        System.out.println("Precio Unitario: Q" + componente[3]);
                        total =  Float.parseFloat(componente[2]) * Float.parseFloat(componente[3]);
                        System.out.println("Total: Q" + total);
                        System.out.println("--------------------------------------");
                        // ESCRIBE EL REGISTRO MODIFICADO
                        System.out.println("Escribe la cantidad a ingresar: ");
                        cantidad = Integer.parseInt(componente[2]) + Integer.parseInt(teclado.nextLine());
                        while(cantidad<Integer.parseInt(componente[2])){
                            System.out.print("ERROR! Cantidad no válida, Ingrese otra cantidad: ");
                            cantidad = Integer.parseInt(componente[2]) + Integer.parseInt(teclado.nextLine());
                        }
                        LocalDateTime fechaHoraActual = LocalDateTime.now();
                        String fechaHoraTexto = fechaHoraActual.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                        nuevoRegistro = componente[0] +"_"+ componente[1] +"_"+ cantidad +"_"+ componente[3] +"_"+ "Ingreso: " + fechaHoraTexto;
                        writer.write(nuevoRegistro);
                        // MUESTRA LOS DATOS MODIFICADOS
                        System.out.println("--------------------------------------");
                        System.out.println("Código: " + componente[0]);
                        System.out.println("Nombre: " + componente[1]);
                        System.out.println("Cantidad: " + cantidad);
                        System.out.println("Precio Unitario: Q" + componente[3]);
                        total =  cantidad * Float.parseFloat(componente[3]);
                        System.out.println("Total: Q" + total);
                        System.out.println("--------------------------------------");
                    } else {
                        // CONSERVA EL REGISTRO ORIGINAL
                        writer.write(linea);
                    }
                    // Agregar un salto de línea después de cada registro
                    writer.newLine();
                }
            }
            // Cerrar los objetos de lectura y escritura
            reader.close();
            writer.close();
            // ELIMINA EL ARCHIVO VIEJO
            File archivoOriginal = new File("c:/Users/ricar/Desktop/registros/datos.txt");
            archivoOriginal.delete();
            // RENOMBRA EL ARCHIVO NUEVO COMO EL VIEJO
            File archivoTemporal = new File("c:/Users/ricar/Desktop/registros/datos_temp.txt");
            String directorio = archivoTemporal.getParent();
            File archivoNuevo = new File(directorio, "datos.txt");
            archivoTemporal.renameTo(archivoNuevo);
            if(vacio){
                System.out.println("--------------------------------------");
                System.out.println("El documento está vacío, no hay datos");
            }else if(productoInexistente){
                System.out.println("--------------------------------------");
                System.out.println("El código que ingresaste no existe");
            }else{
                System.out.println("Producto ingresado exitosamente.");
            }
        } catch (IOException e) {
            System.out.println("Error al modificar el registro: " + e.getMessage());
        }
  }
  
  public void extraer(){
      String cod, nuevoRegistro;
      int cantidad;
      float total;
      boolean vacio = true, productoInexistente = true;
      System.out.println("Ingrese el código del producto: ");
      cod = teclado.nextLine();
      try {
            // Crear objetos para leer y escribir en archivos
            BufferedReader reader = new BufferedReader(new FileReader("c:/Users/ricar/Desktop/registros/datos.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("c:/Users/ricar/Desktop/registros/datos_temp.txt"));
            String linea;
            while ((linea = reader.readLine()) != null) {
                vacio = false;
                // Dividir la línea en partes usando el "_" como separador
                String[] componente = linea.split("_");
                if (componente.length >= 4) {
                    // Verificar si el registro coincide con el que se va a modificar
                    if (cod.equals(componente[0])) {
                        productoInexistente = false;
                        // MUESTRA LOS DATOS
                        System.out.println("Código: " + componente[0]);
                        System.out.println("Nombre: " + componente[1]);
                        System.out.println("Cantidad: " + componente[2]);
                        System.out.println("Precio Unitario: Q" + componente[3]);
                        total =  Float.parseFloat(componente[2]) * Float.parseFloat(componente[3]);
                        System.out.println("Total: Q" + total);
                        System.out.println("--------------------------------------");
                        // ESCRIBE EL REGISTRO MODIFICADO
                        System.out.println("Escribe la cantidad a ingresar: ");
                        cantidad = Integer.parseInt(componente[2]) - Integer.parseInt(teclado.nextLine());
                        while(cantidad>Integer.parseInt(componente[2]) || cantidad < 0){
                            System.out.print("ERROR! Cantidad no válida, Ingrese otra cantidad: ");
                            cantidad = Integer.parseInt(componente[2]) - Integer.parseInt(teclado.nextLine());
                        }
                        LocalDateTime fechaHoraActual = LocalDateTime.now();
                        String fechaHoraTexto = fechaHoraActual.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                        nuevoRegistro = componente[0] +"_"+ componente[1] +"_"+ cantidad +"_"+ componente[3] +"_"+ "Extracción: " + fechaHoraTexto;
                        writer.write(nuevoRegistro);
                        // MUESTRA LOS DATOS MODIFICADOS
                        System.out.println("--------------------------------------");
                        System.out.println("Código: " + componente[0]);
                        System.out.println("Nombre: " + componente[1]);
                        System.out.println("Cantidad: " + cantidad);
                        System.out.println("Precio Unitario: Q" + componente[3]);
                        total =  cantidad * Float.parseFloat(componente[3]);
                        System.out.println("Total: Q" + total);
                        System.out.println("--------------------------------------");
                    } else {
                        // CONSERVA EL REGISTRO ORIGINAL
                        writer.write(linea);
                    }
                    // Agregar un salto de línea después de cada registro
                    writer.newLine();
                }
            }
            // Cerrar los objetos de lectura y escritura
            reader.close();
            writer.close();
            // ELIMINA EL ARCHIVO VIEJO
            File archivoOriginal = new File("c:/Users/ricar/Desktop/registros/datos.txt");
            archivoOriginal.delete();
            // RENOMBRA EL ARCHIVO NUEVO COMO EL VIEJO
            File archivoTemporal = new File("c:/Users/ricar/Desktop/registros/datos_temp.txt");
            String directorio = archivoTemporal.getParent();
            File archivoNuevo = new File(directorio, "datos.txt");
            archivoTemporal.renameTo(archivoNuevo);
            if(vacio){
                System.out.println("--------------------------------------");
                System.out.println("El documento está vacío, no hay datos");
            }else if(productoInexistente){
                System.out.println("--------------------------------------");
                System.out.println("El código que ingresaste no existe");
            }else{
                System.out.println("Producto extraido exitosamente.");
            }
        } catch (IOException e) {
            System.out.println("Error al modificar el registro: " + e.getMessage());
        }
  }
  
  public void copia(){
      String ruta;
      boolean vacio = true;
      try {
            LocalDateTime fechaHoraActual = LocalDateTime.now();
            String fechaHoraTexto = fechaHoraActual.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            ruta = "c:/Users/ricar/Desktop/datos_backup ("+fechaHoraTexto+").txt";
            // Crear objetos para leer y escribir en archivos
            BufferedReader reader = new BufferedReader(new FileReader("c:/Users/ricar/Desktop/registros/datos.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter(ruta));
            String linea;
            while ((linea = reader.readLine()) != null) {
                vacio = false;
                     // CONSERVA EL REGISTRO ORIGINAL
                        writer.write(linea);
                    // Agregar un salto de línea después de cada registro
                    writer.newLine();
            }
            if(vacio){
                System.out.println("--------------------------------------");
                System.out.println("El documento está vacío, no hay datos");
            }else{
                writer.write("---------------------------------------------------------------------\nFECHA Y HORA DE LA COPIA DE SEGURIDAD ["+fechaHoraActual.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))+"]");
                System.out.println("Backup realizado con exito, se ubica en la ruta:\n"+ruta);
            }
            // Cerrar los objetos de lectura y escritura
            reader.close();
            writer.close();
        } catch (IOException e) {
            System.out.println("Error al hacer la copia: " + e.getMessage());
        }
  }
  
//MAIN
  public static void main(String[] args) {
        int opcion;
        PrimerParcial metodo = new PrimerParcial();
        do{
            System.out.println("======================================");
            System.out.println("1) Registrar producto en el inventario");
            System.out.println("2) Mostrar productos del inventario");
            System.out.println("3) Ingresar producto al inventario");
            System.out.println("4) Extraer  producto del inventario");
            System.out.println("5) Crear una copia de seguridad");
            System.out.println("6) SALIR");
            System.out.println("--------------------------------------");
            opcion = Integer.parseInt(teclado.nextLine());
            System.out.println("======================================");
            switch(opcion){
                case 1:
                    metodo.registrar();
                break;
                case 2:
                    metodo.mostrar();
                break;
                case 3:
                    metodo.ingresar();
                break;
                case 4:
                    metodo.extraer();
                break;
                case 5:
                    metodo.copia();
                break;
                case 6:
                break;
                default:
                System.out.println("OPCIÓN INVALIDA!");
            }
        }while(opcion != 6);
    }
}