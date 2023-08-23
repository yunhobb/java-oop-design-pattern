## 해당 패턴이 보호하고자 하는 것을 생각해라! 

# 어댑터 
1. 인터페이스 변경
2. 호환을 위한 추가적인 동작

Service에서 클래스에서 복잡한 FileStorage 클래스로의 의존이 사라짐

service를 보호해준다.


# 퍼사드
-> 건물의 (출입구가 있는) 정면

<img width="1116" alt="image" src="https://github.com/yunhobb/java-oop-design-pattern/assets/87285536/47ecf53d-314f-4c43-8881-2d30d83b691c">

-> 모든 서비스가 모든 기능을 한번에 제어하도록 Facade 패턴 적용(예시에서 동영상 분석과정을 캡슐화 함)

<img width="808" alt="image" src="https://github.com/yunhobb/java-oop-design-pattern/assets/87285536/471e8f7d-98c0-450c-8b18-4277da6dcaf4">

-> 순환 참조 에러 시 Facade 패턴 적용 

# 전략
<img width="928" alt="image" src="https://github.com/yunhobb/java-oop-design-pattern/assets/87285536/ca3d429c-d4db-4a19-a2d1-dc747764c107">

## 상속과 구성
상속보다는 구성을 선호해라~ <br>
다른 클래스의 코드를 재사용하기 위해서는 **구성**을 사용해라<br>
(상속을 사용하면 코드의 변화가 상속한 클래스에도 영향을 미침)
* 상속  is ~ a
* 구성 has ~ b

# 싱글턴
해당 클래스의 인스턴스를 오직 하나만 만들 수 있도록 제안하는 패턴

인스턴스를 새로 생성한다는 것은 자원(메모리, 시간)을 소모

스프링에서는 알아서 bean으로 등록되면서 싱글턴 패턴이 적용됨 

* spring bean
* Database Connection Pool
* Thread Pool

우리가 쓰는 객체는 싱글톤이기 때문에 모든 쓰레드간에 공유된다. 상태를 가지지 않도록 만들어야 한다.

하나의 인스턴스만 만들어서 성능상 이점을 얻음<br>
-> 플라이웨이트 패턴과 유사

# 옵저버 패턴
어떤 대상의 상태 변화에 관심 있어하는 대상들에게 상태가 변화 됐다고 전파할 수 있는 패턴(어떤일에 대한 구독과 발행)

<img width="695" alt="image" src="https://github.com/yunhobb/java-oop-design-pattern/assets/87285536/98434de7-048c-4c4b-a22a-81708fc8f629">

이벤트가 발생되는 곳에서 이벤트를 처리하는 주체들로의 의존성을 제거<br>
실행 시점에 이벤트 구독 대상을 추가하거나 제거

# 프록시 패턴
원래 객체를 대신하여 요청을 받아, 원래 객체를 호출하기 전이나 후에 특정 로직을 실행함

## AOP(Aspect Oriented Programming)
관점 지향 프로그래밍

어떤 로직을 핵심적인 로직과 부가적인 로직으로 나누고,<br>
반복되는 부가적인 로직을 분리하여 감추는것 <br>
-> 어떤 로직에서 부가적인 로직이 없어지고 <br>
핵심적인 로직만 남기 떄문에 핵심적인 로직의 가독성이 올라감 


프록시 패턴때문에 종종 문제를 일으킴<br>
self Invocation: 진짜 객채 내부에서 this를 통해 내부 메서드를 호출하려고 할 때 발생함<br>
-> 해당 메서드는 AOP가 실행이 안됨<br>

해결법은 많다 찾아봐~ 여러가지야

## 프록시 패턴의 장점, 보호하고자 하는 것
장점: 반복되는 부가로직을 묶어내고 감출 수 있음

보호하고자 하는 것: 서버코드를 보호 하고자 함


