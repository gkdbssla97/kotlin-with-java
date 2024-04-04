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

### Lec04:
- 비교 연산자 사용법은 Java랑 다 같다.
  - 객체끼리도 자동 호출되는 compareTo를 이용하여 비교 연산자를 수행할 수 있다.
- 객체끼리의 연산자를 직접 정의할 수 있다. 
