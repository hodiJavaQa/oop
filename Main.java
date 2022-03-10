
import java.awt.*;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // int short byte boolean double float long char
        //Scanner sc1 =new Scanner(System.in);

        //3
        //int[] numbers = new int[5];
//
        //for(int i=0;i<numbers.length;i++){
        //System.out.print("Please enter the "+(i+1)+" number: ");
        //numbers[i]=sc1.nextInt();
        //System.out.println("the number is : "+numbers[i]);
        //}

        //4
       // int[] numbers2= new int[10];
        //0-9
      ////for( int i=0 ; i< numbers2.length ; i++ ){
      //    System.out.print("Please enter number");
      //    numbers2[i]= sc1.nextInt();
      //}
      //System.out.println(Arrays.toString(numbers2));

      //System.out.print("the first number in the array is : ");
      //System.out.println(numbers2[0]);

      //System.out.println("the smallest value");
      //int min=numbers2[0];
      //int sum=0;

      //for( int i=0 ; i< numbers2.length ; i++ ){
      //    sum=sum+numbers2[i];
      //    //System.out.println(""+min+">"+numbers2[i]+"--->>>>> "+(min>numbers2[i]));
      //    if(numbers2[i] < min )
      //        min=numbers2[i];
      //}
      //System.out.println("the min ins :"+min);
      //System.out.println("the avg is "+sum/10);
      //System.out.println("the sum is "+sum);


      //short[] short1= new short[3];
      //for(short w : short1){
      //    System.out.println(w);
      //}
        //Car hodiCar = new Car();
        //color model make year numberOfDoors maxSpeed
        //hodiCar.make="seat";
        //hodiCar.model="leon fr";
        //hodiCar.year= 2018;
        //hodiCar.numberOfDoors=3;
        //hodiCar.maxSpeed=205;
        //hodiCar.color="black";
//
        //Car barCar=new Car();
        //barCar.maxSpeed=250;
        //barCar.make="bmw";
        //barCar.model="m4";
        //barCar.year=2022;
        //barCar.color="white";
        //barCar.numberOfDoors=5;
//
        //System.out.println(barCar.make);
        //System.out.println(barCar.model);
        //System.out.println(barCar.year);
        //System.out.println(barCar.color);
        //System.out.println(barCar.maxSpeed);
        //System.out.println(barCar.numberOfDoors);
//
        //barCar.make="tesla";
        //System.out.println(barCar.make);

        Animal dog =new Animal();
        Animal zebra= new Animal();
        System.out.println(dog.name);
        System.out.println(zebra.name);
        dog.name="jojo the dog";
        dog.age=24;
        zebra.name="rosta";
        zebra.age=30;



        System.out.println(dog.name);
        System.out.println(dog.age);

        System.out.println(zebra.name);
        System.out.println(zebra.age);

        dog.makeSound();
        dog.eat();
        zebra.makeSound();

    }
}