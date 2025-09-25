Step 1 (기초 확인: Collection)

Q1. 자바에서 배열(Array)과 컬렉션(Collection)의 가장 큰 차이는 데이터의 크기 관리 방식인데요.
제가 예시 코드를 보여드릴게요:

```java
// 배열
String[] arr = new String[3];
arr[0] = "A";
arr[1] = "B";
arr[2] = "C";
// arr[3] = "D";  // ❌ 에러 발생 (크기 고정)

// ArrayList (컬렉션)
import java.util.ArrayList;
import java.util.List;

List<String> list = new ArrayList<>();
list.add("A");
list.add("B");
list.add("C");
list.add("D");   // ✅ 크기가 자동으로 늘어남
```



👉 여기서 배열과 ArrayList의 차이를 본인 말로 설명해보실래요?
(Level 1 마이유틱 질문: 기초 이해)

```text
## 나의 답변

배열은 처음 생성할 때 3이라는 크기로 고정을 하지만, ArrayList는 따로 크기를 지정해주지 않고 있다.
이유는 ArrayList는 요소의 메모리 마지막 부분에 다음 요소의 메모리 주소를 넣어줌으로써
리스트의 크기를 늘리고 줄일 수 있다. 
```
GPT의 추가 설명
- ArrayList가 단순하게 "메모리 주소를 연결"하는 것이 아니라 실제로는 **배열**을 사용한다.
- 하지만 크기가 꽉 차면, 새로운 더 큰 배열을 만들고 기존 요소들을 **복사**해 넣는다.
- 즉, **"배열 기반 + 자동 크기 확장 로직"** 은 ArrayList의 특징이다.