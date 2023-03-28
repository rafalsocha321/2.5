import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Double a, b;
    System.out.println("Wprowadź dwie liczby: ");
    a = scanner.nextDouble();
    b = scanner.nextDouble();

    System.out.println("Jaką operację chcesz wykonać? Wpisz 1 (pole prostokąta), 2 (pole trójkąta prostokątnego), 3 (średnią 10 liczb losowych z zakresu 0-100), 4 (medianę 10 liczb losowych z zakresu 0-100) ");
    int wybor= scanner.nextInt();
    
    switch(wybor)
      {
        case 1:
          System.out.println("Pole prostokąta o podanych bokach wynosi " + a*b);
          break;

        case 2:
          System.out.println("Pole trojkąta prostokątnego o podanych bokach wynosi " + a*b/2);
          break;

        case 3:
          int sum=0;
          Random random=new Random();
          for(int i=0; i<10; i++){
            sum= sum +  random.nextInt(101);
          }
          System.out.println("średnia to " + sum/10);
         break;

        case 4:
          Random random2=new Random();
          int tablica[] = new int[10];
          for(int i=0; i<10; i++){
              tablica[i]=random2.nextInt(101);
          }
          int s;
          for(int i=0; i<10; i++){
            for(int l=0; l<9; l++){
              if(tablica[l]>tablica[l+1]){
                s=tablica[l+1];
                tablica[l+1]=tablica[l];
                tablica[l]=s;
              }
          }
          }
          
          System.out.println("mediana 10 losowych liczb z zakresu od zera do 10 to: " + (tablica[4]+tablica[5])/2);
    break;
          
      
    
      }
  }
}