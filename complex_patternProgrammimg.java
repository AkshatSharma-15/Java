public class complex_patternProgrammimg {
    public static void main(String[] args) {
        int n=11;
        int i,j;
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ; j++)
            {
                if(i==j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ; j++)
            {
                if(i==j || i==0 || j==0 || i==n-1 || j==n-1 || i+j==n-1 || i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)+(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ; j++)
            {
                if(i==0 || j==0 || i==(n-1) || j==(n-1) ||  i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)+(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<n ; j++)
            {
                if(i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2 || i+j<=(n-1)/2 ||
                   j==0 && i>=(n-1)/2 || i==(n-1) && j<=(n-1)/2 || i-j>=(n-1)/2 ||
                   i==0 && j>=(n-1)/2 || j==(n-1) && i<=(n-1)/2 || j-i>=(n-1)/2 ||
                   i==(n-1) && j>=(n-1)/2 || j==(n-1) && i>=(n-1)/2 || i+j>=(n-1) + (n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
