# SOLID
의존성 관리는 우리 대부분이 직면한 문제<br>
의존성이 잘못 관리될 경우 변경하기 어렵고 재사용하기 어려운 코드가 됨<br>
반면 의존성이 잘 관리된 코드는 유연하면 재사용이 가능한 코드가 됨<br>
그렇게 하기 위해서는 아래와 같은 원칙을 따르면 되는데~
* SRP
* OCP
* LSP
* ISP
* DIP
### 객체지향의 4대 원칙
* 캡슐화
  * 필드를 private하게 메서드로만 값을 control 하도록
* 상속
  * 일반적으로 메서드를 재사용하기 위해서는 상속을 하면 안됨
  * 보통 필드를 확장하기 위해 상속을 사용하는 것은 올바를 확률이 높음
* 추상화
  * 추상적인 존재에 의존하여 생기는 장점들
* 다형성
  * 똑같은 클라이언트 코드로 안에 들어있는 존재에 따라 다른 동작이 수행되는 것 
  * (아님 주의)부모 클래스의 레퍼런스 변수에 자식 클래스의 인스턴스를 넣을 수 있는 행위는 다형성이 아님