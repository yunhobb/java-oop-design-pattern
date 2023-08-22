# ISP
Interface Segregation Principle

클라이언트별로 세분화된 인터페이스를 만들어야한다.

<img width="1167" alt="image" src="https://github.com/yunhobb/java-oop-design-pattern/assets/87285536/d23993f4-4a53-48fe-8b66-e74449635580">

(자바에서 주입 받은 인터페이스의 모든 메서드를 오버라이딩 해야한다.<br>
불필요한 메서드들 까지 전부 가져와 진다 따라서 인터페이스 분리해라)

인터페이스 분리 원칙을 지키는 코드는 구현 클래스에는 불필요한 메서드를 구현하지 않도록 만들고, 인터페이스를 사용하는 클래스에게는 붎필요 메서드를 노출 시키지 않아 유지보수하기 좋은 코들르 만들어준다.