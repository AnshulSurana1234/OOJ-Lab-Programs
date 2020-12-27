class NewThread implements Runnable 
{ String name,print;
  int delay,loop;
  Thread t;
  NewThread(String threadname,String toprint,int d,int n) 
  { name = threadname;
    print=toprint;
	delay=d;
	loop=n;
    t = new Thread(this, name);
    System.out.println("New thread: " + t);
    t.start();                                  
  }


 public void run() 
 { try 
   { for(int i = loop; i > 0; i--) 
     { System.out.println(print);
       Thread.sleep(delay);  }
   } 
   catch (InterruptedException e) 
   { System.out.println(name + "Interrupted"); }
   System.out.println(name + " exiting.");
 }
}

class multiThread
{ public static void main(String args[]) 
  { new NewThread("Thread_1","BMS College of Engineering",10000,2); // start threads 
    new NewThread("Thread_2","CSE",2000,5);
  }
}
