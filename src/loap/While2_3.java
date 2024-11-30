package loap;

public class While2_3 {
    //반복문 시작
    public static void main(String[] args) {
        int sum = 0;
        //sum = sum + 1;
        int i = 1;
        int endNum = 3;//i부터 endNum까지 수만큼 반복


        //i=1, endNum=3     => true
        while(i <= endNum) {
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;

        }
    }
}
