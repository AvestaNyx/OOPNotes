package com.example.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*

        User myUser = new User();
        myUser.name = "Kağan";
        myUser.job = "Footballer";

        User newUser = new User();
        newUser.name = "Stephen";
        newUser.job = "Basketballer";

         */

        User myUser = new User("Kagan", "Footballer");
        System.out.println(myUser.information());

        System.out.println(myUser.name);

        //Encapsulation

        Footballer messi = new Footballer("Messi", "Adidas", 36);
        System.out.println(messi.getName());
        messi.setAge(38, "Kagan" );
        System.out.println(messi.getAge());

        //Inheritance
        GoatFootballers ronaldo = new GoatFootballers("Ronaldo", "Nike", 40);
        System.out.println(ronaldo.ball());
        System.out.println(ronaldo.getAge());

        //Polymorphism

        //Static Polymorphism

        Math math = new Math();
        System.out.println(math.sum());
        System.out.println(math.sum(3, 5));
        System.out.println(math.sum(3, 5, 7));

        //Dynamic Polymorphism
        Galatasaray myGalatasaray = new Galatasaray();
        myGalatasaray.sing();

        Icardi wanda = new Icardi();
        wanda.test();
        wanda.sing();

        //Abstract & Interface

        Car myCar = new Car();
        myCar.brand = "Porsche";
        myCar.digital = true;
        myCar.info();



    }
}