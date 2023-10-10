class Book{
    String title;
    String genre;

    public void getInfo(){
        System.out.println("제목: "+title);
        System.out.println("장르: "+genre);
    }
}

class Novel extends Book{
    String writer;

    public String setWriter(String writer){
        this.writer = writer;
        return writer;
    }
    public void getNovelnfo(){
        getInfo();
        System.out.println("저자: "+writer);
    }
}

class Magazine extends Book{
    String day;

    public String setDay(String day){
        this.day = day;
        return day;
    }
    public void getMagazineInfo(){
        getInfo();
        System.out.println("발매일: "+day);
    }
}
public class BookInherit {
    public static void main(String[] args) {
        Novel novel1 = new Novel();
        Magazine magazine1 = new Magazine();

        novel1.title = "구운몽";
        novel1.genre = "고전문학";
        novel1.setWriter("김만중");
        magazine1.title = "월간 자바 그림책";
        magazine1.genre = "컴퓨터";
        magazine1.setDay("20일");

        novel1.getNovelnfo();
        System.out.println();

        magazine1.getMagazineInfo();
    }
}
