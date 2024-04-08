package sample;

import javax.swing.text.GapContent;

public class ExceptionExample1 {

    public static void main(String[] args) {
        System.out.println("処理開始");
        
        try {//個々に除外が発生する可能性のあるコードを書く
        System.out.println("割り算開始A");
        int a = 10/0;
                System.out.println(a);
        }catch(ArithmeticException e) {
            System.out.println("ArithmeticExceptionが発生:"+e.getMessage());
        }finally {
            System.out.println("割り算終了）");
            
        }
        System.out.println("処理終了");
        
        }
                    

}
