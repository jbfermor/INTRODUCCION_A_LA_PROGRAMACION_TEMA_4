public class Main {

  public static void main(String[] args) {

    //Variables
    int numeroIf = -1;
    int numeroWhile = 0;
    int numeroEstacion = 3;

    //If 
    if (numeroIf > 0) {
      System.out.println("El número " + numeroIf + " es positivo");
    }
    else if (numeroIf < 0) {
      System.out.println("El número " + numeroIf + " es negativo");
    }
    else {
      System.out.println("El número " + numeroIf + " es cero");
    }

    //While
    while (numeroWhile < 3){
      System.out.println("El número numeroWhile actual es " + numeroWhile);
      numeroWhile ++;
    }

    //Do while con valor reseteado
    numeroWhile = 0;

    do {
      System.out.println("El número numeroWhile actual es " + numeroWhile);
      numeroWhile ++;
      break;
    }
    while (numeroWhile < 3);

    //For
    for(int numeroFor = 0; numeroFor < 3; numeroFor++){
      System.out.println("El número numeroFor actual es " + numeroFor);
    }

    //Switch
    switch (numeroEstacion) {
      case 1:
        System.out.println("La estación actual es primavera");
        break;
      case 2:
        System.out.println("La estación actual es verano");
        break;
      case 3:
        System.out.println("La estación actual es otoño");
        break;
      case 4:
        System.out.println("La estación actual es invierno");
        break;
      default:
        System.out.println("La estación introducuida no existe");
        break;
    }

  }
}
