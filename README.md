## Java to Kotlin 강의

---
### Lec01:
- 모든 변수는 var / val을 붙여주어야 한다.
  - variable 가변, value 불변(read-only)
- 타입은 명시적으로 작성하지 않아도, 컴파일러가 타입을 추론하는 정적타입 언어 
- 기본형, 참조형을 구분하지 않아도 됨
- Null이 들어갈 수 있는 변수는 타입 뒤에 ?를 붙여주어야함
- 객체 인스턴스화 시, new 키워드 안 붙여도 됨
---
### Lec02:
- Kotlin에서 null이 들어갈 수 있는 타입은 다르게 간주한다.
  - null 검사 시, non-null임을 컴파일러가 인지한다.
- null이 아닌 경우에만 호출되는 Safe Call(`?.`)이 있다.
- null인 경우에만 호출되는 Elvis 연산자(`?:`)가 있다.
- null이 절대 아닐 때 사용될 수 있는 Null 아님을 단언하는(`!!`)가 있다.
- Kotlin에서 Java를 사용할 때 플랫폼 타입(null의 여부 판단 불가) 사용에 유의
  - Java Source Code에서 Null 가능성을 확인해야 함 / Kotlin으로 Wrapping
---
### Lec04:
- 비교 연산자 사용법은 Java랑 다 같다.
  - 객체끼리도 자동 호출되는 compareTo를 이용하여 비교 연산자를 수행할 수 있다.
- 객체끼리의 연산자를 직접 정의할 수 있다.
---
### Lec05:
- if / if-else 모두 Java와 문법이 동일
- 단 Kotlin에서는 Statement가 아닌 Expression으로 취급된다.
  - 때문에 Kotlin에서는 삼항연산자가 없다.
- Switch는 when으로 대체되어 유연하게 사용 가능
---
### Lec07:
- Kotlin에서 모든 예외는 Unchecked Exception이다.
- try with resources 구문이 없다. Kotlin의 언어적 특성을 활용해 close를 호출한다.
---
### Lec08:
- 함수의 문법은 Java와 다르다.
  ```
  접근제어자 fun 함수명(parameter): returnType {
     ...
  }
  ```
- 함수 파라미터에 기본 값을 설정해줄 수 있다.
  > fun fun(str: String = "hi", age: Int = 10)
- 가변인자에는 vararg 키워드를 사용하며, 가변인자 함수를 배열과 호출할 때는 `*`를 붙여주어야 한다.
---
### Lec09:
- Kotlin에서는 필드를 만들면 getter와 setter가 자동으로 생성된다.
  - 이를 프로퍼티라고 함
- Kotlin에서는 주생성자가 필수이다.
- Kotlin에서는 constructor 키워드를 사용해 부생성자를 추가로 만들 수 있다.
  - 단, default parameter나 정적 팩토리 메소드를 추천한다.
---
### Lec10:
- 상위 클래스를 설계할 때 생성자 또는 초기화 블록에 사용되는 프로퍼티에는 open을 피해야 한다.
  - 하위 클래스에서 오버라이딩된 프로퍼티가 초기화 되지 않아 Int의 초기값인 0이 출력되는 상황이 발생 가능
#### 상속 관련 키워드 4가지
1. final: override를 할 수 없게 한다. default로 보이지 않게 존재한다.
2. open: override를 열어준다.
3. abstract 반드시 override 해야한다.
4. override: 상위 타입을 오버라이드 하고 있다.
- 추상 멤버가 아니면 기본적으로 오버라이드가 불가능하다.
  - open을 사용해주어야 한다.