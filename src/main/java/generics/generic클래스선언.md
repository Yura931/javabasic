# 제네릭 클래스 선언


- 기존 클래스 선언
```java
class Box {
    Object item;
    
    void setItem(Object item) {
        this.item = item;
    }
    
    Object getItem() {
        return item;
    }
}
```
- 제네릭 클래스로 변경
```java
class Box<T> {
    T item;
    
    void setItem(T item) {
        this.item = item;
    }
    
    T getItem() {
        return item;
    }
}
```
- Box<T>에서 T를 `타입 변수(type variable)`라고 하며, "Type"의 첫 글자에서 따온 것. T가아닌 다른 것을 사용해도 됨
- 타입 변수가 여러 개인 경우 Map<K,V>와 같이 콤마','를 구분자로 나열하면 됨
- 무조건 T를 사용하기보다 상황에 맞게 의미있는 문자를 선택해서 사용하는 것이 좋다.
- 기호의 종류만 다를 뿐 '임의의 참조형 타입'을 의미한다는 것은 같다.

**기존에는 다양한 종류의 타입을 다루는 메서드의 매개변수나 리턴 타입으로 Object타입의 참조변수를 많이 사용했고,**   
**그로 인해 형변환이 불가피했지만, 제네릭을 사용하게 되며 Object타입 대신 원하는 타입을 지정하기만 하면 되는 것**

- 제네릭 클래스가 된 Box클래스의 객체를 생성할 때는 참조변수와 생성자에 타입T대신 사용될 실제 타입을 지정해주면 된다.
```java
public class Main {
    public static void main(String args[]) {
        Box<String> b = new Box<String>();
        b.setITem(new Object());    // 에러. String 이외의 타입은 지정 불가
        b.setITem("ABC");
        String item = b.getItem(); // 객체의 타입을 String으로 지정해주었기 때문에 형변환이 필요 없음
    }
}
```
- T 대신에 String타입을 지정해주었으므로, 제네릭 클래스 Box<T>는 다음과 같이 정의 된 것
```java
class Box {
    String item;
    
    void setItem(String item) {
        this.item = item;
    }
    
    String getItem() {
        return item;
    }
}
```
- 제네릭이 도입되기 이전의 코드와 호환을 위해, 제네릭 클래스인데도 예전의 방식으로 객체를 생성하는 것이 허용된다.
- 다만 제네릭 타입을 지정하지 않아서 안전하지 않다는 경고가 발생한다.
- 호환성을 유지하기 위해 허용되는 것일 뿐, 제네릭 클래스를 사용할 때는 반드시 타입을 지정해주도록 하자

### 제네릭스의 제한
- 모든 객체에 대해 동일하게 동작해야하는 static멤버에 타입 변수 T를 사용할 수 없음. T는 인스턴수변수로 간주되기 때문
- static멤버는 인스턴스 변수를 참조할 수 없다.
- static멤버는 타입 변수에 지정된 타입, 즉 대입된 타입의 종류에 관계없이 동일한 것이어야 하기 때문
- `Box<String>.item`과 `Box<Integer>.item`이 다른 것이어서는 안된다는 뜻
- 제네릭 배열 타입의 참조변수를 선언하는 것은 가능하지만, `new T[10]`과 같이 배열을 생성하는 것은 안됨
- new 연산자는 컴파일 시점에 타입 T가 무엇인지 정확하게 알아야한다. 하지만 Box<T>클래스를 컴파일하는 시점에서는 T가 어떤 타입이 될지 전혀 알 수 없다.
- instanceof연산자도 new연산자와 같은 이유로 t를 피연산자로 사용할 수 없다.
```java
class Box<T> {
    static T item; // 에러
    static int compare(T t1, T t2) { } // 에러
    
    T[] itemArr;    // OK. T타입의 배열을 위한 참조변수
    T[] toArray() {
        T[] tmpArr = new T[itemArr.length]; // 에러. 제네릭 배열 생성불가
        return tmpArr;
    }
}
```

### 제네릭 클래스의 객체 생성과 사용
```java
class Box<T> {
    ARrayList<T> list = new ARrayList<T>();
    
    void add(T item) {
        list.add(item);
    }
    
    T get(int i) {
        return list.get(i);
    }
    
    ArrayList<T> getList() {
        return list;
    }
    
    int size() {
        return list.size();
    }
    
    public String toString() {
        return list.toString();
    }
}
```
- Box<T>의 객체를 생성할 때 참조변수와 생성자에 대입된 타입(매개 변수화된 타입)이 일치해야 한다.
  - `Box<Apple> appleBox = new Box<Apple>();` -> 가능
  - `Box<Appke> appleBox = new Box<Grape>();` -> 에러
- 두 타입이 상속관계에 있어도 마찬가지. Apple이 Fruit의 자손이라고 가정
  - `Box<Fruit> appleBox = new Box<apple>();` -> 에러. 대입된 타입이 다름
- 두 제네릭 클래스의 타입이 상속관계에 있고, 대입된 타입이 같은 것은 괜찮다. FruitBox가 Box의 자손일 경우
  - `Box<Apple> appleBox = new FruitBox<Apple>();` -> 가능. 다형성
- JDK1.7부터는 추정이 가능한 경우 타입을 생략할 수 있다. 동일한 두 문장
  - `Box<Apple> appleBox = new Box<Apple>();`
  - `Box<Apple> appleBox = new Box<>();`
- 생성된 Box<T>의 객체에 `void add(T itme)`으로 객체를 추가할 때 대입된 타입과 다른 타입의 객체는 추가할 수 없음
- 타입 T가 `Fruit`인 경우 `void add(Fruit item)`이 되므로 Fruit의 자손들은 메서드의 매개변수가 될 수 있다.
```java
class main {
    public static void main(String args[]) {
        Box<Apple> appleBox = new Box<apple>();
        applebox.add(new Apple());  // OK
        appleBox.add(new Grape()); // 에러. Box<Apple>에는 Apple객체만 추가가능
        
        Box<Fruit> fruitBox = new Box<Fruit>();  
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple()); // 지정타입객체의 자손객체
    }
}
```

### 제한된 제네릭 클래스
- 타입 문자로 사용할 타입을 명시하면 한 종류의 타입만 저장할 수 있도록 제한 할 수 있지만, 모든 종류의 타입을 지정할 수 있다는 것에는 변함이 없다.
- 타입 매개변수 T에 지정할 수 있는 타입의 종류를 제한 할 수 있는 방법
```java
// 타입 매개변수를 T로만 지정할 경우
// NumberBox<T>라는 네이밍으로 클래스를 만들었지만 타입에 String이 들어올 수도 있어 클래스를 만든 의도와 많이 달라질 수 있음
class NumberBox<T> {
    ArrayList<T> list = new ArrayList<T>();
}

// extends를 사용해 특정 타입의 자손들만 대입할 수 있도록
class NumberBox<T extends Number> {
    ArrayList<T> list = new ArrayList<T>();
    void setItem(T item) {
        list.add(item);
    }
}

public class Main {
    public static void main(String[] args) {
        NumberBox<Number> numberBox = new NumberBox<Number>();
        NumberBox<String> StringBox = new NumberBox<String>();  //에러. String은 Number의 자식이 아님
        
        // add()의 매개변수 타입 T가 Number와 자손 타입이 될 수 있으므로 여러 숫자를 담는 상자가 됨
        numberBox.add(1);
        numberBox.add(1L);
        numberBox.add(1.1);
    }
}
```
- 다형성에서 조상타입의 참조변수로 자손타입의 객체를 가리킬 수 있는 것처럼, 매개변수화된 타입의 자손타입도 가능한 것
- 타입 매개변수 T에 Object를 대입하면, 모든 종류의 객체를 저장할 수 있게 된다.
- 인터페이스를 구현해야 할 때도 extends사용
- Fruit의 자손이면서 Eatable인터페이스도 구현해야 한다면 '&'기호로 연결
```java
interface Eatable {}
class Fruit {}
class FruitBox<T extends Fruit & Eatable> {}
```


