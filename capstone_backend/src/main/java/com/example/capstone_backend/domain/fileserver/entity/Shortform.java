package com.example.capstone_backend.domain.fileserver.entity;


import com.example.capstone_backend.domain.user.entity.UserInfo;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Table(name = "shortform")
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Shortform {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserInfo userId;

    @Column
    private String contents;

    @CreatedDate
    @Column
    private LocalDate createdAt;
}
