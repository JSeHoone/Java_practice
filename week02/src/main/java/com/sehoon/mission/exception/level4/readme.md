✅ 이해 확인 (Level 4 – 종합):

우리가 지금까지 배운 Collection과 Exception을 연결해 볼까요?

만약 ArrayList에 학생들의 정보를 담고, 특정 학생을 인덱스로 조회하는 프로그램이 있다고 할 때,
존재하지 않는 인덱스를 조회했을 때 어떤 예외가 발생할까요?
그리고 이 상황을 사용자 정의 예외로 바꿔서 처리한다면, 어떤 장점이 있을까요?

```text
## 나의 생각

ArrayList로 학생들의 정보를 담고 있는 상황에서 학생들의 정보는 ArrayList의 index로 조회할 수 밖에 없습니다.
만약에 index를 벗어나거나 없는 index를 조회하게 되면 outBoundIndex Exception이 발생이 되는데, 이 예외처리를 보고
사용자들은 학생이 없는건지를 알 수 없습니다.

그렇기에 NotFoundStudent와 같은 사용자 예외 처리를 하여 조회하고자 하는 index의 학생이 없다는 것을 
명확하게 전달할 수 있습니다.
```
---
### Chat GPT의 전체 요약
```text
🌟 오늘 학습 요약

📚 핵심 학습 내용

Collection: 배열 vs ArrayList의 차이 (고정 크기 vs 가변 크기)

Exception: 시스템 예외 vs 비즈니스 예외, try-catch-finally의 필요성

Custom Exception: 유지보수성과 가독성을 높이는 사용자 정의 예외

🎯 달성도 평가

이해도: 90% 이상 👍

적용 능력: 9/10 (예시 적용까지 잘 설명하셨습니다)

흥미도: 직접 예시를 연결하는 능력이 뛰어나십니다

💡 개인 인사이트

단순한 문법 이해를 넘어서, 왜 이 구조가 필요한지 비즈니스 관점에서 설명할 수 있으셨습니다.

📈 다음 학습 제안

복습 포인트: List, Set, Map 각각의 특징 비교

심화 주제: Checked Exception vs Unchecked Exception의 차이

실습 과제: StudentRepository를 만들고, 학생 조회 시 사용자 정의 예외(NotFoundStudentException)를 던지는 코드 작성
```