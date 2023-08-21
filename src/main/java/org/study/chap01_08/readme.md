Having Optional enables me to do fluent API thingies like:

```
// Optional을 사용해서 편함 (코드간에 연관성을 한눈에 파악이 가능함)
stream.getFirst().orElseThrow(()->new MyFancyException()


// Optional이 없어서 불편함
object object = stream.getFirst();

if(object == null))
    new MyFancyException();
```

메서드 호출 결과가 null이다?
1. 생성하여 메서드 호출을 계속한다.
2. 예외를 던진다.

```
MapRepository mapRepository = new MapRepository();
Optioncal<String> string = mapRepository.getOptionalValue("NOT_EXIST_KEY');

//파라미터 값이 null인 경우 NPE를 던짐 (Optinoal 객채를 생성하기 전에 던짐 (의도적))
Optioncal.of(string);
// 파라미터로 들어온 값이 null인 경우 비어있는 Optioncal 값이 있는경우 값이 들어있는 Optional
Optional.ofNullable(string);
//비어있는 Optional 생성
Optional.emtpy();
```

내가 쓰는 라이브러리에서 메서드 반환 티입이 Optional인 경우
-> 그대로 orElseThrow 같은 메서드로 사용

내가 쓰는 라이브러리의 메서드 반환 타입이 Optional이 **아닌**경우
-> Optional.ofNullable로 Optional 객체 생성 후 orElseThrow같은 메서드로 사용 

