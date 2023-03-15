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
         
      }
    
    
  }
}