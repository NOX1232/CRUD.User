package cibertec.edu.pe.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tbl_Usuario")
public class Usuario {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY )
		private int CodUsuario;
		
		@Column(name = "name_usua")
		private String nomUsuario;
		
		@Column(name = "surname_usua")
		private String apeUsuario;
		
		@Column(name = "email_usua")
		private String emaUsuario;
		
		public Usuario() {
		}

		public Usuario(int codUsuario, String nomUsuario, String apeUsuario, String emaUsuario) {
			super();
			CodUsuario = codUsuario;
			this.nomUsuario = nomUsuario;
			this.apeUsuario = apeUsuario;
			this.emaUsuario = emaUsuario;
		}

		public int getCodUsuario() {
			return CodUsuario;
		}

		public void setCodUsuario(int codUsuario) {
			CodUsuario = codUsuario;
		}

		public String getNomUsuario() {
			return nomUsuario;
		}

		public void setNomUsuario(String nomUsuario) {
			this.nomUsuario = nomUsuario;
		}

		public String getApeUsuario() {
			return apeUsuario;
		}

		public void setApeUsuario(String apeUsuario) {
			this.apeUsuario = apeUsuario;
		}

		public String getEmaUsuario() {
			return emaUsuario;
		}

		public void setEmaUsuario(String emaUsuario) {
			this.emaUsuario = emaUsuario;
		}
		
		

}
