package com.example.testheader.app.branch;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "branches")
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "branch_id", nullable = false)
    private String branchId;
    private String referenceId;
    private String referenceCode;
    private String referenceValue;
    private String branchCode;
    private String branchTitle;
    private String branchTitleEn;
    private String branchTitleKh;
    private String branchTitleCn;
}
