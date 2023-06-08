public class if_else {
    public static void main(String[] args) {
        int age=26;
        if(age>=18 && age<60)
        {
            if(age>20 && age<30)
            {
                System.out.println("You're in your 20's");
            }
        }
        else if(age>=60)
        {
            System.out.println("You're a old man");
        }
        else
        {
            System.out.println("You're a kid");
        }
    }
}
