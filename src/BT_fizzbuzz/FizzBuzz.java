package BT_fizzbuzz;

public class FizzBuzz {
    private String a; //hàng đơn vị
    private String b; //hàng chục

    public FizzBuzz() {
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public void getNum(int num) {
        switch (num) {
            case 1:
                a = "one";
                break;
            case 2:
                a = "two";
                break;
            case 3:
                a = "three";
                break;
            case 4:
                a = "four";
                break;
            case 5:
                a = "five";
                break;
            case 6:
                a = "six";
                break;
            case 7:
                a = "seven";
                break;
            case 8:
                a = "eight";
                break;
            case 9:
                a = "nine";
                break;
            case 10:
                a = "ten";
                break;
            case 11:
                a = "eleven";
                break;
            case 12:
                a = "twelfth";
                break;
            case 13:
                a = "thirteen";
                break;
            case 14:
                a = "fourteen";
                break;
            case 15:
                a = "fifteen";
                break;
            case 16:
                a = "sixteen";
                break;
            case 17:
                a = "seventeen";
                break;
            case 18:
                a = "eighteen";
                break;
            case 19:
                a = "nineteen";
                break;
            default:
                a = "";
        }
    }

    public void getNum2(int num){
        switch (num){
            case 2:
                b = "twenty";
                break;
            case 3:
                b = "thirty";
                break;
            case 4:
                b = "forty";
                break;
            case 5:
                b = "fifty";
                break;
            case 6:
                b = "sixty";
                break;
            case 7:
                b = "seventy";
                break;
            case 8:
                b = "eighty";
                break;
            case 9:
                b = "ninety";
            case 0:
            case 1:
                b = "";
        }
    }
}
