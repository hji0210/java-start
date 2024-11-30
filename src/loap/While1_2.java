package loap;

public class While1_2 {

    public static void main(String[] args) {
        int count = 0;

       //count=1
        //count=3이 들어가면 거짓이 됨 => 코드 블럭 수행을 안함
        while(count < 3){

           count = count + 1;
           System.out.println("현재 숫자는: " + count);

       }

    }

}
