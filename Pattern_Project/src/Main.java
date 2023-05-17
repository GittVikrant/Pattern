public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*

        *
        * *
        * * *
        * * * *
        * * * * *

        */

        System.out.println("Right Triangle Star Pattern");

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if ((i==j)||(i>j))
                System.out.print("*"+" ");
               // System.out.println(" ");
            }
            System.out.print("\n");

        }






        /*

                 *
               * *
             * * *
           * * * *
         * * * * *

         */


        System.out.println("\n\n\nLeft Triangle Star Pattern");



        for(int a=0;a<5;a++)
        {
            for(int b=0;b<5;b++)
            { int c=a+b;
                if((c>=4))
                {
                    System.out.print("* ");

                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");

        }



        /*


            *
           * *
          * * *
         * * * *
        * * * * *

         */

        System.out.println("\n\n\nPyramid Star Pattern");


        for(int d=0;d<6;d++) {


            for (int f=5;f>d;f--) {
                System.out.print(" ");

            }

        for(int e=0;e<=d;e++)
            {
                System.out.print("* ");
            }

            System.out.print("\n");



        }


    }
}