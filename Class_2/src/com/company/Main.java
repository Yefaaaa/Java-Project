package com.company;


public class Main {

    public static void main(String[] args) {
        static_1();
        static_2();
        public_private_pretect();
        final_keyword();
        inheritance();
        polymorphism();
        method_overird();
        abstract_method();
        interface_();
        recursion();

    }

    public static void static_1(){
        System.out.println("Example-- static 1");

        Hello a =new Hello();
        // call a NoN-static class
        a.dosometingElse("Non-static");
        // It is a wrong way to call static
        a.dosometing("static");
        // It is the right way to call staic method
        Hello.dosometing("Right way to call static");

        Hello.age =15;
        a.age = 10;
        Hello b =new Hello();

        System.out.println(a.age);
        System.out.println(b.age);
        System.out.println(Hello.age);

    }

    public static void static_2(){
        System.out.println("Example-- static 2");

        Student mark = new Student();
        System.out.println(mark.getNuOfStudent());

        Student Tom = new Student();
        System.out.println(Tom.getNuOfStudent());

        System.out.println(Student.getNuOfStudent());

    }
    public static void public_private_pretect(){
        System.out.println("Example -- public, private,protected");

        Modifier m =new Modifier();
        m.name ="Tom";
        m.num =123.123d;

        // using get and set to set the private
        m.setN(12.123f);
        System.out.println(m.getN());

    };
    public static void final_keyword(){
        System.out.println("Example -- final");
        Final a =new Final();

    };

    public static void inheritance(){
        System.out.println("Example -- inheritance");
        Retangle a =new Retangle();
        a.set_value(1,3);
        System.out.println(a.area());

        Trangle b =new Trangle();
        b.set_value(1,3);
        System.out.println(b.area());
    };

    public static void polymorphism(){
        System.out.println("Example -- polymorphism");
        Bank b1 =new Bank_a();
        Bank b2 =new Bank_b();
        Bank b3 =new Bank_c();

        System.out.println(b1.getInterrate());
        System.out.println(b2.getInterrate());
        System.out.println(b3.getInterrate());

    }
    public static void method_overird(){
        System.out.println("Example -- method overriding");
        Bank b1 =new Bank_d();
        System.out.println(b1.getInterrate());

    };

    public static void abstract_method(){
        System.out.println("Example -- abstract_class");
        // cannot create like
        // Bank b1 = new Bank();
        // but can create
        Bank b1 =new Bank_d();

    }

    public static void interface_(){
        System.out.println("Example -- interface");
        Bank_1 b1 =new Bank_e();
        System.out.println(b1.getInterrate());


        // class, class extends
        // interface, class implement
        //interface, interface extends

    }

    public static void recursion(){
        System.out.println("Example -- Recursion");
        // N! = N*(N-1)*(N-1).....*1
        int res = fatorial(3);
        System.out.println(res);


    };

    public static int fatorial(int a){
        int res=1;
        if (a >0){
            return(a* fatorial(a-1));
        }else {
            return 1;
        }
    }




}
