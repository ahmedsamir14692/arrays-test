
package arrays;

import java.util.ArrayList;
import java.util.Vector;
 import java.util.Arrays;

public class Array {

  
    public static void main(String[] args) {
      int [] array1,array2;
        int array3 [],array;
        array =6;
        //array3=5;
        String f= "ahmed";
        String l= "samir";
        String[]slist = new String[2];
        slist[0]=f; // slist[0] like ane object of type string[]
        slist[1]=l;
        System.out.println(slist[0].lastIndexOf("a"));  
        slist[1]="abdelaziz";
       // slist[2]="exception"; // exception
        System.out.println(slist.length); // number of ellements
       slist=new String []{};
        System.out.println(slist.length); 
        //slist= new String []{3,"reet"}; // syntex
        int [] arr= new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        for(int i:arr)
            System.out.println(i);
        double sume=0;
        for(int i:arr)
        {
            sume = sume +i;
        }
        System.out.println(sume+5);
        
        int ary []={4,5,6   };
        int [] ar2= new int[10];
        for (int i = 0; i < ary.length; i++) {
            ar2[i]=ary[i];
        }
        System.out.println(ar2[0]);
        System.arraycopy(ary, 0, ar2, 3, 3);
        double total;
        for(int i:ar2)
        {
            i=1;
            System.out.println(i);
        }
        arraysteats.test(56);
        ArrayList<Integer> vvv= new ArrayList<Integer>();
        
     //  vvv.r
     Vector<Integer> vec= new Vector();
    //
    int[][]tt= new int[3][];
    tt[0]=null;
    tt[1]=new int[0];
    tt[2]=null;
    for(int i: tt[1])
            System.out.println(i);
    int yy[]={1,2,3};
    int dd[]=yy;
        System.out.println(dd[0]);
        char s='s';
    long xxx=1234456780;
    long ccc= 1000000000;
    long vvvv= ccc*xxx;
        System.out.println(vvvv);
        byte rs=122;
        byte yu=-23;
        byte byt=(byte) (rs+yu);
       long big=1234456780;
       int aa;
       byte bb;
      // bb=(byte)a; u can not ues variable in any expresion befor intialization
       // Integer.p
    }
    
}
