import java.util.Scanner;
class Main {
  public static void main(String[] args) { 
    int aux,num;
   Scanner input = new Scanner (System.in);
    System.out.print("introduce el numero de elementos del arreglo: ");
    num = input.nextInt();
    int[] arreglo=new int[num];
    for (int i=0;i<(num-1);i++){
      arreglo[i]=(int) (Math.random()*99);
    }
    System.out.println("el arreglo desordenado es: ");
    System.out.println();
    for (int j=0;j<(num);j++){
      System.out.print(arreglo[j]+" ");
    }
    System.out.println();
    System.out.println();
    System.out.println("el arregolo ordenado es: ");
    System.out.println();
    for (int p=0;p<(num-1);p++){
      for(int q=0;q<(num-1);q++){
        if (arreglo[q] > arreglo[q+1]){
          aux = arreglo[q];
          arreglo[q] = arreglo[q+1];
          arreglo[q+1] = aux;
        }
      }
    }
    for (int k=0;k<(num);k++){
      System.out.print(arreglo[k]+" ");
    }
  }
}