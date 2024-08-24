//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] numeros = {44,15,12,28,53,60,75,33};


        int i = 0;
        int maior = 0;

       while (i < numeros.length){

           if (numeros[i]> maior) {
               maior = numeros[i];
           }
           i++;

       }
        System.out.println("O maior é " + maior);
        System.out.println("======================");

       int menor = maior;
       i = 0;

        while(i < numeros.length){

            if(numeros[i] < menor){
                menor = numeros[i];
            }
            i++;
        }

        System.out.println("O menor é: " + menor);

    i = 0;
    int pares[] = new int [10];
    int impares[] = new int [10];
    int indicePares = 0;
    int indiceImpares = 0;


    while(i < numeros.length){
        if (numeros[i] % 2 == 0) {
            pares[indicePares] = numeros[i];
            indicePares += 1;
        } else {
            impares[indiceImpares] = numeros[i];
            indiceImpares += 1;

        }



      i++;
    }
        System.out.println("Mostrando Pares");

        for (int j = 0; j < pares.length ; j++) {
            if (pares[j] > 0);
            System.out.println("Pares posição " + j + " - " + pares[j]);
        }

        System.out.println("Mostrando Impares");

        for (int j = 0; j < impares.length ; j++) {
            if(impares[j] > 0);
            System.out.println("Impares posição " + j + " - " + impares[j]);

        }

        















        }
    }
