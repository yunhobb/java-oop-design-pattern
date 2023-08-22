# stream API 와 Optional

java stream API는 for-loop보다 느리다.

그러나 가독성이 높은 코드로 개발을 해라(가독성을 높은것을 택해라)
-> 성능 개선은 추후에 하면 된다.


<br>

다시 한 번 말하지만

stream을 사용하면 초기 값을 null로 초기화를 안해도 되기 때문에 안정적이다.


<br>
### Parallel Stream
병렬적으로 stream을 생성함 
그러나 순서를 보장하지 않음 
