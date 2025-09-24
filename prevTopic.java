public class prevTopic {

    public static void ifelse(int age){
        
        if(age>18){
            System.out.println("you are a adult");
        }
        else if(age<=12 && age>=5){
            System.out.println("you are a child");
        }
        else{
            System.out.println("you are a teenager");
        }
    }

    public static boolean isOddorEven(int num){
        if(num%2==0){
            return true ;
        }else{
            return false;
        }
    }

    public static void oneToTen(int n){
        int counter=0;
        while(counter<n){
            System.out.println("my son is great");
            counter++;
        }
    }

    public static void printsum(int n) {
        int counter=0;
        while(counter<n){
            int sum=0;
            System.out.println(sum=sum+counter);
        }
    }

    public static void main(String args[]){
        // ifelse(5);
        boolean result=isOddorEven(13);
        System.out.println(result);
        oneToTen(10);
    }
}
