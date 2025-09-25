## Step 2 (기초 확인: Exception)

자바에서 프로그램 실행 중 에러가 발생하면 두 가지로 나눌 수 있어요:

Error (에러)

시스템 레벨 문제 (예: OutOfMemoryError)

개발자가 직접 처리하기 어렵습니다.

Exception (예외)

개발자가 예측하고, 직접 처리할 수 있는 문제 (예: NullPointerException, IOException)

예시 코드:
```java
try {
    int[] arr = new int[3];
    arr[5] = 10; // ❌ ArrayIndexOutOfBoundsException 발생
} catch (Exception e) {
    System.out.println("예외 발생: " + e.getMessage());
} finally {
    System.out.println("프로그램 종료");
}
```


---
✅ 이해 확인 질문 (Level 1 – 기초 이해):
위 코드에서 **예외 처리(try-catch-finally)**가 없다면 프로그램은 어떻게 될까요?

```text
## 나의 답변

만약 예외 처리가 없었다면, arr[5] = 10이라는 부분에서 프로그램이 종료되었을 겁니다.
finally에 있는 '프로그램 종류'라는 문구를 출력하지 못하고 프로그램이 다운되었을 것입니다.
```