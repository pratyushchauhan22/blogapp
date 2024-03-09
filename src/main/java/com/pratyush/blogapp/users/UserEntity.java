package com.pratyush.blogapp.users;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity(name = "users")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column( nullable = false)
    @NonNull
    private String username;

    @Column(nullable = false)
    @NonNull
    private String email;

    @Column(nullable = true)
    @Nullable
    private String image;

    @Column(nullable = true)
    @Nullable
    private String bio;



}
