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
	//�θ��� �޼ҵ��(���)�� �״�� �޾� ��¦ �ٲٴ� ������ �ϴ� �� ����  [�θ𲨴� �������� ���]
    public void sum() {
        System.out.println("���� ����� " +(this.left + this.right)+"�Դϴ�.");
    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
    	// �ڽ� ��ü�� ���� (�θ� �� ������ ����)
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();     //  <-- �� �żҵ�� �θ𲨸� ȣ���ұ�? �ڽĲ��� ȣ���ұ�? �� :  �ڽĲ� �켱!!
        c1.avg();
        c1.substract();
    }
}