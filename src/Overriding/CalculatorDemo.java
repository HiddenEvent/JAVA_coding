package Overriding;

class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
class SubstractionableCalculator extends Calculator {
	//부모꺼의 메소드명(기능)을 그대로 받아 살짝 바꾸는 재정의 하는 데 사용됨  [부모꺼는 포괄적인 기능]
    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
    	// 자식 객체를 생성 (부모꺼 다 갖을수 있음)
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();     //  <-- 이 매소드는 부모꺼를 호출할까? 자식꺼를 호출할까? 답 :  자식꺼 우선!!
        c1.avg();
        c1.substract();
    }
}