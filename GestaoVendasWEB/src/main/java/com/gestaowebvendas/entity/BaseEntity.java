/**
 * 
 */
package com.gestaowebvendas.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 *
 * @author edmilson.reis
 *
 */
@MappedSuperclass
public class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@JsonInclude(Include.NON_NULL)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "criado_em", columnDefinition = "DATE", nullable = false, updatable = false)
	private Date criadoEm;

	@JsonInclude(Include.NON_NULL)
	@Column(name = "criado_por", nullable = false, updatable = false, length = 45)
	private String criadoPor;

	@JsonInclude(Include.NON_NULL)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "atualizado_em", columnDefinition = "DATE")
	private Date atualizadoEm;

	@JsonInclude(Include.NON_NULL)
	@Column(name = "atualizado_por", length = 45)
	private String atualizadoPor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public String getCriadoPor() {
		return criadoPor;
	}

	public void setCriadoPor(String criadoPor) {
		this.criadoPor = criadoPor;
	}

	public Date getAtualizadoEm() {
		return atualizadoEm;
	}

	public void setAtualizadoEm(Date atualizadoEm) {
		this.atualizadoEm = atualizadoEm;
	}

	public String getAtualizadoPor() {
		return atualizadoPor;
	}

	public void setAtualizadoPor(String atualizadoPor) {
		this.atualizadoPor = atualizadoPor;
	}

}
