package com.company;

 public class Main{

        public static void main(String[] args) {

            try{
                hiloss  hiloss = new hiloss();

                hiloss.start();
                hiloss.join();

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
}



