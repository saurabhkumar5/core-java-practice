package arrays;

class ArrayExamle{

    void multiArrays(){
        // int [][] arr = new int[5][3];
        int [][] arr = {{56,55,78},{77,33,11}};
       // int [][][] arr_3 = new int[5][4][3];
       // arr_3[0][0][0] = 2;
        System.out.print(arr[0][0]+" ");//56
        System.out.print(arr[0][1]+" ");//55
        System.out.println(arr[0][2]+" ");//78

        System.out.print(arr[1][0]+" ");//77
        System.out.print(arr[1][1]+" ");//33
        System.out.println(arr[1][2]+" ");//11

       // System.out.print(arr[2][0]+" ");//36
       // System.out.print(arr[2][1]+" ");//44
       // System.out.print(arr[2][2]+" ");//25
        //for loop using
        //for (int i = 0; i<2; i++){
        for (int i = 0; i<arr.length; i++){
            //for (int j = 0; j<3; j++){
            for (int j = 0; j<arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    void demoArrays(){
       int [] age = new int[3];
       float [] weights = new float[3];
       String [] name = {"amit","sumit","ammu","chor"};
        System.out.println(name.length);
        System.out.println(age.length);
        System.out.println(weights.length);

       age[0] = 34;
        age[1] = 39;
        age[2] = 36;
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);

        //for (int i = 0; i<3; i++){// for loop
        for (int i = 0; i<age.length; i++){
            System.out.println(age[i]);
        }

       // for each loop
        for (int ages : age){
            System.out.println(ages+"for each llop");
        }

        //while loop
        int i =0;
       // while (i<3){
        while (i<age.length){
            System.out.println(age[i] +"  while loop");
            i++;
        }

    }
}








public class Main {
    public static void main(String[] args) {
        ArrayExamle r = new ArrayExamle();
        r.demoArrays();
        r.multiArrays();

    }
}
