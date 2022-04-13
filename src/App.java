public class App {
    public static void main(String[] args) throws Exception {
       metodoIf();
       metodoWhile();
       metodoDoWhile();
       metodoFor();
       metodoSwitch();
}

    //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
    public static void metodoIf(){
        int numeroIf = -5;

        if (numeroIf>0){
            System.out.println("El numero es positivo");
        }else if (numeroIf<0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es cero");
        }
    }   

    //Crea un bucle While, este bucle tendrá que tener como condición que la variable 
    //numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
            //Incrementar el valor de la variable en uno cada vez que se ejecute.
            //Mostrarlo por pantalla cada vez que se ejecute.


    public static void metodoWhile(){
        int numeroWhile = 0;
        while (numeroWhile<3){
            System.out.println(numeroWhile);            
            numeroWhile=numeroWhile +1;
        }
    }

     //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

     public static void metodoDoWhile(){
        int numeroWhile = 5;
        do{
            System.out.println(numeroWhile);
            numeroWhile=numeroWhile +1;
        }
        while (numeroWhile<3);
     }
    
//Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición 
        //será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se 
        //ejecute y deberá mostrarse por pantalla.

    public static void metodoFor(){
        for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }
    }

    //Por último, para el Switch, deberás crear la variable estacion, y distintos case para las 
    //cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje
    //por consola informando de la estación en la que está. También habrá que poner un default para cuando
    //el valor de la variable no sea una estación.

    public static void metodoSwitch(){
        var estacion= "Otoño";
        switch (estacion){
            case "Verano":
            System.out.println("Verano");
            break;
            case "Otoño":
            System.out.println("Otoño");
            break;
            case "Invierno":
            System.out.println("Invierno");
            break;
            case "Primavera":
            System.out.println("Primavera");
            break;
            default:
            System.out.println("Esta no es una estacion");
        }
    }
}
