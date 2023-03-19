import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float kt,gk,ck;
        float dtb=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap kt");
        kt= scanner.nextFloat();
        System.out.println("nhap gk");
        gk= scanner.nextFloat();
        System.out.println("nhap ck");
        ck= scanner.nextFloat();
        dtb=(kt+gk+ck)/3;
        if (dtb>=9){
            System.out.println("hang a "+dtb);
        }else {
            if (dtb>=7 && dtb<9){
                System.out.println("hang b "+dtb);
            }else {
                if (dtb>=5 && dtb<7){
                    System.out.println(" hang c "+dtb);
                }else {
                    if (dtb<5){
                        System.out.println(" hang f "+dtb);
                    }
                }
            }
        }
    }
}