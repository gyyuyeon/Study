package com.example.periodicTable.domain.periodicTable;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="periodictable")
public class periodicTable {

	
	@Id
	@Column(name="PERIODIC_ID")
	@Comment("원소번호")
	private int periodicId;
	
	@Column(name="PERIODIC_SI")
	@Comment("원소기호")
	private String periodicSi;
	
	@Column(name="PERIODIC_NM")
	@Comment("원소명")
	private String periodicNm;
	
	@Column(name="PERIODIC_MASS")
	@Comment("원자질량")
	private String periodicMass;
	
	@Column(name="PERIODIC_ST")
	@Comment("상태")
	private String periodicSt;
	
	@Column(name="PERIODIC_FY")
	@Comment("발견년도")
	private String periodicFy;
	
	@Column(name="PERIODIC_FP")
	@Comment("발견자")
	private String periodicFp;
	

}
