package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {

        MovieReview movie1 = new MovieReview();

        movie1.tittle = "인셉션";
        movie1.review = "인생은 무한 루프";

        MovieReview movie2 = new MovieReview();
        movie2.tittle = "어바웃 타임";
        movie2.review = "인생 시간 영화!";


        System.out.println("영화 제목 :" + movie1.tittle + ", 리뷰 : "+ movie1.review);
        System.out.println("영화 제목 :" + movie2.tittle + ", 리뷰 : "+ movie2.review);
    }
}
