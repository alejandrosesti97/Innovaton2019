package com.mongo.repo.documents;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)

@Document(collection = "Cases")
public class CaseDTO implements Serializable {
	private static final long serialVersionUID = -7988011601236670041L;
	@Id
	@NotNull
	protected String caseId;
	protected String businessUnit;
	protected String origin;
	protected String category;
	protected String caseType;
}
