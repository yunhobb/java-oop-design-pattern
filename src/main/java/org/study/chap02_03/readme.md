## stream API
for,if -> stream API

* forEach - 반복시키기
* filter - 조건에 맞는 요소만 뽑기
  * findAny() -> 하나라도 발견되면 반환 해라~  나머지는 실행이 안됨~ 
* map - 요소를 매핑시키기
* filter 와 map 결합
  <img width="1035" alt="image" src="https://github.com/yunhobb/java-oop-design-pattern/assets/87285536/462440f3-c5eb-4639-9b15-c5438d5a3fa1">

```
List<Integer> integerList = Arrays.stream(integerArray)
          .boxed() //원시 타입을 Wrapper 타입으로 변경
//        .toList(); // 자바 16이상 지원
          .collect(Collectors.toList()); //윗줄이랑 동치
```

map은 독자적인 stream api를 사용하지 못함

그래서 key는 set으로 , value는 list로 변경을 하고 해야함 

