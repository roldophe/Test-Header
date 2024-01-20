package com.example.testheader.app.user;


import com.example.testheader.app.branch.Branch;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id")
    private String userId;
    private String referenceId;
    private String referenceCode;
    private String referenceValue;
    private String accountNumber;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String gender;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_id")
    private Branch branch;
}