package com.sehoon.todos.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "todo_id")
    private long id;

    // 내용
    @Column(name = "title")
    private String title;

    // 작성자
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // 작성일 -> 연월일로만 할건지 / 시간 포함할건지
    // 나는 [ 연/월/일 ] 로만
    @Column(name = "create_at")
    private LocalDate createdAt = LocalDate.now();

    // 상태
    @Column(name = "status")
    private boolean status;

    // 생성자
    protected Todo() {}

    public Todo(String title) {
        this.title = title;
    }

    // Setter
    public void setUser(User user) {
        this.user = user;
    }

    // toString

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", createdAt=" + createdAt +
                ", status=" + status +
                '}';
    }
}
