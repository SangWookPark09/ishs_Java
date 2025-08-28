public class DataType {
    public static void main(String[] args) {
        int score = 100;
        float gpa = 4.13F;
        System.out.println(score);
        score = (int)99.9;
        System.out.println(score);
        System.out.println(gpa);
        score = (int)gpa;   //명시적 형변환
        System.out.println(score);
        System.out.println(gpa);
        gpa = score;    //묵시적 형변환
        //gpa = (float)score;   //명시적 형변환
        System.out.println(gpa);
    }
}