모든 클래스는 object 클래스의 자손 
```java
public class SomeObject {
}

public class SomeObject extends Object {
}
//위 아래 동치
```
# equals()
동일성 vs 동등성
* 동일성: 비교 대상이 실제로 '똑같은' 대상이어야 함 "=="
* 동등성: 비교 대상이 같은 값이라고 우리가 정의한 것 "equals()"

동일한것은 반드시 동등하다.

# hasCode()
Q. 언제 사용해야 할까?
A. 보통 equals 메서드와 같이 사용한다. 동등함을 확인하기 위해 ~

HashMap에서 key를 hashCode()로 사용함 


# toString()
인스턴스를 문자열로 만드는 것 
-> 이게 왜 필요?? : 인스턴스를 로그로 남기기 위해 문자열로 바꿈 

호출되는 시점(자동으로)
레퍼런스 변수를 문자열과 더하기 연산 할 때 (특이한 특)

# 번외

objects 클래스는 NPE를 피할 수 있슴
