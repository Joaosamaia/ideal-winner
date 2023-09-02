//    import java.util.ArrayList;
//    public class lista_1_primeiro {
//        public static void main(String[] args) {
//            ArrayList<Integer> lista = new ArrayList<>();
  //          lista.add(0, 1);
    //        lista.add(1, 2);
      //      for (int x = 1; x < 100; x++){
        //        for (int i = 1; i < x; i++) {
          //          if (x % i == 0) {
//                        break;	
  //                  }   else if (!lista.contains(x)) {
    //                    lista.add(x);
            //        }
          //      }   
        //    }
      //      System.out.print(lista);
//        }
  //  }

import java.util.ArrayList;
public class lista_1_primeiro {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        for (int x = 3; x <= 100; x++) { 
            boolean a = true; 
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    a = false; 
                    break;    }    }
            if (a == true) {
                lista.add(x);     }    }
        System.out.println(lista);
    }   }