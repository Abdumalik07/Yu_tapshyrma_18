package com.company;

public class Main {

    public static void main(String[] args) {
       Adam adam1=new Kvartira("Kvartira");
       Adam adam2=new Gostinitsa("Gostinitsa");
       Adam adam3=new Obshejitie("Obshejitie");
       Adam adam4=new Gostinitsa("Gostinitsa");
       Adam adam5=new Obshejitie("Obshejitie");
       Adam adam6=new Obshejitie("Obshejitie");
       Adam adam7=new Kvartira("Kvartira");
       Adam adam8=new Gostinitsa("Gostinitsa");
       Adam adam9=new Gostinitsa("Gostinitsa");

       Adam[] family={adam1,adam2,adam3,adam4,adam5,adam6,adam7,adam8,adam9};
       int b=0;
       int c=0;
       int d=0;

       for (Adam a:family){
           if (a instanceof Kvartira){
               b++;
           }
       }
       System.out.println("kvartirada jashagan adamdardyn sany: "+b);

       for (Adam a:family){
            if (a instanceof Obshejitie){
                d++;
            }
        }
        System.out.println("Gostinitsa jashagan adamdardyn sany: "+d);
        for (Adam a:family){
            if (a instanceof Gostinitsa){
                c++;
            }
        }
        System.out.println("Obshejitie jashagan adamdardyn sany: "+c);







    }
}
