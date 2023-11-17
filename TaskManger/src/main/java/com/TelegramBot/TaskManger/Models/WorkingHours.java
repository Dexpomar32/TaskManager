package com.TelegramBot.TaskManger.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "working_hours")
public class WorkingHours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "record_id")
    private Integer id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    Users user;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "task_id")
    private GlobalTasks globalTask;
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "task_id, insertable=false, updatable=false")
//    private LocalTasks localTasks;
    @Column(name = "start_time")
    private Timestamp start;
    @Column(name = "end_time")
    private Timestamp end;
}
