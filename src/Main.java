public class Main {
    public static void main(String[] args) {

        int[] numbers = {1,2,5,7,9,0};
        int aranacak = 10;
        boolean varMi = false;

        for(int sayi : numbers){
            if(sayi == aranacak){
                varMi = true;
                break;
            }
        }
        if(varMi){
            System.out.println("Sayı mevcuttur");
        }
        else{
            System.out.println("Sayı mevcut değildir.");
        }

    }
}