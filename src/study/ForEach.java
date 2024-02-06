package study;

public class ForEach {

    public static void main(String[] args) {
        String[] vector = new String[]{"Matheus, Maria, Joao"};

        for (int i=0; i< vector.length; i++){
            System.out.println(vector[i]);
        }


        ///FOR EACH

        for (String obj: vector) {
            System.out.println(obj);
        }




    }
}
