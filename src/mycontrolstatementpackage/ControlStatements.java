package mycontrolstatementpackage;

public class ControlStatements {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x = 10;
        int y = 5;
        int z = 3;
        if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("x is less than y");
        }
        switch (z) {
        case 1:
            System.out.println("Room1");
            break;
        case 2:
            System.out.println("Room2");
            break;
        case 3:
            System.out.println("Room3");
            break;
        default:
            System.out.println("No Room");
            break;
        }
        for(int i=1;i<=10;i++) {
            System.out.println(i);
        }
        String[] fruits= {"Apple","Orange","Mango","Grape"};
        for(String j:fruits) {
            System.out.println(j);
        }
        int a=10;
        while(a!=0) {
            if(a==5) {
                a--;
                continue;
            }
            else if(a==3){
                break;
            }
            System.out.println(a);
            a--;
            
        }
        System.out.println("The result is "+addNumber(20,30));
    }
    static int addNumber(int c,int d) {
        int result=c+d;
        return result;
    }

}
