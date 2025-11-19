public class SingleThreadExample {
    public static void runTask(String name) {
        for(int i = 1; i <= 5; i++){
            System.out.println(name + "스레드 " + i);
            try {
                Thread.sleep(500); //0.5초 대기
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // 작업 시작시간 기록
        runTask("첫 번째");
        runTask("두 번째");

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("순차 처리 총 시간 : " + duration + "ms");
    }
}
