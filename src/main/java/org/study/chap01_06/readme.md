Q. checked Exception과 Unchecked Exception 차이 ? 

A. "Checked Exception은 컴파일 할 때 예외에 대한 처릴를 강제하고, Unchecked Exception은 예외에 대한 처리를 장제하지 않습니다."

* checked Exception -> 예외 처리 강제
* Unchecked Exception -> 예외 처리 강제 안함 

예외를 강제한다.
1. try catch로 감싸주거나
2. 메서드 밖으로 던져 버리는 것 

정상적으로 끝났을 시 종료코드 0 나머지는 그 외 다른 값

<img width="981" alt="image" src="https://github.com/yunhobb/java-oop-design-pattern/assets/87285536/01b5a840-9364-44e3-82d5-77c152cd4734">

예외를 처리 할 때 unchecked Exception을 사용해야 한다.
-> 대부분의 예외는 로직에서 해결할 수 없다.

-> checkException을 파일 밖으로 던지는게 캡슐화를 위반 할 수 있다.