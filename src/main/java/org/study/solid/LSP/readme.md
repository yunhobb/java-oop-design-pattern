# LSP
Liskov Substitution Principle

부모 클래스가 할 수 있는 행동은 <br>
자식 클래스도 할 수 있어야 한다.

파생 클래스는 기반 클래스를 대체할 수 있어야 한다. - 로버트

### 부모 클래스가 할 수 있는걸 자식이 할 수 없는 상황
오버라이딩! -> 클라이언트가 원래 함수인지 아니면 오버라이딩 함수인지 알 수가 없음
* child 대신 Parent 인스턴스를 넣어준다.
* 파라미터로 양수만 넣어준다
* instanceof로 어떤 인스턴스인지 구분하여 호출한다.

예시를 보면 애초에 상속관계를 가지면 안되었다~ (client쪽이 너~무 복잡s)

### 계약에 의한 설계
사전 조건은 자식 클래스에서 더 강해지면 안된다.<br>
(사전조건: 파라미터로 들어올 수 있는 값의 범위)

### 접근제어자에서도 확인할 수 있는 리스코프 치환원칙
자식 클래스로 갈 때 더 엄격해지지 못하도록 해야함<br>
(부모 클래스의 래퍼런스 변수에 자식 타입의 인스턴스를 넣었을때 자식 클래스에서는 private으로 선언된 메서드가 호출 될 수 있다.)

리스코프 치환 원칙을 지키는 코드는 진정 의미에서의 다형성을 제공해주기 때문에 코드의 분기 없이도 올바르게 확장 가능한 코드를 만든다.