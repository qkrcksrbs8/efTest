package cg.park.testSpringBoot.cote._2022.kakao2022;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
public class parkingPay {


    @Test
    public void test() {
        //  기본 시간(분)	| 기본 요금(원) |	단위 시간(분) | 단위 요금(원)
//        int[] fees       = {180, 5000, 10, 600};
//        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        int[] fees = {120, 0, 60, 591};
        String[] records = {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};
//        int[] fees = {1, 461, 1, 10};
//        String[] records = {"00:00 1234 IN"};
//        int[] fees       = {120, 0, 60, 591};
//        String[] records = {"00:00 1234 IN", "00:02 1235 IN"};

        Arrays.stream(solution(fees, records)).forEach(System.out::println);
    }

    HashMap<String, String> parkingMap = new HashMap<>();
    HashMap<String, Integer> resultMap = new HashMap<>();
    public int[] solution(int[] fees, String[] records) {

        // 1.누적 입/출차 시간 계산
        Set<String> car = new HashSet<>();
        int cnt = 0;
        for (String record : records) {
            String[] arr = record.split(" ");
            parkingTime(arr);
            if (car.contains(arr[1])) continue;
            car.add(arr[1]);
            cnt++;
        }

        // 2.출차된 내역 없는 차량 시간 계산
        for (Map.Entry<String, String> map : parkingMap.entrySet()) {
            lastTime(map.getKey(), map.getValue());
        }

        // 3.차량 번호 정렬
        List<String> keyList = new ArrayList<>(resultMap.keySet());
        Collections.sort(keyList);


        // 4.요금 정산
        int[] answer = new int[cnt];
        int index = 0;
        for (String key : keyList) {
            answer[index] = calculate(fees, resultMap.get(key));
            index++;
        }

        return answer;
    }

    public void parkingTime(String[] record) {
        String time = record[0];
        String carNumber = record[1];
        String inOut = record[2];

        if ("IN".equals(inOut)) {
            parkingMap.put(carNumber, time);
            return;
        }

        int inTime = toMinutes(parkingMap.get(carNumber).split(":"));
        int outTime = toMinutes(time.split(":"));
        int useTime = outTime - inTime;

        parkingMap.remove(carNumber);
        if (resultMap.containsKey(carNumber)) {
            resultMap.put(carNumber, resultMap.get(carNumber) + useTime);
            return;
        }
        resultMap.put(carNumber, useTime);
    }

    public int toMinutes(String[] time) {
        int hour = Integer.parseInt(time[0]) * 60;
        int minute = Integer.parseInt(time[1]);
        return hour + minute;
    }

    public void lastTime(String carNumber, String time) {

        int inTime = toMinutes(time.split(":"));
        int outTime = toMinutes("23:59".split(":"));
        int useTime = outTime - inTime;

        if (resultMap.containsKey(carNumber)) {
            resultMap.put(carNumber, resultMap.get(carNumber) + useTime);
            return;
        }
        resultMap.put(carNumber, useTime);
    }

    public int calculate(int[] fees, int parkingTime) {
        int defaultTime = fees[0];
        int defaultPay = fees[1];
        int time = fees[2];
        int pay = fees[3];

        int useTime = parkingTime;

        if (defaultTime >= useTime) {
            return defaultPay;
        }

        useTime -= defaultTime;

        int quotient = useTime / time;

        if (quotient == 0) {
            quotient = 1;
            return defaultPay + (pay * quotient);
        }

        if (((quotient * time) - useTime) != 0) {
            quotient += 1;
        }

        return defaultPay + (pay * quotient);
    }

}
