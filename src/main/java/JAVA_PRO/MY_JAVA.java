package JAVA_PRO;

public class MY_JAVA {


        public static void main( String[] args)
        {
/*aa:
        for(int i=1;i<=3;i++){
            bb:
            for(int j=1;j<=3;j++){
                if(i==2&&j==3){
                    break aa;
                }
                System.out.println(i+" "+j);
            }
        }*/

  /*      int i,j,k;
        for(i=1; i<=4; i++)
        {
            for(j=4; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(k=1; k<=(2*i-1); k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }*/

            for (int i=0; i<4; i++)
            {

                // inner loop to handle number spaces
                // values changing acc. to requirement
                for (int j=4-i; j>1; j--)
                {
                    // printing spaces
                    System.out.print(" ");
                }

                //  inner loop to handle number of columns
                //  values changing acc. to outer loop
                for (int j=0; j<=i; j++ ) {
                    // printing stars
                    System.out.print("* ");


                }

                // inner loop to handle number spaces
                // values changing acc. to requirement
                for (int l = 7 - i; l > 1+i; l--)
                {
                    // printing spaces
                    System.out.print(" ");

                }

                for (int j=0; j<=i; j++ ) {
                    // printing stars
                    System.out.print("* ");

                }

                // ending line after each row
                System.out.println();
            }
            for (int y = 3; y >= 1; y--)
            {
                for (int j = 3; j >= y; j--)
                {
                    System.out.print(" ");
                }
                for (int j = 1; j <= y; j++)
                {
                    System.out.print("* ");
                }

                for (int j =7-y ; j >= y; j--)
                {
                    System.out.print(" ");
                }
                for (int j = 1; j <= y; j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }




