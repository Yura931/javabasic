# Object클래스
    
- 모든 클래스의 최고 조상. 오직 11개의 메서드만을 가지고 있다.
- notify(), wait() 등은 쓰레드와 관련된 메서드이다.

| Object클래스의 메서드                                                                                       | 설명                                                                                                                                   |
|------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|
| protected Object clone()                                                                             | 객체 자신의 복사본을 반환한다.                                                                                                                    |
| public boolean equals(Object obj)                                                                    | 객체 자신과 객체 obj가 같은 객체인지 알려준다.(같으면 true)                                                                                               |
| protected void finalize()                                                                            | 객체가 소멸될 때 가비지 컬렉터에 의해 자동적으로 호출된다.</br> 이때 수행되어야하는 코드가 있을 때 오버라이딩한다. (거의 사용 안 함)                                                      |
| public Class getClass()                                                                              | 객체 자신의 클래스 정보를 담고 있는 Class인스턴스를 반환한다.                                                                                                |
| public int hashCode()                                                                                | 객체 자신의 해시코드를 반환한다.                                                                                                                   |
| public String toString()                                                                             | 객체 자신의 정보를 문자열로 반환한다.                                                                                                                |
| public void notify()                                                                                 | 객체 자신을 사용하려고 기다리는 쓰레드를 하나만 깨운다.                                                                                                      |
| public void notifyAll()                                                                              | 객체 자신을 사용하려고 기다리는 모든 쓰레드를 깨운다.                                                                                                       |
| public void wait()</br>public void wait(long timeout)</br> public void wait(long timeout, int nanos) | 다른 쓰레드가 notify()나 notifyAll()을 호출할 때 까지</br> 현재 쓰레드를 무한히 또는 지정된 시간(timeout, nanos)동안 기다리게 한다.</br>(timeout은 천 분의 1초, nanos는 10⁹분의 1초 |



> Class { } 첫 글자가 대문자인 클래스 
>   - 클래스의 정보를 담기 위한 클래스
>   - Hello.java 컴파일 -> Hello.class 파일 -> 메모리에 올라갈 때 -> Hello 클래스에 Class객체 자동 생성
>   - Hello클래스에 대한 정보가 다 담겨 있음
>   - iv, method, 생성자 등등
>   - 즉 설계도 객체

>
>```java
> public Class getClass()
>```
> - 어떤 객체에 대해 getClass()를 호출하면 설계도 객체를 줌
> - 이것을 통해 객체를 생성할 수 있고 객체정보를 얻을 수 있음
> - 이 설계도를 가지고 객체생성도 하고 정보도 얻을 수 있게 해놓은 것을 Reflection API라고 함 (JAVA 기본 API에 포함되어 있음)
