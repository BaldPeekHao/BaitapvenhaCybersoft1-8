import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui lòng nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int [] array = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < array.length ; i++) {
            System.out.println("Phần tử thứ "+ (i + 1) +" :");
            array[i] = scanner.nextInt();
        }
        int tongDuong = tongCacSoDuong(array);
        System.out.println("Tổng các số dương là: " + tongDuong);
        int tongLe = tongCacSoLe(array);
        System.out.println("Tổng các số lẻ là: " + tongLe);
        demCacSoDuong(array);
        timSoNhoNhatTrongMang(array);
        timSoDuongNhoNhat(array);
        timSoChanCuoiCung(array);
        timSoChanDauTien(array);
        timSoNguyenToDauTien(array);
        timSoDuongCuoiCung(array);

    }
    public static int tongCacSoDuong (int[] truyenMangVaoDay){
        int sumDuong = 0;
        for (int i = 0; i < truyenMangVaoDay.length ; i++) {
            if (truyenMangVaoDay[i] > 0) {
                sumDuong += truyenMangVaoDay[i];
            }
        }
        return sumDuong;
    }
    public static int tongCacSoLe (int[] truyenMangVaoDay) {
        int sumOdd = 0;
        for (int i = 0; i < truyenMangVaoDay.length ; i++) {
            if (truyenMangVaoDay[i] % 2 != 0) {
                sumOdd += truyenMangVaoDay[i];
            }
        }
        return sumOdd;
    }
    public static void demCacSoDuong (int [] array) {
        int demsoDuong = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array [i] > 0 ){
                demsoDuong ++;
            }
        }
        System.out.println("Có tổng cộng " + demsoDuong + " số dương!");
    }
    public static void timSoNhoNhatTrongMang (int[] array) {
        int minNum = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < minNum){
                minNum = array[i];
            }
        }
        System.out.println("Số nhỏ nhất trong mảng là: "+ minNum);
    }
    public static void timSoDuongNhoNhat (int[] array){
        int minPosNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if ((array[i] > 0) && (array[i] < minPosNum)) {
                minPosNum = array[i];
            }
        }
        System.out.println("Số dương nhỏ nhất trong mảng là: "+ minPosNum);
    }
    public static void timSoChanCuoiCung (int[] array) {
        int lastEvenNumber = array[array.length-1];
        int lastIndex = array.length -1;
//        Tạo một biến boolean để thoát ra vòng lập for dễ in ra màn hình hơn!
        boolean conditionSatisfied = false;
        int exception = -1;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2 == 0) {
                lastEvenNumber = array[i];
                lastIndex = i;
                conditionSatisfied = true;
            }
        }
        if (conditionSatisfied) {
            System.out.println("Giá trị của số chẵn cuối cùng trong mảng là: " + lastEvenNumber);
            System.out.println("Vị trí của số chẵn cuối cùng trong mảng là: " + lastIndex);
        }else {
            System.out.println("Không có số nào là số chẵn trong mảng nên giá trị mặc đình bằng: " + exception);
        }
    }
    public static void timSoChanDauTien (int [] array) {
        int firstEvenNumber = array [0];
        int firstIndex = -1;
        int exception = -1;
        boolean conditionSatisfied = false;
        for (int i = 0; i < array.length; i++) {
            if ( array[i] % 2 == 0 ){
                firstEvenNumber = array[i];
                firstIndex = i;
                conditionSatisfied = true;
            break;
            }
        }
        if (conditionSatisfied){
            System.out.println("Giá trị của số chẵn đầu tiên trong mảng là: " + firstEvenNumber);
            System.out.println("Vị trí của số chẵn đầu tiên trong mảng là: " + firstIndex);
        }else{
            System.out.println("Không có số nào là số chẵn trong mảng nên giá trị mặc định bằng: " + exception);
        }
    }
    public static void timSoNguyenToDauTien (int [] array) {
        int firstPrimeNumber = array [0];
        int firstIndex = -1;
        int exception = -1;
        boolean conditionSatisfied = false;
        for (int i = 0; i < array.length; i++) {
            if (( array[i] > 1 ) && ( array[i] % array[i] == 0 ) && ( array[i] % 1 == 0 )) {
                firstPrimeNumber = array[i];
                firstIndex = i;
                conditionSatisfied = true;
                break;
            }
        }
        if (conditionSatisfied){
            System.out.println("Giá trị của số nguyên tố đầu tiên trong mảng là: " + firstPrimeNumber);
            System.out.println("Vị trí của số nguyên tố đầu tiên trong mảng là: " + firstIndex);
        }else{
            System.out.println("Không có số nào là số nguyên tố trong mảng nên giá trị mặc định bằng: " + exception);
        }
    }
    public static void timSoDuongCuoiCung (int [] array) {
        int lastPosNumber = array[array.length-1];
        int lastIndex = array.length -1;
        int exception = -1;
        boolean conditionSatisfied = false;
        for (int i = 0; i < array.length; i++) {
            if ( array[i] > 0 ){
                lastPosNumber = array[i];
                lastIndex = i;
                conditionSatisfied = true;

            }
        }
        if (conditionSatisfied){
            System.out.println("Giá trị của số dương cuối cùng trong mảng là: " + lastPosNumber);
            System.out.println("Vị trí của số dương cuối cùng trong mảng là: " + lastIndex);
        }else{
            System.out.println("Không có số nào là số dương trong mảng nên giá trị mặc định bằng: " + exception);
        }
    }
    public static void timSoChanNhoNhat (int [] array) {
        int lowestEvenNum = array[0];
        int lowestEvenIndex = 0;
        int exception = -1;
        boolean conditionSatisfied = false;
        for (int i = 0; i < array.length; i++) {
            if (( array[i] % 2 == 0 ) && ( array[i] < lowestEvenNum )){
                lowestEvenNum = array[i];
                lowestEvenIndex = i;
                conditionSatisfied = true;

            }
        }
        if (conditionSatisfied){
            System.out.println("Giá trị của số chẵn nhỏ nhất trong mảng là: " + lowestEvenNum);
            System.out.println("Vị trí của số chẵn nhỏ nhất trong mảng là: " + lowestEvenIndex);
        }else{
            System.out.println("Không có số nào là số chẵn trong mảng nên giá trị mặc định bằng: " + exception);
        }
    }
}


