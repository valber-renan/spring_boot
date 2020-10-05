package org.generation.MinhaEscola.model;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.validation.constraints.NotNull;
	import javax.validation.constraints.Size;


	@Entity
	@Table(name = "aluno")
	public class Aluno {
		
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private long id ;
		
		@NotNull
		@Size(min=3, max=10)
		private String nome;
		
		@NotNull
		private boolean matriculado;
		
		@NotNull
		@Column(name="turma_id")
		private long turma_id;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public boolean isMatriculado() {
			return matriculado;
		}

		public void setMatriculado(boolean matriculado) {
			this.matriculado = matriculado;
		}

		public long getTurma_id() {
			return turma_id;
		}

		public void setTurma_id(long turma_id) {
			this.turma_id = turma_id;
		}

}
