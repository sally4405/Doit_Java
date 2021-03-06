package stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
	public static void main(String[] args) {
		TravelCustomer cLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer cKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer cHong = new TravelCustomer("홍길동", 13, 50);
		
		List<TravelCustomer> cList = new ArrayList<>();
		
		cList.add(cLee);
		cList.add(cKim);
		cList.add(cHong);
		
		System.out.println("== 고객 명단에 추가된 순서대로 출력 ==");
		cList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		int total = cList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 비용은 : " + total + "입니다.");
		
		System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
		cList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
		
		
	}

}
