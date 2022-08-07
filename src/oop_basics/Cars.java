package oop_basics;

import com.sun.xml.internal.ws.api.pipe.Engine;
class Engines
{
    void run()
    {
        System.out.println("Engine is started");
    }
}

 class Cars {

    Engines engine;
     public Cars(Engines engine)
     {
         this.engine = engine;
     }


    void drive()
     {
        engine.run();
     }
    public static void main(String[] args) {
        Engines engine = new Engines();
        Cars cars = new Cars(engine);
        cars.drive();
    }
}
