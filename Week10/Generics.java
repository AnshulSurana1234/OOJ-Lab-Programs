class Gen<T, U, V> 
{ 
    T ob;
    U ob2;
    V ob3;
    Gen(T o,U o2,V o3) 
    { 
        ob = o;
        ob2 = o2;
        ob3 = o3;
    }
    void showType() 
    { 
        System.out.println(ob+" is of Type of T is " + ob.getClass().getName());
        System.out.println(ob2+" is of Type of U is " + ob2.getClass().getName());
        System.out.println(ob3+" is of Type of V is " + ob3.getClass().getName());
    }
}
class Main 
{
    public static void main(String args[]) 
    { 
        Gen<Integer, String,Double> obj = new Gen<Integer,String,Double>(100,"Anshul",9.35);
        obj.showType();
    }
}
