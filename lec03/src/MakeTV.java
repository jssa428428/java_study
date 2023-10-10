class TV{
    String manufacturer;
    int year;
    int size;

    public TV(String manufacturer, int year, int size){
        this.manufacturer = manufacturer;
        this.year = year;
        this.size = size;
        System.out.print(manufacturer+"에서 만든 ");
        System.out.print(year+"년형 ");
        System.out.println(size+"인치 TV");
    }

    void show(){
//        System.out.print(manufacturer+"에서 만든 ");
//        System.out.print(year+"년형 ");
//        System.out.println(size+"인치 TV");
    }
}

public class MakeTV {
    public static void main(String[] args) {
        TV tv1 = new TV("LG", 2017, 32);
    }
}
